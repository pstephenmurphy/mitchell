package com.cieca.estimate.resource.entity.event;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.cieca.estimate.resource.entity.person.ContactInfoType;


/**
 * <p>Java class for EventDateTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventDateTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventDateTime" type="{http://www.cieca.com/BMS}DateTime"/>
 *         &lt;element name="EventContact" type="{http://www.cieca.com/BMS}ContactInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventDateTimeType", propOrder = {
    "eventDateTime",
    "eventContact"
})
public class EventDateTimeType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "EventDateTime", required = true)
    protected XMLGregorianCalendar eventDateTime;
    @XmlElement(name = "EventContact")
    protected ContactInfoType eventContact;

    /**
     * Gets the value of the eventDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDateTime() {
        return eventDateTime;
    }

    /**
     * Sets the value of the eventDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDateTime(XMLGregorianCalendar value) {
        this.eventDateTime = value;
    }

    /**
     * Gets the value of the eventContact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getEventContact() {
        return eventContact;
    }

    /**
     * Sets the value of the eventContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setEventContact(ContactInfoType value) {
        this.eventContact = value;
    }

}
