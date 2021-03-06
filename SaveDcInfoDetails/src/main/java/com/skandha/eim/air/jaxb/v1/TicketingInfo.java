//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.30 at 10:02:03 PM IST 
//


package com.skandha.eim.air.jaxb.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for TicketingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ticketType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validInterline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingInfo", propOrder = {
    "ticketType",
    "validInterline"
})
public class TicketingInfo
    implements Equals, ToString
{

    protected String ticketType;
    protected String validInterline;

    /**
     * Gets the value of the ticketType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketType() {
        return ticketType;
    }

    /**
     * Sets the value of the ticketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketType(String value) {
        this.ticketType = value;
    }

    /**
     * Gets the value of the validInterline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidInterline() {
        return validInterline;
    }

    /**
     * Sets the value of the validInterline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidInterline(String value) {
        this.validInterline = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theTicketType;
            theTicketType = this.getTicketType();
            strategy.appendField(locator, this, "ticketType", buffer, theTicketType);
        }
        {
            String theValidInterline;
            theValidInterline = this.getValidInterline();
            strategy.appendField(locator, this, "validInterline", buffer, theValidInterline);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TicketingInfo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TicketingInfo that = ((TicketingInfo) object);
        {
            String lhsTicketType;
            lhsTicketType = this.getTicketType();
            String rhsTicketType;
            rhsTicketType = that.getTicketType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ticketType", lhsTicketType), LocatorUtils.property(thatLocator, "ticketType", rhsTicketType), lhsTicketType, rhsTicketType)) {
                return false;
            }
        }
        {
            String lhsValidInterline;
            lhsValidInterline = this.getValidInterline();
            String rhsValidInterline;
            rhsValidInterline = that.getValidInterline();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validInterline", lhsValidInterline), LocatorUtils.property(thatLocator, "validInterline", rhsValidInterline), lhsValidInterline, rhsValidInterline)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
