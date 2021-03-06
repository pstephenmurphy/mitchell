package com.cieca.estimate.resource.entity.vehicle.vin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VINInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VINInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="VINAvailabilityCode" type="{http://www.cieca.com/BMS}VINAvailabilityEnum"/>
 *           &lt;element name="VIN" maxOccurs="unbounded">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="VINSource" type="{http://www.cieca.com/BMS}VINSourceEnum" minOccurs="0"/>
 *                     &lt;element name="VINFormat" type="{http://www.cieca.com/BMS}VINFormatEnum" minOccurs="0"/>
 *                     &lt;element name="VINNum">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.cieca.com/BMS}C">
 *                           &lt;minLength value="1"/>
 *                           &lt;maxLength value="30"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="VINDecodeCorrectInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *                     &lt;element name="VINDecodeStatus" type="{http://www.cieca.com/BMS}VINDecodeStatusEnum" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
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
@XmlType(name = "VINInfoType", propOrder = {
    "vinAvailabilityCode",
    "vin"
})
public class VINInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "VINAvailabilityCode")
    protected VINAvailabilityEnum vinAvailabilityCode;
    @XmlElement(name = "VIN")
    protected List<VINType> vin;

    /**
     * Gets the value of the vinAvailabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link VINAvailabilityEnum }
     *     
     */
    public VINAvailabilityEnum getVINAvailabilityCode() {
        return vinAvailabilityCode;
    }

    /**
     * Sets the value of the vinAvailabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VINAvailabilityEnum }
     *     
     */
    public void setVINAvailabilityCode(VINAvailabilityEnum value) {
        this.vinAvailabilityCode = value;
    }

    /**
     * Gets the value of the vin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VINType }
     * 
     * 
     */
    public List<VINType> getVIN() {
        if (vin == null) {
            vin = new ArrayList<VINType>();
        }
        return this.vin;
    }



}
