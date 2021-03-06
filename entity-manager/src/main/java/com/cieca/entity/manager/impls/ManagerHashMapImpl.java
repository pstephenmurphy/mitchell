package com.cieca.entity.manager.impls;

import static com.cieca.utility.Preconditions.checkArgument;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Nonnull;

import com.cieca.entity.Entity;
import com.cieca.entity.manager.EntityManager;
import com.cieca.entity.manager.exceptions.DuplicateEntityException;
import com.cieca.entity.manager.exceptions.EntityManagerException;
import com.cieca.entity.manager.exceptions.NonExistentEntityException;

public class ManagerHashMapImpl<T extends Entity<K>, K> implements EntityManager<T, K> {

    private Map<K, T> managedEntities = new ConcurrentHashMap<K, T>();
    
    @Override
    public void add(@Nonnull T managedEntity) throws EntityManagerException, IllegalArgumentException {
        checkArgument(managedEntity != null);

        if (!managedEntities.containsKey(managedEntity.getID())) {
            this.managedEntities.put(managedEntity.getID(), managedEntity);
        } else {
            throw new DuplicateEntityException();
        }

    }

    @Override
    public void update(@Nonnull T managedEntity) throws EntityManagerException, IllegalArgumentException {
        checkArgument(managedEntity != null);

        if (Boolean.FALSE == this.managedEntities.containsKey(managedEntity.getID())) {
            throw new NonExistentEntityException();
        } else {
            this.managedEntities.put(managedEntity.getID(), managedEntity);
        }
    }

    @Override
    public void delete(@Nonnull K id) throws EntityManagerException, IllegalArgumentException {
        checkArgument(id != null);

        if (null == this.managedEntities.remove(id)) {
            throw new NonExistentEntityException();
        }
    }

    @Override
    public T get(@Nonnull K id) throws EntityManagerException, IllegalArgumentException {
        T entity = null;

        checkArgument(id != null);

        entity = this.managedEntities.get(id);

        if (null == entity) {
            throw new NonExistentEntityException();
        }

        return entity;
    }
}
