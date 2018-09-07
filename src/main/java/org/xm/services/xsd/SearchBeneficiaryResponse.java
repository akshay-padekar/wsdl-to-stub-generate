
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
 *         &lt;element name="xmCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="beneficiary" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="beneficiaryDetails" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="beneficiaryRegisteredAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryRegisteredOn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiarySerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneAddressCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryMobileCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryMobile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryPOBox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryFaxCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryFax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="beneficiaryAdditionalInfo" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="beneficiaryGender" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryNationalityCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryRelationship" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiaryEmailNotify" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="beneficiarySmsNotify" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="beneficiaryIDDetailsList"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="beneficiaryIDDetails" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="beneficiaryIDSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="beneficiaryIDType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                                 &lt;element name="beneficiaryIDOtherType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="beneficiaryIDStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="beneficiaryID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="beneficiaryIdIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="beneficiaryIdIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="beneficiaryIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="beneficiaryIdExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="beneficiarySecIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="beneficiarySecIDNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="beneficiarySecIDIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="beneficiarySecIDIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="beneficiarySecIDIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="beneficiarySecIDExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="accountDetailsList"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="accountDetails" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="accountSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="bankAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="accountIBAN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="bankBranch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="bankBranchCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="cardDetailsList"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="cardDetails" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="cardSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="cardStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="cardDeliveryAgent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="remittanceToMobileList"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="remittanceToMobile" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="walletSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="walletNoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="walletNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="walletStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="walletDeliveryAgent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
 *         &lt;element name="xmReserved5" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "xmCustomerNo",
    "beneficiaryList",
    "xmReserved1",
    "xmReserved2",
    "xmReserved3",
    "xmReserved4",
    "xmReserved5"
})
@XmlRootElement(name = "searchBeneficiaryResponse")
public class SearchBeneficiaryResponse {

    @XmlElement(required = true, nillable = true)
    protected String returnCode;
    @XmlElement(required = true, nillable = true)
    protected String returnMsg;
    @XmlElement(required = true, nillable = true)
    protected String xmCustomerNo;
    @XmlElement(required = true)
    protected SearchBeneficiaryResponse.BeneficiaryList beneficiaryList;
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
     * Gets the value of the xmCustomerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmCustomerNo() {
        return xmCustomerNo;
    }

    /**
     * Sets the value of the xmCustomerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmCustomerNo(String value) {
        this.xmCustomerNo = value;
    }

    /**
     * Gets the value of the beneficiaryList property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBeneficiaryResponse.BeneficiaryList }
     *     
     */
    public SearchBeneficiaryResponse.BeneficiaryList getBeneficiaryList() {
        return beneficiaryList;
    }

    /**
     * Sets the value of the beneficiaryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBeneficiaryResponse.BeneficiaryList }
     *     
     */
    public void setBeneficiaryList(SearchBeneficiaryResponse.BeneficiaryList value) {
        this.beneficiaryList = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="beneficiary" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="beneficiaryDetails" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="beneficiaryRegisteredAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryRegisteredOn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiarySerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneAddressCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryMobileCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryMobile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryPOBox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryFaxCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryFax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="beneficiaryAdditionalInfo" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="beneficiaryGender" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryNationalityCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryRelationship" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiaryEmailNotify" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="beneficiarySmsNotify" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="beneficiaryIDDetailsList"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="beneficiaryIDDetails" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="beneficiaryIDSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="beneficiaryIDType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                                       &lt;element name="beneficiaryIDOtherType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="beneficiaryIDStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="beneficiaryID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="beneficiaryIdIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="beneficiaryIdIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="beneficiaryIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="beneficiaryIdExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="beneficiarySecIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="beneficiarySecIDNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="beneficiarySecIDIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="beneficiarySecIDIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="beneficiarySecIDIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="beneficiarySecIDExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="accountDetailsList"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="accountDetails" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="accountSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="bankAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="accountIBAN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="bankBranch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="bankBranchCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="cardDetailsList"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="cardDetails" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="cardSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="cardStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="cardDeliveryAgent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="remittanceToMobileList"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="remittanceToMobile" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="walletSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="walletNoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="walletNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="walletStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="walletDeliveryAgent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
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
        "beneficiary"
    })
    public static class BeneficiaryList {

        @XmlElement(required = true)
        protected List<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary> beneficiary;

        /**
         * Gets the value of the beneficiary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the beneficiary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBeneficiary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchBeneficiaryResponse.BeneficiaryList.Beneficiary }
         * 
         * 
         */
        public List<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary> getBeneficiary() {
            if (beneficiary == null) {
                beneficiary = new ArrayList<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary>();
            }
            return this.beneficiary;
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
         *         &lt;element name="beneficiaryDetails" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="beneficiaryRegisteredAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryRegisteredOn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiarySerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneAddressCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryMobileCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryMobile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryPOBox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryFaxCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryFax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="beneficiaryAdditionalInfo" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="beneficiaryGender" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryNationalityCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryRelationship" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiaryEmailNotify" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="beneficiarySmsNotify" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="beneficiaryIDDetailsList"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="beneficiaryIDDetails" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="beneficiaryIDSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="beneficiaryIDType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                             &lt;element name="beneficiaryIDOtherType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="beneficiaryIDStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="beneficiaryID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="beneficiaryIdIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="beneficiaryIdIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="beneficiaryIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="beneficiaryIdExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="beneficiarySecIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="beneficiarySecIDNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="beneficiarySecIDIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="beneficiarySecIDIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="beneficiarySecIDIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="beneficiarySecIDExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         *         &lt;element name="accountDetailsList"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="accountDetails" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="accountSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="bankAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="accountIBAN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="bankBranch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="bankBranchCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         *         &lt;element name="cardDetailsList"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="cardDetails" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="cardSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="cardStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="cardDeliveryAgent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         *         &lt;element name="remittanceToMobileList"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="remittanceToMobile" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="walletSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="walletNoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="walletNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="walletStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="walletDeliveryAgent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "beneficiaryDetails",
            "beneficiaryAdditionalInfo",
            "beneficiaryIDDetailsList",
            "accountDetailsList",
            "cardDetailsList",
            "remittanceToMobileList"
        })
        public static class Beneficiary {

            @XmlElement(required = true)
            protected List<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.BeneficiaryDetails> beneficiaryDetails;
            @XmlElement(required = true)
            protected List<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.BeneficiaryAdditionalInfo> beneficiaryAdditionalInfo;
            @XmlElement(required = true)
            protected SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.BeneficiaryIDDetailsList beneficiaryIDDetailsList;
            @XmlElement(required = true)
            protected SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.AccountDetailsList accountDetailsList;
            @XmlElement(required = true)
            protected SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.CardDetailsList cardDetailsList;
            @XmlElement(required = true)
            protected SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.RemittanceToMobileList remittanceToMobileList;

            /**
             * Gets the value of the beneficiaryDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the beneficiaryDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBeneficiaryDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.BeneficiaryDetails }
             * 
             * 
             */
            public List<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.BeneficiaryDetails> getBeneficiaryDetails() {
                if (beneficiaryDetails == null) {
                    beneficiaryDetails = new ArrayList<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.BeneficiaryDetails>();
                }
                return this.beneficiaryDetails;
            }

            /**
             * Gets the value of the beneficiaryAdditionalInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the beneficiaryAdditionalInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBeneficiaryAdditionalInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.BeneficiaryAdditionalInfo }
             * 
             * 
             */
            public List<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.BeneficiaryAdditionalInfo> getBeneficiaryAdditionalInfo() {
                if (beneficiaryAdditionalInfo == null) {
                    beneficiaryAdditionalInfo = new ArrayList<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.BeneficiaryAdditionalInfo>();
                }
                return this.beneficiaryAdditionalInfo;
            }

            /**
             * Gets the value of the beneficiaryIDDetailsList property.
             * 
             * @return
             *     possible object is
             *     {@link SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.BeneficiaryIDDetailsList }
             *     
             */
            public SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.BeneficiaryIDDetailsList getBeneficiaryIDDetailsList() {
                return beneficiaryIDDetailsList;
            }

            /**
             * Sets the value of the beneficiaryIDDetailsList property.
             * 
             * @param value
             *     allowed object is
             *     {@link SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.BeneficiaryIDDetailsList }
             *     
             */
            public void setBeneficiaryIDDetailsList(SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.BeneficiaryIDDetailsList value) {
                this.beneficiaryIDDetailsList = value;
            }

            /**
             * Gets the value of the accountDetailsList property.
             * 
             * @return
             *     possible object is
             *     {@link SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.AccountDetailsList }
             *     
             */
            public SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.AccountDetailsList getAccountDetailsList() {
                return accountDetailsList;
            }

            /**
             * Sets the value of the accountDetailsList property.
             * 
             * @param value
             *     allowed object is
             *     {@link SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.AccountDetailsList }
             *     
             */
            public void setAccountDetailsList(SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.AccountDetailsList value) {
                this.accountDetailsList = value;
            }

            /**
             * Gets the value of the cardDetailsList property.
             * 
             * @return
             *     possible object is
             *     {@link SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.CardDetailsList }
             *     
             */
            public SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.CardDetailsList getCardDetailsList() {
                return cardDetailsList;
            }

            /**
             * Sets the value of the cardDetailsList property.
             * 
             * @param value
             *     allowed object is
             *     {@link SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.CardDetailsList }
             *     
             */
            public void setCardDetailsList(SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.CardDetailsList value) {
                this.cardDetailsList = value;
            }

            /**
             * Gets the value of the remittanceToMobileList property.
             * 
             * @return
             *     possible object is
             *     {@link SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.RemittanceToMobileList }
             *     
             */
            public SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.RemittanceToMobileList getRemittanceToMobileList() {
                return remittanceToMobileList;
            }

            /**
             * Sets the value of the remittanceToMobileList property.
             * 
             * @param value
             *     allowed object is
             *     {@link SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.RemittanceToMobileList }
             *     
             */
            public void setRemittanceToMobileList(SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.RemittanceToMobileList value) {
                this.remittanceToMobileList = value;
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
             *         &lt;element name="accountDetails" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="accountSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="bankAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="accountIBAN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="bankBranch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="bankBranchCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "accountDetails"
            })
            public static class AccountDetailsList {

                @XmlElement(required = true)
                protected List<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.AccountDetailsList.AccountDetails> accountDetails;

                /**
                 * Gets the value of the accountDetails property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the accountDetails property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAccountDetails().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.AccountDetailsList.AccountDetails }
                 * 
                 * 
                 */
                public List<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.AccountDetailsList.AccountDetails> getAccountDetails() {
                    if (accountDetails == null) {
                        accountDetails = new ArrayList<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.AccountDetailsList.AccountDetails>();
                    }
                    return this.accountDetails;
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
                 *         &lt;element name="accountSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="bankAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="accountIBAN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="bankBranch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="bankBranchCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "accountSerialNo",
                    "bankName",
                    "bankAgentCode",
                    "bankCode",
                    "accountName",
                    "accountNo",
                    "accountIBAN",
                    "bankBranch",
                    "bankBranchCode",
                    "accountStatus"
                })
                public static class AccountDetails {

                    @XmlElement(required = true, nillable = true)
                    protected String accountSerialNo;
                    @XmlElement(required = true, nillable = true)
                    protected String bankName;
                    @XmlElement(required = true, nillable = true)
                    protected String bankAgentCode;
                    @XmlElement(required = true, nillable = true)
                    protected String bankCode;
                    @XmlElement(required = true, nillable = true)
                    protected String accountName;
                    @XmlElement(required = true, nillable = true)
                    protected String accountNo;
                    @XmlElement(required = true, nillable = true)
                    protected String accountIBAN;
                    @XmlElement(required = true, nillable = true)
                    protected String bankBranch;
                    @XmlElement(required = true, nillable = true)
                    protected String bankBranchCode;
                    @XmlElement(required = true, nillable = true)
                    protected String accountStatus;

                    /**
                     * Gets the value of the accountSerialNo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAccountSerialNo() {
                        return accountSerialNo;
                    }

                    /**
                     * Sets the value of the accountSerialNo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAccountSerialNo(String value) {
                        this.accountSerialNo = value;
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
                     * Gets the value of the bankAgentCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBankAgentCode() {
                        return bankAgentCode;
                    }

                    /**
                     * Sets the value of the bankAgentCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBankAgentCode(String value) {
                        this.bankAgentCode = value;
                    }

                    /**
                     * Gets the value of the bankCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBankCode() {
                        return bankCode;
                    }

                    /**
                     * Sets the value of the bankCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBankCode(String value) {
                        this.bankCode = value;
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
                     * Gets the value of the accountIBAN property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAccountIBAN() {
                        return accountIBAN;
                    }

                    /**
                     * Sets the value of the accountIBAN property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAccountIBAN(String value) {
                        this.accountIBAN = value;
                    }

                    /**
                     * Gets the value of the bankBranch property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBankBranch() {
                        return bankBranch;
                    }

                    /**
                     * Sets the value of the bankBranch property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBankBranch(String value) {
                        this.bankBranch = value;
                    }

                    /**
                     * Gets the value of the bankBranchCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBankBranchCode() {
                        return bankBranchCode;
                    }

                    /**
                     * Sets the value of the bankBranchCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBankBranchCode(String value) {
                        this.bankBranchCode = value;
                    }

                    /**
                     * Gets the value of the accountStatus property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAccountStatus() {
                        return accountStatus;
                    }

                    /**
                     * Sets the value of the accountStatus property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAccountStatus(String value) {
                        this.accountStatus = value;
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
             *         &lt;element name="beneficiaryGender" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryNationalityCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryRelationship" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryEmailNotify" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiarySmsNotify" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "beneficiaryGender",
                "beneficiaryDateOfBirth",
                "beneficiaryNationalityCode",
                "beneficiaryRelationship",
                "beneficiaryDescription",
                "beneficiaryEmailNotify",
                "beneficiarySmsNotify",
                "serviceType"
            })
            public static class BeneficiaryAdditionalInfo {

                @XmlElement(required = true, nillable = true)
                protected String beneficiaryGender;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryDateOfBirth;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryNationalityCode;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryRelationship;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryDescription;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryEmailNotify;
                @XmlElement(required = true, nillable = true)
                protected String beneficiarySmsNotify;
                @XmlElement(required = true, nillable = true)
                protected String serviceType;

                /**
                 * Gets the value of the beneficiaryGender property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBeneficiaryGender() {
                    return beneficiaryGender;
                }

                /**
                 * Sets the value of the beneficiaryGender property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBeneficiaryGender(String value) {
                    this.beneficiaryGender = value;
                }

                /**
                 * Gets the value of the beneficiaryDateOfBirth property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBeneficiaryDateOfBirth() {
                    return beneficiaryDateOfBirth;
                }

                /**
                 * Sets the value of the beneficiaryDateOfBirth property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBeneficiaryDateOfBirth(String value) {
                    this.beneficiaryDateOfBirth = value;
                }

                /**
                 * Gets the value of the beneficiaryNationalityCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBeneficiaryNationalityCode() {
                    return beneficiaryNationalityCode;
                }

                /**
                 * Sets the value of the beneficiaryNationalityCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBeneficiaryNationalityCode(String value) {
                    this.beneficiaryNationalityCode = value;
                }

                /**
                 * Gets the value of the beneficiaryRelationship property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBeneficiaryRelationship() {
                    return beneficiaryRelationship;
                }

                /**
                 * Sets the value of the beneficiaryRelationship property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBeneficiaryRelationship(String value) {
                    this.beneficiaryRelationship = value;
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
                 * Gets the value of the beneficiaryEmailNotify property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBeneficiaryEmailNotify() {
                    return beneficiaryEmailNotify;
                }

                /**
                 * Sets the value of the beneficiaryEmailNotify property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBeneficiaryEmailNotify(String value) {
                    this.beneficiaryEmailNotify = value;
                }

                /**
                 * Gets the value of the beneficiarySmsNotify property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBeneficiarySmsNotify() {
                    return beneficiarySmsNotify;
                }

                /**
                 * Sets the value of the beneficiarySmsNotify property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBeneficiarySmsNotify(String value) {
                    this.beneficiarySmsNotify = value;
                }

                /**
                 * Gets the value of the serviceType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getServiceType() {
                    return serviceType;
                }

                /**
                 * Sets the value of the serviceType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setServiceType(String value) {
                    this.serviceType = value;
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
             *         &lt;element name="beneficiaryRegisteredAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryRegisteredOn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiarySerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneAddressCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryMobileCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryMobile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryPOBox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryFaxCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="beneficiaryFax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "beneficiaryRegisteredAgentCode",
                "beneficiaryRegisteredOn",
                "beneficiarySerialNo",
                "beneficiaryStatus",
                "beneficiaryFirstName",
                "beneficiaryMiddleName",
                "beneficiaryLastName",
                "beneficiaryAddress1",
                "beneficiaryAddress2",
                "beneAddressCountryCode",
                "beneficiaryAddressCity",
                "beneficiaryAddressState",
                "beneficiaryPhoneCountryCode",
                "beneficiaryPhone",
                "beneficiaryMobileCountryCode",
                "beneficiaryMobile",
                "beneficiaryPOBox",
                "beneficiaryAddressZip",
                "beneficiaryEmail",
                "beneficiaryFaxCountryCode",
                "beneficiaryFax"
            })
            public static class BeneficiaryDetails {

                @XmlElement(required = true, nillable = true)
                protected String beneficiaryRegisteredAgentCode;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryRegisteredOn;
                @XmlElement(required = true, nillable = true)
                protected String beneficiarySerialNo;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryStatus;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryFirstName;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryMiddleName;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryLastName;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryAddress1;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryAddress2;
                @XmlElement(required = true, nillable = true)
                protected String beneAddressCountryCode;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryAddressCity;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryAddressState;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryPhoneCountryCode;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryPhone;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryMobileCountryCode;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryMobile;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryPOBox;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryAddressZip;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryEmail;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryFaxCountryCode;
                @XmlElement(required = true, nillable = true)
                protected String beneficiaryFax;

                /**
                 * Gets the value of the beneficiaryRegisteredAgentCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBeneficiaryRegisteredAgentCode() {
                    return beneficiaryRegisteredAgentCode;
                }

                /**
                 * Sets the value of the beneficiaryRegisteredAgentCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBeneficiaryRegisteredAgentCode(String value) {
                    this.beneficiaryRegisteredAgentCode = value;
                }

                /**
                 * Gets the value of the beneficiaryRegisteredOn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBeneficiaryRegisteredOn() {
                    return beneficiaryRegisteredOn;
                }

                /**
                 * Sets the value of the beneficiaryRegisteredOn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBeneficiaryRegisteredOn(String value) {
                    this.beneficiaryRegisteredOn = value;
                }

                /**
                 * Gets the value of the beneficiarySerialNo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBeneficiarySerialNo() {
                    return beneficiarySerialNo;
                }

                /**
                 * Sets the value of the beneficiarySerialNo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBeneficiarySerialNo(String value) {
                    this.beneficiarySerialNo = value;
                }

                /**
                 * Gets the value of the beneficiaryStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBeneficiaryStatus() {
                    return beneficiaryStatus;
                }

                /**
                 * Sets the value of the beneficiaryStatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBeneficiaryStatus(String value) {
                    this.beneficiaryStatus = value;
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
                 * Gets the value of the beneAddressCountryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBeneAddressCountryCode() {
                    return beneAddressCountryCode;
                }

                /**
                 * Sets the value of the beneAddressCountryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBeneAddressCountryCode(String value) {
                    this.beneAddressCountryCode = value;
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
                 * Gets the value of the beneficiaryFaxCountryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBeneficiaryFaxCountryCode() {
                    return beneficiaryFaxCountryCode;
                }

                /**
                 * Sets the value of the beneficiaryFaxCountryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBeneficiaryFaxCountryCode(String value) {
                    this.beneficiaryFaxCountryCode = value;
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
             *         &lt;element name="beneficiaryIDDetails" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="beneficiaryIDSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="beneficiaryIDType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *                   &lt;element name="beneficiaryIDOtherType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="beneficiaryIDStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="beneficiaryID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="beneficiaryIdIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="beneficiaryIdIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="beneficiaryIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="beneficiaryIdExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="beneficiarySecIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="beneficiarySecIDNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="beneficiarySecIDIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="beneficiarySecIDIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="beneficiarySecIDIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="beneficiarySecIDExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "beneficiaryIDDetails"
            })
            public static class BeneficiaryIDDetailsList {

                @XmlElement(required = true)
                protected List<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.BeneficiaryIDDetailsList.BeneficiaryIDDetails> beneficiaryIDDetails;

                /**
                 * Gets the value of the beneficiaryIDDetails property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the beneficiaryIDDetails property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBeneficiaryIDDetails().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.BeneficiaryIDDetailsList.BeneficiaryIDDetails }
                 * 
                 * 
                 */
                public List<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.BeneficiaryIDDetailsList.BeneficiaryIDDetails> getBeneficiaryIDDetails() {
                    if (beneficiaryIDDetails == null) {
                        beneficiaryIDDetails = new ArrayList<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.BeneficiaryIDDetailsList.BeneficiaryIDDetails>();
                    }
                    return this.beneficiaryIDDetails;
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
                 *         &lt;element name="beneficiaryIDSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="beneficiaryIDType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
                 *         &lt;element name="beneficiaryIDOtherType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="beneficiaryIDStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="beneficiaryID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="beneficiaryIdIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="beneficiaryIdIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="beneficiaryIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="beneficiaryIdExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="beneficiarySecIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="beneficiarySecIDNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="beneficiarySecIDIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="beneficiarySecIDIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="beneficiarySecIDIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="beneficiarySecIDExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "beneficiaryIDSerialNo",
                    "beneficiaryIDType",
                    "beneficiaryIDOtherType",
                    "beneficiaryIDStatus",
                    "beneficiaryID",
                    "beneficiaryIdIssuedAt",
                    "beneficiaryIdIssuedBy",
                    "beneficiaryIdIssueDate",
                    "beneficiaryIdExpiryDate",
                    "beneficiarySecIDType",
                    "beneficiarySecIDNo",
                    "beneficiarySecIDIssuedAt",
                    "beneficiarySecIDIssuedBy",
                    "beneficiarySecIDIssueDate",
                    "beneficiarySecIDExpiryDate"
                })
                public static class BeneficiaryIDDetails {

                    @XmlElement(required = true, nillable = true)
                    protected String beneficiaryIDSerialNo;
                    @XmlElement(required = true, type = Integer.class, nillable = true)
                    protected Integer beneficiaryIDType;
                    @XmlElement(required = true, nillable = true)
                    protected String beneficiaryIDOtherType;
                    @XmlElement(required = true, nillable = true)
                    protected String beneficiaryIDStatus;
                    @XmlElement(required = true, nillable = true)
                    protected String beneficiaryID;
                    @XmlElement(required = true, nillable = true)
                    protected String beneficiaryIdIssuedAt;
                    @XmlElement(required = true, nillable = true)
                    protected String beneficiaryIdIssuedBy;
                    @XmlElement(required = true, nillable = true)
                    protected String beneficiaryIdIssueDate;
                    @XmlElement(required = true, nillable = true)
                    protected String beneficiaryIdExpiryDate;
                    @XmlElement(required = true, nillable = true)
                    protected String beneficiarySecIDType;
                    @XmlElement(required = true, nillable = true)
                    protected String beneficiarySecIDNo;
                    @XmlElement(required = true, nillable = true)
                    protected String beneficiarySecIDIssuedAt;
                    @XmlElement(required = true, nillable = true)
                    protected String beneficiarySecIDIssuedBy;
                    @XmlElement(required = true, nillable = true)
                    protected String beneficiarySecIDIssueDate;
                    @XmlElement(required = true, nillable = true)
                    protected String beneficiarySecIDExpiryDate;

                    /**
                     * Gets the value of the beneficiaryIDSerialNo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBeneficiaryIDSerialNo() {
                        return beneficiaryIDSerialNo;
                    }

                    /**
                     * Sets the value of the beneficiaryIDSerialNo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBeneficiaryIDSerialNo(String value) {
                        this.beneficiaryIDSerialNo = value;
                    }

                    /**
                     * Gets the value of the beneficiaryIDType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getBeneficiaryIDType() {
                        return beneficiaryIDType;
                    }

                    /**
                     * Sets the value of the beneficiaryIDType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setBeneficiaryIDType(Integer value) {
                        this.beneficiaryIDType = value;
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
                     * Gets the value of the beneficiaryIDStatus property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBeneficiaryIDStatus() {
                        return beneficiaryIDStatus;
                    }

                    /**
                     * Sets the value of the beneficiaryIDStatus property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBeneficiaryIDStatus(String value) {
                        this.beneficiaryIDStatus = value;
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
                     * Gets the value of the beneficiaryIdIssuedAt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBeneficiaryIdIssuedAt() {
                        return beneficiaryIdIssuedAt;
                    }

                    /**
                     * Sets the value of the beneficiaryIdIssuedAt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBeneficiaryIdIssuedAt(String value) {
                        this.beneficiaryIdIssuedAt = value;
                    }

                    /**
                     * Gets the value of the beneficiaryIdIssuedBy property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBeneficiaryIdIssuedBy() {
                        return beneficiaryIdIssuedBy;
                    }

                    /**
                     * Sets the value of the beneficiaryIdIssuedBy property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBeneficiaryIdIssuedBy(String value) {
                        this.beneficiaryIdIssuedBy = value;
                    }

                    /**
                     * Gets the value of the beneficiaryIdIssueDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBeneficiaryIdIssueDate() {
                        return beneficiaryIdIssueDate;
                    }

                    /**
                     * Sets the value of the beneficiaryIdIssueDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBeneficiaryIdIssueDate(String value) {
                        this.beneficiaryIdIssueDate = value;
                    }

                    /**
                     * Gets the value of the beneficiaryIdExpiryDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBeneficiaryIdExpiryDate() {
                        return beneficiaryIdExpiryDate;
                    }

                    /**
                     * Sets the value of the beneficiaryIdExpiryDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBeneficiaryIdExpiryDate(String value) {
                        this.beneficiaryIdExpiryDate = value;
                    }

                    /**
                     * Gets the value of the beneficiarySecIDType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBeneficiarySecIDType() {
                        return beneficiarySecIDType;
                    }

                    /**
                     * Sets the value of the beneficiarySecIDType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBeneficiarySecIDType(String value) {
                        this.beneficiarySecIDType = value;
                    }

                    /**
                     * Gets the value of the beneficiarySecIDNo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBeneficiarySecIDNo() {
                        return beneficiarySecIDNo;
                    }

                    /**
                     * Sets the value of the beneficiarySecIDNo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBeneficiarySecIDNo(String value) {
                        this.beneficiarySecIDNo = value;
                    }

                    /**
                     * Gets the value of the beneficiarySecIDIssuedAt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBeneficiarySecIDIssuedAt() {
                        return beneficiarySecIDIssuedAt;
                    }

                    /**
                     * Sets the value of the beneficiarySecIDIssuedAt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBeneficiarySecIDIssuedAt(String value) {
                        this.beneficiarySecIDIssuedAt = value;
                    }

                    /**
                     * Gets the value of the beneficiarySecIDIssuedBy property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBeneficiarySecIDIssuedBy() {
                        return beneficiarySecIDIssuedBy;
                    }

                    /**
                     * Sets the value of the beneficiarySecIDIssuedBy property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBeneficiarySecIDIssuedBy(String value) {
                        this.beneficiarySecIDIssuedBy = value;
                    }

                    /**
                     * Gets the value of the beneficiarySecIDIssueDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBeneficiarySecIDIssueDate() {
                        return beneficiarySecIDIssueDate;
                    }

                    /**
                     * Sets the value of the beneficiarySecIDIssueDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBeneficiarySecIDIssueDate(String value) {
                        this.beneficiarySecIDIssueDate = value;
                    }

                    /**
                     * Gets the value of the beneficiarySecIDExpiryDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBeneficiarySecIDExpiryDate() {
                        return beneficiarySecIDExpiryDate;
                    }

                    /**
                     * Sets the value of the beneficiarySecIDExpiryDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBeneficiarySecIDExpiryDate(String value) {
                        this.beneficiarySecIDExpiryDate = value;
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
             *         &lt;element name="cardDetails" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="cardSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="cardStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="cardDeliveryAgent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "cardDetails"
            })
            public static class CardDetailsList {

                @XmlElement(required = true)
                protected List<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.CardDetailsList.CardDetails> cardDetails;

                /**
                 * Gets the value of the cardDetails property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the cardDetails property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCardDetails().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.CardDetailsList.CardDetails }
                 * 
                 * 
                 */
                public List<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.CardDetailsList.CardDetails> getCardDetails() {
                    if (cardDetails == null) {
                        cardDetails = new ArrayList<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.CardDetailsList.CardDetails>();
                    }
                    return this.cardDetails;
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
                 *         &lt;element name="cardSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="cardStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="cardDeliveryAgent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "cardSerialNo",
                    "cardNumber",
                    "cardStatus",
                    "serviceProvider",
                    "cardType",
                    "cardDeliveryAgent"
                })
                public static class CardDetails {

                    @XmlElement(required = true, nillable = true)
                    protected String cardSerialNo;
                    @XmlElement(required = true, nillable = true)
                    protected String cardNumber;
                    @XmlElement(required = true, nillable = true)
                    protected String cardStatus;
                    @XmlElement(required = true, nillable = true)
                    protected String serviceProvider;
                    @XmlElement(required = true, nillable = true)
                    protected String cardType;
                    @XmlElement(required = true, nillable = true)
                    protected String cardDeliveryAgent;

                    /**
                     * Gets the value of the cardSerialNo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCardSerialNo() {
                        return cardSerialNo;
                    }

                    /**
                     * Sets the value of the cardSerialNo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCardSerialNo(String value) {
                        this.cardSerialNo = value;
                    }

                    /**
                     * Gets the value of the cardNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCardNumber() {
                        return cardNumber;
                    }

                    /**
                     * Sets the value of the cardNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCardNumber(String value) {
                        this.cardNumber = value;
                    }

                    /**
                     * Gets the value of the cardStatus property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCardStatus() {
                        return cardStatus;
                    }

                    /**
                     * Sets the value of the cardStatus property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCardStatus(String value) {
                        this.cardStatus = value;
                    }

                    /**
                     * Gets the value of the serviceProvider property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getServiceProvider() {
                        return serviceProvider;
                    }

                    /**
                     * Sets the value of the serviceProvider property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setServiceProvider(String value) {
                        this.serviceProvider = value;
                    }

                    /**
                     * Gets the value of the cardType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCardType() {
                        return cardType;
                    }

                    /**
                     * Sets the value of the cardType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCardType(String value) {
                        this.cardType = value;
                    }

                    /**
                     * Gets the value of the cardDeliveryAgent property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCardDeliveryAgent() {
                        return cardDeliveryAgent;
                    }

                    /**
                     * Sets the value of the cardDeliveryAgent property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCardDeliveryAgent(String value) {
                        this.cardDeliveryAgent = value;
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
             *         &lt;element name="remittanceToMobile" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="walletSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="walletNoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="walletNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="walletStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="walletDeliveryAgent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "remittanceToMobile"
            })
            public static class RemittanceToMobileList {

                @XmlElement(required = true)
                protected List<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.RemittanceToMobileList.RemittanceToMobile> remittanceToMobile;

                /**
                 * Gets the value of the remittanceToMobile property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the remittanceToMobile property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRemittanceToMobile().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.RemittanceToMobileList.RemittanceToMobile }
                 * 
                 * 
                 */
                public List<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.RemittanceToMobileList.RemittanceToMobile> getRemittanceToMobile() {
                    if (remittanceToMobile == null) {
                        remittanceToMobile = new ArrayList<SearchBeneficiaryResponse.BeneficiaryList.Beneficiary.RemittanceToMobileList.RemittanceToMobile>();
                    }
                    return this.remittanceToMobile;
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
                 *         &lt;element name="walletSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="walletNoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="walletNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="walletStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="walletDeliveryAgent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "walletSerialNo",
                    "walletNoCountryCode",
                    "walletNo",
                    "walletStatus",
                    "walletDeliveryAgent"
                })
                public static class RemittanceToMobile {

                    @XmlElement(required = true, nillable = true)
                    protected String walletSerialNo;
                    @XmlElement(required = true, nillable = true)
                    protected String walletNoCountryCode;
                    @XmlElement(required = true, nillable = true)
                    protected String walletNo;
                    @XmlElement(required = true, nillable = true)
                    protected String walletStatus;
                    @XmlElement(required = true, nillable = true)
                    protected String walletDeliveryAgent;

                    /**
                     * Gets the value of the walletSerialNo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getWalletSerialNo() {
                        return walletSerialNo;
                    }

                    /**
                     * Sets the value of the walletSerialNo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setWalletSerialNo(String value) {
                        this.walletSerialNo = value;
                    }

                    /**
                     * Gets the value of the walletNoCountryCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getWalletNoCountryCode() {
                        return walletNoCountryCode;
                    }

                    /**
                     * Sets the value of the walletNoCountryCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setWalletNoCountryCode(String value) {
                        this.walletNoCountryCode = value;
                    }

                    /**
                     * Gets the value of the walletNo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getWalletNo() {
                        return walletNo;
                    }

                    /**
                     * Sets the value of the walletNo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setWalletNo(String value) {
                        this.walletNo = value;
                    }

                    /**
                     * Gets the value of the walletStatus property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getWalletStatus() {
                        return walletStatus;
                    }

                    /**
                     * Sets the value of the walletStatus property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setWalletStatus(String value) {
                        this.walletStatus = value;
                    }

                    /**
                     * Gets the value of the walletDeliveryAgent property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getWalletDeliveryAgent() {
                        return walletDeliveryAgent;
                    }

                    /**
                     * Sets the value of the walletDeliveryAgent property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setWalletDeliveryAgent(String value) {
                        this.walletDeliveryAgent = value;
                    }

                }

            }

        }

    }

}
