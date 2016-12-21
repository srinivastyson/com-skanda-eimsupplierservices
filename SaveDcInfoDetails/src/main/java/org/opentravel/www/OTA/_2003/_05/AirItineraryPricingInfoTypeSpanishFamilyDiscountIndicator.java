/**
 * AirItineraryPricingInfoTypeSpanishFamilyDiscountIndicator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirItineraryPricingInfoTypeSpanishFamilyDiscountIndicator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AirItineraryPricingInfoTypeSpanishFamilyDiscountIndicator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _A = "A";
    public static final java.lang.String _B = "B";
    public static final java.lang.String _C = "C";
    public static final AirItineraryPricingInfoTypeSpanishFamilyDiscountIndicator A = new AirItineraryPricingInfoTypeSpanishFamilyDiscountIndicator(_A);
    public static final AirItineraryPricingInfoTypeSpanishFamilyDiscountIndicator B = new AirItineraryPricingInfoTypeSpanishFamilyDiscountIndicator(_B);
    public static final AirItineraryPricingInfoTypeSpanishFamilyDiscountIndicator C = new AirItineraryPricingInfoTypeSpanishFamilyDiscountIndicator(_C);
    public java.lang.String getValue() { return _value_;}
    public static AirItineraryPricingInfoTypeSpanishFamilyDiscountIndicator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AirItineraryPricingInfoTypeSpanishFamilyDiscountIndicator enumeration = (AirItineraryPricingInfoTypeSpanishFamilyDiscountIndicator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AirItineraryPricingInfoTypeSpanishFamilyDiscountIndicator fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirItineraryPricingInfoTypeSpanishFamilyDiscountIndicator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirItineraryPricingInfoType>SpanishFamilyDiscountIndicator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
