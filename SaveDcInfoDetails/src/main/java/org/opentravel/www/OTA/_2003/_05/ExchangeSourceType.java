/**
 * ExchangeSourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class ExchangeSourceType  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.SourceBookingChannelType bookingChannel;

    private java.lang.String agentSine;  // attribute

    private java.lang.String pseudoCityCode;  // attribute

    private java.lang.String ISOCountry;  // attribute

    private java.lang.String ISOCurrency;  // attribute

    private java.lang.String agentDutyCode;  // attribute

    private java.lang.String airlineVendorID;  // attribute

    private java.lang.String airportCode;  // attribute

    private java.lang.String firstDepartPoint;  // attribute

    private java.lang.String ERSP_UserID;  // attribute

    private java.lang.String personalCityCode;  // attribute

    private java.lang.String accountingCode;  // attribute

    private java.lang.String officeCode;  // attribute

    private java.lang.String defaultTicketingCarrier;  // attribute

    private java.lang.String airlineChannelCode;  // attribute

    private java.lang.String agentDepartmentCode;  // attribute

    private java.lang.String agentFunction;  // attribute

    private java.lang.String travelAgencyIATA;  // attribute

    private java.lang.String homeAgencyIATA;  // attribute

    private java.lang.String agentIATA;  // attribute

    private java.lang.String vendorCRSCode;  // attribute

    private java.lang.String agentDuty;  // attribute

    private java.lang.Boolean abacusUser;  // attribute

    private java.lang.String agentCity;  // attribute

    private java.lang.String mainTravelAgencyPCC;  // attribute

    private java.lang.String carrier;  // attribute

    private java.lang.String hostCarrier;  // attribute

    private java.lang.Boolean ETicketCapable;  // attribute

    private java.lang.Short coHostID;  // attribute

    public ExchangeSourceType() {
    }

    public ExchangeSourceType(
           org.opentravel.www.OTA._2003._05.SourceBookingChannelType bookingChannel,
           java.lang.String agentSine,
           java.lang.String pseudoCityCode,
           java.lang.String ISOCountry,
           java.lang.String ISOCurrency,
           java.lang.String agentDutyCode,
           java.lang.String airlineVendorID,
           java.lang.String airportCode,
           java.lang.String firstDepartPoint,
           java.lang.String ERSP_UserID,
           java.lang.String personalCityCode,
           java.lang.String accountingCode,
           java.lang.String officeCode,
           java.lang.String defaultTicketingCarrier,
           java.lang.String airlineChannelCode,
           java.lang.String agentDepartmentCode,
           java.lang.String agentFunction,
           java.lang.String travelAgencyIATA,
           java.lang.String homeAgencyIATA,
           java.lang.String agentIATA,
           java.lang.String vendorCRSCode,
           java.lang.String agentDuty,
           java.lang.Boolean abacusUser,
           java.lang.String agentCity,
           java.lang.String mainTravelAgencyPCC,
           java.lang.String carrier,
           java.lang.String hostCarrier,
           java.lang.Boolean ETicketCapable,
           java.lang.Short coHostID) {
           this.bookingChannel = bookingChannel;
           this.agentSine = agentSine;
           this.pseudoCityCode = pseudoCityCode;
           this.ISOCountry = ISOCountry;
           this.ISOCurrency = ISOCurrency;
           this.agentDutyCode = agentDutyCode;
           this.airlineVendorID = airlineVendorID;
           this.airportCode = airportCode;
           this.firstDepartPoint = firstDepartPoint;
           this.ERSP_UserID = ERSP_UserID;
           this.personalCityCode = personalCityCode;
           this.accountingCode = accountingCode;
           this.officeCode = officeCode;
           this.defaultTicketingCarrier = defaultTicketingCarrier;
           this.airlineChannelCode = airlineChannelCode;
           this.agentDepartmentCode = agentDepartmentCode;
           this.agentFunction = agentFunction;
           this.travelAgencyIATA = travelAgencyIATA;
           this.homeAgencyIATA = homeAgencyIATA;
           this.agentIATA = agentIATA;
           this.vendorCRSCode = vendorCRSCode;
           this.agentDuty = agentDuty;
           this.abacusUser = abacusUser;
           this.agentCity = agentCity;
           this.mainTravelAgencyPCC = mainTravelAgencyPCC;
           this.carrier = carrier;
           this.hostCarrier = hostCarrier;
           this.ETicketCapable = ETicketCapable;
           this.coHostID = coHostID;
    }


    /**
     * Gets the bookingChannel value for this ExchangeSourceType.
     * 
     * @return bookingChannel
     */
    public org.opentravel.www.OTA._2003._05.SourceBookingChannelType getBookingChannel() {
        return bookingChannel;
    }


    /**
     * Sets the bookingChannel value for this ExchangeSourceType.
     * 
     * @param bookingChannel
     */
    public void setBookingChannel(org.opentravel.www.OTA._2003._05.SourceBookingChannelType bookingChannel) {
        this.bookingChannel = bookingChannel;
    }


    /**
     * Gets the agentSine value for this ExchangeSourceType.
     * 
     * @return agentSine
     */
    public java.lang.String getAgentSine() {
        return agentSine;
    }


    /**
     * Sets the agentSine value for this ExchangeSourceType.
     * 
     * @param agentSine
     */
    public void setAgentSine(java.lang.String agentSine) {
        this.agentSine = agentSine;
    }


    /**
     * Gets the pseudoCityCode value for this ExchangeSourceType.
     * 
     * @return pseudoCityCode
     */
    public java.lang.String getPseudoCityCode() {
        return pseudoCityCode;
    }


    /**
     * Sets the pseudoCityCode value for this ExchangeSourceType.
     * 
     * @param pseudoCityCode
     */
    public void setPseudoCityCode(java.lang.String pseudoCityCode) {
        this.pseudoCityCode = pseudoCityCode;
    }


    /**
     * Gets the ISOCountry value for this ExchangeSourceType.
     * 
     * @return ISOCountry
     */
    public java.lang.String getISOCountry() {
        return ISOCountry;
    }


    /**
     * Sets the ISOCountry value for this ExchangeSourceType.
     * 
     * @param ISOCountry
     */
    public void setISOCountry(java.lang.String ISOCountry) {
        this.ISOCountry = ISOCountry;
    }


    /**
     * Gets the ISOCurrency value for this ExchangeSourceType.
     * 
     * @return ISOCurrency
     */
    public java.lang.String getISOCurrency() {
        return ISOCurrency;
    }


    /**
     * Sets the ISOCurrency value for this ExchangeSourceType.
     * 
     * @param ISOCurrency
     */
    public void setISOCurrency(java.lang.String ISOCurrency) {
        this.ISOCurrency = ISOCurrency;
    }


    /**
     * Gets the agentDutyCode value for this ExchangeSourceType.
     * 
     * @return agentDutyCode
     */
    public java.lang.String getAgentDutyCode() {
        return agentDutyCode;
    }


    /**
     * Sets the agentDutyCode value for this ExchangeSourceType.
     * 
     * @param agentDutyCode
     */
    public void setAgentDutyCode(java.lang.String agentDutyCode) {
        this.agentDutyCode = agentDutyCode;
    }


    /**
     * Gets the airlineVendorID value for this ExchangeSourceType.
     * 
     * @return airlineVendorID
     */
    public java.lang.String getAirlineVendorID() {
        return airlineVendorID;
    }


    /**
     * Sets the airlineVendorID value for this ExchangeSourceType.
     * 
     * @param airlineVendorID
     */
    public void setAirlineVendorID(java.lang.String airlineVendorID) {
        this.airlineVendorID = airlineVendorID;
    }


    /**
     * Gets the airportCode value for this ExchangeSourceType.
     * 
     * @return airportCode
     */
    public java.lang.String getAirportCode() {
        return airportCode;
    }


    /**
     * Sets the airportCode value for this ExchangeSourceType.
     * 
     * @param airportCode
     */
    public void setAirportCode(java.lang.String airportCode) {
        this.airportCode = airportCode;
    }


    /**
     * Gets the firstDepartPoint value for this ExchangeSourceType.
     * 
     * @return firstDepartPoint
     */
    public java.lang.String getFirstDepartPoint() {
        return firstDepartPoint;
    }


    /**
     * Sets the firstDepartPoint value for this ExchangeSourceType.
     * 
     * @param firstDepartPoint
     */
    public void setFirstDepartPoint(java.lang.String firstDepartPoint) {
        this.firstDepartPoint = firstDepartPoint;
    }


    /**
     * Gets the ERSP_UserID value for this ExchangeSourceType.
     * 
     * @return ERSP_UserID
     */
    public java.lang.String getERSP_UserID() {
        return ERSP_UserID;
    }


    /**
     * Sets the ERSP_UserID value for this ExchangeSourceType.
     * 
     * @param ERSP_UserID
     */
    public void setERSP_UserID(java.lang.String ERSP_UserID) {
        this.ERSP_UserID = ERSP_UserID;
    }


    /**
     * Gets the personalCityCode value for this ExchangeSourceType.
     * 
     * @return personalCityCode
     */
    public java.lang.String getPersonalCityCode() {
        return personalCityCode;
    }


    /**
     * Sets the personalCityCode value for this ExchangeSourceType.
     * 
     * @param personalCityCode
     */
    public void setPersonalCityCode(java.lang.String personalCityCode) {
        this.personalCityCode = personalCityCode;
    }


    /**
     * Gets the accountingCode value for this ExchangeSourceType.
     * 
     * @return accountingCode
     */
    public java.lang.String getAccountingCode() {
        return accountingCode;
    }


    /**
     * Sets the accountingCode value for this ExchangeSourceType.
     * 
     * @param accountingCode
     */
    public void setAccountingCode(java.lang.String accountingCode) {
        this.accountingCode = accountingCode;
    }


    /**
     * Gets the officeCode value for this ExchangeSourceType.
     * 
     * @return officeCode
     */
    public java.lang.String getOfficeCode() {
        return officeCode;
    }


    /**
     * Sets the officeCode value for this ExchangeSourceType.
     * 
     * @param officeCode
     */
    public void setOfficeCode(java.lang.String officeCode) {
        this.officeCode = officeCode;
    }


    /**
     * Gets the defaultTicketingCarrier value for this ExchangeSourceType.
     * 
     * @return defaultTicketingCarrier
     */
    public java.lang.String getDefaultTicketingCarrier() {
        return defaultTicketingCarrier;
    }


    /**
     * Sets the defaultTicketingCarrier value for this ExchangeSourceType.
     * 
     * @param defaultTicketingCarrier
     */
    public void setDefaultTicketingCarrier(java.lang.String defaultTicketingCarrier) {
        this.defaultTicketingCarrier = defaultTicketingCarrier;
    }


    /**
     * Gets the airlineChannelCode value for this ExchangeSourceType.
     * 
     * @return airlineChannelCode
     */
    public java.lang.String getAirlineChannelCode() {
        return airlineChannelCode;
    }


    /**
     * Sets the airlineChannelCode value for this ExchangeSourceType.
     * 
     * @param airlineChannelCode
     */
    public void setAirlineChannelCode(java.lang.String airlineChannelCode) {
        this.airlineChannelCode = airlineChannelCode;
    }


    /**
     * Gets the agentDepartmentCode value for this ExchangeSourceType.
     * 
     * @return agentDepartmentCode
     */
    public java.lang.String getAgentDepartmentCode() {
        return agentDepartmentCode;
    }


    /**
     * Sets the agentDepartmentCode value for this ExchangeSourceType.
     * 
     * @param agentDepartmentCode
     */
    public void setAgentDepartmentCode(java.lang.String agentDepartmentCode) {
        this.agentDepartmentCode = agentDepartmentCode;
    }


    /**
     * Gets the agentFunction value for this ExchangeSourceType.
     * 
     * @return agentFunction
     */
    public java.lang.String getAgentFunction() {
        return agentFunction;
    }


    /**
     * Sets the agentFunction value for this ExchangeSourceType.
     * 
     * @param agentFunction
     */
    public void setAgentFunction(java.lang.String agentFunction) {
        this.agentFunction = agentFunction;
    }


    /**
     * Gets the travelAgencyIATA value for this ExchangeSourceType.
     * 
     * @return travelAgencyIATA
     */
    public java.lang.String getTravelAgencyIATA() {
        return travelAgencyIATA;
    }


    /**
     * Sets the travelAgencyIATA value for this ExchangeSourceType.
     * 
     * @param travelAgencyIATA
     */
    public void setTravelAgencyIATA(java.lang.String travelAgencyIATA) {
        this.travelAgencyIATA = travelAgencyIATA;
    }


    /**
     * Gets the homeAgencyIATA value for this ExchangeSourceType.
     * 
     * @return homeAgencyIATA
     */
    public java.lang.String getHomeAgencyIATA() {
        return homeAgencyIATA;
    }


    /**
     * Sets the homeAgencyIATA value for this ExchangeSourceType.
     * 
     * @param homeAgencyIATA
     */
    public void setHomeAgencyIATA(java.lang.String homeAgencyIATA) {
        this.homeAgencyIATA = homeAgencyIATA;
    }


    /**
     * Gets the agentIATA value for this ExchangeSourceType.
     * 
     * @return agentIATA
     */
    public java.lang.String getAgentIATA() {
        return agentIATA;
    }


    /**
     * Sets the agentIATA value for this ExchangeSourceType.
     * 
     * @param agentIATA
     */
    public void setAgentIATA(java.lang.String agentIATA) {
        this.agentIATA = agentIATA;
    }


    /**
     * Gets the vendorCRSCode value for this ExchangeSourceType.
     * 
     * @return vendorCRSCode
     */
    public java.lang.String getVendorCRSCode() {
        return vendorCRSCode;
    }


    /**
     * Sets the vendorCRSCode value for this ExchangeSourceType.
     * 
     * @param vendorCRSCode
     */
    public void setVendorCRSCode(java.lang.String vendorCRSCode) {
        this.vendorCRSCode = vendorCRSCode;
    }


    /**
     * Gets the agentDuty value for this ExchangeSourceType.
     * 
     * @return agentDuty
     */
    public java.lang.String getAgentDuty() {
        return agentDuty;
    }


    /**
     * Sets the agentDuty value for this ExchangeSourceType.
     * 
     * @param agentDuty
     */
    public void setAgentDuty(java.lang.String agentDuty) {
        this.agentDuty = agentDuty;
    }


    /**
     * Gets the abacusUser value for this ExchangeSourceType.
     * 
     * @return abacusUser
     */
    public java.lang.Boolean getAbacusUser() {
        return abacusUser;
    }


    /**
     * Sets the abacusUser value for this ExchangeSourceType.
     * 
     * @param abacusUser
     */
    public void setAbacusUser(java.lang.Boolean abacusUser) {
        this.abacusUser = abacusUser;
    }


    /**
     * Gets the agentCity value for this ExchangeSourceType.
     * 
     * @return agentCity
     */
    public java.lang.String getAgentCity() {
        return agentCity;
    }


    /**
     * Sets the agentCity value for this ExchangeSourceType.
     * 
     * @param agentCity
     */
    public void setAgentCity(java.lang.String agentCity) {
        this.agentCity = agentCity;
    }


    /**
     * Gets the mainTravelAgencyPCC value for this ExchangeSourceType.
     * 
     * @return mainTravelAgencyPCC
     */
    public java.lang.String getMainTravelAgencyPCC() {
        return mainTravelAgencyPCC;
    }


    /**
     * Sets the mainTravelAgencyPCC value for this ExchangeSourceType.
     * 
     * @param mainTravelAgencyPCC
     */
    public void setMainTravelAgencyPCC(java.lang.String mainTravelAgencyPCC) {
        this.mainTravelAgencyPCC = mainTravelAgencyPCC;
    }


    /**
     * Gets the carrier value for this ExchangeSourceType.
     * 
     * @return carrier
     */
    public java.lang.String getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this ExchangeSourceType.
     * 
     * @param carrier
     */
    public void setCarrier(java.lang.String carrier) {
        this.carrier = carrier;
    }


    /**
     * Gets the hostCarrier value for this ExchangeSourceType.
     * 
     * @return hostCarrier
     */
    public java.lang.String getHostCarrier() {
        return hostCarrier;
    }


    /**
     * Sets the hostCarrier value for this ExchangeSourceType.
     * 
     * @param hostCarrier
     */
    public void setHostCarrier(java.lang.String hostCarrier) {
        this.hostCarrier = hostCarrier;
    }


    /**
     * Gets the ETicketCapable value for this ExchangeSourceType.
     * 
     * @return ETicketCapable
     */
    public java.lang.Boolean getETicketCapable() {
        return ETicketCapable;
    }


    /**
     * Sets the ETicketCapable value for this ExchangeSourceType.
     * 
     * @param ETicketCapable
     */
    public void setETicketCapable(java.lang.Boolean ETicketCapable) {
        this.ETicketCapable = ETicketCapable;
    }


    /**
     * Gets the coHostID value for this ExchangeSourceType.
     * 
     * @return coHostID
     */
    public java.lang.Short getCoHostID() {
        return coHostID;
    }


    /**
     * Sets the coHostID value for this ExchangeSourceType.
     * 
     * @param coHostID
     */
    public void setCoHostID(java.lang.Short coHostID) {
        this.coHostID = coHostID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExchangeSourceType)) return false;
        ExchangeSourceType other = (ExchangeSourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bookingChannel==null && other.getBookingChannel()==null) || 
             (this.bookingChannel!=null &&
              this.bookingChannel.equals(other.getBookingChannel()))) &&
            ((this.agentSine==null && other.getAgentSine()==null) || 
             (this.agentSine!=null &&
              this.agentSine.equals(other.getAgentSine()))) &&
            ((this.pseudoCityCode==null && other.getPseudoCityCode()==null) || 
             (this.pseudoCityCode!=null &&
              this.pseudoCityCode.equals(other.getPseudoCityCode()))) &&
            ((this.ISOCountry==null && other.getISOCountry()==null) || 
             (this.ISOCountry!=null &&
              this.ISOCountry.equals(other.getISOCountry()))) &&
            ((this.ISOCurrency==null && other.getISOCurrency()==null) || 
             (this.ISOCurrency!=null &&
              this.ISOCurrency.equals(other.getISOCurrency()))) &&
            ((this.agentDutyCode==null && other.getAgentDutyCode()==null) || 
             (this.agentDutyCode!=null &&
              this.agentDutyCode.equals(other.getAgentDutyCode()))) &&
            ((this.airlineVendorID==null && other.getAirlineVendorID()==null) || 
             (this.airlineVendorID!=null &&
              this.airlineVendorID.equals(other.getAirlineVendorID()))) &&
            ((this.airportCode==null && other.getAirportCode()==null) || 
             (this.airportCode!=null &&
              this.airportCode.equals(other.getAirportCode()))) &&
            ((this.firstDepartPoint==null && other.getFirstDepartPoint()==null) || 
             (this.firstDepartPoint!=null &&
              this.firstDepartPoint.equals(other.getFirstDepartPoint()))) &&
            ((this.ERSP_UserID==null && other.getERSP_UserID()==null) || 
             (this.ERSP_UserID!=null &&
              this.ERSP_UserID.equals(other.getERSP_UserID()))) &&
            ((this.personalCityCode==null && other.getPersonalCityCode()==null) || 
             (this.personalCityCode!=null &&
              this.personalCityCode.equals(other.getPersonalCityCode()))) &&
            ((this.accountingCode==null && other.getAccountingCode()==null) || 
             (this.accountingCode!=null &&
              this.accountingCode.equals(other.getAccountingCode()))) &&
            ((this.officeCode==null && other.getOfficeCode()==null) || 
             (this.officeCode!=null &&
              this.officeCode.equals(other.getOfficeCode()))) &&
            ((this.defaultTicketingCarrier==null && other.getDefaultTicketingCarrier()==null) || 
             (this.defaultTicketingCarrier!=null &&
              this.defaultTicketingCarrier.equals(other.getDefaultTicketingCarrier()))) &&
            ((this.airlineChannelCode==null && other.getAirlineChannelCode()==null) || 
             (this.airlineChannelCode!=null &&
              this.airlineChannelCode.equals(other.getAirlineChannelCode()))) &&
            ((this.agentDepartmentCode==null && other.getAgentDepartmentCode()==null) || 
             (this.agentDepartmentCode!=null &&
              this.agentDepartmentCode.equals(other.getAgentDepartmentCode()))) &&
            ((this.agentFunction==null && other.getAgentFunction()==null) || 
             (this.agentFunction!=null &&
              this.agentFunction.equals(other.getAgentFunction()))) &&
            ((this.travelAgencyIATA==null && other.getTravelAgencyIATA()==null) || 
             (this.travelAgencyIATA!=null &&
              this.travelAgencyIATA.equals(other.getTravelAgencyIATA()))) &&
            ((this.homeAgencyIATA==null && other.getHomeAgencyIATA()==null) || 
             (this.homeAgencyIATA!=null &&
              this.homeAgencyIATA.equals(other.getHomeAgencyIATA()))) &&
            ((this.agentIATA==null && other.getAgentIATA()==null) || 
             (this.agentIATA!=null &&
              this.agentIATA.equals(other.getAgentIATA()))) &&
            ((this.vendorCRSCode==null && other.getVendorCRSCode()==null) || 
             (this.vendorCRSCode!=null &&
              this.vendorCRSCode.equals(other.getVendorCRSCode()))) &&
            ((this.agentDuty==null && other.getAgentDuty()==null) || 
             (this.agentDuty!=null &&
              this.agentDuty.equals(other.getAgentDuty()))) &&
            ((this.abacusUser==null && other.getAbacusUser()==null) || 
             (this.abacusUser!=null &&
              this.abacusUser.equals(other.getAbacusUser()))) &&
            ((this.agentCity==null && other.getAgentCity()==null) || 
             (this.agentCity!=null &&
              this.agentCity.equals(other.getAgentCity()))) &&
            ((this.mainTravelAgencyPCC==null && other.getMainTravelAgencyPCC()==null) || 
             (this.mainTravelAgencyPCC!=null &&
              this.mainTravelAgencyPCC.equals(other.getMainTravelAgencyPCC()))) &&
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier()))) &&
            ((this.hostCarrier==null && other.getHostCarrier()==null) || 
             (this.hostCarrier!=null &&
              this.hostCarrier.equals(other.getHostCarrier()))) &&
            ((this.ETicketCapable==null && other.getETicketCapable()==null) || 
             (this.ETicketCapable!=null &&
              this.ETicketCapable.equals(other.getETicketCapable()))) &&
            ((this.coHostID==null && other.getCoHostID()==null) || 
             (this.coHostID!=null &&
              this.coHostID.equals(other.getCoHostID())));
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
        if (getBookingChannel() != null) {
            _hashCode += getBookingChannel().hashCode();
        }
        if (getAgentSine() != null) {
            _hashCode += getAgentSine().hashCode();
        }
        if (getPseudoCityCode() != null) {
            _hashCode += getPseudoCityCode().hashCode();
        }
        if (getISOCountry() != null) {
            _hashCode += getISOCountry().hashCode();
        }
        if (getISOCurrency() != null) {
            _hashCode += getISOCurrency().hashCode();
        }
        if (getAgentDutyCode() != null) {
            _hashCode += getAgentDutyCode().hashCode();
        }
        if (getAirlineVendorID() != null) {
            _hashCode += getAirlineVendorID().hashCode();
        }
        if (getAirportCode() != null) {
            _hashCode += getAirportCode().hashCode();
        }
        if (getFirstDepartPoint() != null) {
            _hashCode += getFirstDepartPoint().hashCode();
        }
        if (getERSP_UserID() != null) {
            _hashCode += getERSP_UserID().hashCode();
        }
        if (getPersonalCityCode() != null) {
            _hashCode += getPersonalCityCode().hashCode();
        }
        if (getAccountingCode() != null) {
            _hashCode += getAccountingCode().hashCode();
        }
        if (getOfficeCode() != null) {
            _hashCode += getOfficeCode().hashCode();
        }
        if (getDefaultTicketingCarrier() != null) {
            _hashCode += getDefaultTicketingCarrier().hashCode();
        }
        if (getAirlineChannelCode() != null) {
            _hashCode += getAirlineChannelCode().hashCode();
        }
        if (getAgentDepartmentCode() != null) {
            _hashCode += getAgentDepartmentCode().hashCode();
        }
        if (getAgentFunction() != null) {
            _hashCode += getAgentFunction().hashCode();
        }
        if (getTravelAgencyIATA() != null) {
            _hashCode += getTravelAgencyIATA().hashCode();
        }
        if (getHomeAgencyIATA() != null) {
            _hashCode += getHomeAgencyIATA().hashCode();
        }
        if (getAgentIATA() != null) {
            _hashCode += getAgentIATA().hashCode();
        }
        if (getVendorCRSCode() != null) {
            _hashCode += getVendorCRSCode().hashCode();
        }
        if (getAgentDuty() != null) {
            _hashCode += getAgentDuty().hashCode();
        }
        if (getAbacusUser() != null) {
            _hashCode += getAbacusUser().hashCode();
        }
        if (getAgentCity() != null) {
            _hashCode += getAgentCity().hashCode();
        }
        if (getMainTravelAgencyPCC() != null) {
            _hashCode += getMainTravelAgencyPCC().hashCode();
        }
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        if (getHostCarrier() != null) {
            _hashCode += getHostCarrier().hashCode();
        }
        if (getETicketCapable() != null) {
            _hashCode += getETicketCapable().hashCode();
        }
        if (getCoHostID() != null) {
            _hashCode += getCoHostID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExchangeSourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeSourceType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("agentSine");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AgentSine"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to16"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("pseudoCityCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PseudoCityCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to16"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ISOCountry");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ISOCountry"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ISO3166"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ISOCurrency");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ISOCurrency"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlphaLength3"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("agentDutyCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AgentDutyCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to16"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("airlineVendorID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AirlineVendorID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "UpperCaseAlphaNumericLength2to3"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("airportCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AirportCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "UpperCaseAlphaNumericLength3to5"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("firstDepartPoint");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FirstDepartPoint"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength3"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ERSP_UserID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ERSP_UserID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to16"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("personalCityCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PersonalCityCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PersonalCityCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("accountingCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AccountingCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AccountingCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("officeCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OfficeCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">OfficeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("defaultTicketingCarrier");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DefaultTicketingCarrier"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">DefaultTicketingCarrier"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("airlineChannelCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AirlineChannelCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirlineChannelCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("agentDepartmentCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AgentDepartmentCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AgentDepartmentCodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("agentFunction");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AgentFunction"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AgentFunctionType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("travelAgencyIATA");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TravelAgencyIATA"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ARCNumberType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("homeAgencyIATA");
        attrField.setXmlName(new javax.xml.namespace.QName("", "HomeAgencyIATA"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ARCNumberType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("agentIATA");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AgentIATA"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ARCNumberType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("vendorCRSCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "VendorCRSCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("agentDuty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AgentDuty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CharacterType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("abacusUser");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AbacusUser"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("agentCity");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AgentCity"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlphaLength3"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("mainTravelAgencyPCC");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MainTravelAgencyPCC"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to16"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("carrier");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Carrier"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CarrierCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("hostCarrier");
        attrField.setXmlName(new javax.xml.namespace.QName("", "HostCarrier"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CarrierCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ETicketCapable");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ETicketCapable"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("coHostID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CoHostID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BookingChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SourceBookingChannelType"));
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
