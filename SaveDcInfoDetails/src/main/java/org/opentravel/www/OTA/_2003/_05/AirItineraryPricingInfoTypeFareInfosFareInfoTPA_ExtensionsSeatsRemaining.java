/**
 * AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsSeatsRemaining.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsSeatsRemaining  implements java.io.Serializable {
    private int number;  // attribute

    private boolean belowMin;  // attribute

    public AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsSeatsRemaining() {
    }

    public AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsSeatsRemaining(
           int number,
           boolean belowMin) {
           this.number = number;
           this.belowMin = belowMin;
    }


    /**
     * Gets the number value for this AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsSeatsRemaining.
     * 
     * @return number
     */
    public int getNumber() {
        return number;
    }


    /**
     * Sets the number value for this AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsSeatsRemaining.
     * 
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }


    /**
     * Gets the belowMin value for this AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsSeatsRemaining.
     * 
     * @return belowMin
     */
    public boolean isBelowMin() {
        return belowMin;
    }


    /**
     * Sets the belowMin value for this AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsSeatsRemaining.
     * 
     * @param belowMin
     */
    public void setBelowMin(boolean belowMin) {
        this.belowMin = belowMin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsSeatsRemaining)) return false;
        AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsSeatsRemaining other = (AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsSeatsRemaining) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.number == other.getNumber() &&
            this.belowMin == other.isBelowMin();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getNumber();
        _hashCode += (isBelowMin() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsSeatsRemaining.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>AirItineraryPricingInfoType>FareInfos>FareInfo>TPA_Extensions>SeatsRemaining"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("number");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Number"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("belowMin");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BelowMin"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
