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
 * <p>Java class for TravelPreferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelPreferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightTypePref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cabinPref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eTicketDesired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validInterlineTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xoFares" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelPreferences", propOrder = {
    "flightTypePref",
    "cabinPref",
    "eTicketDesired",
    "validInterlineTicket",
    "xoFares"
})
public class TravelPreferences
    implements Equals, ToString
{

    protected String flightTypePref;
    protected String cabinPref;
    protected String eTicketDesired;
    protected String validInterlineTicket;
    protected String xoFares;

    /**
     * Gets the value of the flightTypePref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightTypePref() {
        return flightTypePref;
    }

    /**
     * Sets the value of the flightTypePref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightTypePref(String value) {
        this.flightTypePref = value;
    }

    /**
     * Gets the value of the cabinPref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinPref() {
        return cabinPref;
    }

    /**
     * Sets the value of the cabinPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinPref(String value) {
        this.cabinPref = value;
    }

    /**
     * Gets the value of the eTicketDesired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETicketDesired() {
        return eTicketDesired;
    }

    /**
     * Sets the value of the eTicketDesired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETicketDesired(String value) {
        this.eTicketDesired = value;
    }

    /**
     * Gets the value of the validInterlineTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidInterlineTicket() {
        return validInterlineTicket;
    }

    /**
     * Sets the value of the validInterlineTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidInterlineTicket(String value) {
        this.validInterlineTicket = value;
    }

    /**
     * Gets the value of the xoFares property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXoFares() {
        return xoFares;
    }

    /**
     * Sets the value of the xoFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXoFares(String value) {
        this.xoFares = value;
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
            String theFlightTypePref;
            theFlightTypePref = this.getFlightTypePref();
            strategy.appendField(locator, this, "flightTypePref", buffer, theFlightTypePref);
        }
        {
            String theCabinPref;
            theCabinPref = this.getCabinPref();
            strategy.appendField(locator, this, "cabinPref", buffer, theCabinPref);
        }
        {
            String theETicketDesired;
            theETicketDesired = this.getETicketDesired();
            strategy.appendField(locator, this, "eTicketDesired", buffer, theETicketDesired);
        }
        {
            String theValidInterlineTicket;
            theValidInterlineTicket = this.getValidInterlineTicket();
            strategy.appendField(locator, this, "validInterlineTicket", buffer, theValidInterlineTicket);
        }
        {
            String theXoFares;
            theXoFares = this.getXoFares();
            strategy.appendField(locator, this, "xoFares", buffer, theXoFares);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TravelPreferences)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TravelPreferences that = ((TravelPreferences) object);
        {
            String lhsFlightTypePref;
            lhsFlightTypePref = this.getFlightTypePref();
            String rhsFlightTypePref;
            rhsFlightTypePref = that.getFlightTypePref();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flightTypePref", lhsFlightTypePref), LocatorUtils.property(thatLocator, "flightTypePref", rhsFlightTypePref), lhsFlightTypePref, rhsFlightTypePref)) {
                return false;
            }
        }
        {
            String lhsCabinPref;
            lhsCabinPref = this.getCabinPref();
            String rhsCabinPref;
            rhsCabinPref = that.getCabinPref();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cabinPref", lhsCabinPref), LocatorUtils.property(thatLocator, "cabinPref", rhsCabinPref), lhsCabinPref, rhsCabinPref)) {
                return false;
            }
        }
        {
            String lhsETicketDesired;
            lhsETicketDesired = this.getETicketDesired();
            String rhsETicketDesired;
            rhsETicketDesired = that.getETicketDesired();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eTicketDesired", lhsETicketDesired), LocatorUtils.property(thatLocator, "eTicketDesired", rhsETicketDesired), lhsETicketDesired, rhsETicketDesired)) {
                return false;
            }
        }
        {
            String lhsValidInterlineTicket;
            lhsValidInterlineTicket = this.getValidInterlineTicket();
            String rhsValidInterlineTicket;
            rhsValidInterlineTicket = that.getValidInterlineTicket();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validInterlineTicket", lhsValidInterlineTicket), LocatorUtils.property(thatLocator, "validInterlineTicket", rhsValidInterlineTicket), lhsValidInterlineTicket, rhsValidInterlineTicket)) {
                return false;
            }
        }
        {
            String lhsXoFares;
            lhsXoFares = this.getXoFares();
            String rhsXoFares;
            rhsXoFares = that.getXoFares();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xoFares", lhsXoFares), LocatorUtils.property(thatLocator, "xoFares", rhsXoFares), lhsXoFares, rhsXoFares)) {
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