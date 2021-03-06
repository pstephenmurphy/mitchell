package com.cieca.estimate.resource.entity.vehicle.paint;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaintType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaintType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaintStagesNum" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}Integer">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PaintTonesNum" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}Integer">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StageToneDesc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Exterior" type="{http://www.cieca.com/BMS}ExteriorInteriorType" minOccurs="0"/>
 *         &lt;element name="Interior" type="{http://www.cieca.com/BMS}ExteriorInteriorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaintType", propOrder = {
    "paintStagesNum",
    "paintTonesNum",
    "stageToneDesc",
    "exterior",
    "interior"
})
public class PaintType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "PaintStagesNum")
    protected Integer paintStagesNum;
    @XmlElement(name = "PaintTonesNum")
    protected Integer paintTonesNum;
    @XmlElement(name = "StageToneDesc")
    protected String stageToneDesc;
    @XmlElement(name = "Exterior")
    protected ExteriorInteriorType exterior;
    @XmlElement(name = "Interior")
    protected ExteriorInteriorType interior;

    /**
     * Gets the value of the paintStagesNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaintStagesNum() {
        return paintStagesNum;
    }

    /**
     * Sets the value of the paintStagesNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaintStagesNum(Integer value) {
        this.paintStagesNum = value;
    }

    /**
     * Gets the value of the paintTonesNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaintTonesNum() {
        return paintTonesNum;
    }

    /**
     * Sets the value of the paintTonesNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaintTonesNum(Integer value) {
        this.paintTonesNum = value;
    }

    /**
     * Gets the value of the stageToneDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStageToneDesc() {
        return stageToneDesc;
    }

    /**
     * Sets the value of the stageToneDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStageToneDesc(String value) {
        this.stageToneDesc = value;
    }

    /**
     * Gets the value of the exterior property.
     * 
     * @return
     *     possible object is
     *     {@link ExteriorInteriorType }
     *     
     */
    public ExteriorInteriorType getExterior() {
        return exterior;
    }

    /**
     * Sets the value of the exterior property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExteriorInteriorType }
     *     
     */
    public void setExterior(ExteriorInteriorType value) {
        this.exterior = value;
    }

    /**
     * Gets the value of the interior property.
     * 
     * @return
     *     possible object is
     *     {@link ExteriorInteriorType }
     *     
     */
    public ExteriorInteriorType getInterior() {
        return interior;
    }

    /**
     * Sets the value of the interior property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExteriorInteriorType }
     *     
     */
    public void setInterior(ExteriorInteriorType value) {
        this.interior = value;
    }

}
