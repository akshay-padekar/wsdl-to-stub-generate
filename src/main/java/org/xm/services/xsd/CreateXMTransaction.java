
package org.xm.services.xsd;

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
 *         &lt;element name="authenticationAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="agentTxnRefNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deliveryOption" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerPOBox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerAddressCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerPrimaryContactCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerPrimaryContactNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerPrimaryContactNoType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerSecContactCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerSecContactNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerSecContactNoType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerSmsNotify" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerFaxCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerFax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerOtherInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerNationalityCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sourceOfIncome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="purposeOfTxn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerIDOtherType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerIDIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerIDIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerIDIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerIDValidThru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerIDIssuanceCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerProofOfAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerSecondaryIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerSecondaryIDNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerSecondaryIDIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerSecondaryIDIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerSecIDIssuanceCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerSecondaryIDIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerSecondaryIDValidThru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerPlaceOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerOccupation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerGender" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerEmployerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerEmployerPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerEmployerPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryIDOtherType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryPOBox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneAddressCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryMobileCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryMobile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryNationalityCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryTestQuestion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryTestAnswer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="messageToBeneficiary" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryRelationship" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="xmCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="xmLoyaltyNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="promoCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sendingAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receivingAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payoutCcyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payinCcyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sendingAmountFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paymentMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authorizationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accountIBAN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accountAdditionalNo1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accountAdditionalNo2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiarySmsNotify" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bankBranchName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mobileWalletCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mobileWalletNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mobileOrCardAddInfo1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mobileOrCardAddInfo2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "authenticationAgentCode",
    "userID",
    "password",
    "pin",
    "agentTxnRefNo",
    "deliveryOption",
    "customerFirstName",
    "customerMiddleName",
    "customerLastName",
    "customerPOBox",
    "customerAddress1",
    "customerAddress2",
    "customerAddressCity",
    "customerAddressState",
    "customerAddressCountryCode",
    "customerAddressZip",
    "customerPrimaryContactCountryCode",
    "customerPrimaryContactNo",
    "customerPrimaryContactNoType",
    "customerSecContactCountryCode",
    "customerSecContactNo",
    "customerSecContactNoType",
    "customerSmsNotify",
    "customerFaxCountryCode",
    "customerFax",
    "customerOtherInfo",
    "customerDescription",
    "customerEmail",
    "customerNationalityCode",
    "sourceOfIncome",
    "purposeOfTxn",
    "customerIDType",
    "customerIDOtherType",
    "customerID",
    "customerIDIssuedBy",
    "customerIDIssuedAt",
    "customerIDIssueDate",
    "customerIDValidThru",
    "customerDateOfBirth",
    "customerIDIssuanceCountry",
    "customerProofOfAddress",
    "customerSecondaryIDType",
    "customerSecondaryIDNo",
    "customerSecondaryIDIssuedBy",
    "customerSecondaryIDIssuedAt",
    "customerSecIDIssuanceCountry",
    "customerSecondaryIDIssueDate",
    "customerSecondaryIDValidThru",
    "customerPlaceOfBirth",
    "customerOccupation",
    "customerGender",
    "customerEmployerName",
    "customerEmployerPhoneCountryCode",
    "customerEmployerPhone",
    "beneficiaryFirstName",
    "beneficiaryMiddleName",
    "beneficiaryLastName",
    "beneficiaryIDType",
    "beneficiaryIDOtherType",
    "beneficiaryID",
    "beneficiaryPOBox",
    "beneficiaryAddress1",
    "beneficiaryAddress2",
    "beneficiaryAddressCity",
    "beneficiaryAddressState",
    "beneAddressCountryCode",
    "beneficiaryAddressZip",
    "beneficiaryPhoneCountryCode",
    "beneficiaryPhone",
    "beneficiaryMobileCountryCode",
    "beneficiaryMobile",
    "beneficiaryNationalityCode",
    "beneficiaryTestQuestion",
    "beneficiaryTestAnswer",
    "messageToBeneficiary",
    "beneficiaryRelationship",
    "xmCustomerNo",
    "xmLoyaltyNo",
    "promoCode",
    "sendingAgentCode",
    "receivingAgentCode",
    "payoutCcyCode",
    "payinCcyCode",
    "amount",
    "sendingAmountFlag",
    "paymentMode",
    "authorizationCode",
    "accountName",
    "accountNo",
    "accountIBAN",
    "accountAdditionalNo1",
    "accountAdditionalNo2",
    "beneficiarySmsNotify",
    "bankName",
    "bankCode",
    "bankBranchName",
    "mobileWalletCountryCode",
    "mobileWalletNo",
    "cardNumber",
    "cardType",
    "mobileOrCardAddInfo1",
    "mobileOrCardAddInfo2",
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
@XmlRootElement(name = "createXMTransaction")
public class CreateXMTransaction {

    @XmlElement(required = true, nillable = true)
    protected String authenticationAgentCode;
    @XmlElement(required = true, nillable = true)
    protected String userID;
    @XmlElement(required = true, nillable = true)
    protected String password;
    @XmlElement(required = true, nillable = true)
    protected String pin;
    @XmlElement(required = true, nillable = true)
    protected String agentTxnRefNo;
    @XmlElement(required = true, nillable = true)
    protected String deliveryOption;
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
    protected String customerAddressCountryCode;
    @XmlElement(required = true, nillable = true)
    protected String customerAddressZip;
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
    protected String customerSmsNotify;
    @XmlElement(required = true, nillable = true)
    protected String customerFaxCountryCode;
    @XmlElement(required = true, nillable = true)
    protected String customerFax;
    @XmlElement(required = true, nillable = true)
    protected String customerOtherInfo;
    @XmlElement(required = true, nillable = true)
    protected String customerDescription;
    @XmlElement(required = true, nillable = true)
    protected String customerEmail;
    @XmlElement(required = true, nillable = true)
    protected String customerNationalityCode;
    @XmlElement(required = true, nillable = true)
    protected String sourceOfIncome;
    @XmlElement(required = true, nillable = true)
    protected String purposeOfTxn;
    @XmlElement(required = true, nillable = true)
    protected String customerIDType;
    @XmlElement(required = true, nillable = true)
    protected String customerIDOtherType;
    @XmlElement(required = true, nillable = true)
    protected String customerID;
    @XmlElement(required = true, nillable = true)
    protected String customerIDIssuedBy;
    @XmlElement(required = true, nillable = true)
    protected String customerIDIssuedAt;
    @XmlElement(required = true, nillable = true)
    protected String customerIDIssueDate;
    @XmlElement(required = true, nillable = true)
    protected String customerIDValidThru;
    @XmlElement(required = true, nillable = true)
    protected String customerDateOfBirth;
    @XmlElement(required = true, nillable = true)
    protected String customerIDIssuanceCountry;
    @XmlElement(required = true, nillable = true)
    protected String customerProofOfAddress;
    @XmlElement(required = true, nillable = true)
    protected String customerSecondaryIDType;
    @XmlElement(required = true, nillable = true)
    protected String customerSecondaryIDNo;
    @XmlElement(required = true, nillable = true)
    protected String customerSecondaryIDIssuedBy;
    @XmlElement(required = true, nillable = true)
    protected String customerSecondaryIDIssuedAt;
    @XmlElement(required = true, nillable = true)
    protected String customerSecIDIssuanceCountry;
    @XmlElement(required = true, nillable = true)
    protected String customerSecondaryIDIssueDate;
    @XmlElement(required = true, nillable = true)
    protected String customerSecondaryIDValidThru;
    @XmlElement(required = true, nillable = true)
    protected String customerPlaceOfBirth;
    @XmlElement(required = true, nillable = true)
    protected String customerOccupation;
    @XmlElement(required = true, nillable = true)
    protected String customerGender;
    @XmlElement(required = true, nillable = true)
    protected String customerEmployerName;
    @XmlElement(required = true, nillable = true)
    protected String customerEmployerPhoneCountryCode;
    @XmlElement(required = true, nillable = true)
    protected String customerEmployerPhone;
    @XmlElement(required = true, nillable = true)
    protected String beneficiaryFirstName;
    @XmlElement(required = true, nillable = true)
    protected String beneficiaryMiddleName;
    @XmlElement(required = true, nillable = true)
    protected String beneficiaryLastName;
    @XmlElement(required = true, nillable = true)
    protected String beneficiaryIDType;
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
    protected String beneAddressCountryCode;
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
    protected String beneficiaryNationalityCode;
    @XmlElement(required = true, nillable = true)
    protected String beneficiaryTestQuestion;
    @XmlElement(required = true, nillable = true)
    protected String beneficiaryTestAnswer;
    @XmlElement(required = true, nillable = true)
    protected String messageToBeneficiary;
    @XmlElement(required = true, nillable = true)
    protected String beneficiaryRelationship;
    @XmlElement(required = true, nillable = true)
    protected String xmCustomerNo;
    @XmlElement(required = true, nillable = true)
    protected String xmLoyaltyNo;
    @XmlElement(required = true, nillable = true)
    protected String promoCode;
    @XmlElement(required = true, nillable = true)
    protected String sendingAgentCode;
    @XmlElement(required = true, nillable = true)
    protected String receivingAgentCode;
    @XmlElement(required = true, nillable = true)
    protected String payoutCcyCode;
    @XmlElement(required = true, nillable = true)
    protected String payinCcyCode;
    @XmlElement(required = true, nillable = true)
    protected String amount;
    @XmlElement(required = true, nillable = true)
    protected String sendingAmountFlag;
    @XmlElement(required = true, nillable = true)
    protected String paymentMode;
    @XmlElement(required = true, nillable = true)
    protected String authorizationCode;
    @XmlElement(required = true, nillable = true)
    protected String accountName;
    @XmlElement(required = true, nillable = true)
    protected String accountNo;
    @XmlElement(required = true, nillable = true)
    protected String accountIBAN;
    @XmlElement(required = true, nillable = true)
    protected String accountAdditionalNo1;
    @XmlElement(required = true, nillable = true)
    protected String accountAdditionalNo2;
    @XmlElement(required = true, nillable = true)
    protected String beneficiarySmsNotify;
    @XmlElement(required = true, nillable = true)
    protected String bankName;
    @XmlElement(required = true, nillable = true)
    protected String bankCode;
    @XmlElement(required = true, nillable = true)
    protected String bankBranchName;
    @XmlElement(required = true, nillable = true)
    protected String mobileWalletCountryCode;
    @XmlElement(required = true, nillable = true)
    protected String mobileWalletNo;
    @XmlElement(required = true, nillable = true)
    protected String cardNumber;
    @XmlElement(required = true, nillable = true)
    protected String cardType;
    @XmlElement(required = true, nillable = true)
    protected String mobileOrCardAddInfo1;
    @XmlElement(required = true, nillable = true)
    protected String mobileOrCardAddInfo2;
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
     * Gets the value of the authenticationAgentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationAgentCode() {
        return authenticationAgentCode;
    }

    /**
     * Sets the value of the authenticationAgentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationAgentCode(String value) {
        this.authenticationAgentCode = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the agentTxnRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentTxnRefNo() {
        return agentTxnRefNo;
    }

    /**
     * Sets the value of the agentTxnRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentTxnRefNo(String value) {
        this.agentTxnRefNo = value;
    }

    /**
     * Gets the value of the deliveryOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryOption() {
        return deliveryOption;
    }

    /**
     * Sets the value of the deliveryOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryOption(String value) {
        this.deliveryOption = value;
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
     * Gets the value of the beneficiaryIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryIDType() {
        return beneficiaryIDType;
    }

    /**
     * Sets the value of the beneficiaryIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryIDType(String value) {
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
     * Gets the value of the xmLoyaltyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmLoyaltyNo() {
        return xmLoyaltyNo;
    }

    /**
     * Sets the value of the xmLoyaltyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmLoyaltyNo(String value) {
        this.xmLoyaltyNo = value;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode(String value) {
        this.promoCode = value;
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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the sendingAmountFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendingAmountFlag() {
        return sendingAmountFlag;
    }

    /**
     * Sets the value of the sendingAmountFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendingAmountFlag(String value) {
        this.sendingAmountFlag = value;
    }

    /**
     * Gets the value of the paymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMode(String value) {
        this.paymentMode = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
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
     * Gets the value of the accountAdditionalNo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAdditionalNo1() {
        return accountAdditionalNo1;
    }

    /**
     * Sets the value of the accountAdditionalNo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAdditionalNo1(String value) {
        this.accountAdditionalNo1 = value;
    }

    /**
     * Gets the value of the accountAdditionalNo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAdditionalNo2() {
        return accountAdditionalNo2;
    }

    /**
     * Sets the value of the accountAdditionalNo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAdditionalNo2(String value) {
        this.accountAdditionalNo2 = value;
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
     * Gets the value of the mobileOrCardAddInfo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileOrCardAddInfo1() {
        return mobileOrCardAddInfo1;
    }

    /**
     * Sets the value of the mobileOrCardAddInfo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileOrCardAddInfo1(String value) {
        this.mobileOrCardAddInfo1 = value;
    }

    /**
     * Gets the value of the mobileOrCardAddInfo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileOrCardAddInfo2() {
        return mobileOrCardAddInfo2;
    }

    /**
     * Sets the value of the mobileOrCardAddInfo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileOrCardAddInfo2(String value) {
        this.mobileOrCardAddInfo2 = value;
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
