package com.cieca.estimate.resource.entity.vehicle;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrimColor" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;maxLength value="20"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TrimCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;maxLength value="20"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MoldingCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;maxLength value="20"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrimType", propOrder = {
    "trimColor",
    "trimCode",
    "moldingCode"
})
public class TrimType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "TrimColor")
    protected String trimColor;
    @XmlElement(name = "TrimCode")
    protected String trimCode;
    @XmlElement(name = "MoldingCode")
    protected String moldingCode;

    /**
     * Gets the value of the trimColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrimColor() {
        return trimColor;
    }

    /**
     * Sets the value of the trimColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrimColor(String value) {
        this.trimColor = value;
    }

    /**
     * Gets the value of the trimCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrimCode() {
        return trimCode;
    }

    /**
     * Sets the value of the trimCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrimCode(String value) {
        this.trimCode = value;
    }

    /**
     * Gets the value of the moldingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoldingCode() {
        return moldingCode;
    }

    /**
     * Sets the value of the moldingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoldingCode(String value) {
        this.moldingCode = value;
    }

}