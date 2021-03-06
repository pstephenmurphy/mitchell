package com.cieca.estimate.resource.entity.rate.tax;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CanadianTaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CanadianTaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxableInd" type="{http://www.cieca.com/BMS}Boolean"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="GoodsServicesTaxRate" type="{http://www.cieca.com/BMS}Decimal_Range_0-100.00"/>
 *           &lt;element name="HarmonizedTaxRate" type="{http://www.cieca.com/BMS}Decimal_Range_0-100.00"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CanadianTaxType", propOrder = {
    "taxableInd",
    "goodsServicesTaxRate",
    "harmonizedTaxRate"
})
public class CanadianTaxType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    
    @XmlElement(name = "TaxableInd")
    protected boolean taxableInd;
    
    @XmlElement(name = "GoodsServicesTaxRate")
    protected BigDecimal goodsServicesTaxRate;
    
    @XmlElement(name = "HarmonizedTaxRate")
    protected BigDecimal harmonizedTaxRate;

    /**
     * Gets the value of the taxableInd property.
     * 
     */
    public boolean isTaxableInd() {
        return taxableInd;
    }

    /**
     * Sets the value of the taxableInd property.
     * 
     */
    public void setTaxableInd(boolean value) {
        this.taxableInd = value;
    }

    /**
     * Gets the value of the goodsServicesTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGoodsServicesTaxRate() {
        return goodsServicesTaxRate;
    }

    /**
     * Sets the value of the goodsServicesTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGoodsServicesTaxRate(BigDecimal value) {
        this.goodsServicesTaxRate = value;
    }

    /**
     * Gets the value of the harmonizedTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHarmonizedTaxRate() {
        return harmonizedTaxRate;
    }

    /**
     * Sets the value of the harmonizedTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHarmonizedTaxRate(BigDecimal value) {
        this.harmonizedTaxRate = value;
    }

}
