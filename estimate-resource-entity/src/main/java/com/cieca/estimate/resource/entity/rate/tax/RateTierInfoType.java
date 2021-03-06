package com.cieca.estimate.resource.entity.rate.tax;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TierInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TierNum" type="{http://www.cieca.com/BMS}Integer_Range_0-9"/>
 *         &lt;choice>
 *           &lt;element name="Rate" type="{http://www.cieca.com/BMS}Decimal_Range_0-999.99"/>
 *           &lt;element name="Percentage" type="{http://www.cieca.com/BMS}Decimal_Range_0-100.00"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ThresholdAmt" type="{http://www.cieca.com/BMS}Currency"/>
 *           &lt;element name="ThresholdHours" type="{http://www.cieca.com/BMS}Decimal_Range_0-99.9"/>
 *         &lt;/choice>
 *         &lt;element name="SurchargeAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="CostPct" type="{http://www.cieca.com/BMS}Decimal_Range_0-100.00" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TierInfoType", propOrder = {
    "tierNum",
    "rate",
    "percentage",
    "thresholdAmt",
    "thresholdHours",
    "surchargeAmt",
    "costPct"
})
public class RateTierInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "TierNum")
    protected Integer tierNum;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "Percentage")
    protected BigDecimal percentage;
    @XmlElement(name = "ThresholdAmt")
    protected BigDecimal thresholdAmt;
    @XmlElement(name = "ThresholdHours")
    protected BigDecimal thresholdHours;
    @XmlElement(name = "SurchargeAmt")
    protected BigDecimal surchargeAmt;
    @XmlElement(name = "CostPct")
    protected BigDecimal costPct;

    /**
     * Gets the value of the tierNum property.
     * 
     */
    public Integer getTierNum() {
        return tierNum;
    }

    /**
     * Sets the value of the tierNum property.
     * 
     */
    public void setTierNum(Integer value) {
        this.tierNum = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentage(BigDecimal value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the thresholdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThresholdAmt() {
        return thresholdAmt;
    }

    /**
     * Sets the value of the thresholdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThresholdAmt(BigDecimal value) {
        this.thresholdAmt = value;
    }

    /**
     * Gets the value of the thresholdHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThresholdHours() {
        return thresholdHours;
    }

    /**
     * Sets the value of the thresholdHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThresholdHours(BigDecimal value) {
        this.thresholdHours = value;
    }

    /**
     * Gets the value of the surchargeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSurchargeAmt() {
        return surchargeAmt;
    }

    /**
     * Sets the value of the surchargeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSurchargeAmt(BigDecimal value) {
        this.surchargeAmt = value;
    }

    /**
     * Gets the value of the costPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostPct() {
        return costPct;
    }

    /**
     * Sets the value of the costPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostPct(BigDecimal value) {
        this.costPct = value;
    }

}
