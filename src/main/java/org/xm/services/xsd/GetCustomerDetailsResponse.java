
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
 *         &lt;element name="customer"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="customerDetails"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="returnMsg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerRegisteredAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerReason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerPrimaryContactCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerPrimaryContactNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerPrimaryContactNoType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerSecContactCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerSecContactNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerSecContactNoType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerOtherContactCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerOtherContactNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerAddressType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerEmailIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerOtherEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerFaxCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerFax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerAddressCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerPOBox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerOtherInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerRegistrationChannel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="sourceOfIncome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="sourceOfIncomeDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="servicesAvailed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerCCyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="annualIncomeInCCy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="annualIncomeInUSD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerRegisteredOn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerTaxBracket" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="residentialStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerAdddressVerification" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="registeredAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="customerAdditionalInfo"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="customerGender" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerPlaceOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerNationalityCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerOccupation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerProofOfAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerEmployerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerEmployerPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerEmployerPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="employerIndustry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="associatedAccounts" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerEmailNotify" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerSmsNotify" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="actimizeDetails"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="riskLevel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="lastReview" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="subpoenasReceived" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="sTRsSubmitted" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="adverseMediaMatch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="isSanctioned" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="isPEP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="loyaltyNumberDetails"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="isLoyaltyEnabled" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="loyaltyNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="referredBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="customerIDDetailsList"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="customerIDDetails" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="customerSerialID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="customerIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="customerIDOtherType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="customerIDStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="customerIDNationality" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="customerIDIssuanceCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="customerIDIssuingAuthority" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="customerIDIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="customerIDIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="customerIDIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="customerIDValidThru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="scanID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="scanIDFileType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="customerSecondaryIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="customerSecondaryIDNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="customerSecondaryIDIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="customerSecondaryIDIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="customerSecIDIssuanceCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="customerSecondaryIDIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="customerSecondaryIDValidThru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                   &lt;element name="xmReserved1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="xmReserved2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="xmReserved3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="xmReserved4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="xmReserved5" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "customer"
})
@XmlRootElement(name = "getCustomerDetailsResponse")
public class GetCustomerDetailsResponse {

    @XmlElement(required = true)
    protected GetCustomerDetailsResponse.Customer customer;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerDetailsResponse.Customer }
     *     
     */
    public GetCustomerDetailsResponse.Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerDetailsResponse.Customer }
     *     
     */
    public void setCustomer(GetCustomerDetailsResponse.Customer value) {
        this.customer = value;
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
     *         &lt;element name="customerDetails"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="returnMsg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerRegisteredAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerReason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerPrimaryContactCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerPrimaryContactNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerPrimaryContactNoType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerSecContactCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerSecContactNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerSecContactNoType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerOtherContactCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerOtherContactNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerAddressType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerEmailIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerOtherEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerFaxCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerFax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerAddressCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerPOBox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerOtherInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerRegistrationChannel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="sourceOfIncome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="sourceOfIncomeDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="servicesAvailed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerCCyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="annualIncomeInCCy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="annualIncomeInUSD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerRegisteredOn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerTaxBracket" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="residentialStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerAdddressVerification" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="registeredAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="customerAdditionalInfo"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="customerGender" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerPlaceOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerNationalityCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerOccupation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerProofOfAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerEmployerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerEmployerPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerEmployerPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="employerIndustry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="associatedAccounts" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerEmailNotify" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerSmsNotify" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="actimizeDetails"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="riskLevel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="lastReview" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="subpoenasReceived" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="sTRsSubmitted" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="adverseMediaMatch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="isSanctioned" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="isPEP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="loyaltyNumberDetails"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="isLoyaltyEnabled" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="loyaltyNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="referredBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="customerIDDetailsList"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="customerIDDetails" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="customerSerialID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="customerIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="customerIDOtherType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="customerIDStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="customerIDNationality" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="customerIDIssuanceCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="customerIDIssuingAuthority" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="customerIDIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="customerIDIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="customerIDIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="customerIDValidThru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="scanID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="scanIDFileType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="customerSecondaryIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="customerSecondaryIDNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="customerSecondaryIDIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="customerSecondaryIDIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="customerSecIDIssuanceCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="customerSecondaryIDIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="customerSecondaryIDValidThru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "customerDetails",
        "customerAdditionalInfo",
        "actimizeDetails",
        "loyaltyNumberDetails",
        "customerIDDetailsList",
        "xmReserved1",
        "xmReserved2",
        "xmReserved3",
        "xmReserved4",
        "xmReserved5"
    })
    public static class Customer {

        @XmlElement(required = true)
        protected GetCustomerDetailsResponse.Customer.CustomerDetails customerDetails;
        @XmlElement(required = true)
        protected GetCustomerDetailsResponse.Customer.CustomerAdditionalInfo customerAdditionalInfo;
        @XmlElement(required = true)
        protected GetCustomerDetailsResponse.Customer.ActimizeDetails actimizeDetails;
        @XmlElement(required = true)
        protected GetCustomerDetailsResponse.Customer.LoyaltyNumberDetails loyaltyNumberDetails;
        @XmlElement(required = true)
        protected GetCustomerDetailsResponse.Customer.CustomerIDDetailsList customerIDDetailsList;
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
         * Gets the value of the customerDetails property.
         * 
         * @return
         *     possible object is
         *     {@link GetCustomerDetailsResponse.Customer.CustomerDetails }
         *     
         */
        public GetCustomerDetailsResponse.Customer.CustomerDetails getCustomerDetails() {
            return customerDetails;
        }

        /**
         * Sets the value of the customerDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetCustomerDetailsResponse.Customer.CustomerDetails }
         *     
         */
        public void setCustomerDetails(GetCustomerDetailsResponse.Customer.CustomerDetails value) {
            this.customerDetails = value;
        }

        /**
         * Gets the value of the customerAdditionalInfo property.
         * 
         * @return
         *     possible object is
         *     {@link GetCustomerDetailsResponse.Customer.CustomerAdditionalInfo }
         *     
         */
        public GetCustomerDetailsResponse.Customer.CustomerAdditionalInfo getCustomerAdditionalInfo() {
            return customerAdditionalInfo;
        }

        /**
         * Sets the value of the customerAdditionalInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetCustomerDetailsResponse.Customer.CustomerAdditionalInfo }
         *     
         */
        public void setCustomerAdditionalInfo(GetCustomerDetailsResponse.Customer.CustomerAdditionalInfo value) {
            this.customerAdditionalInfo = value;
        }

        /**
         * Gets the value of the actimizeDetails property.
         * 
         * @return
         *     possible object is
         *     {@link GetCustomerDetailsResponse.Customer.ActimizeDetails }
         *     
         */
        public GetCustomerDetailsResponse.Customer.ActimizeDetails getActimizeDetails() {
            return actimizeDetails;
        }

        /**
         * Sets the value of the actimizeDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetCustomerDetailsResponse.Customer.ActimizeDetails }
         *     
         */
        public void setActimizeDetails(GetCustomerDetailsResponse.Customer.ActimizeDetails value) {
            this.actimizeDetails = value;
        }

        /**
         * Gets the value of the loyaltyNumberDetails property.
         * 
         * @return
         *     possible object is
         *     {@link GetCustomerDetailsResponse.Customer.LoyaltyNumberDetails }
         *     
         */
        public GetCustomerDetailsResponse.Customer.LoyaltyNumberDetails getLoyaltyNumberDetails() {
            return loyaltyNumberDetails;
        }

        /**
         * Sets the value of the loyaltyNumberDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetCustomerDetailsResponse.Customer.LoyaltyNumberDetails }
         *     
         */
        public void setLoyaltyNumberDetails(GetCustomerDetailsResponse.Customer.LoyaltyNumberDetails value) {
            this.loyaltyNumberDetails = value;
        }

        /**
         * Gets the value of the customerIDDetailsList property.
         * 
         * @return
         *     possible object is
         *     {@link GetCustomerDetailsResponse.Customer.CustomerIDDetailsList }
         *     
         */
        public GetCustomerDetailsResponse.Customer.CustomerIDDetailsList getCustomerIDDetailsList() {
            return customerIDDetailsList;
        }

        /**
         * Sets the value of the customerIDDetailsList property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetCustomerDetailsResponse.Customer.CustomerIDDetailsList }
         *     
         */
        public void setCustomerIDDetailsList(GetCustomerDetailsResponse.Customer.CustomerIDDetailsList value) {
            this.customerIDDetailsList = value;
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
         *         &lt;element name="riskLevel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="lastReview" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="subpoenasReceived" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="sTRsSubmitted" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="adverseMediaMatch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="isSanctioned" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="isPEP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "riskLevel",
            "lastReview",
            "subpoenasReceived",
            "stRsSubmitted",
            "adverseMediaMatch",
            "isSanctioned",
            "isPEP"
        })
        public static class ActimizeDetails {

            @XmlElement(required = true, nillable = true)
            protected String riskLevel;
            @XmlElement(required = true, nillable = true)
            protected String lastReview;
            @XmlElement(required = true, nillable = true)
            protected String subpoenasReceived;
            @XmlElement(name = "sTRsSubmitted", required = true, nillable = true)
            protected String stRsSubmitted;
            @XmlElement(required = true, nillable = true)
            protected String adverseMediaMatch;
            @XmlElement(required = true, nillable = true)
            protected String isSanctioned;
            @XmlElement(required = true, nillable = true)
            protected String isPEP;

            /**
             * Gets the value of the riskLevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRiskLevel() {
                return riskLevel;
            }

            /**
             * Sets the value of the riskLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRiskLevel(String value) {
                this.riskLevel = value;
            }

            /**
             * Gets the value of the lastReview property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastReview() {
                return lastReview;
            }

            /**
             * Sets the value of the lastReview property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastReview(String value) {
                this.lastReview = value;
            }

            /**
             * Gets the value of the subpoenasReceived property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubpoenasReceived() {
                return subpoenasReceived;
            }

            /**
             * Sets the value of the subpoenasReceived property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubpoenasReceived(String value) {
                this.subpoenasReceived = value;
            }

            /**
             * Gets the value of the stRsSubmitted property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTRsSubmitted() {
                return stRsSubmitted;
            }

            /**
             * Sets the value of the stRsSubmitted property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTRsSubmitted(String value) {
                this.stRsSubmitted = value;
            }

            /**
             * Gets the value of the adverseMediaMatch property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdverseMediaMatch() {
                return adverseMediaMatch;
            }

            /**
             * Sets the value of the adverseMediaMatch property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdverseMediaMatch(String value) {
                this.adverseMediaMatch = value;
            }

            /**
             * Gets the value of the isSanctioned property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsSanctioned() {
                return isSanctioned;
            }

            /**
             * Sets the value of the isSanctioned property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsSanctioned(String value) {
                this.isSanctioned = value;
            }

            /**
             * Gets the value of the isPEP property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsPEP() {
                return isPEP;
            }

            /**
             * Sets the value of the isPEP property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsPEP(String value) {
                this.isPEP = value;
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
         *         &lt;element name="customerGender" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerPlaceOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerNationalityCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerOccupation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerProofOfAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerEmployerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerEmployerPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerEmployerPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="employerIndustry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="associatedAccounts" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerEmailNotify" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerSmsNotify" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "customerGender",
            "customerDateOfBirth",
            "customerPlaceOfBirth",
            "customerNationalityCode",
            "customerOccupation",
            "customerProofOfAddress",
            "customerEmployerName",
            "customerEmployerPhoneCountryCode",
            "customerEmployerPhone",
            "employerIndustry",
            "associatedAccounts",
            "customerEmailNotify",
            "customerSmsNotify"
        })
        public static class CustomerAdditionalInfo {

            @XmlElement(required = true, nillable = true)
            protected String customerGender;
            @XmlElement(required = true, nillable = true)
            protected String customerDateOfBirth;
            @XmlElement(required = true, nillable = true)
            protected String customerPlaceOfBirth;
            @XmlElement(required = true, nillable = true)
            protected String customerNationalityCode;
            @XmlElement(required = true, nillable = true)
            protected String customerOccupation;
            @XmlElement(required = true, nillable = true)
            protected String customerProofOfAddress;
            @XmlElement(required = true, nillable = true)
            protected String customerEmployerName;
            @XmlElement(required = true, nillable = true)
            protected String customerEmployerPhoneCountryCode;
            @XmlElement(required = true, nillable = true)
            protected String customerEmployerPhone;
            @XmlElement(required = true, nillable = true)
            protected String employerIndustry;
            @XmlElement(required = true, nillable = true)
            protected String associatedAccounts;
            @XmlElement(required = true, nillable = true)
            protected String customerEmailNotify;
            @XmlElement(required = true, nillable = true)
            protected String customerSmsNotify;

            /**
             * Gets the value of the customerGender property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerGender() {
                return customerGender;
            }

            /**
             * Sets the value of the customerGender property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerGender(String value) {
                this.customerGender = value;
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
             * Gets the value of the customerPlaceOfBirth property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerPlaceOfBirth() {
                return customerPlaceOfBirth;
            }

            /**
             * Sets the value of the customerPlaceOfBirth property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerPlaceOfBirth(String value) {
                this.customerPlaceOfBirth = value;
            }

            /**
             * Gets the value of the customerNationalityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerNationalityCode() {
                return customerNationalityCode;
            }

            /**
             * Sets the value of the customerNationalityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerNationalityCode(String value) {
                this.customerNationalityCode = value;
            }

            /**
             * Gets the value of the customerOccupation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerOccupation() {
                return customerOccupation;
            }

            /**
             * Sets the value of the customerOccupation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerOccupation(String value) {
                this.customerOccupation = value;
            }

            /**
             * Gets the value of the customerProofOfAddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerProofOfAddress() {
                return customerProofOfAddress;
            }

            /**
             * Sets the value of the customerProofOfAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerProofOfAddress(String value) {
                this.customerProofOfAddress = value;
            }

            /**
             * Gets the value of the customerEmployerName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerEmployerName() {
                return customerEmployerName;
            }

            /**
             * Sets the value of the customerEmployerName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerEmployerName(String value) {
                this.customerEmployerName = value;
            }

            /**
             * Gets the value of the customerEmployerPhoneCountryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerEmployerPhoneCountryCode() {
                return customerEmployerPhoneCountryCode;
            }

            /**
             * Sets the value of the customerEmployerPhoneCountryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerEmployerPhoneCountryCode(String value) {
                this.customerEmployerPhoneCountryCode = value;
            }

            /**
             * Gets the value of the customerEmployerPhone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerEmployerPhone() {
                return customerEmployerPhone;
            }

            /**
             * Sets the value of the customerEmployerPhone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerEmployerPhone(String value) {
                this.customerEmployerPhone = value;
            }

            /**
             * Gets the value of the employerIndustry property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmployerIndustry() {
                return employerIndustry;
            }

            /**
             * Sets the value of the employerIndustry property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmployerIndustry(String value) {
                this.employerIndustry = value;
            }

            /**
             * Gets the value of the associatedAccounts property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssociatedAccounts() {
                return associatedAccounts;
            }

            /**
             * Sets the value of the associatedAccounts property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssociatedAccounts(String value) {
                this.associatedAccounts = value;
            }

            /**
             * Gets the value of the customerEmailNotify property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerEmailNotify() {
                return customerEmailNotify;
            }

            /**
             * Sets the value of the customerEmailNotify property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerEmailNotify(String value) {
                this.customerEmailNotify = value;
            }

            /**
             * Gets the value of the customerSmsNotify property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerSmsNotify() {
                return customerSmsNotify;
            }

            /**
             * Sets the value of the customerSmsNotify property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerSmsNotify(String value) {
                this.customerSmsNotify = value;
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
         *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="returnMsg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xmCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerRegisteredAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerReason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerPrimaryContactCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerPrimaryContactNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerPrimaryContactNoType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerSecContactCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerSecContactNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerSecContactNoType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerOtherContactCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerOtherContactNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerAddressType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerEmailIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerOtherEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerFaxCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerFax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerAddressCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerPOBox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerOtherInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerRegistrationChannel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="sourceOfIncome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="sourceOfIncomeDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="servicesAvailed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerCCyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="annualIncomeInCCy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="annualIncomeInUSD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerRegisteredOn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerTaxBracket" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="residentialStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerAdddressVerification" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="registeredAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "customerRegisteredAgentCode",
            "customerStatus",
            "customerReason",
            "customerFirstName",
            "customerMiddleName",
            "customerLastName",
            "customerPrimaryContactCountryCode",
            "customerPrimaryContactNo",
            "customerPrimaryContactNoType",
            "customerSecContactCountryCode",
            "customerSecContactNo",
            "customerSecContactNoType",
            "customerOtherContactCountryCode",
            "customerOtherContactNo",
            "customerAddress1",
            "customerAddress2",
            "customerAddressType",
            "customerEmail",
            "customerEmailIDType",
            "customerOtherEmail",
            "customerFaxCountryCode",
            "customerFax",
            "customerAddressCountryCode",
            "customerAddressCity",
            "customerAddressState",
            "customerPOBox",
            "customerAddressZip",
            "customerOtherInfo",
            "customerDescription",
            "customerRegistrationChannel",
            "sourceOfIncome",
            "sourceOfIncomeDescription",
            "servicesAvailed",
            "customerCCyCode",
            "annualIncomeInCCy",
            "annualIncomeInUSD",
            "customerRegisteredOn",
            "customerTaxBracket",
            "residentialStatus",
            "customerAdddressVerification",
            "registeredAt"
        })
        public static class CustomerDetails {

            @XmlElement(required = true, nillable = true)
            protected String returnCode;
            @XmlElement(required = true, nillable = true)
            protected String returnMsg;
            @XmlElement(required = true, nillable = true)
            protected String xmCustomerNo;
            @XmlElement(required = true, nillable = true)
            protected String customerRegisteredAgentCode;
            @XmlElement(required = true, nillable = true)
            protected String customerStatus;
            @XmlElement(required = true, nillable = true)
            protected String customerReason;
            @XmlElement(required = true, nillable = true)
            protected String customerFirstName;
            @XmlElement(required = true, nillable = true)
            protected String customerMiddleName;
            @XmlElement(required = true, nillable = true)
            protected String customerLastName;
            @XmlElement(required = true, nillable = true)
            protected String customerPrimaryContactCountryCode;
            @XmlElement(required = true, nillable = true)
            protected String customerPrimaryContactNo;
            @XmlElement(required = true, nillable = true)
            protected String customerPrimaryContactNoType;
            @XmlElement(required = true, nillable = true)
            protected String customerSecContactCountryCode;
            @XmlElement(required = true, nillable = true)
            protected String customerSecContactNo;
            @XmlElement(required = true, nillable = true)
            protected String customerSecContactNoType;
            @XmlElement(required = true, nillable = true)
            protected String customerOtherContactCountryCode;
            @XmlElement(required = true, nillable = true)
            protected String customerOtherContactNo;
            @XmlElement(required = true, nillable = true)
            protected String customerAddress1;
            @XmlElement(required = true, nillable = true)
            protected String customerAddress2;
            @XmlElement(required = true, nillable = true)
            protected String customerAddressType;
            @XmlElement(required = true, nillable = true)
            protected String customerEmail;
            @XmlElement(required = true, nillable = true)
            protected String customerEmailIDType;
            @XmlElement(required = true, nillable = true)
            protected String customerOtherEmail;
            @XmlElement(required = true, nillable = true)
            protected String customerFaxCountryCode;
            @XmlElement(required = true, nillable = true)
            protected String customerFax;
            @XmlElement(required = true, nillable = true)
            protected String customerAddressCountryCode;
            @XmlElement(required = true, nillable = true)
            protected String customerAddressCity;
            @XmlElement(required = true, nillable = true)
            protected String customerAddressState;
            @XmlElement(required = true, nillable = true)
            protected String customerPOBox;
            @XmlElement(required = true, nillable = true)
            protected String customerAddressZip;
            @XmlElement(required = true, nillable = true)
            protected String customerOtherInfo;
            @XmlElement(required = true, nillable = true)
            protected String customerDescription;
            @XmlElement(required = true, nillable = true)
            protected String customerRegistrationChannel;
            @XmlElement(required = true, nillable = true)
            protected String sourceOfIncome;
            @XmlElement(required = true, nillable = true)
            protected String sourceOfIncomeDescription;
            @XmlElement(required = true, nillable = true)
            protected String servicesAvailed;
            @XmlElement(required = true, nillable = true)
            protected String customerCCyCode;
            @XmlElement(required = true, nillable = true)
            protected String annualIncomeInCCy;
            @XmlElement(required = true, nillable = true)
            protected String annualIncomeInUSD;
            @XmlElement(required = true, nillable = true)
            protected String customerRegisteredOn;
            @XmlElement(required = true, nillable = true)
            protected String customerTaxBracket;
            @XmlElement(required = true, nillable = true)
            protected String residentialStatus;
            @XmlElement(required = true, nillable = true)
            protected String customerAdddressVerification;
            @XmlElement(required = true, nillable = true)
            protected String registeredAt;

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
             * Gets the value of the customerRegisteredAgentCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerRegisteredAgentCode() {
                return customerRegisteredAgentCode;
            }

            /**
             * Sets the value of the customerRegisteredAgentCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerRegisteredAgentCode(String value) {
                this.customerRegisteredAgentCode = value;
            }

            /**
             * Gets the value of the customerStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerStatus() {
                return customerStatus;
            }

            /**
             * Sets the value of the customerStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerStatus(String value) {
                this.customerStatus = value;
            }

            /**
             * Gets the value of the customerReason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerReason() {
                return customerReason;
            }

            /**
             * Sets the value of the customerReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerReason(String value) {
                this.customerReason = value;
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
             * Gets the value of the customerPrimaryContactCountryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerPrimaryContactCountryCode() {
                return customerPrimaryContactCountryCode;
            }

            /**
             * Sets the value of the customerPrimaryContactCountryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerPrimaryContactCountryCode(String value) {
                this.customerPrimaryContactCountryCode = value;
            }

            /**
             * Gets the value of the customerPrimaryContactNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerPrimaryContactNo() {
                return customerPrimaryContactNo;
            }

            /**
             * Sets the value of the customerPrimaryContactNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerPrimaryContactNo(String value) {
                this.customerPrimaryContactNo = value;
            }

            /**
             * Gets the value of the customerPrimaryContactNoType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerPrimaryContactNoType() {
                return customerPrimaryContactNoType;
            }

            /**
             * Sets the value of the customerPrimaryContactNoType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerPrimaryContactNoType(String value) {
                this.customerPrimaryContactNoType = value;
            }

            /**
             * Gets the value of the customerSecContactCountryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerSecContactCountryCode() {
                return customerSecContactCountryCode;
            }

            /**
             * Sets the value of the customerSecContactCountryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerSecContactCountryCode(String value) {
                this.customerSecContactCountryCode = value;
            }

            /**
             * Gets the value of the customerSecContactNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerSecContactNo() {
                return customerSecContactNo;
            }

            /**
             * Sets the value of the customerSecContactNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerSecContactNo(String value) {
                this.customerSecContactNo = value;
            }

            /**
             * Gets the value of the customerSecContactNoType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerSecContactNoType() {
                return customerSecContactNoType;
            }

            /**
             * Sets the value of the customerSecContactNoType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerSecContactNoType(String value) {
                this.customerSecContactNoType = value;
            }

            /**
             * Gets the value of the customerOtherContactCountryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerOtherContactCountryCode() {
                return customerOtherContactCountryCode;
            }

            /**
             * Sets the value of the customerOtherContactCountryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerOtherContactCountryCode(String value) {
                this.customerOtherContactCountryCode = value;
            }

            /**
             * Gets the value of the customerOtherContactNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerOtherContactNo() {
                return customerOtherContactNo;
            }

            /**
             * Sets the value of the customerOtherContactNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerOtherContactNo(String value) {
                this.customerOtherContactNo = value;
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
             * Gets the value of the customerAddressType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerAddressType() {
                return customerAddressType;
            }

            /**
             * Sets the value of the customerAddressType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerAddressType(String value) {
                this.customerAddressType = value;
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
             * Gets the value of the customerEmailIDType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerEmailIDType() {
                return customerEmailIDType;
            }

            /**
             * Sets the value of the customerEmailIDType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerEmailIDType(String value) {
                this.customerEmailIDType = value;
            }

            /**
             * Gets the value of the customerOtherEmail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerOtherEmail() {
                return customerOtherEmail;
            }

            /**
             * Sets the value of the customerOtherEmail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerOtherEmail(String value) {
                this.customerOtherEmail = value;
            }

            /**
             * Gets the value of the customerFaxCountryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerFaxCountryCode() {
                return customerFaxCountryCode;
            }

            /**
             * Sets the value of the customerFaxCountryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerFaxCountryCode(String value) {
                this.customerFaxCountryCode = value;
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
             * Gets the value of the customerAddressCountryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerAddressCountryCode() {
                return customerAddressCountryCode;
            }

            /**
             * Sets the value of the customerAddressCountryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerAddressCountryCode(String value) {
                this.customerAddressCountryCode = value;
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
             * Gets the value of the customerRegistrationChannel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerRegistrationChannel() {
                return customerRegistrationChannel;
            }

            /**
             * Sets the value of the customerRegistrationChannel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerRegistrationChannel(String value) {
                this.customerRegistrationChannel = value;
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
             * Gets the value of the sourceOfIncomeDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSourceOfIncomeDescription() {
                return sourceOfIncomeDescription;
            }

            /**
             * Sets the value of the sourceOfIncomeDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSourceOfIncomeDescription(String value) {
                this.sourceOfIncomeDescription = value;
            }

            /**
             * Gets the value of the servicesAvailed property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServicesAvailed() {
                return servicesAvailed;
            }

            /**
             * Sets the value of the servicesAvailed property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServicesAvailed(String value) {
                this.servicesAvailed = value;
            }

            /**
             * Gets the value of the customerCCyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerCCyCode() {
                return customerCCyCode;
            }

            /**
             * Sets the value of the customerCCyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerCCyCode(String value) {
                this.customerCCyCode = value;
            }

            /**
             * Gets the value of the annualIncomeInCCy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAnnualIncomeInCCy() {
                return annualIncomeInCCy;
            }

            /**
             * Sets the value of the annualIncomeInCCy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAnnualIncomeInCCy(String value) {
                this.annualIncomeInCCy = value;
            }

            /**
             * Gets the value of the annualIncomeInUSD property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAnnualIncomeInUSD() {
                return annualIncomeInUSD;
            }

            /**
             * Sets the value of the annualIncomeInUSD property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAnnualIncomeInUSD(String value) {
                this.annualIncomeInUSD = value;
            }

            /**
             * Gets the value of the customerRegisteredOn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerRegisteredOn() {
                return customerRegisteredOn;
            }

            /**
             * Sets the value of the customerRegisteredOn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerRegisteredOn(String value) {
                this.customerRegisteredOn = value;
            }

            /**
             * Gets the value of the customerTaxBracket property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerTaxBracket() {
                return customerTaxBracket;
            }

            /**
             * Sets the value of the customerTaxBracket property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerTaxBracket(String value) {
                this.customerTaxBracket = value;
            }

            /**
             * Gets the value of the residentialStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResidentialStatus() {
                return residentialStatus;
            }

            /**
             * Sets the value of the residentialStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResidentialStatus(String value) {
                this.residentialStatus = value;
            }

            /**
             * Gets the value of the customerAdddressVerification property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerAdddressVerification() {
                return customerAdddressVerification;
            }

            /**
             * Sets the value of the customerAdddressVerification property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerAdddressVerification(String value) {
                this.customerAdddressVerification = value;
            }

            /**
             * Gets the value of the registeredAt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegisteredAt() {
                return registeredAt;
            }

            /**
             * Sets the value of the registeredAt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegisteredAt(String value) {
                this.registeredAt = value;
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
         *         &lt;element name="customerIDDetails" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="customerSerialID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="customerIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="customerIDOtherType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="customerIDStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="customerIDNationality" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="customerIDIssuanceCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="customerIDIssuingAuthority" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="customerIDIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="customerIDIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="customerIDIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="customerIDValidThru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="scanID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="scanIDFileType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="customerSecondaryIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="customerSecondaryIDNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="customerSecondaryIDIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="customerSecondaryIDIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="customerSecIDIssuanceCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="customerSecondaryIDIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="customerSecondaryIDValidThru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "customerIDDetails"
        })
        public static class CustomerIDDetailsList {

            @XmlElement(required = true)
            protected List<GetCustomerDetailsResponse.Customer.CustomerIDDetailsList.CustomerIDDetails> customerIDDetails;

            /**
             * Gets the value of the customerIDDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the customerIDDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCustomerIDDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetCustomerDetailsResponse.Customer.CustomerIDDetailsList.CustomerIDDetails }
             * 
             * 
             */
            public List<GetCustomerDetailsResponse.Customer.CustomerIDDetailsList.CustomerIDDetails> getCustomerIDDetails() {
                if (customerIDDetails == null) {
                    customerIDDetails = new ArrayList<GetCustomerDetailsResponse.Customer.CustomerIDDetailsList.CustomerIDDetails>();
                }
                return this.customerIDDetails;
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
             *         &lt;element name="customerSerialID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="customerIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="customerIDOtherType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="customerIDStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="customerIDNationality" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="customerIDIssuanceCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="customerIDIssuingAuthority" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="customerIDIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="customerIDIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="customerIDIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="customerIDValidThru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="scanID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="scanIDFileType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="customerSecondaryIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="customerSecondaryIDNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="customerSecondaryIDIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="customerSecondaryIDIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="customerSecIDIssuanceCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="customerSecondaryIDIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="customerSecondaryIDValidThru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "customerSerialID",
                "customerIDType",
                "customerIDOtherType",
                "customerIDStatus",
                "customerID",
                "customerIDNationality",
                "customerIDIssuanceCountry",
                "customerIDIssuingAuthority",
                "customerIDIssuedBy",
                "customerIDIssuedAt",
                "customerIDIssueDate",
                "customerIDValidThru",
                "scanID",
                "scanIDFileType",
                "customerSecondaryIDType",
                "customerSecondaryIDNo",
                "customerSecondaryIDIssuedAt",
                "customerSecondaryIDIssuedBy",
                "customerSecIDIssuanceCountry",
                "customerSecondaryIDIssueDate",
                "customerSecondaryIDValidThru"
            })
            public static class CustomerIDDetails {

                @XmlElement(required = true, nillable = true)
                protected String customerSerialID;
                @XmlElement(required = true, nillable = true)
                protected String customerIDType;
                @XmlElement(required = true, nillable = true)
                protected String customerIDOtherType;
                @XmlElement(required = true, nillable = true)
                protected String customerIDStatus;
                @XmlElement(required = true, nillable = true)
                protected String customerID;
                @XmlElement(required = true, nillable = true)
                protected String customerIDNationality;
                @XmlElement(required = true, nillable = true)
                protected String customerIDIssuanceCountry;
                @XmlElement(required = true, nillable = true)
                protected String customerIDIssuingAuthority;
                @XmlElement(required = true, nillable = true)
                protected String customerIDIssuedBy;
                @XmlElement(required = true, nillable = true)
                protected String customerIDIssuedAt;
                @XmlElement(required = true, nillable = true)
                protected String customerIDIssueDate;
                @XmlElement(required = true, nillable = true)
                protected String customerIDValidThru;
                @XmlElement(required = true, nillable = true)
                protected String scanID;
                @XmlElement(required = true, nillable = true)
                protected String scanIDFileType;
                @XmlElement(required = true, nillable = true)
                protected String customerSecondaryIDType;
                @XmlElement(required = true, nillable = true)
                protected String customerSecondaryIDNo;
                @XmlElement(required = true, nillable = true)
                protected String customerSecondaryIDIssuedAt;
                @XmlElement(required = true, nillable = true)
                protected String customerSecondaryIDIssuedBy;
                @XmlElement(required = true, nillable = true)
                protected String customerSecIDIssuanceCountry;
                @XmlElement(required = true, nillable = true)
                protected String customerSecondaryIDIssueDate;
                @XmlElement(required = true, nillable = true)
                protected String customerSecondaryIDValidThru;

                /**
                 * Gets the value of the customerSerialID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerSerialID() {
                    return customerSerialID;
                }

                /**
                 * Sets the value of the customerSerialID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerSerialID(String value) {
                    this.customerSerialID = value;
                }

                /**
                 * Gets the value of the customerIDType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerIDType() {
                    return customerIDType;
                }

                /**
                 * Sets the value of the customerIDType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerIDType(String value) {
                    this.customerIDType = value;
                }

                /**
                 * Gets the value of the customerIDOtherType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerIDOtherType() {
                    return customerIDOtherType;
                }

                /**
                 * Sets the value of the customerIDOtherType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerIDOtherType(String value) {
                    this.customerIDOtherType = value;
                }

                /**
                 * Gets the value of the customerIDStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerIDStatus() {
                    return customerIDStatus;
                }

                /**
                 * Sets the value of the customerIDStatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerIDStatus(String value) {
                    this.customerIDStatus = value;
                }

                /**
                 * Gets the value of the customerID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerID() {
                    return customerID;
                }

                /**
                 * Sets the value of the customerID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerID(String value) {
                    this.customerID = value;
                }

                /**
                 * Gets the value of the customerIDNationality property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerIDNationality() {
                    return customerIDNationality;
                }

                /**
                 * Sets the value of the customerIDNationality property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerIDNationality(String value) {
                    this.customerIDNationality = value;
                }

                /**
                 * Gets the value of the customerIDIssuanceCountry property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerIDIssuanceCountry() {
                    return customerIDIssuanceCountry;
                }

                /**
                 * Sets the value of the customerIDIssuanceCountry property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerIDIssuanceCountry(String value) {
                    this.customerIDIssuanceCountry = value;
                }

                /**
                 * Gets the value of the customerIDIssuingAuthority property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerIDIssuingAuthority() {
                    return customerIDIssuingAuthority;
                }

                /**
                 * Sets the value of the customerIDIssuingAuthority property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerIDIssuingAuthority(String value) {
                    this.customerIDIssuingAuthority = value;
                }

                /**
                 * Gets the value of the customerIDIssuedBy property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerIDIssuedBy() {
                    return customerIDIssuedBy;
                }

                /**
                 * Sets the value of the customerIDIssuedBy property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerIDIssuedBy(String value) {
                    this.customerIDIssuedBy = value;
                }

                /**
                 * Gets the value of the customerIDIssuedAt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerIDIssuedAt() {
                    return customerIDIssuedAt;
                }

                /**
                 * Sets the value of the customerIDIssuedAt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerIDIssuedAt(String value) {
                    this.customerIDIssuedAt = value;
                }

                /**
                 * Gets the value of the customerIDIssueDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerIDIssueDate() {
                    return customerIDIssueDate;
                }

                /**
                 * Sets the value of the customerIDIssueDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerIDIssueDate(String value) {
                    this.customerIDIssueDate = value;
                }

                /**
                 * Gets the value of the customerIDValidThru property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerIDValidThru() {
                    return customerIDValidThru;
                }

                /**
                 * Sets the value of the customerIDValidThru property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerIDValidThru(String value) {
                    this.customerIDValidThru = value;
                }

                /**
                 * Gets the value of the scanID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getScanID() {
                    return scanID;
                }

                /**
                 * Sets the value of the scanID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setScanID(String value) {
                    this.scanID = value;
                }

                /**
                 * Gets the value of the scanIDFileType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getScanIDFileType() {
                    return scanIDFileType;
                }

                /**
                 * Sets the value of the scanIDFileType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setScanIDFileType(String value) {
                    this.scanIDFileType = value;
                }

                /**
                 * Gets the value of the customerSecondaryIDType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerSecondaryIDType() {
                    return customerSecondaryIDType;
                }

                /**
                 * Sets the value of the customerSecondaryIDType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerSecondaryIDType(String value) {
                    this.customerSecondaryIDType = value;
                }

                /**
                 * Gets the value of the customerSecondaryIDNo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerSecondaryIDNo() {
                    return customerSecondaryIDNo;
                }

                /**
                 * Sets the value of the customerSecondaryIDNo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerSecondaryIDNo(String value) {
                    this.customerSecondaryIDNo = value;
                }

                /**
                 * Gets the value of the customerSecondaryIDIssuedAt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerSecondaryIDIssuedAt() {
                    return customerSecondaryIDIssuedAt;
                }

                /**
                 * Sets the value of the customerSecondaryIDIssuedAt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerSecondaryIDIssuedAt(String value) {
                    this.customerSecondaryIDIssuedAt = value;
                }

                /**
                 * Gets the value of the customerSecondaryIDIssuedBy property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerSecondaryIDIssuedBy() {
                    return customerSecondaryIDIssuedBy;
                }

                /**
                 * Sets the value of the customerSecondaryIDIssuedBy property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerSecondaryIDIssuedBy(String value) {
                    this.customerSecondaryIDIssuedBy = value;
                }

                /**
                 * Gets the value of the customerSecIDIssuanceCountry property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerSecIDIssuanceCountry() {
                    return customerSecIDIssuanceCountry;
                }

                /**
                 * Sets the value of the customerSecIDIssuanceCountry property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerSecIDIssuanceCountry(String value) {
                    this.customerSecIDIssuanceCountry = value;
                }

                /**
                 * Gets the value of the customerSecondaryIDIssueDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerSecondaryIDIssueDate() {
                    return customerSecondaryIDIssueDate;
                }

                /**
                 * Sets the value of the customerSecondaryIDIssueDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerSecondaryIDIssueDate(String value) {
                    this.customerSecondaryIDIssueDate = value;
                }

                /**
                 * Gets the value of the customerSecondaryIDValidThru property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerSecondaryIDValidThru() {
                    return customerSecondaryIDValidThru;
                }

                /**
                 * Sets the value of the customerSecondaryIDValidThru property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerSecondaryIDValidThru(String value) {
                    this.customerSecondaryIDValidThru = value;
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
         *         &lt;element name="isLoyaltyEnabled" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="loyaltyNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="referredBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "isLoyaltyEnabled",
            "loyaltyNo",
            "referredBy"
        })
        public static class LoyaltyNumberDetails {

            @XmlElement(required = true, nillable = true)
            protected String isLoyaltyEnabled;
            @XmlElement(required = true, nillable = true)
            protected String loyaltyNo;
            @XmlElement(required = true, nillable = true)
            protected String referredBy;

            /**
             * Gets the value of the isLoyaltyEnabled property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsLoyaltyEnabled() {
                return isLoyaltyEnabled;
            }

            /**
             * Sets the value of the isLoyaltyEnabled property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsLoyaltyEnabled(String value) {
                this.isLoyaltyEnabled = value;
            }

            /**
             * Gets the value of the loyaltyNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLoyaltyNo() {
                return loyaltyNo;
            }

            /**
             * Sets the value of the loyaltyNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLoyaltyNo(String value) {
                this.loyaltyNo = value;
            }

            /**
             * Gets the value of the referredBy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferredBy() {
                return referredBy;
            }

            /**
             * Sets the value of the referredBy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReferredBy(String value) {
                this.referredBy = value;
            }

        }

    }

}
