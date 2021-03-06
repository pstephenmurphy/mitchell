package com.cieca.estimate.resource.entity.totals;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.damage.LineTypeEnum;

/**
 * <p>Java class for RepairTotalsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepairTotalsInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LaborTotalsInfo" type="{http://www.cieca.com/BMS}TotalsInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartsTotalsInfo" type="{http://www.cieca.com/BMS}TotalsInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OtherChargesTotalsInfo" type="{http://www.cieca.com/BMS}TotalsInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NumOfDamageLines" type="{http://www.cieca.com/BMS}Integer_Range_1-9999" minOccurs="0"/>
 *         &lt;element name="SummaryTotalsInfo" type="{http://www.cieca.com/BMS}TotalsInfoType" maxOccurs="unbounded"/>
 *         &lt;element name="RepairTotalsType" type="{http://www.cieca.com/BMS}LineTypeClosedEnumType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepairTotalsInfoType", propOrder = {
    "laborTotalsInfo",
    "partsTotalsInfo",
    "otherChargesTotalsInfo",
    "numOfDamageLines",
    "summaryTotalsInfo",
    "repairTotalsType"
})
@XmlRootElement(name = "RepairTotalsInfoType")
public class RepairTotalsInfoType implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "LaborTotalsInfo")
    protected List<TotalsInfoType> laborTotalsInfo;
    @XmlElement(name = "PartsTotalsInfo")
    protected List<TotalsInfoType> partsTotalsInfo;
    @XmlElement(name = "OtherChargesTotalsInfo")
    protected List<TotalsInfoType> otherChargesTotalsInfo;
    @XmlElement(name = "NumOfDamageLines")
    protected Integer numOfDamageLines;
    @XmlElement(name = "SummaryTotalsInfo", required = true)
    protected List<TotalsInfoType> summaryTotalsInfo;
    @XmlElement(name = "RepairTotalsType")
    protected LineTypeEnum repairTotalsType;

    /**
     * Gets the value of the laborTotalsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the laborTotalsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLaborTotalsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalsInfoType }
     * 
     * 
     */
    public List<TotalsInfoType> getLaborTotalsInfo() {
        if (laborTotalsInfo == null) {
            laborTotalsInfo = new ArrayList<TotalsInfoType>();
        }
        return this.laborTotalsInfo;
    }

    /**
     * Gets the value of the partsTotalsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partsTotalsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartsTotalsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalsInfoType }
     * 
     * 
     */
    public List<TotalsInfoType> getPartsTotalsInfo() {
        if (partsTotalsInfo == null) {
            partsTotalsInfo = new ArrayList<TotalsInfoType>();
        }
        return this.partsTotalsInfo;
    }

    /**
     * Gets the value of the otherChargesTotalsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherChargesTotalsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherChargesTotalsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalsInfoType }
     * 
     * 
     */
    public List<TotalsInfoType> getOtherChargesTotalsInfo() {
        if (otherChargesTotalsInfo == null) {
            otherChargesTotalsInfo = new ArrayList<TotalsInfoType>();
        }
        return this.otherChargesTotalsInfo;
    }

    /**
     * Gets the value of the numOfDamageLines property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumOfDamageLines() {
        return numOfDamageLines;
    }

    /**
     * Sets the value of the numOfDamageLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumOfDamageLines(Integer value) {
        this.numOfDamageLines = value;
    }

    /**
     * Gets the value of the summaryTotalsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summaryTotalsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummaryTotalsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalsInfoType }
     * 
     * 
     */
    public List<TotalsInfoType> getSummaryTotalsInfo() {
        if (summaryTotalsInfo == null) {
            summaryTotalsInfo = new ArrayList<TotalsInfoType>();
        }
        return this.summaryTotalsInfo;
    }

    /**
     * Gets the value of the repairTotalsType property.
     * 
     * @return
     *     possible object is
     *     {@link LineTypeEnum }
     *     
     */
    public LineTypeEnum getRepairTotalsType() {
        return repairTotalsType;
    }

    /**
     * Sets the value of the repairTotalsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineTypeEnum }
     *     
     */
    public void setRepairTotalsType(LineTypeEnum value) {
        this.repairTotalsType = value;
    }

}
