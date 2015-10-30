//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.30 at 01:10:39 AM PDT 
//


package com.yourcompany;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="TimeStampUtc" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Details" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Paging">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="PageResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="TotalResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="TotalPageCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Events">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Event" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="EventGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="VenueName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Town" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TicketCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="MinPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="SwURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="EventGroupImageURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="LayoutId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="EventGroupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="VenueId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="SwSellURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "status",
    "paging",
    "events"
})
@XmlRootElement(name = "EventsResponse")
public class EventsResponse {

    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElement(name = "Paging", required = true)
    protected Paging paging;
    @XmlElement(name = "Events", required = true)
    protected Events events;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    public void setPaging(Paging value) {
        this.paging = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link Events }
     *     
     */
    public Events getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link Events }
     *     
     */
    public void setEvents(Events value) {
        this.events = value;
    }

}
