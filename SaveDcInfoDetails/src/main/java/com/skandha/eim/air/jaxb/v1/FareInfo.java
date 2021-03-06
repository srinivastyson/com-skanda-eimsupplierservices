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
 * <p>Java class for FareInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seatsRemaining" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="belowMin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cabin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mealcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareInfo", propOrder = {
    "fareReference",
    "seatsRemaining",
    "belowMin",
    "cabin",
    "mealcode"
})
public class FareInfo
    implements Equals, ToString
{

    protected String fareReference;
    protected String seatsRemaining;
    protected String belowMin;
    protected String cabin;
    protected String mealcode;

    /**
     * Gets the value of the fareReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareReference() {
        return fareReference;
    }

    /**
     * Sets the value of the fareReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareReference(String value) {
        this.fareReference = value;
    }

    /**
     * Gets the value of the seatsRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatsRemaining() {
        return seatsRemaining;
    }

    /**
     * Sets the value of the seatsRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatsRemaining(String value) {
        this.seatsRemaining = value;
    }

    /**
     * Gets the value of the belowMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelowMin() {
        return belowMin;
    }

    /**
     * Sets the value of the belowMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelowMin(String value) {
        this.belowMin = value;
    }

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabin() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabin(String value) {
        this.cabin = value;
    }

    /**
     * Gets the value of the mealcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealcode() {
        return mealcode;
    }

    /**
     * Sets the value of the mealcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealcode(String value) {
        this.mealcode = value;
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
            String theFareReference;
            theFareReference = this.getFareReference();
            strategy.appendField(locator, this, "fareReference", buffer, theFareReference);
        }
        {
            String theSeatsRemaining;
            theSeatsRemaining = this.getSeatsRemaining();
            strategy.appendField(locator, this, "seatsRemaining", buffer, theSeatsRemaining);
        }
        {
            String theBelowMin;
            theBelowMin = this.getBelowMin();
            strategy.appendField(locator, this, "belowMin", buffer, theBelowMin);
        }
        {
            String theCabin;
            theCabin = this.getCabin();
            strategy.appendField(locator, this, "cabin", buffer, theCabin);
        }
        {
            String theMealcode;
            theMealcode = this.getMealcode();
            strategy.appendField(locator, this, "mealcode", buffer, theMealcode);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FareInfo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FareInfo that = ((FareInfo) object);
        {
            String lhsFareReference;
            lhsFareReference = this.getFareReference();
            String rhsFareReference;
            rhsFareReference = that.getFareReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fareReference", lhsFareReference), LocatorUtils.property(thatLocator, "fareReference", rhsFareReference), lhsFareReference, rhsFareReference)) {
                return false;
            }
        }
        {
            String lhsSeatsRemaining;
            lhsSeatsRemaining = this.getSeatsRemaining();
            String rhsSeatsRemaining;
            rhsSeatsRemaining = that.getSeatsRemaining();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "seatsRemaining", lhsSeatsRemaining), LocatorUtils.property(thatLocator, "seatsRemaining", rhsSeatsRemaining), lhsSeatsRemaining, rhsSeatsRemaining)) {
                return false;
            }
        }
        {
            String lhsBelowMin;
            lhsBelowMin = this.getBelowMin();
            String rhsBelowMin;
            rhsBelowMin = that.getBelowMin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "belowMin", lhsBelowMin), LocatorUtils.property(thatLocator, "belowMin", rhsBelowMin), lhsBelowMin, rhsBelowMin)) {
                return false;
            }
        }
        {
            String lhsCabin;
            lhsCabin = this.getCabin();
            String rhsCabin;
            rhsCabin = that.getCabin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cabin", lhsCabin), LocatorUtils.property(thatLocator, "cabin", rhsCabin), lhsCabin, rhsCabin)) {
                return false;
            }
        }
        {
            String lhsMealcode;
            lhsMealcode = this.getMealcode();
            String rhsMealcode;
            rhsMealcode = that.getMealcode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mealcode", lhsMealcode), LocatorUtils.property(thatLocator, "mealcode", rhsMealcode), lhsMealcode, rhsMealcode)) {
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
