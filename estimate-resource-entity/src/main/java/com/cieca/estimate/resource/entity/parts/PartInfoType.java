package com.cieca.estimate.resource.entity.parts;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.adjustment.PriceAdjustmentType;
import com.cieca.estimate.resource.entity.rate.RateTypeEnum;


/**
 * <p>Java class for PartInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartType" type="{http://www.cieca.com/BMS}PartTypeEnum"/>
 *         &lt;element name="PartNum" type="{http://www.cieca.com/BMS}PartNumType" minOccurs="0"/>
 *         &lt;element name="OEMPartNum" type="{http://www.cieca.com/BMS}PartNumType" minOccurs="0"/>
 *         &lt;element name="NonOEM" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PartType" type="{http://www.cieca.com/BMS}PartTypeEnum"/>
 *                   &lt;element name="NonOEMPartNum" type="{http://www.cieca.com/BMS}PartNumType"/>
 *                   &lt;element name="NonOEMPartPrice" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *                   &lt;element name="NonOEMPartDesc" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *                   &lt;element name="SupplierRefNum" type="{http://www.cieca.com/BMS}SupplierRefNumType"/>
 *                   &lt;element name="PartSelectedInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PartPrice" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="OEMPartPrice" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="PriceAdjustment" type="{http://www.cieca.com/BMS}PriceAdjustmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="TaxableInd" type="{http://www.cieca.com/BMS}Boolean"/>
 *           &lt;element name="AppliedTaxes" type="{http://www.cieca.com/BMS}RateTypeEnum"/>
 *         &lt;/choice>
 *         &lt;element name="AfterMarketUsage" type="{http://www.cieca.com/BMS}AftermarketUsageEnum" minOccurs="0"/>
 *         &lt;element name="CertificationType" type="{http://www.cieca.com/BMS}CertificationTypeEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PriceJudgmentInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="AlternatePartInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="GlassPartInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="PriceInclInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.cieca.com/BMS}Integer" minOccurs="0"/>
 *         &lt;element name="PartStatus" type="{http://www.cieca.com/BMS}InventoryStatusEnum" minOccurs="0"/>
 *         &lt;element name="GlassKit" type="{http://www.cieca.com/BMS}GlassKitType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartInfoType", propOrder = {
    "partType",
    "partNum",
    "oemPartNum",
    "nonOEM",
    "partPrice",
    "oemPartPrice",
    "priceAdjustment",
    "taxableInd",
    "appliedTaxes",
    "afterMarketUsage",
    "certificationType",
    "priceJudgmentInd",
    "alternatePartInd",
    "glassPartInd",
    "priceInclInd",
    "quantity",
    "partStatus",
    "glassKit"
})
public class PartInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "PartType", required = true)
    protected PartTypeEnum partType;
    @XmlElement(name = "PartNum")
    protected String partNum;
    @XmlElement(name = "OEMPartNum")
    protected String oemPartNum;
    @XmlElement(name = "NonOEM")
    protected List<NonOEMType> nonOEM;
    @XmlElement(name = "PartPrice")
    protected BigDecimal partPrice;
    @XmlElement(name = "OEMPartPrice")
    protected BigDecimal oemPartPrice;
    @XmlElement(name = "PriceAdjustment")
    protected List<PriceAdjustmentType> priceAdjustment;
    @XmlElement(name = "TaxableInd")
    protected Boolean taxableInd;
    @XmlElement(name = "AppliedTaxes")
    protected RateTypeEnum appliedTaxes;
    @XmlElement(name = "AfterMarketUsage")
    protected AftermarketUsageEnum afterMarketUsage;
    @XmlElement(name = "CertificationType")
    protected List<CertificationTypeEnum> certificationType;
    @XmlElement(name = "PriceJudgmentInd")
    protected Boolean priceJudgmentInd;
    @XmlElement(name = "AlternatePartInd")
    protected Boolean alternatePartInd;
    @XmlElement(name = "GlassPartInd")
    protected Boolean glassPartInd;
    @XmlElement(name = "PriceInclInd")
    protected Boolean priceInclInd;
    @XmlElement(name = "Quantity")
    protected BigInteger quantity;
    @XmlElement(name = "PartStatus")
    protected InventoryStatusEnum partStatus;
    @XmlElement(name = "GlassKit")
    protected GlassKitType glassKit;

    /**
     * Gets the value of the partType property.
     * 
     * @return
     *     possible object is
     *     {@link PartTypeEnum }
     *     
     */
    public PartTypeEnum getPartType() {
        return partType;
    }

    /**
     * Sets the value of the partType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartTypeEnum }
     *     
     */
    public void setPartType(PartTypeEnum value) {
        this.partType = value;
    }

    /**
     * Gets the value of the partNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNum() {
        return partNum;
    }

    /**
     * Sets the value of the partNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNum(String value) {
        this.partNum = value;
    }

    /**
     * Gets the value of the oemPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOEMPartNum() {
        return oemPartNum;
    }

    /**
     * Sets the value of the oemPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOEMPartNum(String value) {
        this.oemPartNum = value;
    }

    /**
     * Gets the value of the nonOEM property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonOEM property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonOEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonOEMType }
     * 
     * 
     */
    public List<NonOEMType> getNonOEM() {
        if (nonOEM == null) {
            nonOEM = new ArrayList<NonOEMType>();
        }
        return this.nonOEM;
    }

    /**
     * Gets the value of the partPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartPrice() {
        return partPrice;
    }

    /**
     * Sets the value of the partPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartPrice(BigDecimal value) {
        this.partPrice = value;
    }

    /**
     * Gets the value of the oemPartPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOEMPartPrice() {
        return oemPartPrice;
    }

    /**
     * Sets the value of the oemPartPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOEMPartPrice(BigDecimal value) {
        this.oemPartPrice = value;
    }

    /**
     * Gets the value of the priceAdjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceAdjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceAdjustmentType }
     * 
     * 
     */
    public List<PriceAdjustmentType> getPriceAdjustment() {
        if (priceAdjustment == null) {
            priceAdjustment = new ArrayList<PriceAdjustmentType>();
        }
        return this.priceAdjustment;
    }

    /**
     * Gets the value of the taxableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTaxableInd() {
        return taxableInd;
    }

    /**
     * Sets the value of the taxableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxableInd(Boolean value) {
        this.taxableInd = value;
    }

    /**
     * Gets the value of the appliedTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeEnum }
     *     
     */
    public RateTypeEnum getAppliedTaxes() {
        return appliedTaxes;
    }

    /**
     * Sets the value of the appliedTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeEnum }
     *     
     */
    public void setAppliedTaxes(RateTypeEnum value) {
        this.appliedTaxes = value;
    }

    /**
     * Gets the value of the afterMarketUsage property.
     * 
     * @return
     *     possible object is
     *     {@link AftermarketUsageEnum }
     *     
     */
    public AftermarketUsageEnum getAfterMarketUsage() {
        return afterMarketUsage;
    }

    /**
     * Sets the value of the afterMarketUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link AftermarketUsageEnum }
     *     
     */
    public void setAfterMarketUsage(AftermarketUsageEnum value) {
        this.afterMarketUsage = value;
    }

    /**
     * Gets the value of the certificationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificationTypeEnum }
     * 
     * 
     */
    public List<CertificationTypeEnum> getCertificationType() {
        if (certificationType == null) {
            certificationType = new ArrayList<CertificationTypeEnum>();
        }
        return this.certificationType;
    }

    /**
     * Gets the value of the priceJudgmentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPriceJudgmentInd() {
        return priceJudgmentInd;
    }

    /**
     * Sets the value of the priceJudgmentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceJudgmentInd(Boolean value) {
        this.priceJudgmentInd = value;
    }

    /**
     * Gets the value of the alternatePartInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAlternatePartInd() {
        return alternatePartInd;
    }

    /**
     * Sets the value of the alternatePartInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlternatePartInd(Boolean value) {
        this.alternatePartInd = value;
    }

    /**
     * Gets the value of the glassPartInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getGlassPartInd() {
        return glassPartInd;
    }

    /**
     * Sets the value of the glassPartInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlassPartInd(Boolean value) {
        this.glassPartInd = value;
    }

    /**
     * Gets the value of the priceInclInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPriceInclInd() {
        return priceInclInd;
    }

    /**
     * Sets the value of the priceInclInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceInclInd(Boolean value) {
        this.priceInclInd = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the partStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryStatusEnum }
     *     
     */
    public InventoryStatusEnum getPartStatus() {
        return partStatus;
    }

    /**
     * Sets the value of the partStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryStatusEnum }
     *     
     */
    public void setPartStatus(InventoryStatusEnum value) {
        this.partStatus = value;
    }

    /**
     * Gets the value of the glassKit property.
     * 
     * @return
     *     possible object is
     *     {@link GlassKitType }
     *     
     */
    public GlassKitType getGlassKit() {
        return glassKit;
    }

    /**
     * Sets the value of the glassKit property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlassKitType }
     *     
     */
    public void setGlassKit(GlassKitType value) {
        this.glassKit = value;
    }

}
