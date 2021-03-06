package com.cieca.estimate.resource.entity.document;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentVerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentVerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="DocumentVerCode" type="{http://www.cieca.com/BMS}DocumentVersionClosedEnumType"/>
 *         &lt;element name="DocumentVerNum" type="{http://www.cieca.com/BMS}Integer_Range_0-99"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentVerType", propOrder = {
    "documentVerCode",
    "documentVerNum"
})
public class DocumentVerType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "DocumentVerCode")
    protected DocumentVersionEnum documentVerCode;
    @XmlElement(name = "DocumentVerNum")
    protected Integer documentVerNum;

    /**
     * Gets the value of the documentVerCode property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentVersionEnum }
     *     
     */
    public DocumentVersionEnum getDocumentVerCode() {
        return documentVerCode;
    }

    /**
     * Sets the value of the documentVerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentVersionEnum }
     *     
     */
    public void setDocumentVerCode(DocumentVersionEnum value) {
        this.documentVerCode = value;
    }

    /**
     * Gets the value of the documentVerNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocumentVerNum() {
        return documentVerNum;
    }

    /**
     * Sets the value of the documentVerNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocumentVerNum(Integer value) {
        this.documentVerNum = value;
    }

}
