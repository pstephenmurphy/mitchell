package com.cieca.estimate.resource.entity.party;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.vehicle.VehicleInfoType;


/**
 * <p>Java class for DemandingPartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DemandingPartyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Party" type="{http://www.cieca.com/BMS}PartyType"/>
 *         &lt;element name="VehicleInfo" type="{http://www.cieca.com/BMS}VehicleInfoType" minOccurs="0"/>
 *         &lt;element name="AccompanyingParty" type="{http://www.cieca.com/BMS}AccompanyingPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RepresentativeParty" type="{http://www.cieca.com/BMS}RepresentativePartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CitationIssuedInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemandingPartyType", propOrder = {
    "party",
    "vehicleInfo",
    "accompanyingParty",
    "representativeParty",
    "citationIssuedInd"
})
public class DemandingPartyType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "Party", required = true)
    protected PartyType party;
    @XmlElement(name = "VehicleInfo")
    protected VehicleInfoType vehicleInfo;
    @XmlElement(name = "AccompanyingParty")
    protected List<AccompanyingPartyType> accompanyingParty;
    @XmlElement(name = "RepresentativeParty")
    protected List<RepresentativePartyType> representativeParty;
    @XmlElement(name = "CitationIssuedInd")
    protected Boolean citationIssuedInd;

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setParty(PartyType value) {
        this.party = value;
    }

    /**
     * Gets the value of the vehicleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleInfoType }
     *     
     */
    public VehicleInfoType getVehicleInfo() {
        return vehicleInfo;
    }

    /**
     * Sets the value of the vehicleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleInfoType }
     *     
     */
    public void setVehicleInfo(VehicleInfoType value) {
        this.vehicleInfo = value;
    }

    /**
     * Gets the value of the accompanyingParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accompanyingParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccompanyingParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccompanyingPartyType }
     * 
     * 
     */
    public List<AccompanyingPartyType> getAccompanyingParty() {
        if (accompanyingParty == null) {
            accompanyingParty = new ArrayList<AccompanyingPartyType>();
        }
        return this.accompanyingParty;
    }

    /**
     * Gets the value of the representativeParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the representativeParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepresentativeParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepresentativePartyType }
     * 
     * 
     */
    public List<RepresentativePartyType> getRepresentativeParty() {
        if (representativeParty == null) {
            representativeParty = new ArrayList<RepresentativePartyType>();
        }
        return this.representativeParty;
    }

    /**
     * Gets the value of the citationIssuedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCitationIssuedInd() {
        return citationIssuedInd;
    }

    /**
     * Sets the value of the citationIssuedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCitationIssuedInd(Boolean value) {
        this.citationIssuedInd = value;
    }

}
