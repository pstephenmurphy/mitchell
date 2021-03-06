package com.cieca.estimate.resource.entity.vehicle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.attachment.FileAttachmentType;
import com.cieca.estimate.resource.entity.vehicle.condition.ConditionType;
import com.cieca.estimate.resource.entity.vehicle.description.VehicleDescType;
import com.cieca.estimate.resource.entity.vehicle.license.LicenseType;
import com.cieca.estimate.resource.entity.vehicle.paint.PaintType;
import com.cieca.estimate.resource.entity.vehicle.power.PowerTrainType;
import com.cieca.estimate.resource.entity.vehicle.valuation.ValuationTypeType;
import com.cieca.estimate.resource.entity.vehicle.vin.VINInfoType;


/**
 * <p>Java class for VehicleInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VINInfo" type="{http://www.cieca.com/BMS}VINInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="License" type="{http://www.cieca.com/BMS}LicenseType" minOccurs="0"/>
 *         &lt;element name="VehicleDesc" type="{http://www.cieca.com/BMS}VehicleDescType" minOccurs="0"/>
 *         &lt;element name="Paint" type="{http://www.cieca.com/BMS}PaintType" minOccurs="0"/>
 *         &lt;element name="Body" type="{http://www.cieca.com/BMS}BodyType" minOccurs="0"/>
 *         &lt;element name="Powertrain" type="{http://www.cieca.com/BMS}PowerTrainType" minOccurs="0"/>
 *         &lt;element name="Condition" type="{http://www.cieca.com/BMS}CondType" minOccurs="0"/>
 *         &lt;element name="Valuation" type="{http://www.cieca.com/BMS}ValuationTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VehicleMemo" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *         &lt;element name="PolicyVehicleNum" type="{http://www.cieca.com/BMS}Char_10" minOccurs="0"/>
 *         &lt;element name="LossVehicleNum" type="{http://www.cieca.com/BMS}Char_10" minOccurs="0"/>
 *         &lt;element name="LienholderInd" type="{http://www.cieca.com/BMS}Indicator" minOccurs="0"/>
 *         &lt;element name="FileAttachment" type="{http://www.cieca.com/BMS}FileAttachmentType" minOccurs="0"/>
 *         &lt;element name="CustomElement" type="{http://www.cieca.com/BMS}CustomElementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleInfoType", propOrder = {
    "vinInfo",
    "license",
    "vehicleDesc",
    "paint",
    "body",
    "powertrain",
    "condition",
    "valuation",
    "vehicleMemo",
    "policyVehicleNum",
    "lossVehicleNum",
    "lienholderInd",
    "fileAttachment",
    "customElement"
})
@XmlRootElement(name = "VehicleInfoType")
public class VehicleInfoType implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "VINInfo")
    protected List<VINInfoType> vinInfo;
    @XmlElement(name = "License")
    protected LicenseType license;
    @XmlElement(name = "VehicleDesc")
    protected VehicleDescType vehicleDesc;
    @XmlElement(name = "Paint")
    protected PaintType paint;
    @XmlElement(name = "Body")
    protected BodyType body;
    @XmlElement(name = "Powertrain")
    protected PowerTrainType powertrain;
    @XmlElement(name = "Condition")
    protected ConditionType condition;
    @XmlElement(name = "Valuation")
    protected List<ValuationTypeType> valuation;
    @XmlElement(name = "VehicleMemo")
    protected String vehicleMemo;
    @XmlElement(name = "PolicyVehicleNum")
    protected String policyVehicleNum;
    @XmlElement(name = "LossVehicleNum")
    protected String lossVehicleNum;
    @XmlElement(name = "LienholderInd")
    protected String lienholderInd;
    @XmlElement(name = "FileAttachment")
    protected FileAttachmentType fileAttachment;
    @XmlElement(name = "CustomElement")
    protected List<CustomElementType> customElement;

    /**
     * Gets the value of the vinInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vinInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVINInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VINInfoType }
     * 
     * 
     */
    public List<VINInfoType> getVINInfo() {
        if (vinInfo == null) {
            vinInfo = new ArrayList<VINInfoType>();
        }
        return this.vinInfo;
    }

    /**
     * Gets the value of the license property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseType }
     *     
     */
    public LicenseType getLicense() {
        return license;
    }

    /**
     * Sets the value of the license property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseType }
     *     
     */
    public void setLicense(LicenseType value) {
        this.license = value;
    }

    /**
     * Gets the value of the vehicleDesc property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleDescType }
     *     
     */
    public VehicleDescType getVehicleDesc() {
        return vehicleDesc;
    }

    /**
     * Sets the value of the vehicleDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleDescType }
     *     
     */
    public void setVehicleDesc(VehicleDescType value) {
        this.vehicleDesc = value;
    }

    /**
     * Gets the value of the paint property.
     * 
     * @return
     *     possible object is
     *     {@link PaintType }
     *     
     */
    public PaintType getPaint() {
        return paint;
    }

    /**
     * Sets the value of the paint property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaintType }
     *     
     */
    public void setPaint(PaintType value) {
        this.paint = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link BodyType }
     *     
     */
    public BodyType getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyType }
     *     
     */
    public void setBody(BodyType value) {
        this.body = value;
    }

    /**
     * Gets the value of the powertrain property.
     * 
     * @return
     *     possible object is
     *     {@link PowerTrainType }
     *     
     */
    public PowerTrainType getPowertrain() {
        return powertrain;
    }

    /**
     * Sets the value of the powertrain property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerTrainType }
     *     
     */
    public void setPowertrain(PowerTrainType value) {
        this.powertrain = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionType }
     *     
     */
    public ConditionType getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionType }
     *     
     */
    public void setCondition(ConditionType value) {
        this.condition = value;
    }

    /**
     * Gets the value of the valuation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valuation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValuation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValuationTypeType }
     * 
     * 
     */
    public List<ValuationTypeType> getValuation() {
        if (valuation == null) {
            valuation = new ArrayList<ValuationTypeType>();
        }
        return this.valuation;
    }

    /**
     * Gets the value of the vehicleMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleMemo() {
        return vehicleMemo;
    }

    /**
     * Sets the value of the vehicleMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleMemo(String value) {
        this.vehicleMemo = value;
    }

    /**
     * Gets the value of the policyVehicleNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyVehicleNum() {
        return policyVehicleNum;
    }

    /**
     * Sets the value of the policyVehicleNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyVehicleNum(String value) {
        this.policyVehicleNum = value;
    }

    /**
     * Gets the value of the lossVehicleNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossVehicleNum() {
        return lossVehicleNum;
    }

    /**
     * Sets the value of the lossVehicleNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossVehicleNum(String value) {
        this.lossVehicleNum = value;
    }

    /**
     * Gets the value of the lienholderInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLienholderInd() {
        return lienholderInd;
    }

    /**
     * Sets the value of the lienholderInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLienholderInd(String value) {
        this.lienholderInd = value;
    }

    /**
     * Gets the value of the fileAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link FileAttachmentType }
     *     
     */
    public FileAttachmentType getFileAttachment() {
        return fileAttachment;
    }

    /**
     * Sets the value of the fileAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileAttachmentType }
     *     
     */
    public void setFileAttachment(FileAttachmentType value) {
        this.fileAttachment = value;
    }

    /**
     * Gets the value of the customElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomElementType }
     * 
     * 
     */
    public List<CustomElementType> getCustomElement() {
        if (customElement == null) {
            customElement = new ArrayList<CustomElementType>();
        }
        return this.customElement;
    }

}
