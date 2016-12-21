/**
 * PriceRequestInformationTypeTPA_ExtensionsCustomerTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PriceRequestInformationTypeTPA_ExtensionsCustomerTypeValue implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PriceRequestInformationTypeTPA_ExtensionsCustomerTypeValue(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _REGULAR = "REGULAR";
    public static final java.lang.String _TVLYPREF = "TVLYPREF";
    public static final java.lang.String _PREFELITE = "PREFELITE";
    public static final java.lang.String _LOYALTY = "LOYALTY";
    public static final PriceRequestInformationTypeTPA_ExtensionsCustomerTypeValue REGULAR = new PriceRequestInformationTypeTPA_ExtensionsCustomerTypeValue(_REGULAR);
    public static final PriceRequestInformationTypeTPA_ExtensionsCustomerTypeValue TVLYPREF = new PriceRequestInformationTypeTPA_ExtensionsCustomerTypeValue(_TVLYPREF);
    public static final PriceRequestInformationTypeTPA_ExtensionsCustomerTypeValue PREFELITE = new PriceRequestInformationTypeTPA_ExtensionsCustomerTypeValue(_PREFELITE);
    public static final PriceRequestInformationTypeTPA_ExtensionsCustomerTypeValue LOYALTY = new PriceRequestInformationTypeTPA_ExtensionsCustomerTypeValue(_LOYALTY);
    public java.lang.String getValue() { return _value_;}
    public static PriceRequestInformationTypeTPA_ExtensionsCustomerTypeValue fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PriceRequestInformationTypeTPA_ExtensionsCustomerTypeValue enumeration = (PriceRequestInformationTypeTPA_ExtensionsCustomerTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PriceRequestInformationTypeTPA_ExtensionsCustomerTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PriceRequestInformationTypeTPA_ExtensionsCustomerTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>CustomerType>Value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
