
package org.xm.services.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="returnMsg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="countryActivity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isAnyWherePayoutCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="anyWherePayoutCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payinCcyList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="payinCcyLimit" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="payinCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="payinAmountLimit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="payoutCcyList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="payoutCcyLimit" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="payoutCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="payoutAmountLimit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="service"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="purposeOfTxnTypes"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="purposeOfTxnList" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sourceOfIncomeTypes"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="sourceOfIncomeList" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AcceptableIDTypes"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IDList" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="IDIndexNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="IDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="isIDIssuedByMandatory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="isIDIssuedAtMandatory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="isIDIssuedDateMandatory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="isIDExpiryDateMandatory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="xmReserved1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="xmReserved2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="xmReserved3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="xmReserved4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "returnCode",
    "returnMsg",
    "countryCode",
    "countryName",
    "countryActivity",
    "isAnyWherePayoutCountry",
    "anyWherePayoutCountryCode",
    "payinCcyList",
    "payoutCcyList",
    "service",
    "purposeOfTxnTypes",
    "sourceOfIncomeTypes",
    "acceptableIDTypes",
    "xmReserved1",
    "xmReserved2",
    "xmReserved3",
    "xmReserved4"
})
@XmlRootElement(name = "getXMCountryDetailsResponse")
public class GetXMCountryDetailsResponse {

    @XmlElement(required = true, nillable = true)
    protected String returnCode;
    @XmlElement(required = true, nillable = true)
    protected String returnMsg;
    @XmlElement(required = true, nillable = true)
    protected String countryCode;
    @XmlElement(required = true, nillable = true)
    protected String countryName;
    @XmlElement(required = true, nillable = true)
    protected String countryActivity;
    @XmlElement(required = true, nillable = true)
    protected String isAnyWherePayoutCountry;
    @XmlElement(required = true, nillable = true)
    protected String anyWherePayoutCountryCode;
    @XmlElement(required = true)
    protected GetXMCountryDetailsResponse.PayinCcyList payinCcyList;
    @XmlElement(required = true)
    protected GetXMCountryDetailsResponse.PayoutCcyList payoutCcyList;
    @XmlElement(required = true)
    protected GetXMCountryDetailsResponse.Service service;
    @XmlElement(required = true)
    protected GetXMCountryDetailsResponse.PurposeOfTxnTypes purposeOfTxnTypes;
    @XmlElement(required = true)
    protected GetXMCountryDetailsResponse.SourceOfIncomeTypes sourceOfIncomeTypes;
    @XmlElement(name = "AcceptableIDTypes", required = true)
    protected GetXMCountryDetailsResponse.AcceptableIDTypes acceptableIDTypes;
    @XmlElement(required = true, nillable = true)
    protected String xmReserved1;
    @XmlElement(required = true, nillable = true)
    protected String xmReserved2;
    @XmlElement(required = true, nillable = true)
    protected String xmReserved3;
    @XmlElement(required = true, nillable = true)
    protected String xmReserved4;

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the returnMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnMsg() {
        return returnMsg;
    }

    /**
     * Sets the value of the returnMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnMsg(String value) {
        this.returnMsg = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the countryActivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryActivity() {
        return countryActivity;
    }

    /**
     * Sets the value of the countryActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryActivity(String value) {
        this.countryActivity = value;
    }

    /**
     * Gets the value of the isAnyWherePayoutCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAnyWherePayoutCountry() {
        return isAnyWherePayoutCountry;
    }

    /**
     * Sets the value of the isAnyWherePayoutCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAnyWherePayoutCountry(String value) {
        this.isAnyWherePayoutCountry = value;
    }

    /**
     * Gets the value of the anyWherePayoutCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnyWherePayoutCountryCode() {
        return anyWherePayoutCountryCode;
    }

    /**
     * Sets the value of the anyWherePayoutCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnyWherePayoutCountryCode(String value) {
        this.anyWherePayoutCountryCode = value;
    }

    /**
     * Gets the value of the payinCcyList property.
     * 
     * @return
     *     possible object is
     *     {@link GetXMCountryDetailsResponse.PayinCcyList }
     *     
     */
    public GetXMCountryDetailsResponse.PayinCcyList getPayinCcyList() {
        return payinCcyList;
    }

    /**
     * Sets the value of the payinCcyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetXMCountryDetailsResponse.PayinCcyList }
     *     
     */
    public void setPayinCcyList(GetXMCountryDetailsResponse.PayinCcyList value) {
        this.payinCcyList = value;
    }

    /**
     * Gets the value of the payoutCcyList property.
     * 
     * @return
     *     possible object is
     *     {@link GetXMCountryDetailsResponse.PayoutCcyList }
     *     
     */
    public GetXMCountryDetailsResponse.PayoutCcyList getPayoutCcyList() {
        return payoutCcyList;
    }

    /**
     * Sets the value of the payoutCcyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetXMCountryDetailsResponse.PayoutCcyList }
     *     
     */
    public void setPayoutCcyList(GetXMCountryDetailsResponse.PayoutCcyList value) {
        this.payoutCcyList = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link GetXMCountryDetailsResponse.Service }
     *     
     */
    public GetXMCountryDetailsResponse.Service getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetXMCountryDetailsResponse.Service }
     *     
     */
    public void setService(GetXMCountryDetailsResponse.Service value) {
        this.service = value;
    }

    /**
     * Gets the value of the purposeOfTxnTypes property.
     * 
     * @return
     *     possible object is
     *     {@link GetXMCountryDetailsResponse.PurposeOfTxnTypes }
     *     
     */
    public GetXMCountryDetailsResponse.PurposeOfTxnTypes getPurposeOfTxnTypes() {
        return purposeOfTxnTypes;
    }

    /**
     * Sets the value of the purposeOfTxnTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetXMCountryDetailsResponse.PurposeOfTxnTypes }
     *     
     */
    public void setPurposeOfTxnTypes(GetXMCountryDetailsResponse.PurposeOfTxnTypes value) {
        this.purposeOfTxnTypes = value;
    }

    /**
     * Gets the value of the sourceOfIncomeTypes property.
     * 
     * @return
     *     possible object is
     *     {@link GetXMCountryDetailsResponse.SourceOfIncomeTypes }
     *     
     */
    public GetXMCountryDetailsResponse.SourceOfIncomeTypes getSourceOfIncomeTypes() {
        return sourceOfIncomeTypes;
    }

    /**
     * Sets the value of the sourceOfIncomeTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetXMCountryDetailsResponse.SourceOfIncomeTypes }
     *     
     */
    public void setSourceOfIncomeTypes(GetXMCountryDetailsResponse.SourceOfIncomeTypes value) {
        this.sourceOfIncomeTypes = value;
    }

    /**
     * Gets the value of the acceptableIDTypes property.
     * 
     * @return
     *     possible object is
     *     {@link GetXMCountryDetailsResponse.AcceptableIDTypes }
     *     
     */
    public GetXMCountryDetailsResponse.AcceptableIDTypes getAcceptableIDTypes() {
        return acceptableIDTypes;
    }

    /**
     * Sets the value of the acceptableIDTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetXMCountryDetailsResponse.AcceptableIDTypes }
     *     
     */
    public void setAcceptableIDTypes(GetXMCountryDetailsResponse.AcceptableIDTypes value) {
        this.acceptableIDTypes = value;
    }

    /**
     * Gets the value of the xmReserved1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmReserved1() {
        return xmReserved1;
    }

    /**
     * Sets the value of the xmReserved1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmReserved1(String value) {
        this.xmReserved1 = value;
    }

    /**
     * Gets the value of the xmReserved2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmReserved2() {
        return xmReserved2;
    }

    /**
     * Sets the value of the xmReserved2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmReserved2(String value) {
        this.xmReserved2 = value;
    }

    /**
     * Gets the value of the xmReserved3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmReserved3() {
        return xmReserved3;
    }

    /**
     * Sets the value of the xmReserved3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmReserved3(String value) {
        this.xmReserved3 = value;
    }

    /**
     * Gets the value of the xmReserved4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmReserved4() {
        return xmReserved4;
    }

    /**
     * Sets the value of the xmReserved4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmReserved4(String value) {
        this.xmReserved4 = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="IDList" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IDIndexNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="IDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="isIDIssuedByMandatory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="isIDIssuedAtMandatory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="isIDIssuedDateMandatory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="isIDExpiryDateMandatory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "idList"
    })
    public static class AcceptableIDTypes {

        @XmlElement(name = "IDList", required = true)
        protected List<GetXMCountryDetailsResponse.AcceptableIDTypes.IDList> idList;

        /**
         * Gets the value of the idList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the idList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIDList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetXMCountryDetailsResponse.AcceptableIDTypes.IDList }
         * 
         * 
         */
        public List<GetXMCountryDetailsResponse.AcceptableIDTypes.IDList> getIDList() {
            if (idList == null) {
                idList = new ArrayList<GetXMCountryDetailsResponse.AcceptableIDTypes.IDList>();
            }
            return this.idList;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="IDIndexNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="IDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="isIDIssuedByMandatory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="isIDIssuedAtMandatory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="isIDIssuedDateMandatory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="isIDExpiryDateMandatory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "idIndexNo",
            "idType",
            "isIDIssuedByMandatory",
            "isIDIssuedAtMandatory",
            "isIDIssuedDateMandatory",
            "isIDExpiryDateMandatory"
        })
        public static class IDList {

            @XmlElement(name = "IDIndexNo", required = true, nillable = true)
            protected String idIndexNo;
            @XmlElement(name = "IDType", required = true, nillable = true)
            protected String idType;
            @XmlElement(required = true, nillable = true)
            protected String isIDIssuedByMandatory;
            @XmlElement(required = true, nillable = true)
            protected String isIDIssuedAtMandatory;
            @XmlElement(required = true, nillable = true)
            protected String isIDIssuedDateMandatory;
            @XmlElement(required = true, nillable = true)
            protected String isIDExpiryDateMandatory;

            /**
             * Gets the value of the idIndexNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIDIndexNo() {
                return idIndexNo;
            }

            /**
             * Sets the value of the idIndexNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIDIndexNo(String value) {
                this.idIndexNo = value;
            }

            /**
             * Gets the value of the idType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIDType() {
                return idType;
            }

            /**
             * Sets the value of the idType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIDType(String value) {
                this.idType = value;
            }

            /**
             * Gets the value of the isIDIssuedByMandatory property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsIDIssuedByMandatory() {
                return isIDIssuedByMandatory;
            }

            /**
             * Sets the value of the isIDIssuedByMandatory property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsIDIssuedByMandatory(String value) {
                this.isIDIssuedByMandatory = value;
            }

            /**
             * Gets the value of the isIDIssuedAtMandatory property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsIDIssuedAtMandatory() {
                return isIDIssuedAtMandatory;
            }

            /**
             * Sets the value of the isIDIssuedAtMandatory property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsIDIssuedAtMandatory(String value) {
                this.isIDIssuedAtMandatory = value;
            }

            /**
             * Gets the value of the isIDIssuedDateMandatory property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsIDIssuedDateMandatory() {
                return isIDIssuedDateMandatory;
            }

            /**
             * Sets the value of the isIDIssuedDateMandatory property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsIDIssuedDateMandatory(String value) {
                this.isIDIssuedDateMandatory = value;
            }

            /**
             * Gets the value of the isIDExpiryDateMandatory property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsIDExpiryDateMandatory() {
                return isIDExpiryDateMandatory;
            }

            /**
             * Sets the value of the isIDExpiryDateMandatory property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsIDExpiryDateMandatory(String value) {
                this.isIDExpiryDateMandatory = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="payinCcyLimit" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="payinCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="payinAmountLimit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "payinCcyLimit"
    })
    public static class PayinCcyList {

        @XmlElement(required = true)
        protected List<GetXMCountryDetailsResponse.PayinCcyList.PayinCcyLimit> payinCcyLimit;

        /**
         * Gets the value of the payinCcyLimit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the payinCcyLimit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPayinCcyLimit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetXMCountryDetailsResponse.PayinCcyList.PayinCcyLimit }
         * 
         * 
         */
        public List<GetXMCountryDetailsResponse.PayinCcyList.PayinCcyLimit> getPayinCcyLimit() {
            if (payinCcyLimit == null) {
                payinCcyLimit = new ArrayList<GetXMCountryDetailsResponse.PayinCcyList.PayinCcyLimit>();
            }
            return this.payinCcyLimit;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="payinCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="payinAmountLimit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "payinCcy",
            "payinAmountLimit"
        })
        public static class PayinCcyLimit {

            @XmlElement(required = true, nillable = true)
            protected String payinCcy;
            @XmlElement(required = true, nillable = true)
            protected String payinAmountLimit;

            /**
             * Gets the value of the payinCcy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayinCcy() {
                return payinCcy;
            }

            /**
             * Sets the value of the payinCcy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayinCcy(String value) {
                this.payinCcy = value;
            }

            /**
             * Gets the value of the payinAmountLimit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayinAmountLimit() {
                return payinAmountLimit;
            }

            /**
             * Sets the value of the payinAmountLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayinAmountLimit(String value) {
                this.payinAmountLimit = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="payoutCcyLimit" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="payoutCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="payoutAmountLimit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "payoutCcyLimit"
    })
    public static class PayoutCcyList {

        @XmlElement(required = true)
        protected List<GetXMCountryDetailsResponse.PayoutCcyList.PayoutCcyLimit> payoutCcyLimit;

        /**
         * Gets the value of the payoutCcyLimit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the payoutCcyLimit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPayoutCcyLimit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetXMCountryDetailsResponse.PayoutCcyList.PayoutCcyLimit }
         * 
         * 
         */
        public List<GetXMCountryDetailsResponse.PayoutCcyList.PayoutCcyLimit> getPayoutCcyLimit() {
            if (payoutCcyLimit == null) {
                payoutCcyLimit = new ArrayList<GetXMCountryDetailsResponse.PayoutCcyList.PayoutCcyLimit>();
            }
            return this.payoutCcyLimit;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="payoutCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="payoutAmountLimit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "payoutCcy",
            "payoutAmountLimit"
        })
        public static class PayoutCcyLimit {

            @XmlElement(required = true, nillable = true)
            protected String payoutCcy;
            @XmlElement(required = true, nillable = true)
            protected String payoutAmountLimit;

            /**
             * Gets the value of the payoutCcy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayoutCcy() {
                return payoutCcy;
            }

            /**
             * Sets the value of the payoutCcy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayoutCcy(String value) {
                this.payoutCcy = value;
            }

            /**
             * Gets the value of the payoutAmountLimit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayoutAmountLimit() {
                return payoutAmountLimit;
            }

            /**
             * Sets the value of the payoutAmountLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayoutAmountLimit(String value) {
                this.payoutAmountLimit = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="purposeOfTxnList" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "purposeOfTxnList"
    })
    public static class PurposeOfTxnTypes {

        @XmlElement(required = true)
        protected List<GetXMCountryDetailsResponse.PurposeOfTxnTypes.PurposeOfTxnList> purposeOfTxnList;

        /**
         * Gets the value of the purposeOfTxnList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the purposeOfTxnList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPurposeOfTxnList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetXMCountryDetailsResponse.PurposeOfTxnTypes.PurposeOfTxnList }
         * 
         * 
         */
        public List<GetXMCountryDetailsResponse.PurposeOfTxnTypes.PurposeOfTxnList> getPurposeOfTxnList() {
            if (purposeOfTxnList == null) {
                purposeOfTxnList = new ArrayList<GetXMCountryDetailsResponse.PurposeOfTxnTypes.PurposeOfTxnList>();
            }
            return this.purposeOfTxnList;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "code",
            "description"
        })
        public static class PurposeOfTxnList {

            @XmlElement(required = true, nillable = true)
            protected String code;
            @XmlElement(required = true, nillable = true)
            protected String description;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "serviceType"
    })
    public static class Service {

        @XmlElement(required = true, nillable = true)
        protected List<String> serviceType;

        /**
         * Gets the value of the serviceType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getServiceType() {
            if (serviceType == null) {
                serviceType = new ArrayList<String>();
            }
            return this.serviceType;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="sourceOfIncomeList" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sourceOfIncomeList"
    })
    public static class SourceOfIncomeTypes {

        @XmlElement(required = true)
        protected List<GetXMCountryDetailsResponse.SourceOfIncomeTypes.SourceOfIncomeList> sourceOfIncomeList;

        /**
         * Gets the value of the sourceOfIncomeList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sourceOfIncomeList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSourceOfIncomeList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetXMCountryDetailsResponse.SourceOfIncomeTypes.SourceOfIncomeList }
         * 
         * 
         */
        public List<GetXMCountryDetailsResponse.SourceOfIncomeTypes.SourceOfIncomeList> getSourceOfIncomeList() {
            if (sourceOfIncomeList == null) {
                sourceOfIncomeList = new ArrayList<GetXMCountryDetailsResponse.SourceOfIncomeTypes.SourceOfIncomeList>();
            }
            return this.sourceOfIncomeList;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "code",
            "description"
        })
        public static class SourceOfIncomeList {

            @XmlElement(required = true, nillable = true)
            protected String code;
            @XmlElement(required = true, nillable = true)
            protected String description;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

        }

    }

}
