package com.cieca.estimate.resource.entity.vehicle.description;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.vehicle.UnitofMeasureOpenEnum;

/**
 * <p>Java class for OdometerInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OdometerInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OdometerInd" type="{http://www.cieca.com/BMS}Boolean"/>
 *         &lt;element name="OdometerReading" type="{http://www.cieca.com/BMS}Integer_Range_0-9999999" minOccurs="0"/>
 *         &lt;element name="OdometerReadingCode" type="{http://www.cieca.com/BMS}OdometerReadingCodeClosedEnumType" minOccurs="0"/>
 *         &lt;element name="OdometerReadingMeasure" type="{http://www.cieca.com/BMS}UnitOfMeasureOpenEnumType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OdometerInfoType", propOrder = {
    "odometerInd",
    "odometerReading",
    "odometerReadingCode",
    "odometerReadingMeasure"
})
public class OdometerInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "OdometerInd")
    protected boolean odometerInd;
    @XmlElement(name = "OdometerReading")
    protected Integer odometerReading;
    @XmlElement(name = "OdometerReadingCode")
    protected OdometerReadingCodeEnum odometerReadingCode;
    @XmlElement(name = "OdometerReadingMeasure")
    protected UnitofMeasureOpenEnum odometerReadingMeasure;

    /**
     * Gets the value of the odometerInd property.
     * 
     */
    public boolean isOdometerInd() {
        return odometerInd;
    }

    /**
     * Sets the value of the odometerInd property.
     * 
     */
    public void setOdometerInd(boolean value) {
        this.odometerInd = value;
    }

    /**
     * Gets the value of the odometerReading property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOdometerReading() {
        return odometerReading;
    }

    /**
     * Sets the value of the odometerReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOdometerReading(Integer value) {
        this.odometerReading = value;
    }

    /**
     * Gets the value of the odometerReadingCode property.
     * 
     * @return
     *     possible object is
     *     {@link OdometerReadingCodeClosedEnumType }
     *     
     */
    public OdometerReadingCodeEnum getOdometerReadingCode() {
        return odometerReadingCode;
    }

    /**
     * Sets the value of the odometerReadingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OdometerReadingCodeClosedEnumType }
     *     
     */
    public void setOdometerReadingCode(OdometerReadingCodeEnum value) {
        this.odometerReadingCode = value;
    }

    /**
     * Gets the value of the odometerReadingMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureOpenEnumType }
     *     
     */
    public UnitofMeasureOpenEnum getOdometerReadingMeasure() {
        return odometerReadingMeasure;
    }

    /**
     * Sets the value of the odometerReadingMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureOpenEnumType }
     *     
     */
    public void setOdometerReadingMeasure(UnitofMeasureOpenEnum value) {
        this.odometerReadingMeasure = value;
    }

}
