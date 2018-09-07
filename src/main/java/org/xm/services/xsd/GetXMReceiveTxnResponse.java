
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
 *         &lt;element name="customerPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="beneficiaryPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="payInAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="commission" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="agentXchgRate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payoutCcyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payInCcyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payoutDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payinDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sendingAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sendingAgentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receivingAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receivingAgentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sendingCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receiveCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transactionMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="returnMsg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "customerPhone",
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
    "beneficiaryPhone",
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
    "payInAmount",
    "commission",
    "tax",
    "agentXchgRate",
    "payoutCcyCode",
    "payInCcyCode",
    "payoutDate",
    "payinDate",
    "sendingAgentCode",
    "sendingAgentName",
    "receivingAgentCode",
    "receivingAgentName",
    "sendingCountry",
    "receiveCountry",
    "transactionMode",
    "returnCode",
    "returnMsg",
    "xmReserved1",
    "xmReserved2",
    "xmReserved3",
    "xmReserved4"
})
@XmlRootElement(name = "getXMReceiveTxnResponse")
public class GetXMReceiveTxnResponse {

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
    protected String customerPhone;
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
    protected String beneficiaryPhone;
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
    protected String payInAmount;
    @XmlElement(required = true, nillable = true)
    protected String commission;
    @XmlElement(required = true, nillable = true)
    protected String tax;
    @XmlElement(required = true, nillable = true)
    protected String agentXchgRate;
    @XmlElement(required = true, nillable = true)
    protected String payoutCcyCode;
    @XmlElement(required = true, nillable = true)
    protected String payInCcyCode;
    @XmlElement(required = true, nillable = true)
    protected String payoutDate;
    @XmlElement(required = true, nillable = true)
    protected String payinDate;
    @XmlElement(required = true, nillable = true)
    protected String sendingAgentCode;
    @XmlElement(required = true, nillable = true)
    protected String sendingAgentName;
    @XmlElement(required = true, nillable = true)
    protected String receivingAgentCode;
    @XmlElement(required = true, nillable = true)
    protected String receivingAgentName;
    @XmlElement(required = true, nillable = true)
    protected String sendingCountry;
    @XmlElement(required = true, nillable = true)
    protected String receiveCountry;
    @XmlElement(required = true, nillable = true)
    protected String transactionMode;
    @XmlElement(required = true, nillable = true)
    protected String returnCode;
    @XmlElement(required = true, nillable = true)
    protected String returnMsg;
    @XmlElement(required = true, nillable = true)
    protected String xmReserved1;
    @XmlElement(required = true, nillable = true)
    protected String xmReserved2;
    @XmlElement(required = true, nillable = true)
    protected String xmReserved3;
    @XmlElement(required = true, nillable = true)
    protected String xmReserved4;

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
     * Gets the value of the payInAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayInAmount() {
        return payInAmount;
    }

    /**
     * Sets the value of the payInAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayInAmount(String value) {
        this.payInAmount = value;
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
     * Gets the value of the agentXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentXchgRate() {
        return agentXchgRate;
    }

    /**
     * Sets the value of the agentXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentXchgRate(String value) {
        this.agentXchgRate = value;
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
     * Gets the value of the payInCcyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayInCcyCode() {
        return payInCcyCode;
    }

    /**
     * Sets the value of the payInCcyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayInCcyCode(String value) {
        this.payInCcyCode = value;
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
     * Gets the value of the sendingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendingCountry() {
        return sendingCountry;
    }

    /**
     * Sets the value of the sendingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendingCountry(String value) {
        this.sendingCountry = value;
    }

    /**
     * Gets the value of the receiveCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveCountry() {
        return receiveCountry;
    }

    /**
     * Sets the value of the receiveCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveCountry(String value) {
        this.receiveCountry = value;
    }

    /**
     * Gets the value of the transactionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionMode() {
        return transactionMode;
    }

    /**
     * Sets the value of the transactionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionMode(String value) {
        this.transactionMode = value;
    }

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

}
