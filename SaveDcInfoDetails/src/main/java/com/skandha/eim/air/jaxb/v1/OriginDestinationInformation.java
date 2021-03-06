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
 * <p>Java class for OriginDestinationInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginDestinationInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departureDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureWindow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalWindow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originAirportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationAirportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestinationInformation", propOrder = {
    "departureDateTime",
    "arrivalDateTime",
    "departureWindow",
    "arrivalWindow",
    "originLocation",
    "destinationLocation",
    "originAirportCode",
    "destinationAirportCode"
})
public class OriginDestinationInformation
    implements Equals, ToString
{

    protected String departureDateTime;
    protected String arrivalDateTime;
    protected String departureWindow;
    protected String arrivalWindow;
    protected String originLocation;
    protected String destinationLocation;
    protected String originAirportCode;
    protected String destinationAirportCode;

    /**
     * Gets the value of the departureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Sets the value of the departureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDateTime(String value) {
        this.departureDateTime = value;
    }

    /**
     * Gets the value of the arrivalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * Sets the value of the arrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDateTime(String value) {
        this.arrivalDateTime = value;
    }

    /**
     * Gets the value of the departureWindow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureWindow() {
        return departureWindow;
    }

    /**
     * Sets the value of the departureWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureWindow(String value) {
        this.departureWindow = value;
    }

    /**
     * Gets the value of the arrivalWindow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalWindow() {
        return arrivalWindow;
    }

    /**
     * Sets the value of the arrivalWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalWindow(String value) {
        this.arrivalWindow = value;
    }

    /**
     * Gets the value of the originLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginLocation() {
        return originLocation;
    }

    /**
     * Sets the value of the originLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginLocation(String value) {
        this.originLocation = value;
    }

    /**
     * Gets the value of the destinationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * Sets the value of the destinationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationLocation(String value) {
        this.destinationLocation = value;
    }

    /**
     * Gets the value of the originAirportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginAirportCode() {
        return originAirportCode;
    }

    /**
     * Sets the value of the originAirportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginAirportCode(String value) {
        this.originAirportCode = value;
    }

    /**
     * Gets the value of the destinationAirportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    /**
     * Sets the value of the destinationAirportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAirportCode(String value) {
        this.destinationAirportCode = value;
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
            String theDepartureDateTime;
            theDepartureDateTime = this.getDepartureDateTime();
            strategy.appendField(locator, this, "departureDateTime", buffer, theDepartureDateTime);
        }
        {
            String theArrivalDateTime;
            theArrivalDateTime = this.getArrivalDateTime();
            strategy.appendField(locator, this, "arrivalDateTime", buffer, theArrivalDateTime);
        }
        {
            String theDepartureWindow;
            theDepartureWindow = this.getDepartureWindow();
            strategy.appendField(locator, this, "departureWindow", buffer, theDepartureWindow);
        }
        {
            String theArrivalWindow;
            theArrivalWindow = this.getArrivalWindow();
            strategy.appendField(locator, this, "arrivalWindow", buffer, theArrivalWindow);
        }
        {
            String theOriginLocation;
            theOriginLocation = this.getOriginLocation();
            strategy.appendField(locator, this, "originLocation", buffer, theOriginLocation);
        }
        {
            String theDestinationLocation;
            theDestinationLocation = this.getDestinationLocation();
            strategy.appendField(locator, this, "destinationLocation", buffer, theDestinationLocation);
        }
        {
            String theOriginAirportCode;
            theOriginAirportCode = this.getOriginAirportCode();
            strategy.appendField(locator, this, "originAirportCode", buffer, theOriginAirportCode);
        }
        {
            String theDestinationAirportCode;
            theDestinationAirportCode = this.getDestinationAirportCode();
            strategy.appendField(locator, this, "destinationAirportCode", buffer, theDestinationAirportCode);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OriginDestinationInformation)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OriginDestinationInformation that = ((OriginDestinationInformation) object);
        {
            String lhsDepartureDateTime;
            lhsDepartureDateTime = this.getDepartureDateTime();
            String rhsDepartureDateTime;
            rhsDepartureDateTime = that.getDepartureDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "departureDateTime", lhsDepartureDateTime), LocatorUtils.property(thatLocator, "departureDateTime", rhsDepartureDateTime), lhsDepartureDateTime, rhsDepartureDateTime)) {
                return false;
            }
        }
        {
            String lhsArrivalDateTime;
            lhsArrivalDateTime = this.getArrivalDateTime();
            String rhsArrivalDateTime;
            rhsArrivalDateTime = that.getArrivalDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "arrivalDateTime", lhsArrivalDateTime), LocatorUtils.property(thatLocator, "arrivalDateTime", rhsArrivalDateTime), lhsArrivalDateTime, rhsArrivalDateTime)) {
                return false;
            }
        }
        {
            String lhsDepartureWindow;
            lhsDepartureWindow = this.getDepartureWindow();
            String rhsDepartureWindow;
            rhsDepartureWindow = that.getDepartureWindow();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "departureWindow", lhsDepartureWindow), LocatorUtils.property(thatLocator, "departureWindow", rhsDepartureWindow), lhsDepartureWindow, rhsDepartureWindow)) {
                return false;
            }
        }
        {
            String lhsArrivalWindow;
            lhsArrivalWindow = this.getArrivalWindow();
            String rhsArrivalWindow;
            rhsArrivalWindow = that.getArrivalWindow();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "arrivalWindow", lhsArrivalWindow), LocatorUtils.property(thatLocator, "arrivalWindow", rhsArrivalWindow), lhsArrivalWindow, rhsArrivalWindow)) {
                return false;
            }
        }
        {
            String lhsOriginLocation;
            lhsOriginLocation = this.getOriginLocation();
            String rhsOriginLocation;
            rhsOriginLocation = that.getOriginLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originLocation", lhsOriginLocation), LocatorUtils.property(thatLocator, "originLocation", rhsOriginLocation), lhsOriginLocation, rhsOriginLocation)) {
                return false;
            }
        }
        {
            String lhsDestinationLocation;
            lhsDestinationLocation = this.getDestinationLocation();
            String rhsDestinationLocation;
            rhsDestinationLocation = that.getDestinationLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "destinationLocation", lhsDestinationLocation), LocatorUtils.property(thatLocator, "destinationLocation", rhsDestinationLocation), lhsDestinationLocation, rhsDestinationLocation)) {
                return false;
            }
        }
        {
            String lhsOriginAirportCode;
            lhsOriginAirportCode = this.getOriginAirportCode();
            String rhsOriginAirportCode;
            rhsOriginAirportCode = that.getOriginAirportCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originAirportCode", lhsOriginAirportCode), LocatorUtils.property(thatLocator, "originAirportCode", rhsOriginAirportCode), lhsOriginAirportCode, rhsOriginAirportCode)) {
                return false;
            }
        }
        {
            String lhsDestinationAirportCode;
            lhsDestinationAirportCode = this.getDestinationAirportCode();
            String rhsDestinationAirportCode;
            rhsDestinationAirportCode = that.getDestinationAirportCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "destinationAirportCode", lhsDestinationAirportCode), LocatorUtils.property(thatLocator, "destinationAirportCode", rhsDestinationAirportCode), lhsDestinationAirportCode, rhsDestinationAirportCode)) {
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
