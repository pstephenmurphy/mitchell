package com.cieca.estimate.resource.entity.idinfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IDInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDQualifierCode" type="{http://www.cieca.com/BMS}IDQualifierOpenEnumType"/>
 *         &lt;element name="IDNum" type="{http://www.cieca.com/BMS}Char_80" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDInfoType", propOrder = {
    "idQualifierCode",
    "idNum"
})
public class IDInfoType implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "IDQualifierCode", required = true)
    protected String idQualifierCode;
    @XmlElement(name = "IDNum", required = true)
    protected List<String> idNum;

    /**
     * Gets the value of the idQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDQualifierCode() {
        return idQualifierCode;
    }

    /**
     * Sets the value of the idQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDQualifierCode(String value) {
        this.idQualifierCode = value;
    }

    /**
     * Gets the value of the idNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIDNum() {
        if (idNum == null) {
            idNum = new ArrayList<String>();
        }
        return this.idNum;
    }

}
