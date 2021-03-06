package com.cieca.estimate.resource.entity.loss;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.cieca.estimate.resource.entity.address.AddressType;
import com.cieca.estimate.resource.entity.address.StateProvinceEnum;
import com.cieca.estimate.resource.entity.damage.DamageSeverityEnum;


/**
 * <p>Java class for FactsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FactsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccidentDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="LossDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="ReportedDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="CauseOfLoss" type="{http://www.cieca.com/BMS}CauseofLossEnum" minOccurs="0"/>
 *         &lt;element name="LossDescCode" type="{http://www.cieca.com/BMS}LossDescriptionEnum" minOccurs="0"/>
 *         &lt;element name="LossDesc" type="{http://www.cieca.com/BMS}LossDescType" minOccurs="0"/>
 *         &lt;element name="DamagedObjectDesc" type="{http://www.cieca.com/BMS}DamagedObjectDescType" minOccurs="0"/>
 *         &lt;element name="VehicleRecoveryDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="VehicleRecoveryCondition" type="{http://www.cieca.com/BMS}VehicleRecoveryConditionEnum" minOccurs="0"/>
 *         &lt;element name="TheftInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="CatNum" type="{http://www.cieca.com/BMS}CatNumType" minOccurs="0"/>
 *         &lt;element name="CatVehicleInspectionNum" type="{http://www.cieca.com/BMS}CatVehicleInspectionNumType" minOccurs="0"/>
 *         &lt;element name="InjuryInd" type="{http://www.cieca.com/BMS}Indicator" minOccurs="0"/>
 *         &lt;element name="AirbagDeployedInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="NumofAirbagsDeployed" type="{http://www.cieca.com/BMS}NumofAirbagsDeployedType" minOccurs="0"/>
 *         &lt;element name="PrimaryPOI" type="{http://www.cieca.com/BMS}PointOfImpactType" minOccurs="0"/>
 *         &lt;element name="SecondaryPOI" type="{http://www.cieca.com/BMS}PointOfImpactType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DamageMemo" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *         &lt;element name="LossMemo" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *         &lt;element name="DamageSeverity" type="{http://www.cieca.com/BMS}DamageSeverityEnum" minOccurs="0"/>
 *         &lt;element name="LossOccurranceStateProvince" type="{http://www.cieca.com/BMS}StateProvinceEnum" minOccurs="0"/>
 *         &lt;element name="MassachusettsTownCode" type="{http://www.cieca.com/BMS}MassachusettsTownEnum" minOccurs="0"/>
 *         &lt;element name="LossLocationAddress" type="{http://www.cieca.com/BMS}AddressType" minOccurs="0"/>
 *         &lt;element name="LossLocationDesc" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *         &lt;element name="StatuteDate" type="{http://www.cieca.com/BMS}Date" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="StateLitigationVenue" type="{http://www.cieca.com/BMS}OpenEnum"/>
 *           &lt;element name="FederalLitigationVenue" type="{http://www.cieca.com/BMS}FederalLitigationVenueCodeEnum"/>
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
@XmlType(name = "FactsType", propOrder = {
    "accidentDateTime",
    "lossDateTime",
    "reportedDateTime",
    "causeOfLoss",
    "lossDescCode",
    "lossDesc",
    "damagedObjectDesc",
    "vehicleRecoveryDateTime",
    "vehicleRecoveryCondition",
    "theftInd",
    "catNum",
    "catVehicleInspectionNum",
    "injuryInd",
    "airbagDeployedInd",
    "numofAirbagsDeployed",
    "primaryPOI",
    "secondaryPOI",
    "damageMemo",
    "lossMemo",
    "damageSeverity",
    "lossOccurranceStateProvince",
    "massachusettsTownCode",
    "lossLocationAddress",
    "lossLocationDesc",
    "statuteDate",
    "stateLitigationVenue",
    "federalLitigationVenue"
})
public class FactsType implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "AccidentDateTime")
    protected XMLGregorianCalendar accidentDateTime;
    @XmlElement(name = "LossDateTime")
    protected XMLGregorianCalendar lossDateTime;
    @XmlElement(name = "ReportedDateTime")
    protected XMLGregorianCalendar reportedDateTime;
    @XmlElement(name = "CauseOfLoss")
    protected CauseofLossEnum causeOfLoss;
    @XmlElement(name = "LossDescCode")
    protected LossDescriptionEnum lossDescCode;
    @XmlElement(name = "LossDesc")
    protected String lossDesc;
    @XmlElement(name = "DamagedObjectDesc")
    protected String damagedObjectDesc;
    @XmlElement(name = "VehicleRecoveryDateTime")
    protected XMLGregorianCalendar vehicleRecoveryDateTime;
    @XmlElement(name = "VehicleRecoveryCondition")
    protected VehicleRecoveryConditionEnum vehicleRecoveryCondition;
    @XmlElement(name = "TheftInd")
    protected Boolean theftInd;
    @XmlElement(name = "CatNum")
    protected String catNum;
    @XmlElement(name = "CatVehicleInspectionNum")
    protected String catVehicleInspectionNum;
    @XmlElement(name = "InjuryInd")
    protected String injuryInd;
    @XmlElement(name = "AirbagDeployedInd")
    protected Boolean airbagDeployedInd;
    @XmlElement(name = "NumofAirbagsDeployed")
    protected Integer numofAirbagsDeployed;
    @XmlElement(name = "PrimaryPOI")
    protected PointOfImpactType primaryPOI;
    @XmlElement(name = "SecondaryPOI")
    protected List<PointOfImpactType> secondaryPOI;
    @XmlElement(name = "DamageMemo")
    protected String damageMemo;
    @XmlElement(name = "LossMemo")
    protected String lossMemo;
    @XmlElement(name = "DamageSeverity")
    protected DamageSeverityEnum damageSeverity;
    @XmlElement(name = "LossOccurranceStateProvince")
    protected StateProvinceEnum lossOccurranceStateProvince;
    @XmlElement(name = "MassachusettsTownCode")
    protected MassachusettsTownEnum massachusettsTownCode;
    @XmlElement(name = "LossLocationAddress")
    protected AddressType lossLocationAddress;
    @XmlElement(name = "LossLocationDesc")
    protected String lossLocationDesc;
    @XmlElement(name = "StatuteDate")
    protected XMLGregorianCalendar statuteDate;
    @XmlElement(name = "StateLitigationVenue")
    protected String stateLitigationVenue;
    @XmlElement(name = "FederalLitigationVenue")
    protected FederalLitigationVenueCodeEnum federalLitigationVenue;

    /**
     * Gets the value of the accidentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccidentDateTime() {
        return accidentDateTime;
    }

    /**
     * Sets the value of the accidentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccidentDateTime(XMLGregorianCalendar value) {
        this.accidentDateTime = value;
    }

    /**
     * Gets the value of the lossDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLossDateTime() {
        return lossDateTime;
    }

    /**
     * Sets the value of the lossDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLossDateTime(XMLGregorianCalendar value) {
        this.lossDateTime = value;
    }

    /**
     * Gets the value of the reportedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportedDateTime() {
        return reportedDateTime;
    }

    /**
     * Sets the value of the reportedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportedDateTime(XMLGregorianCalendar value) {
        this.reportedDateTime = value;
    }

    /**
     * Gets the value of the causeOfLoss property.
     * 
     * @return
     *     possible object is
     *     {@link CauseofLossEnum }
     *     
     */
    public CauseofLossEnum getCauseOfLoss() {
        return causeOfLoss;
    }

    /**
     * Sets the value of the causeOfLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link CauseofLossEnum }
     *     
     */
    public void setCauseOfLoss(CauseofLossEnum value) {
        this.causeOfLoss = value;
    }

    /**
     * Gets the value of the lossDescCode property.
     * 
     * @return
     *     possible object is
     *     {@link LossDescriptionEnum }
     *     
     */
    public LossDescriptionEnum getLossDescCode() {
        return lossDescCode;
    }

    /**
     * Sets the value of the lossDescCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LossDescriptionEnum }
     *     
     */
    public void setLossDescCode(LossDescriptionEnum value) {
        this.lossDescCode = value;
    }

    /**
     * Gets the value of the lossDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossDesc() {
        return lossDesc;
    }

    /**
     * Sets the value of the lossDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossDesc(String value) {
        this.lossDesc = value;
    }

    /**
     * Gets the value of the damagedObjectDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDamagedObjectDesc() {
        return damagedObjectDesc;
    }

    /**
     * Sets the value of the damagedObjectDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDamagedObjectDesc(String value) {
        this.damagedObjectDesc = value;
    }

    /**
     * Gets the value of the vehicleRecoveryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVehicleRecoveryDateTime() {
        return vehicleRecoveryDateTime;
    }

    /**
     * Sets the value of the vehicleRecoveryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVehicleRecoveryDateTime(XMLGregorianCalendar value) {
        this.vehicleRecoveryDateTime = value;
    }

    /**
     * Gets the value of the vehicleRecoveryCondition property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRecoveryConditionEnum }
     *     
     */
    public VehicleRecoveryConditionEnum getVehicleRecoveryCondition() {
        return vehicleRecoveryCondition;
    }

    /**
     * Sets the value of the vehicleRecoveryCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRecoveryConditionEnum }
     *     
     */
    public void setVehicleRecoveryCondition(VehicleRecoveryConditionEnum value) {
        this.vehicleRecoveryCondition = value;
    }

    /**
     * Gets the value of the theftInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTheftInd() {
        return theftInd;
    }

    /**
     * Sets the value of the theftInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTheftInd(Boolean value) {
        this.theftInd = value;
    }

    /**
     * Gets the value of the catNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatNum() {
        return catNum;
    }

    /**
     * Sets the value of the catNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatNum(String value) {
        this.catNum = value;
    }

    /**
     * Gets the value of the catVehicleInspectionNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatVehicleInspectionNum() {
        return catVehicleInspectionNum;
    }

    /**
     * Sets the value of the catVehicleInspectionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatVehicleInspectionNum(String value) {
        this.catVehicleInspectionNum = value;
    }

    /**
     * Gets the value of the injuryInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInjuryInd() {
        return injuryInd;
    }

    /**
     * Sets the value of the injuryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInjuryInd(String value) {
        this.injuryInd = value;
    }

    /**
     * Gets the value of the airbagDeployedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAirbagDeployedInd() {
        return airbagDeployedInd;
    }

    /**
     * Sets the value of the airbagDeployedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAirbagDeployedInd(Boolean value) {
        this.airbagDeployedInd = value;
    }

    /**
     * Gets the value of the numofAirbagsDeployed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumofAirbagsDeployed() {
        return numofAirbagsDeployed;
    }

    /**
     * Sets the value of the numofAirbagsDeployed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumofAirbagsDeployed(Integer value) {
        this.numofAirbagsDeployed = value;
    }

    /**
     * Gets the value of the primaryPOI property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfImpactType }
     *     
     */
    public PointOfImpactType getPrimaryPOI() {
        return primaryPOI;
    }

    /**
     * Sets the value of the primaryPOI property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfImpactType }
     *     
     */
    public void setPrimaryPOI(PointOfImpactType value) {
        this.primaryPOI = value;
    }

    /**
     * Gets the value of the secondaryPOI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryPOI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryPOI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfImpactType }
     * 
     * 
     */
    public List<PointOfImpactType> getSecondaryPOI() {
        if (secondaryPOI == null) {
            secondaryPOI = new ArrayList<PointOfImpactType>();
        }
        return this.secondaryPOI;
    }

    /**
     * Gets the value of the damageMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDamageMemo() {
        return damageMemo;
    }

    /**
     * Sets the value of the damageMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDamageMemo(String value) {
        this.damageMemo = value;
    }

    /**
     * Gets the value of the lossMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossMemo() {
        return lossMemo;
    }

    /**
     * Sets the value of the lossMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossMemo(String value) {
        this.lossMemo = value;
    }

    /**
     * Gets the value of the damageSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link DamageSeverityEnum }
     *     
     */
    public DamageSeverityEnum getDamageSeverity() {
        return damageSeverity;
    }

    /**
     * Sets the value of the damageSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DamageSeverityEnum }
     *     
     */
    public void setDamageSeverity(DamageSeverityEnum value) {
        this.damageSeverity = value;
    }

    /**
     * Gets the value of the lossOccurranceStateProvince property.
     * 
     * @return
     *     possible object is
     *     {@link StateProvinceEnum }
     *     
     */
    public StateProvinceEnum getLossOccurranceStateProvince() {
        return lossOccurranceStateProvince;
    }

    /**
     * Sets the value of the lossOccurranceStateProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvinceEnum }
     *     
     */
    public void setLossOccurranceStateProvince(StateProvinceEnum value) {
        this.lossOccurranceStateProvince = value;
    }

    /**
     * Gets the value of the massachusettsTownCode property.
     * 
     * @return
     *     possible object is
     *     {@link MassachusettsTownEnum }
     *     
     */
    public MassachusettsTownEnum getMassachusettsTownCode() {
        return massachusettsTownCode;
    }

    /**
     * Sets the value of the massachusettsTownCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassachusettsTownEnum }
     *     
     */
    public void setMassachusettsTownCode(MassachusettsTownEnum value) {
        this.massachusettsTownCode = value;
    }

    /**
     * Gets the value of the lossLocationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getLossLocationAddress() {
        return lossLocationAddress;
    }

    /**
     * Sets the value of the lossLocationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setLossLocationAddress(AddressType value) {
        this.lossLocationAddress = value;
    }

    /**
     * Gets the value of the lossLocationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossLocationDesc() {
        return lossLocationDesc;
    }

    /**
     * Sets the value of the lossLocationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossLocationDesc(String value) {
        this.lossLocationDesc = value;
    }

    /**
     * Gets the value of the statuteDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatuteDate() {
        return statuteDate;
    }

    /**
     * Sets the value of the statuteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatuteDate(XMLGregorianCalendar value) {
        this.statuteDate = value;
    }

    /**
     * Gets the value of the stateLitigationVenue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateLitigationVenue() {
        return stateLitigationVenue;
    }

    /**
     * Sets the value of the stateLitigationVenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateLitigationVenue(String value) {
        this.stateLitigationVenue = value;
    }

    /**
     * Gets the value of the federalLitigationVenue property.
     * 
     * @return
     *     possible object is
     *     {@link FederalLitigationVenueCodeEnum }
     *     
     */
    public FederalLitigationVenueCodeEnum getFederalLitigationVenue() {
        return federalLitigationVenue;
    }

    /**
     * Sets the value of the federalLitigationVenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link FederalLitigationVenueCodeEnum }
     *     
     */
    public void setFederalLitigationVenue(FederalLitigationVenueCodeEnum value) {
        this.federalLitigationVenue = value;
    }

}
