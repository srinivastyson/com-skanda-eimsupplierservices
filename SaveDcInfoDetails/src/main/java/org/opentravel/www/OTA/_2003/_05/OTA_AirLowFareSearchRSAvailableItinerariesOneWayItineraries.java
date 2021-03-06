/**
 * OTA_AirLowFareSearchRSAvailableItinerariesOneWayItineraries.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRSAvailableItinerariesOneWayItineraries  implements java.io.Serializable {
    /* Container for priced itineraries assigned to particular leg. */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItinerariesOneWayItinerariesBrandedOneWayItineraries[] brandedOneWayItineraries;

    /* Container for priced itineraries assigned to particular leg. */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItinerariesOneWayItinerariesSimpleOneWayItineraries[] simpleOneWayItineraries;

    public OTA_AirLowFareSearchRSAvailableItinerariesOneWayItineraries() {
    }

    public OTA_AirLowFareSearchRSAvailableItinerariesOneWayItineraries(
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItinerariesOneWayItinerariesBrandedOneWayItineraries[] brandedOneWayItineraries,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItinerariesOneWayItinerariesSimpleOneWayItineraries[] simpleOneWayItineraries) {
           this.brandedOneWayItineraries = brandedOneWayItineraries;
           this.simpleOneWayItineraries = simpleOneWayItineraries;
    }


    /**
     * Gets the brandedOneWayItineraries value for this OTA_AirLowFareSearchRSAvailableItinerariesOneWayItineraries.
     * 
     * @return brandedOneWayItineraries   * Container for priced itineraries assigned to particular leg.
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItinerariesOneWayItinerariesBrandedOneWayItineraries[] getBrandedOneWayItineraries() {
        return brandedOneWayItineraries;
    }


    /**
     * Sets the brandedOneWayItineraries value for this OTA_AirLowFareSearchRSAvailableItinerariesOneWayItineraries.
     * 
     * @param brandedOneWayItineraries   * Container for priced itineraries assigned to particular leg.
     */
    public void setBrandedOneWayItineraries(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItinerariesOneWayItinerariesBrandedOneWayItineraries[] brandedOneWayItineraries) {
        this.brandedOneWayItineraries = brandedOneWayItineraries;
    }

    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItinerariesOneWayItinerariesBrandedOneWayItineraries getBrandedOneWayItineraries(int i) {
        return this.brandedOneWayItineraries[i];
    }

    public void setBrandedOneWayItineraries(int i, org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItinerariesOneWayItinerariesBrandedOneWayItineraries _value) {
        this.brandedOneWayItineraries[i] = _value;
    }


    /**
     * Gets the simpleOneWayItineraries value for this OTA_AirLowFareSearchRSAvailableItinerariesOneWayItineraries.
     * 
     * @return simpleOneWayItineraries   * Container for priced itineraries assigned to particular leg.
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItinerariesOneWayItinerariesSimpleOneWayItineraries[] getSimpleOneWayItineraries() {
        return simpleOneWayItineraries;
    }


    /**
     * Sets the simpleOneWayItineraries value for this OTA_AirLowFareSearchRSAvailableItinerariesOneWayItineraries.
     * 
     * @param simpleOneWayItineraries   * Container for priced itineraries assigned to particular leg.
     */
    public void setSimpleOneWayItineraries(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItinerariesOneWayItinerariesSimpleOneWayItineraries[] simpleOneWayItineraries) {
        this.simpleOneWayItineraries = simpleOneWayItineraries;
    }

    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItinerariesOneWayItinerariesSimpleOneWayItineraries getSimpleOneWayItineraries(int i) {
        return this.simpleOneWayItineraries[i];
    }

    public void setSimpleOneWayItineraries(int i, org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItinerariesOneWayItinerariesSimpleOneWayItineraries _value) {
        this.simpleOneWayItineraries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRSAvailableItinerariesOneWayItineraries)) return false;
        OTA_AirLowFareSearchRSAvailableItinerariesOneWayItineraries other = (OTA_AirLowFareSearchRSAvailableItinerariesOneWayItineraries) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.brandedOneWayItineraries==null && other.getBrandedOneWayItineraries()==null) || 
             (this.brandedOneWayItineraries!=null &&
              java.util.Arrays.equals(this.brandedOneWayItineraries, other.getBrandedOneWayItineraries()))) &&
            ((this.simpleOneWayItineraries==null && other.getSimpleOneWayItineraries()==null) || 
             (this.simpleOneWayItineraries!=null &&
              java.util.Arrays.equals(this.simpleOneWayItineraries, other.getSimpleOneWayItineraries())));
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
        if (getBrandedOneWayItineraries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBrandedOneWayItineraries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBrandedOneWayItineraries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSimpleOneWayItineraries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSimpleOneWayItineraries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSimpleOneWayItineraries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRSAvailableItinerariesOneWayItineraries.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRS>AvailableItineraries>OneWayItineraries"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandedOneWayItineraries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BrandedOneWayItineraries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRS>AvailableItineraries>OneWayItineraries>BrandedOneWayItineraries"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simpleOneWayItineraries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SimpleOneWayItineraries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRS>AvailableItineraries>OneWayItineraries>SimpleOneWayItineraries"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
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
