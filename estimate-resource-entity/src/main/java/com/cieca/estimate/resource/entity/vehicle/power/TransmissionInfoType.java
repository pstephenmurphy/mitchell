package com.cieca.estimate.resource.entity.vehicle.power;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.vehicle.options.OptionsType;


/**
 * <p>Java class for TransmissionInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransmissionInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransmissionCode" type="{http://www.cieca.com/BMS}TransmissionCodeClosedEnumType"/>
 *         &lt;element name="TransmissionDesc" type="{http://www.cieca.com/BMS}Char_80" minOccurs="0"/>
 *         &lt;element name="TransmissionOptions" type="{http://www.cieca.com/BMS}OptionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransmissionInfoType", propOrder = {
    "transmissionCode",
    "transmissionDesc",
    "transmissionOptions"
})
public class TransmissionInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "TransmissionCode", required = true)
    protected String transmissionCode;
    @XmlElement(name = "TransmissionDesc")
    protected String transmissionDesc;
    @XmlElement(name = "TransmissionOptions")
    protected OptionsType transmissionOptions;

    /**
     * Gets the value of the transmissionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmissionCode() {
        return transmissionCode;
    }

    /**
     * Sets the value of the transmissionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmissionCode(String value) {
        this.transmissionCode = value;
    }

    /**
     * Gets the value of the transmissionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmissionDesc() {
        return transmissionDesc;
    }

    /**
     * Sets the value of the transmissionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmissionDesc(String value) {
        this.transmissionDesc = value;
    }

    /**
     * Gets the value of the transmissionOptions property.
     * 
     * @return
     *     possible object is
     *     {@link OptionsType }
     *     
     */
    public OptionsType getTransmissionOptions() {
        return transmissionOptions;
    }

    /**
     * Sets the value of the transmissionOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsType }
     *     
     */
    public void setTransmissionOptions(OptionsType value) {
        this.transmissionOptions = value;
    }

}
