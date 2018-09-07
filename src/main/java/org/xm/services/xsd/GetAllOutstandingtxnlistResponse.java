
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
 *         &lt;element name="resultList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="result" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="xmwsSessionID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xpin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerPOBox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerAddressCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerMobileCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerMobile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerFax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerOtherInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryIDOtherType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryPOBox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryAddressCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryMobileCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryMobile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryFax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryTestQuestion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryTestAnswer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="messageToBeneficiary" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryOtherInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="purposeOfTxn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="sourceOfIncome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="payoutAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="commission" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="payoutCcyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="payoutDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="sendingAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="sendingAgentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="receivingAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="receivingAgentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="payinCcyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="payinDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="bankBranchName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmBankAdditionalInfo1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmBankAdditionalInfo2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="mobileWalletCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="mobileWalletNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneMobileISOCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmMWAdditionalInfo1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmMWAdditionalInfo2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryCardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="beneficiaryCardType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmECAdditionalInfo1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmECAdditionalInfo2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmReserved1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmReserved2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmReserved3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmReserved4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmReserved5" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmReserved6" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmReserved7" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmReserved8" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmReserved9" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmReserved10" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "resultList"
})
@XmlRootElement(name = "getAllOutstandingtxnlistResponse")
public class GetAllOutstandingtxnlistResponse {

    @XmlElement(required = true, nillable = true)
    protected String returnCode;
    @XmlElement(required = true, nillable = true)
    protected String returnMsg;
    @XmlElement(required = true)
    protected GetAllOutstandingtxnlistResponse.ResultList resultList;

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
     * Gets the value of the resultList property.
     * 
     * @return
     *     possible object is
     *     {@link GetAllOutstandingtxnlistResponse.ResultList }
     *     
     */
    public GetAllOutstandingtxnlistResponse.ResultList getResultList() {
        return resultList;
    }

    /**
     * Sets the value of the resultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAllOutstandingtxnlistResponse.ResultList }
     *     
     */
    public void setResultList(GetAllOutstandingtxnlistResponse.ResultList value) {
        this.resultList = value;
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
     *         &lt;element name="result" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="xmwsSessionID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xpin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerPOBox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerAddressCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerMobileCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerMobile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerFax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerOtherInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryIDOtherType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryPOBox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryAddressCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryMobileCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryMobile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryFax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryTestQuestion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryTestAnswer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="messageToBeneficiary" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryOtherInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="purposeOfTxn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="sourceOfIncome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="payoutAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="commission" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="payoutCcyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="payoutDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="sendingAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="sendingAgentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="receivingAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="receivingAgentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="payinCcyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="payinDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="bankBranchName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmBankAdditionalInfo1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmBankAdditionalInfo2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="mobileWalletCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="mobileWalletNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneMobileISOCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmMWAdditionalInfo1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmMWAdditionalInfo2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryCardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="beneficiaryCardType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmECAdditionalInfo1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmECAdditionalInfo2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmReserved1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmReserved2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmReserved3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmReserved4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmReserved5" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmReserved6" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmReserved7" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmReserved8" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmReserved9" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmReserved10" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "result"
    })
    public static class ResultList {

        @XmlElement(required = true)
        protected List<GetAllOutstandingtxnlistResponse.ResultList.Result> result;

        /**
         * Gets the value of the result property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the result property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResult().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetAllOutstandingtxnlistResponse.ResultList.Result }
         * 
         * 
         */
        public List<GetAllOutstandingtxnlistResponse.ResultList.Result> getResult() {
            if (result == null) {
                result = new ArrayList<GetAllOutstandingtxnlistResponse.ResultList.Result>();
            }
            return this.result;
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
         *         &lt;element name="xmwsSessionID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xpin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerPOBox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerAddressCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerMobileCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerMobile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerFax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerOtherInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryIDOtherType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryPOBox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryAddressCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryMobileCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryMobile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryFax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryTestQuestion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryTestAnswer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="messageToBeneficiary" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryOtherInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="purposeOfTxn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="sourceOfIncome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="payoutAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="commission" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="payoutCcyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="payoutDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="sendingAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="sendingAgentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="receivingAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="receivingAgentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="payinCcyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="payinDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="bankBranchName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xmBankAdditionalInfo1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xmBankAdditionalInfo2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="mobileWalletCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="mobileWalletNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneMobileISOCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xmMWAdditionalInfo1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xmMWAdditionalInfo2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryCardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="beneficiaryCardType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xmECAdditionalInfo1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xmECAdditionalInfo2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xmReserved1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xmReserved2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xmReserved3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xmReserved4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xmReserved5" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xmReserved6" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xmReserved7" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xmReserved8" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xmReserved9" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xmReserved10" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "xmwsSessionID",
            "xpin",
            "customerFirstName",
            "customerMiddleName",
            "customerLastName",
            "customerPOBox",
            "customerAddress1",
            "customerAddress2",
            "customerAddressCity",
            "customerAddressState",
            "customerAddressCountry",
            "customerAddressZip",
            "customerPhoneCountryCode",
            "customerPhone",
            "customerMobileCountryCode",
            "customerMobile",
            "customerFax",
            "customerEmail",
            "customerDescription",
            "customerOtherInfo",
            "customerDateOfBirth",
            "beneficiaryFirstName",
            "beneficiaryMiddleName",
            "beneficiaryLastName",
            "beneficiaryIDOtherType",
            "beneficiaryID",
            "beneficiaryPOBox",
            "beneficiaryAddress1",
            "beneficiaryAddress2",
            "beneficiaryAddressCity",
            "beneficiaryAddressState",
            "beneficiaryAddressCountry",
            "beneficiaryAddressZip",
            "beneficiaryPhoneCountryCode",
            "beneficiaryPhone",
            "beneficiaryMobileCountryCode",
            "beneficiaryMobile",
            "beneficiaryFax",
            "beneficiaryEmail",
            "beneficiaryTestQuestion",
            "beneficiaryTestAnswer",
            "messageToBeneficiary",
            "beneficiaryDescription",
            "beneficiaryOtherInfo",
            "purposeOfTxn",
            "sourceOfIncome",
            "payoutAmount",
            "commission",
            "tax",
            "payoutCcyCode",
            "payoutDate",
            "sendingAgentCode",
            "sendingAgentName",
            "receivingAgentCode",
            "receivingAgentName",
            "payinCcyCode",
            "payinDate",
            "accountNo",
            "accountName",
            "bankName",
            "bankBranchName",
            "xmBankAdditionalInfo1",
            "xmBankAdditionalInfo2",
            "mobileWalletCountryCode",
            "mobileWalletNo",
            "beneMobileISOCountryCode",
            "xmMWAdditionalInfo1",
            "xmMWAdditionalInfo2",
            "beneficiaryCardNumber",
            "beneficiaryCardType",
            "xmECAdditionalInfo1",
            "xmECAdditionalInfo2",
            "xmReserved1",
            "xmReserved2",
            "xmReserved3",
            "xmReserved4",
            "xmReserved5",
            "xmReserved6",
            "xmReserved7",
            "xmReserved8",
            "xmReserved9",
            "xmReserved10"
        })
        public static class Result {

            @XmlElement(required = true, nillable = true)
            protected String xmwsSessionID;
            @XmlElement(required = true, nillable = true)
            protected String xpin;
            @XmlElement(required = true, nillable = true)
            protected String customerFirstName;
            @XmlElement(required = true, nillable = true)
            protected String customerMiddleName;
            @XmlElement(required = true, nillable = true)
            protected String customerLastName;
            @XmlElement(required = true, nillable = true)
            protected String customerPOBox;
            @XmlElement(required = true, nillable = true)
            protected String customerAddress1;
            @XmlElement(required = true, nillable = true)
            protected String customerAddress2;
            @XmlElement(required = true, nillable = true)
            protected String customerAddressCity;
            @XmlElement(required = true, nillable = true)
            protected String customerAddressState;
            @XmlElement(required = true, nillable = true)
            protected String customerAddressCountry;
            @XmlElement(required = true, nillable = true)
            protected String customerAddressZip;
            @XmlElement(required = true, nillable = true)
            protected String customerPhoneCountryCode;
            @XmlElement(required = true, nillable = true)
            protected String customerPhone;
            @XmlElement(required = true, nillable = true)
            protected String customerMobileCountryCode;
            @XmlElement(required = true, nillable = true)
            protected String customerMobile;
            @XmlElement(required = true, nillable = true)
            protected String customerFax;
            @XmlElement(required = true, nillable = true)
            protected String customerEmail;
            @XmlElement(required = true, nillable = true)
            protected String customerDescription;
            @XmlElement(required = true, nillable = true)
            protected String customerOtherInfo;
            @XmlElement(required = true, nillable = true)
            protected String customerDateOfBirth;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryFirstName;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryMiddleName;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryLastName;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryIDOtherType;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryID;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryPOBox;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryAddress1;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryAddress2;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryAddressCity;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryAddressState;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryAddressCountry;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryAddressZip;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryPhoneCountryCode;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryPhone;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryMobileCountryCode;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryMobile;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryFax;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryEmail;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryTestQuestion;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryTestAnswer;
            @XmlElement(required = true, nillable = true)
            protected String messageToBeneficiary;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryDescription;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryOtherInfo;
            @XmlElement(required = true, nillable = true)
            protected String purposeOfTxn;
            @XmlElement(required = true, nillable = true)
            protected String sourceOfIncome;
            @XmlElement(required = true, nillable = true)
            protected String payoutAmount;
            @XmlElement(required = true, nillable = true)
            protected String commission;
            @XmlElement(required = true, nillable = true)
            protected String tax;
            @XmlElement(required = true, nillable = true)
            protected String payoutCcyCode;
            @XmlElement(required = true, nillable = true)
            protected String payoutDate;
            @XmlElement(required = true, nillable = true)
            protected String sendingAgentCode;
            @XmlElement(required = true, nillable = true)
            protected String sendingAgentName;
            @XmlElement(required = true, nillable = true)
            protected String receivingAgentCode;
            @XmlElement(required = true, nillable = true)
            protected String receivingAgentName;
            @XmlElement(required = true, nillable = true)
            protected String payinCcyCode;
            @XmlElement(required = true, nillable = true)
            protected String payinDate;
            @XmlElement(required = true, nillable = true)
            protected String accountNo;
            @XmlElement(required = true, nillable = true)
            protected String accountName;
            @XmlElement(required = true, nillable = true)
            protected String bankName;
            @XmlElement(required = true, nillable = true)
            protected String bankBranchName;
            @XmlElement(required = true, nillable = true)
            protected String xmBankAdditionalInfo1;
            @XmlElement(required = true, nillable = true)
            protected String xmBankAdditionalInfo2;
            @XmlElement(required = true, nillable = true)
            protected String mobileWalletCountryCode;
            @XmlElement(required = true, nillable = true)
            protected String mobileWalletNo;
            @XmlElement(required = true, nillable = true)
            protected String beneMobileISOCountryCode;
            @XmlElement(required = true, nillable = true)
            protected String xmMWAdditionalInfo1;
            @XmlElement(required = true, nillable = true)
            protected String xmMWAdditionalInfo2;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryCardNumber;
            @XmlElement(required = true, nillable = true)
            protected String beneficiaryCardType;
            @XmlElement(required = true, nillable = true)
            protected String xmECAdditionalInfo1;
            @XmlElement(required = true, nillable = true)
            protected String xmECAdditionalInfo2;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved1;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved2;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved3;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved4;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved5;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved6;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved7;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved8;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved9;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved10;

            /**
             * Gets the value of the xmwsSessionID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXmwsSessionID() {
                return xmwsSessionID;
            }

            /**
             * Sets the value of the xmwsSessionID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXmwsSessionID(String value) {
                this.xmwsSessionID = value;
            }

            /**
             * Gets the value of the xpin property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXpin() {
                return xpin;
            }

            /**
             * Sets the value of the xpin property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXpin(String value) {
                this.xpin = value;
            }

            /**
             * Gets the value of the customerFirstName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerFirstName() {
                return customerFirstName;
            }

            /**
             * Sets the value of the customerFirstName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerFirstName(String value) {
                this.customerFirstName = value;
            }

            /**
             * Gets the value of the customerMiddleName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerMiddleName() {
                return customerMiddleName;
            }

            /**
             * Sets the value of the customerMiddleName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerMiddleName(String value) {
                this.customerMiddleName = value;
            }

            /**
             * Gets the value of the customerLastName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerLastName() {
                return customerLastName;
            }

            /**
             * Sets the value of the customerLastName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerLastName(String value) {
                this.customerLastName = value;
            }

            /**
             * Gets the value of the customerPOBox property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerPOBox() {
                return customerPOBox;
            }

            /**
             * Sets the value of the customerPOBox property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerPOBox(String value) {
                this.customerPOBox = value;
            }

            /**
             * Gets the value of the customerAddress1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerAddress1() {
                return customerAddress1;
            }

            /**
             * Sets the value of the customerAddress1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerAddress1(String value) {
                this.customerAddress1 = value;
            }

            /**
             * Gets the value of the customerAddress2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerAddress2() {
                return customerAddress2;
            }

            /**
             * Sets the value of the customerAddress2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerAddress2(String value) {
                this.customerAddress2 = value;
            }

            /**
             * Gets the value of the customerAddressCity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerAddressCity() {
                return customerAddressCity;
            }

            /**
             * Sets the value of the customerAddressCity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerAddressCity(String value) {
                this.customerAddressCity = value;
            }

            /**
             * Gets the value of the customerAddressState property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerAddressState() {
                return customerAddressState;
            }

            /**
             * Sets the value of the customerAddressState property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerAddressState(String value) {
                this.customerAddressState = value;
            }

            /**
             * Gets the value of the customerAddressCountry property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerAddressCountry() {
                return customerAddressCountry;
            }

            /**
             * Sets the value of the customerAddressCountry property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerAddressCountry(String value) {
                this.customerAddressCountry = value;
            }

            /**
             * Gets the value of the customerAddressZip property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerAddressZip() {
                return customerAddressZip;
            }

            /**
             * Sets the value of the customerAddressZip property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerAddressZip(String value) {
                this.customerAddressZip = value;
            }

            /**
             * Gets the value of the customerPhoneCountryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerPhoneCountryCode() {
                return customerPhoneCountryCode;
            }

            /**
             * Sets the value of the customerPhoneCountryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerPhoneCountryCode(String value) {
                this.customerPhoneCountryCode = value;
            }

            /**
             * Gets the value of the customerPhone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerPhone() {
                return customerPhone;
            }

            /**
             * Sets the value of the customerPhone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerPhone(String value) {
                this.customerPhone = value;
            }

            /**
             * Gets the value of the customerMobileCountryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerMobileCountryCode() {
                return customerMobileCountryCode;
            }

            /**
             * Sets the value of the customerMobileCountryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerMobileCountryCode(String value) {
                this.customerMobileCountryCode = value;
            }

            /**
             * Gets the value of the customerMobile property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerMobile() {
                return customerMobile;
            }

            /**
             * Sets the value of the customerMobile property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerMobile(String value) {
                this.customerMobile = value;
            }

            /**
             * Gets the value of the customerFax property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerFax() {
                return customerFax;
            }

            /**
             * Sets the value of the customerFax property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerFax(String value) {
                this.customerFax = value;
            }

            /**
             * Gets the value of the customerEmail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerEmail() {
                return customerEmail;
            }

            /**
             * Sets the value of the customerEmail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerEmail(String value) {
                this.customerEmail = value;
            }

            /**
             * Gets the value of the customerDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerDescription() {
                return customerDescription;
            }

            /**
             * Sets the value of the customerDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerDescription(String value) {
                this.customerDescription = value;
            }

            /**
             * Gets the value of the customerOtherInfo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerOtherInfo() {
                return customerOtherInfo;
            }

            /**
             * Sets the value of the customerOtherInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerOtherInfo(String value) {
                this.customerOtherInfo = value;
            }

            /**
             * Gets the value of the customerDateOfBirth property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerDateOfBirth() {
                return customerDateOfBirth;
            }

            /**
             * Sets the value of the customerDateOfBirth property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerDateOfBirth(String value) {
                this.customerDateOfBirth = value;
            }

            /**
             * Gets the value of the beneficiaryFirstName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryFirstName() {
                return beneficiaryFirstName;
            }

            /**
             * Sets the value of the beneficiaryFirstName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryFirstName(String value) {
                this.beneficiaryFirstName = value;
            }

            /**
             * Gets the value of the beneficiaryMiddleName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryMiddleName() {
                return beneficiaryMiddleName;
            }

            /**
             * Sets the value of the beneficiaryMiddleName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryMiddleName(String value) {
                this.beneficiaryMiddleName = value;
            }

            /**
             * Gets the value of the beneficiaryLastName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryLastName() {
                return beneficiaryLastName;
            }

            /**
             * Sets the value of the beneficiaryLastName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryLastName(String value) {
                this.beneficiaryLastName = value;
            }

            /**
             * Gets the value of the beneficiaryIDOtherType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryIDOtherType() {
                return beneficiaryIDOtherType;
            }

            /**
             * Sets the value of the beneficiaryIDOtherType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryIDOtherType(String value) {
                this.beneficiaryIDOtherType = value;
            }

            /**
             * Gets the value of the beneficiaryID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryID() {
                return beneficiaryID;
            }

            /**
             * Sets the value of the beneficiaryID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryID(String value) {
                this.beneficiaryID = value;
            }

            /**
             * Gets the value of the beneficiaryPOBox property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryPOBox() {
                return beneficiaryPOBox;
            }

            /**
             * Sets the value of the beneficiaryPOBox property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryPOBox(String value) {
                this.beneficiaryPOBox = value;
            }

            /**
             * Gets the value of the beneficiaryAddress1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryAddress1() {
                return beneficiaryAddress1;
            }

            /**
             * Sets the value of the beneficiaryAddress1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryAddress1(String value) {
                this.beneficiaryAddress1 = value;
            }

            /**
             * Gets the value of the beneficiaryAddress2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryAddress2() {
                return beneficiaryAddress2;
            }

            /**
             * Sets the value of the beneficiaryAddress2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryAddress2(String value) {
                this.beneficiaryAddress2 = value;
            }

            /**
             * Gets the value of the beneficiaryAddressCity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryAddressCity() {
                return beneficiaryAddressCity;
            }

            /**
             * Sets the value of the beneficiaryAddressCity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryAddressCity(String value) {
                this.beneficiaryAddressCity = value;
            }

            /**
             * Gets the value of the beneficiaryAddressState property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryAddressState() {
                return beneficiaryAddressState;
            }

            /**
             * Sets the value of the beneficiaryAddressState property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryAddressState(String value) {
                this.beneficiaryAddressState = value;
            }

            /**
             * Gets the value of the beneficiaryAddressCountry property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryAddressCountry() {
                return beneficiaryAddressCountry;
            }

            /**
             * Sets the value of the beneficiaryAddressCountry property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryAddressCountry(String value) {
                this.beneficiaryAddressCountry = value;
            }

            /**
             * Gets the value of the beneficiaryAddressZip property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryAddressZip() {
                return beneficiaryAddressZip;
            }

            /**
             * Sets the value of the beneficiaryAddressZip property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryAddressZip(String value) {
                this.beneficiaryAddressZip = value;
            }

            /**
             * Gets the value of the beneficiaryPhoneCountryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryPhoneCountryCode() {
                return beneficiaryPhoneCountryCode;
            }

            /**
             * Sets the value of the beneficiaryPhoneCountryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryPhoneCountryCode(String value) {
                this.beneficiaryPhoneCountryCode = value;
            }

            /**
             * Gets the value of the beneficiaryPhone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryPhone() {
                return beneficiaryPhone;
            }

            /**
             * Sets the value of the beneficiaryPhone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryPhone(String value) {
                this.beneficiaryPhone = value;
            }

            /**
             * Gets the value of the beneficiaryMobileCountryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryMobileCountryCode() {
                return beneficiaryMobileCountryCode;
            }

            /**
             * Sets the value of the beneficiaryMobileCountryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryMobileCountryCode(String value) {
                this.beneficiaryMobileCountryCode = value;
            }

            /**
             * Gets the value of the beneficiaryMobile property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryMobile() {
                return beneficiaryMobile;
            }

            /**
             * Sets the value of the beneficiaryMobile property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryMobile(String value) {
                this.beneficiaryMobile = value;
            }

            /**
             * Gets the value of the beneficiaryFax property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryFax() {
                return beneficiaryFax;
            }

            /**
             * Sets the value of the beneficiaryFax property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryFax(String value) {
                this.beneficiaryFax = value;
            }

            /**
             * Gets the value of the beneficiaryEmail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryEmail() {
                return beneficiaryEmail;
            }

            /**
             * Sets the value of the beneficiaryEmail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryEmail(String value) {
                this.beneficiaryEmail = value;
            }

            /**
             * Gets the value of the beneficiaryTestQuestion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryTestQuestion() {
                return beneficiaryTestQuestion;
            }

            /**
             * Sets the value of the beneficiaryTestQuestion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryTestQuestion(String value) {
                this.beneficiaryTestQuestion = value;
            }

            /**
             * Gets the value of the beneficiaryTestAnswer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryTestAnswer() {
                return beneficiaryTestAnswer;
            }

            /**
             * Sets the value of the beneficiaryTestAnswer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryTestAnswer(String value) {
                this.beneficiaryTestAnswer = value;
            }

            /**
             * Gets the value of the messageToBeneficiary property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMessageToBeneficiary() {
                return messageToBeneficiary;
            }

            /**
             * Sets the value of the messageToBeneficiary property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMessageToBeneficiary(String value) {
                this.messageToBeneficiary = value;
            }

            /**
             * Gets the value of the beneficiaryDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryDescription() {
                return beneficiaryDescription;
            }

            /**
             * Sets the value of the beneficiaryDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryDescription(String value) {
                this.beneficiaryDescription = value;
            }

            /**
             * Gets the value of the beneficiaryOtherInfo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryOtherInfo() {
                return beneficiaryOtherInfo;
            }

            /**
             * Sets the value of the beneficiaryOtherInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryOtherInfo(String value) {
                this.beneficiaryOtherInfo = value;
            }

            /**
             * Gets the value of the purposeOfTxn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPurposeOfTxn() {
                return purposeOfTxn;
            }

            /**
             * Sets the value of the purposeOfTxn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPurposeOfTxn(String value) {
                this.purposeOfTxn = value;
            }

            /**
             * Gets the value of the sourceOfIncome property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSourceOfIncome() {
                return sourceOfIncome;
            }

            /**
             * Sets the value of the sourceOfIncome property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSourceOfIncome(String value) {
                this.sourceOfIncome = value;
            }

            /**
             * Gets the value of the payoutAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayoutAmount() {
                return payoutAmount;
            }

            /**
             * Sets the value of the payoutAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayoutAmount(String value) {
                this.payoutAmount = value;
            }

            /**
             * Gets the value of the commission property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommission() {
                return commission;
            }

            /**
             * Sets the value of the commission property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommission(String value) {
                this.commission = value;
            }

            /**
             * Gets the value of the tax property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTax() {
                return tax;
            }

            /**
             * Sets the value of the tax property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTax(String value) {
                this.tax = value;
            }

            /**
             * Gets the value of the payoutCcyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayoutCcyCode() {
                return payoutCcyCode;
            }

            /**
             * Sets the value of the payoutCcyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayoutCcyCode(String value) {
                this.payoutCcyCode = value;
            }

            /**
             * Gets the value of the payoutDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayoutDate() {
                return payoutDate;
            }

            /**
             * Sets the value of the payoutDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayoutDate(String value) {
                this.payoutDate = value;
            }

            /**
             * Gets the value of the sendingAgentCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSendingAgentCode() {
                return sendingAgentCode;
            }

            /**
             * Sets the value of the sendingAgentCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSendingAgentCode(String value) {
                this.sendingAgentCode = value;
            }

            /**
             * Gets the value of the sendingAgentName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSendingAgentName() {
                return sendingAgentName;
            }

            /**
             * Sets the value of the sendingAgentName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSendingAgentName(String value) {
                this.sendingAgentName = value;
            }

            /**
             * Gets the value of the receivingAgentCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReceivingAgentCode() {
                return receivingAgentCode;
            }

            /**
             * Sets the value of the receivingAgentCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReceivingAgentCode(String value) {
                this.receivingAgentCode = value;
            }

            /**
             * Gets the value of the receivingAgentName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReceivingAgentName() {
                return receivingAgentName;
            }

            /**
             * Sets the value of the receivingAgentName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReceivingAgentName(String value) {
                this.receivingAgentName = value;
            }

            /**
             * Gets the value of the payinCcyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayinCcyCode() {
                return payinCcyCode;
            }

            /**
             * Sets the value of the payinCcyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayinCcyCode(String value) {
                this.payinCcyCode = value;
            }

            /**
             * Gets the value of the payinDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayinDate() {
                return payinDate;
            }

            /**
             * Sets the value of the payinDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayinDate(String value) {
                this.payinDate = value;
            }

            /**
             * Gets the value of the accountNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountNo() {
                return accountNo;
            }

            /**
             * Sets the value of the accountNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountNo(String value) {
                this.accountNo = value;
            }

            /**
             * Gets the value of the accountName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountName() {
                return accountName;
            }

            /**
             * Sets the value of the accountName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountName(String value) {
                this.accountName = value;
            }

            /**
             * Gets the value of the bankName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankName() {
                return bankName;
            }

            /**
             * Sets the value of the bankName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankName(String value) {
                this.bankName = value;
            }

            /**
             * Gets the value of the bankBranchName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankBranchName() {
                return bankBranchName;
            }

            /**
             * Sets the value of the bankBranchName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankBranchName(String value) {
                this.bankBranchName = value;
            }

            /**
             * Gets the value of the xmBankAdditionalInfo1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXmBankAdditionalInfo1() {
                return xmBankAdditionalInfo1;
            }

            /**
             * Sets the value of the xmBankAdditionalInfo1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXmBankAdditionalInfo1(String value) {
                this.xmBankAdditionalInfo1 = value;
            }

            /**
             * Gets the value of the xmBankAdditionalInfo2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXmBankAdditionalInfo2() {
                return xmBankAdditionalInfo2;
            }

            /**
             * Sets the value of the xmBankAdditionalInfo2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXmBankAdditionalInfo2(String value) {
                this.xmBankAdditionalInfo2 = value;
            }

            /**
             * Gets the value of the mobileWalletCountryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMobileWalletCountryCode() {
                return mobileWalletCountryCode;
            }

            /**
             * Sets the value of the mobileWalletCountryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMobileWalletCountryCode(String value) {
                this.mobileWalletCountryCode = value;
            }

            /**
             * Gets the value of the mobileWalletNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMobileWalletNo() {
                return mobileWalletNo;
            }

            /**
             * Sets the value of the mobileWalletNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMobileWalletNo(String value) {
                this.mobileWalletNo = value;
            }

            /**
             * Gets the value of the beneMobileISOCountryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneMobileISOCountryCode() {
                return beneMobileISOCountryCode;
            }

            /**
             * Sets the value of the beneMobileISOCountryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneMobileISOCountryCode(String value) {
                this.beneMobileISOCountryCode = value;
            }

            /**
             * Gets the value of the xmMWAdditionalInfo1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXmMWAdditionalInfo1() {
                return xmMWAdditionalInfo1;
            }

            /**
             * Sets the value of the xmMWAdditionalInfo1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXmMWAdditionalInfo1(String value) {
                this.xmMWAdditionalInfo1 = value;
            }

            /**
             * Gets the value of the xmMWAdditionalInfo2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXmMWAdditionalInfo2() {
                return xmMWAdditionalInfo2;
            }

            /**
             * Sets the value of the xmMWAdditionalInfo2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXmMWAdditionalInfo2(String value) {
                this.xmMWAdditionalInfo2 = value;
            }

            /**
             * Gets the value of the beneficiaryCardNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryCardNumber() {
                return beneficiaryCardNumber;
            }

            /**
             * Sets the value of the beneficiaryCardNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryCardNumber(String value) {
                this.beneficiaryCardNumber = value;
            }

            /**
             * Gets the value of the beneficiaryCardType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiaryCardType() {
                return beneficiaryCardType;
            }

            /**
             * Sets the value of the beneficiaryCardType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiaryCardType(String value) {
                this.beneficiaryCardType = value;
            }

            /**
             * Gets the value of the xmECAdditionalInfo1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXmECAdditionalInfo1() {
                return xmECAdditionalInfo1;
            }

            /**
             * Sets the value of the xmECAdditionalInfo1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXmECAdditionalInfo1(String value) {
                this.xmECAdditionalInfo1 = value;
            }

            /**
             * Gets the value of the xmECAdditionalInfo2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXmECAdditionalInfo2() {
                return xmECAdditionalInfo2;
            }

            /**
             * Sets the value of the xmECAdditionalInfo2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXmECAdditionalInfo2(String value) {
                this.xmECAdditionalInfo2 = value;
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
             * Gets the value of the xmReserved5 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXmReserved5() {
                return xmReserved5;
            }

            /**
             * Sets the value of the xmReserved5 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXmReserved5(String value) {
                this.xmReserved5 = value;
            }

            /**
             * Gets the value of the xmReserved6 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXmReserved6() {
                return xmReserved6;
            }

            /**
             * Sets the value of the xmReserved6 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXmReserved6(String value) {
                this.xmReserved6 = value;
            }

            /**
             * Gets the value of the xmReserved7 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXmReserved7() {
                return xmReserved7;
            }

            /**
             * Sets the value of the xmReserved7 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXmReserved7(String value) {
                this.xmReserved7 = value;
            }

            /**
             * Gets the value of the xmReserved8 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXmReserved8() {
                return xmReserved8;
            }

            /**
             * Sets the value of the xmReserved8 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXmReserved8(String value) {
                this.xmReserved8 = value;
            }

            /**
             * Gets the value of the xmReserved9 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXmReserved9() {
                return xmReserved9;
            }

            /**
             * Sets the value of the xmReserved9 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXmReserved9(String value) {
                this.xmReserved9 = value;
            }

            /**
             * Gets the value of the xmReserved10 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXmReserved10() {
                return xmReserved10;
            }

            /**
             * Sets the value of the xmReserved10 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXmReserved10(String value) {
                this.xmReserved10 = value;
            }

        }

    }

}
