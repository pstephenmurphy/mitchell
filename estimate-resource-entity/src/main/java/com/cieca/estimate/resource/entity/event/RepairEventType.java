package com.cieca.estimate.resource.entity.event;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RepairEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepairEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TargetStartDate" type="{http://www.cieca.com/BMS}Date" minOccurs="0"/>
 *         &lt;element name="ArrivalDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="ActualStartDate" type="{http://www.cieca.com/BMS}Date" minOccurs="0"/>
 *         &lt;element name="ArrivalOdometerReading" type="{http://www.cieca.com/BMS}Integer_Range_0-9999999" minOccurs="0"/>
 *         &lt;element name="RepairAuthorizedInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="RepairAuthorizationMemo" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *         &lt;element name="TargetCompletionDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="ActualCompletionDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="RequestedPickUpDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="ActualPickUpDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="RepairDuration" type="{http://www.cieca.com/BMS}Integer_Range_0-999" minOccurs="0"/>
 *         &lt;element name="RepairDurationUnits" type="{http://www.cieca.com/BMS}Decimal_Range_0-9999.9" minOccurs="0"/>
 *         &lt;element name="RentalAssistedInd" type="{http://www.cieca.com/BMS}Indicator" minOccurs="0"/>
 *         &lt;element name="AcceptanceDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="DropOffDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="GuaranteedCompletionDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="BoardUpIndicator" type="{http://www.cieca.com/BMS}Indicator" minOccurs="0"/>
 *         &lt;element name="BoardUpDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="DepartureOdometerReading" type="{http://www.cieca.com/BMS}Integer_Range_0-9999999" minOccurs="0"/>
 *         &lt;element name="ScheduledArrivalDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="CreatedDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="CustomerAuthorizationDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="InsuranceAuthorizationDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="OriginalTargetCompletionDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="PostedDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="CloseDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="ArchiveDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="ReinspectionDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepairEventType", propOrder = {
    "targetStartDate",
    "arrivalDateTime",
    "actualStartDate",
    "arrivalOdometerReading",
    "repairAuthorizedInd",
    "repairAuthorizationMemo",
    "targetCompletionDateTime",
    "actualCompletionDateTime",
    "requestedPickUpDateTime",
    "actualPickUpDateTime",
    "repairDuration",
    "repairDurationUnits",
    "rentalAssistedInd",
    "acceptanceDateTime",
    "dropOffDateTime",
    "guaranteedCompletionDateTime",
    "boardUpIndicator",
    "boardUpDateTime",
    "departureOdometerReading",
    "scheduledArrivalDateTime",
    "createdDateTime",
    "customerAuthorizationDateTime",
    "insuranceAuthorizationDateTime",
    "originalTargetCompletionDateTime",
    "postedDateTime",
    "closeDateTime",
    "archiveDateTime",
    "reinspectionDateTime"
})
public class RepairEventType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "TargetStartDate")
    protected XMLGregorianCalendar targetStartDate;
    @XmlElement(name = "ArrivalDateTime")
    protected XMLGregorianCalendar arrivalDateTime;
    @XmlElement(name = "ActualStartDate")
    protected XMLGregorianCalendar actualStartDate;
    @XmlElement(name = "ArrivalOdometerReading")
    protected Integer arrivalOdometerReading;
    @XmlElement(name = "RepairAuthorizedInd")
    protected Boolean repairAuthorizedInd;
    @XmlElement(name = "RepairAuthorizationMemo")
    protected String repairAuthorizationMemo;
    @XmlElement(name = "TargetCompletionDateTime")
    protected XMLGregorianCalendar targetCompletionDateTime;
    @XmlElement(name = "ActualCompletionDateTime")
    protected XMLGregorianCalendar actualCompletionDateTime;
    @XmlElement(name = "RequestedPickUpDateTime")
    protected XMLGregorianCalendar requestedPickUpDateTime;
    @XmlElement(name = "ActualPickUpDateTime")
    protected XMLGregorianCalendar actualPickUpDateTime;
    @XmlElement(name = "RepairDuration")
    protected Integer repairDuration;
    @XmlElement(name = "RepairDurationUnits")
    protected BigDecimal repairDurationUnits;
    @XmlElement(name = "RentalAssistedInd")
    protected String rentalAssistedInd;
    @XmlElement(name = "AcceptanceDateTime")
    protected XMLGregorianCalendar acceptanceDateTime;
    @XmlElement(name = "DropOffDateTime")
    protected XMLGregorianCalendar dropOffDateTime;
    @XmlElement(name = "GuaranteedCompletionDateTime")
    protected XMLGregorianCalendar guaranteedCompletionDateTime;
    @XmlElement(name = "BoardUpIndicator")
    protected String boardUpIndicator;
    @XmlElement(name = "BoardUpDateTime")
    protected XMLGregorianCalendar boardUpDateTime;
    @XmlElement(name = "DepartureOdometerReading")
    protected Integer departureOdometerReading;
    @XmlElement(name = "ScheduledArrivalDateTime")
    protected XMLGregorianCalendar scheduledArrivalDateTime;
    @XmlElement(name = "CreatedDateTime")
    protected XMLGregorianCalendar createdDateTime;
    @XmlElement(name = "CustomerAuthorizationDateTime")
    protected XMLGregorianCalendar customerAuthorizationDateTime;
    @XmlElement(name = "InsuranceAuthorizationDateTime")
    protected XMLGregorianCalendar insuranceAuthorizationDateTime;
    @XmlElement(name = "OriginalTargetCompletionDateTime")
    protected XMLGregorianCalendar originalTargetCompletionDateTime;
    @XmlElement(name = "PostedDateTime")
    protected XMLGregorianCalendar postedDateTime;
    @XmlElement(name = "CloseDateTime")
    protected XMLGregorianCalendar closeDateTime;
    @XmlElement(name = "ArchiveDateTime")
    protected XMLGregorianCalendar archiveDateTime;
    @XmlElement(name = "ReinspectionDateTime")
    protected XMLGregorianCalendar reinspectionDateTime;

    /**
     * Gets the value of the targetStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTargetStartDate() {
        return targetStartDate;
    }

    /**
     * Sets the value of the targetStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTargetStartDate(XMLGregorianCalendar value) {
        this.targetStartDate = value;
    }

    /**
     * Gets the value of the arrivalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * Sets the value of the arrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDateTime(XMLGregorianCalendar value) {
        this.arrivalDateTime = value;
    }

    /**
     * Gets the value of the actualStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualStartDate() {
        return actualStartDate;
    }

    /**
     * Sets the value of the actualStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualStartDate(XMLGregorianCalendar value) {
        this.actualStartDate = value;
    }

    /**
     * Gets the value of the arrivalOdometerReading property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArrivalOdometerReading() {
        return arrivalOdometerReading;
    }

    /**
     * Sets the value of the arrivalOdometerReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArrivalOdometerReading(Integer value) {
        this.arrivalOdometerReading = value;
    }

    /**
     * Gets the value of the repairAuthorizedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRepairAuthorizedInd() {
        return repairAuthorizedInd;
    }

    /**
     * Sets the value of the repairAuthorizedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepairAuthorizedInd(Boolean value) {
        this.repairAuthorizedInd = value;
    }

    /**
     * Gets the value of the repairAuthorizationMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepairAuthorizationMemo() {
        return repairAuthorizationMemo;
    }

    /**
     * Sets the value of the repairAuthorizationMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepairAuthorizationMemo(String value) {
        this.repairAuthorizationMemo = value;
    }

    /**
     * Gets the value of the targetCompletionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTargetCompletionDateTime() {
        return targetCompletionDateTime;
    }

    /**
     * Sets the value of the targetCompletionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTargetCompletionDateTime(XMLGregorianCalendar value) {
        this.targetCompletionDateTime = value;
    }

    /**
     * Gets the value of the actualCompletionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualCompletionDateTime() {
        return actualCompletionDateTime;
    }

    /**
     * Sets the value of the actualCompletionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualCompletionDateTime(XMLGregorianCalendar value) {
        this.actualCompletionDateTime = value;
    }

    /**
     * Gets the value of the requestedPickUpDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedPickUpDateTime() {
        return requestedPickUpDateTime;
    }

    /**
     * Sets the value of the requestedPickUpDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedPickUpDateTime(XMLGregorianCalendar value) {
        this.requestedPickUpDateTime = value;
    }

    /**
     * Gets the value of the actualPickUpDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualPickUpDateTime() {
        return actualPickUpDateTime;
    }

    /**
     * Sets the value of the actualPickUpDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualPickUpDateTime(XMLGregorianCalendar value) {
        this.actualPickUpDateTime = value;
    }

    /**
     * Gets the value of the repairDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepairDuration() {
        return repairDuration;
    }

    /**
     * Sets the value of the repairDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepairDuration(Integer value) {
        this.repairDuration = value;
    }

    /**
     * Gets the value of the repairDurationUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepairDurationUnits() {
        return repairDurationUnits;
    }

    /**
     * Sets the value of the repairDurationUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepairDurationUnits(BigDecimal value) {
        this.repairDurationUnits = value;
    }

    /**
     * Gets the value of the rentalAssistedInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalAssistedInd() {
        return rentalAssistedInd;
    }

    /**
     * Sets the value of the rentalAssistedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalAssistedInd(String value) {
        this.rentalAssistedInd = value;
    }

    /**
     * Gets the value of the acceptanceDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptanceDateTime() {
        return acceptanceDateTime;
    }

    /**
     * Sets the value of the acceptanceDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcceptanceDateTime(XMLGregorianCalendar value) {
        this.acceptanceDateTime = value;
    }

    /**
     * Gets the value of the dropOffDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDropOffDateTime() {
        return dropOffDateTime;
    }

    /**
     * Sets the value of the dropOffDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDropOffDateTime(XMLGregorianCalendar value) {
        this.dropOffDateTime = value;
    }

    /**
     * Gets the value of the guaranteedCompletionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGuaranteedCompletionDateTime() {
        return guaranteedCompletionDateTime;
    }

    /**
     * Sets the value of the guaranteedCompletionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGuaranteedCompletionDateTime(XMLGregorianCalendar value) {
        this.guaranteedCompletionDateTime = value;
    }

    /**
     * Gets the value of the boardUpIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardUpIndicator() {
        return boardUpIndicator;
    }

    /**
     * Sets the value of the boardUpIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardUpIndicator(String value) {
        this.boardUpIndicator = value;
    }

    /**
     * Gets the value of the boardUpDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBoardUpDateTime() {
        return boardUpDateTime;
    }

    /**
     * Sets the value of the boardUpDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBoardUpDateTime(XMLGregorianCalendar value) {
        this.boardUpDateTime = value;
    }

    /**
     * Gets the value of the departureOdometerReading property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDepartureOdometerReading() {
        return departureOdometerReading;
    }

    /**
     * Sets the value of the departureOdometerReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDepartureOdometerReading(Integer value) {
        this.departureOdometerReading = value;
    }

    /**
     * Gets the value of the scheduledArrivalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledArrivalDateTime() {
        return scheduledArrivalDateTime;
    }

    /**
     * Sets the value of the scheduledArrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledArrivalDateTime(XMLGregorianCalendar value) {
        this.scheduledArrivalDateTime = value;
    }

    /**
     * Gets the value of the createdDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDateTime() {
        return createdDateTime;
    }

    /**
     * Sets the value of the createdDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDateTime(XMLGregorianCalendar value) {
        this.createdDateTime = value;
    }

    /**
     * Gets the value of the customerAuthorizationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomerAuthorizationDateTime() {
        return customerAuthorizationDateTime;
    }

    /**
     * Sets the value of the customerAuthorizationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomerAuthorizationDateTime(XMLGregorianCalendar value) {
        this.customerAuthorizationDateTime = value;
    }

    /**
     * Gets the value of the insuranceAuthorizationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInsuranceAuthorizationDateTime() {
        return insuranceAuthorizationDateTime;
    }

    /**
     * Sets the value of the insuranceAuthorizationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInsuranceAuthorizationDateTime(XMLGregorianCalendar value) {
        this.insuranceAuthorizationDateTime = value;
    }

    /**
     * Gets the value of the originalTargetCompletionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalTargetCompletionDateTime() {
        return originalTargetCompletionDateTime;
    }

    /**
     * Sets the value of the originalTargetCompletionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalTargetCompletionDateTime(XMLGregorianCalendar value) {
        this.originalTargetCompletionDateTime = value;
    }

    /**
     * Gets the value of the postedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostedDateTime() {
        return postedDateTime;
    }

    /**
     * Sets the value of the postedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostedDateTime(XMLGregorianCalendar value) {
        this.postedDateTime = value;
    }

    /**
     * Gets the value of the closeDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCloseDateTime() {
        return closeDateTime;
    }

    /**
     * Sets the value of the closeDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCloseDateTime(XMLGregorianCalendar value) {
        this.closeDateTime = value;
    }

    /**
     * Gets the value of the archiveDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArchiveDateTime() {
        return archiveDateTime;
    }

    /**
     * Sets the value of the archiveDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArchiveDateTime(XMLGregorianCalendar value) {
        this.archiveDateTime = value;
    }

    /**
     * Gets the value of the reinspectionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReinspectionDateTime() {
        return reinspectionDateTime;
    }

    /**
     * Sets the value of the reinspectionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReinspectionDateTime(XMLGregorianCalendar value) {
        this.reinspectionDateTime = value;
    }

}
