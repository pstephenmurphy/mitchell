package com.cieca.estimate.resource.entity.vehicle;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomElementID" type="{http://www.cieca.com/BMS}Char_80"/>
 *         &lt;choice>
 *           &lt;element name="CustomElementText" type="{http://www.cieca.com/BMS}C"/>
 *           &lt;element name="CustomElementCurrency" type="{http://www.cieca.com/BMS}Currency"/>
 *           &lt;element name="CustomElementDecimal" type="{http://www.cieca.com/BMS}Decimal"/>
 *           &lt;element name="CustomElementDate" type="{http://www.cieca.com/BMS}Date"/>
 *           &lt;element name="CustomElementDateTime" type="{http://www.cieca.com/BMS}DateTime"/>
 *           &lt;element name="CustomElementInd" type="{http://www.cieca.com/BMS}Indicator"/>
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
@XmlType(name = "CustomElementType", propOrder = {
    "customElementID",
    "customElementText",
    "customElementCurrency",
    "customElementDecimal",
    "customElementDate",
    "customElementDateTime",
    "customElementInd"
})
public class CustomElementType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "CustomElementID", required = true)
    protected String customElementID;
    @XmlElement(name = "CustomElementText")
    protected String customElementText;
    @XmlElement(name = "CustomElementCurrency")
    protected BigDecimal customElementCurrency;
    @XmlElement(name = "CustomElementDecimal")
    protected BigDecimal customElementDecimal;
    @XmlElement(name = "CustomElementDate")
    protected XMLGregorianCalendar customElementDate;
    @XmlElement(name = "CustomElementDateTime")
    protected XMLGregorianCalendar customElementDateTime;
    @XmlElement(name = "CustomElementInd")
    protected String customElementInd;

    /**
     * Gets the value of the customElementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomElementID() {
        return customElementID;
    }

    /**
     * Sets the value of the customElementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomElementID(String value) {
        this.customElementID = value;
    }

    /**
     * Gets the value of the customElementText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomElementText() {
        return customElementText;
    }

    /**
     * Sets the value of the customElementText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomElementText(String value) {
        this.customElementText = value;
    }

    /**
     * Gets the value of the customElementCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomElementCurrency() {
        return customElementCurrency;
    }

    /**
     * Sets the value of the customElementCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomElementCurrency(BigDecimal value) {
        this.customElementCurrency = value;
    }

    /**
     * Gets the value of the customElementDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomElementDecimal() {
        return customElementDecimal;
    }

    /**
     * Sets the value of the customElementDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomElementDecimal(BigDecimal value) {
        this.customElementDecimal = value;
    }

    /**
     * Gets the value of the customElementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomElementDate() {
        return customElementDate;
    }

    /**
     * Sets the value of the customElementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomElementDate(XMLGregorianCalendar value) {
        this.customElementDate = value;
    }

    /**
     * Gets the value of the customElementDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomElementDateTime() {
        return customElementDateTime;
    }

    /**
     * Sets the value of the customElementDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomElementDateTime(XMLGregorianCalendar value) {
        this.customElementDateTime = value;
    }

    /**
     * Gets the value of the customElementInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomElementInd() {
        return customElementInd;
    }

    /**
     * Sets the value of the customElementInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomElementInd(String value) {
        this.customElementInd = value;
    }

}
