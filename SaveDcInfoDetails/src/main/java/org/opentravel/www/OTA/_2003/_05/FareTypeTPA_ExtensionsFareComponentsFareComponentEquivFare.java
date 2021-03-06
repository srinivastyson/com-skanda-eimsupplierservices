/**
 * FareTypeTPA_ExtensionsFareComponentsFareComponentEquivFare.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class FareTypeTPA_ExtensionsFareComponentsFareComponentEquivFare  extends org.opentravel.www.OTA._2003._05.CurrencyAmountType  implements java.io.Serializable {
    private java.math.BigDecimal effectivePriceDeviation;  // attribute

    public FareTypeTPA_ExtensionsFareComponentsFareComponentEquivFare() {
    }

    public FareTypeTPA_ExtensionsFareComponentsFareComponentEquivFare(
           java.math.BigDecimal amount,
           java.lang.String currencyCode,
           org.apache.axis.types.NonNegativeInteger decimalPlaces,
           java.math.BigDecimal effectivePriceDeviation) {
        super(
            amount,
            currencyCode,
            decimalPlaces);
        this.effectivePriceDeviation = effectivePriceDeviation;
    }


    /**
     * Gets the effectivePriceDeviation value for this FareTypeTPA_ExtensionsFareComponentsFareComponentEquivFare.
     * 
     * @return effectivePriceDeviation
     */
    public java.math.BigDecimal getEffectivePriceDeviation() {
        return effectivePriceDeviation;
    }


    /**
     * Sets the effectivePriceDeviation value for this FareTypeTPA_ExtensionsFareComponentsFareComponentEquivFare.
     * 
     * @param effectivePriceDeviation
     */
    public void setEffectivePriceDeviation(java.math.BigDecimal effectivePriceDeviation) {
        this.effectivePriceDeviation = effectivePriceDeviation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FareTypeTPA_ExtensionsFareComponentsFareComponentEquivFare)) return false;
        FareTypeTPA_ExtensionsFareComponentsFareComponentEquivFare other = (FareTypeTPA_ExtensionsFareComponentsFareComponentEquivFare) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.effectivePriceDeviation==null && other.getEffectivePriceDeviation()==null) || 
             (this.effectivePriceDeviation!=null &&
              this.effectivePriceDeviation.equals(other.getEffectivePriceDeviation())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getEffectivePriceDeviation() != null) {
            _hashCode += getEffectivePriceDeviation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FareTypeTPA_ExtensionsFareComponentsFareComponentEquivFare.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>FareType>TPA_Extensions>FareComponents>FareComponent>EquivFare"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("effectivePriceDeviation");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EffectivePriceDeviation"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Money"));
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
