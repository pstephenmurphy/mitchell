package com.cieca.estimate.resource.entity.loss;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.inspection.InspectionType;


/**
 * <p>Java class for LossInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LossInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Facts" type="{http://www.cieca.com/BMS}FactsType" minOccurs="0"/>
 *         &lt;element name="Inspection" type="{http://www.cieca.com/BMS}InspectionType" minOccurs="0"/>
 *         &lt;element name="TotalLossInd" type="{http://www.cieca.com/BMS}Indicator"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LossInfoType", propOrder = {
    "facts",
    "inspection",
    "totalLossInd"
})
public class LossInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "Facts")
    protected FactsType facts;
    @XmlElement(name = "Inspection")
    protected InspectionType inspection;
    @XmlElement(name = "TotalLossInd", required = true)
    protected String totalLossInd;

    /**
     * Gets the value of the facts property.
     * 
     * @return
     *     possible object is
     *     {@link FactsType }
     *     
     */
    public FactsType getFacts() {
        return facts;
    }

    /**
     * Sets the value of the facts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FactsType }
     *     
     */
    public void setFacts(FactsType value) {
        this.facts = value;
    }

    /**
     * Gets the value of the inspection property.
     * 
     * @return
     *     possible object is
     *     {@link InspectionType }
     *     
     */
    public InspectionType getInspection() {
        return inspection;
    }

    /**
     * Sets the value of the inspection property.
     * 
     * @param value
     *     allowed object is
     *     {@link InspectionType }
     *     
     */
    public void setInspection(InspectionType value) {
        this.inspection = value;
    }

    /**
     * Gets the value of the totalLossInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalLossInd() {
        return totalLossInd;
    }

    /**
     * Sets the value of the totalLossInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalLossInd(String value) {
        this.totalLossInd = value;
    }

}
