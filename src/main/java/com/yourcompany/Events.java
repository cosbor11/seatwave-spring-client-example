//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.30 at 01:10:39 AM PDT 
//


package com.yourcompany;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="Event" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="EventGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="VenueName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Town" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TicketCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MinPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="SwURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="EventGroupImageURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="LayoutId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="EventGroupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="VenueId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="SwSellURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "event"
})
public class Events {

    @XmlElement(name = "Event", required = true)
    protected List<Event> event;

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Event }
     * 
     * 
     */
    public List<Event> getEvent() {
        if (event == null) {
            event = new ArrayList<Event>();
        }
        return this.event;
    }

}
