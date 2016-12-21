//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.30 at 10:02:03 PM IST 
//


package com.skandha.eim.air.jaxb.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requesterDetails" type="{http://www.xmlns.skandha.com/datatypes/Air/Service/1.0/}RequesterDetails" minOccurs="0"/>
 *         &lt;element name="pricedItineraries" type="{http://www.xmlns.skandha.com/datatypes/Air/Service/1.0/}PricedItineraries" maxOccurs="unbounded"/>
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
    "requesterDetails",
    "pricedItineraries"
})
@XmlRootElement(name = "AirLowFareSearchRS")
public class AirLowFareSearchRS
    implements Equals, ToString
{

    protected RequesterDetails requesterDetails;
    @XmlElement(required = true)
    protected List<PricedItineraries> pricedItineraries;

    /**
     * Gets the value of the requesterDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RequesterDetails }
     *     
     */
    public RequesterDetails getRequesterDetails() {
        return requesterDetails;
    }

    /**
     * Sets the value of the requesterDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequesterDetails }
     *     
     */
    public void setRequesterDetails(RequesterDetails value) {
        this.requesterDetails = value;
    }

    /**
     * Gets the value of the pricedItineraries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricedItineraries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricedItineraries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricedItineraries }
     * 
     * 
     */
    public List<PricedItineraries> getPricedItineraries() {
        if (pricedItineraries == null) {
            pricedItineraries = new ArrayList<PricedItineraries>();
        }
        return this.pricedItineraries;
    }

    public void setPricedItineraries(List<PricedItineraries> value) {
        this.pricedItineraries = null;
        List<PricedItineraries> draftl = this.getPricedItineraries();
        draftl.addAll(value);
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
            RequesterDetails theRequesterDetails;
            theRequesterDetails = this.getRequesterDetails();
            strategy.appendField(locator, this, "requesterDetails", buffer, theRequesterDetails);
        }
        {
            List<PricedItineraries> thePricedItineraries;
            thePricedItineraries = (((this.pricedItineraries!= null)&&(!this.pricedItineraries.isEmpty()))?this.getPricedItineraries():null);
            strategy.appendField(locator, this, "pricedItineraries", buffer, thePricedItineraries);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AirLowFareSearchRS)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AirLowFareSearchRS that = ((AirLowFareSearchRS) object);
        {
            RequesterDetails lhsRequesterDetails;
            lhsRequesterDetails = this.getRequesterDetails();
            RequesterDetails rhsRequesterDetails;
            rhsRequesterDetails = that.getRequesterDetails();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requesterDetails", lhsRequesterDetails), LocatorUtils.property(thatLocator, "requesterDetails", rhsRequesterDetails), lhsRequesterDetails, rhsRequesterDetails)) {
                return false;
            }
        }
        {
            List<PricedItineraries> lhsPricedItineraries;
            lhsPricedItineraries = (((this.pricedItineraries!= null)&&(!this.pricedItineraries.isEmpty()))?this.getPricedItineraries():null);
            List<PricedItineraries> rhsPricedItineraries;
            rhsPricedItineraries = (((that.pricedItineraries!= null)&&(!that.pricedItineraries.isEmpty()))?that.getPricedItineraries():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pricedItineraries", lhsPricedItineraries), LocatorUtils.property(thatLocator, "pricedItineraries", rhsPricedItineraries), lhsPricedItineraries, rhsPricedItineraries)) {
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