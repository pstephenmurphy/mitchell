package com.cieca.estimate.resource.entity.currency;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurCode" type="{http://www.cieca.com/BMS}CurrencyEnum"/>
 *         &lt;element name="BaseCurCode" type="{http://www.cieca.com/BMS}CurrencyEnum"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="CurRate" type="{http://www.cieca.com/BMS}Decimal"/>
 *           &lt;element name="CurConvertRule" type="{http://www.cieca.com/BMS}CurrencyConversionRuleEnum"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyInfoType", propOrder = {
    "curCode",
    "baseCurCode",
    "curRate",
    "curConvertRule"
})
public class CurrencyInfoType implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "CurCode", required = true)
    protected CurrencyEnum curCode;
    @XmlElement(name = "BaseCurCode", required = true)
    protected CurrencyEnum baseCurCode;
    @XmlElement(name = "CurRate")
    protected BigDecimal curRate;
    @XmlElement(name = "CurConvertRule")
    protected CurrencyConversionRuleEnum curConvertRule;

    /**
     * Gets the value of the curCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyEnum }
     *     
     */
    public CurrencyEnum getCurCode() {
        return curCode;
    }

    /**
     * Sets the value of the curCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyEnum }
     *     
     */
    public void setCurCode(CurrencyEnum value) {
        this.curCode = value;
    }

    /**
     * Gets the value of the baseCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyEnum }
     *     
     */
    public CurrencyEnum getBaseCurCode() {
        return baseCurCode;
    }

    /**
     * Sets the value of the baseCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyEnum }
     *     
     */
    public void setBaseCurCode(CurrencyEnum value) {
        this.baseCurCode = value;
    }

    /**
     * Gets the value of the curRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurRate() {
        return curRate;
    }

    /**
     * Sets the value of the curRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurRate(BigDecimal value) {
        this.curRate = value;
    }

    /**
     * Gets the value of the curConvertRule property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversionRuleEnum }
     *     
     */
    public CurrencyConversionRuleEnum getCurConvertRule() {
        return curConvertRule;
    }

    /**
     * Sets the value of the curConvertRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversionRuleEnum }
     *     
     */
    public void setCurConvertRule(CurrencyConversionRuleEnum value) {
        this.curConvertRule = value;
    }

}
