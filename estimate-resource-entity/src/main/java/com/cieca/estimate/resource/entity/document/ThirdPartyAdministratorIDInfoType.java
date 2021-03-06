package com.cieca.estimate.resource.entity.document;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyAdministratorIDInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyAdministratorIDInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Affiliation" type="{http://www.cieca.com/BMS}AffiliationClosedEnumType"/>
 *         &lt;element name="FileID" type="{http://www.cieca.com/BMS}Char_38"/>
 *         &lt;element name="RelatedFileID" type="{http://www.cieca.com/BMS}Char_38" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyAdministratorIDInfoType", propOrder = {
    "affiliation",
    "fileID",
    "relatedFileID"
})
public class ThirdPartyAdministratorIDInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "Affiliation", required = true)
    protected String affiliation;
    @XmlElement(name = "FileID", required = true)
    protected String fileID;
    @XmlElement(name = "RelatedFileID")
    protected String relatedFileID;

    /**
     * Gets the value of the affiliation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliation() {
        return affiliation;
    }

    /**
     * Sets the value of the affiliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliation(String value) {
        this.affiliation = value;
    }

    /**
     * Gets the value of the fileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileID() {
        return fileID;
    }

    /**
     * Sets the value of the fileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileID(String value) {
        this.fileID = value;
    }

    /**
     * Gets the value of the relatedFileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedFileID() {
        return relatedFileID;
    }

    /**
     * Sets the value of the relatedFileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedFileID(String value) {
        this.relatedFileID = value;
    }

}
