package com.cieca.estimate.resource.entity.damage.body;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PDRInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDRInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BodyPanel">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="BodyPanelDesc" type="{http://www.cieca.com/BMS}BodyPanelDescType"/>
 *                     &lt;element name="BodyPanelCode" type="{http://www.cieca.com/BMS}PanelCodeEnum"/>
 *                   &lt;/choice>
 *                   &lt;element name="Dents" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="NumOfDents" type="{http://www.cieca.com/BMS}NumOfDentsType"/>
 *                               &lt;element name="MaxNumOfDents" type="{http://www.cieca.com/BMS}NumOfDentsType"/>
 *                             &lt;/choice>
 *                             &lt;element name="DentsSize" type="{http://www.cieca.com/BMS}DentsSizeEnum"/>
 *                             &lt;element name="DentsSeverity" type="{http://www.cieca.com/BMS}DamageSeverityEnum"/>
 *                             &lt;element name="DentsRepairAmt" type="{http://www.cieca.com/BMS}Currency"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecialCond" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="SpecialCondDesc" type="{http://www.cieca.com/BMS}SpecialCondDescType"/>
 *                     &lt;element name="SpecialCondType" type="{http://www.cieca.com/BMS}SpecialConditionTypeEnum"/>
 *                   &lt;/choice>
 *                   &lt;element name="SpecialCondAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PanelAmt" type="{http://www.cieca.com/BMS}Currency"/>
 *         &lt;element name="PanelLaborHours" type="{http://www.cieca.com/BMS}PanelLaborHoursType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDRInfoType", propOrder = {
    "bodyPanel",
    "specialCond",
    "panelAmt",
    "panelLaborHours"
})
public class PDRInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "BodyPanel", required = true)
    protected BodyPanelType bodyPanel;
    @XmlElement(name = "SpecialCond")
    protected List<SpecialCondType> specialCond;
    @XmlElement(name = "PanelAmt", required = true)
    protected BigDecimal panelAmt;
    @XmlElement(name = "PanelLaborHours")
    protected BigDecimal panelLaborHours;

    /**
     * Gets the value of the bodyPanel property.
     * 
     * @return
     *     possible object is
     *     {@link BodyPanelType }
     *     
     */
    public BodyPanelType getBodyPanel() {
        return bodyPanel;
    }

    /**
     * Sets the value of the bodyPanel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyPanelType }
     *     
     */
    public void setBodyPanel(BodyPanelType value) {
        this.bodyPanel = value;
    }

    /**
     * Gets the value of the specialCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialCondType }
     * 
     * 
     */
    public List<SpecialCondType> getSpecialCond() {
        if (specialCond == null) {
            specialCond = new ArrayList<SpecialCondType>();
        }
        return this.specialCond;
    }

    /**
     * Gets the value of the panelAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPanelAmt() {
        return panelAmt;
    }

    /**
     * Sets the value of the panelAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPanelAmt(BigDecimal value) {
        this.panelAmt = value;
    }

    /**
     * Gets the value of the panelLaborHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPanelLaborHours() {
        return panelLaborHours;
    }

    /**
     * Sets the value of the panelLaborHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPanelLaborHours(BigDecimal value) {
        this.panelLaborHours = value;
    }
}
