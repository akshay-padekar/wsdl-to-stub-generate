
package org.xm.services.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="xpin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sendingAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerUpdatedFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerUpdatedMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerUpdatedLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerUpdatedAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerUpdatedAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerUpdatedAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerUpdatedAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerUpdatedPrimaryContactCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerUpdatedPrimaryContactNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerUpdatedSecContactCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerUpdatedSecContactNo " type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryUpdatedFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryUpdatedMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryUpdatedLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryUpdatedAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryUpdatedAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryUpdatedAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryUpdatedAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryUpdatedPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryUpdatedPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryUpdatedMobileCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryUpdatedMobile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerIDType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="customerIDOtherType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerIDIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerIDIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerIDIssueDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="customerIDValidThru" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="customerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="amendmentReason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="amendmentOtherReason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "xpin",
    "sendingAgentCode",
    "type",
    "customerUpdatedFirstName",
    "customerUpdatedMiddleName",
    "customerUpdatedLastName",
    "customerUpdatedAddress1",
    "customerUpdatedAddress2",
    "customerUpdatedAddressCity",
    "customerUpdatedAddressState",
    "customerUpdatedPrimaryContactCountryCode",
    "customerUpdatedPrimaryContactNumber",
    "customerUpdatedSecContactCountryCode",
    "customerUpdatedSecContactNo0020",
    "beneficiaryUpdatedFirstName",
    "beneficiaryUpdatedMiddleName",
    "beneficiaryUpdatedLastName",
    "beneficiaryUpdatedAddress1",
    "beneficiaryUpdatedAddress2",
    "beneficiaryUpdatedAddressCity",
    "beneficiaryUpdatedAddressState",
    "beneficiaryUpdatedPhoneCountryCode",
    "beneficiaryUpdatedPhone",
    "beneficiaryUpdatedMobileCountryCode",
    "beneficiaryUpdatedMobile",
    "customerIDType",
    "customerIDOtherType",
    "customerID",
    "customerIDIssuedBy",
    "customerIDIssuedAt",
    "customerIDIssueDate",
    "customerIDValidThru",
    "customerDateOfBirth",
    "amendmentReason",
    "amendmentOtherReason"
})
@XmlRootElement(name = "confirmXMTxnAmendment")
public class ConfirmXMTxnAmendment {

    @XmlElement(required = true)
    protected String authenticationAgentCode;
    @XmlElement(required = true)
    protected String userID;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected String pin;
    @XmlElement(required = true)
    protected String xpin;
    @XmlElement(required = true)
    protected String sendingAgentCode;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String customerUpdatedFirstName;
    @XmlElement(required = true)
    protected String customerUpdatedMiddleName;
    @XmlElement(required = true)
    protected String customerUpdatedLastName;
    @XmlElement(required = true)
    protected String customerUpdatedAddress1;
    @XmlElement(required = true)
    protected String customerUpdatedAddress2;
    @XmlElement(required = true)
    protected String customerUpdatedAddressCity;
    @XmlElement(required = true)
    protected String customerUpdatedAddressState;
    @XmlElement(required = true)
    protected String customerUpdatedPrimaryContactCountryCode;
    @XmlElement(required = true)
    protected String customerUpdatedPrimaryContactNumber;
    @XmlElement(required = true)
    protected String customerUpdatedSecContactCountryCode;
    @XmlElement(name = "customerUpdatedSecContactNo ", required = true)
    protected String customerUpdatedSecContactNo0020;
    @XmlElement(required = true)
    protected String beneficiaryUpdatedFirstName;
    @XmlElement(required = true)
    protected String beneficiaryUpdatedMiddleName;
    @XmlElement(required = true)
    protected String beneficiaryUpdatedLastName;
    @XmlElement(required = true)
    protected String beneficiaryUpdatedAddress1;
    @XmlElement(required = true)
    protected String beneficiaryUpdatedAddress2;
    @XmlElement(required = true)
    protected String beneficiaryUpdatedAddressCity;
    @XmlElement(required = true)
    protected String beneficiaryUpdatedAddressState;
    @XmlElement(required = true)
    protected String beneficiaryUpdatedPhoneCountryCode;
    @XmlElement(required = true)
    protected String beneficiaryUpdatedPhone;
    @XmlElement(required = true)
    protected String beneficiaryUpdatedMobileCountryCode;
    @XmlElement(required = true)
    protected String beneficiaryUpdatedMobile;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer customerIDType;
    @XmlElement(required = true, nillable = true)
    protected String customerIDOtherType;
    @XmlElement(required = true, nillable = true)
    protected String customerID;
    @XmlElement(required = true, nillable = true)
    protected String customerIDIssuedBy;
    @XmlElement(required = true, nillable = true)
    protected String customerIDIssuedAt;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar customerIDIssueDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar customerIDValidThru;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar customerDateOfBirth;
    @XmlElement(required = true, nillable = true)
    protected String amendmentReason;
    @XmlElement(required = true, nillable = true)
    protected String amendmentOtherReason;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the customerUpdatedFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUpdatedFirstName() {
        return customerUpdatedFirstName;
    }

    /**
     * Sets the value of the customerUpdatedFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUpdatedFirstName(String value) {
        this.customerUpdatedFirstName = value;
    }

    /**
     * Gets the value of the customerUpdatedMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUpdatedMiddleName() {
        return customerUpdatedMiddleName;
    }

    /**
     * Sets the value of the customerUpdatedMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUpdatedMiddleName(String value) {
        this.customerUpdatedMiddleName = value;
    }

    /**
     * Gets the value of the customerUpdatedLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUpdatedLastName() {
        return customerUpdatedLastName;
    }

    /**
     * Sets the value of the customerUpdatedLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUpdatedLastName(String value) {
        this.customerUpdatedLastName = value;
    }

    /**
     * Gets the value of the customerUpdatedAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUpdatedAddress1() {
        return customerUpdatedAddress1;
    }

    /**
     * Sets the value of the customerUpdatedAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUpdatedAddress1(String value) {
        this.customerUpdatedAddress1 = value;
    }

    /**
     * Gets the value of the customerUpdatedAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUpdatedAddress2() {
        return customerUpdatedAddress2;
    }

    /**
     * Sets the value of the customerUpdatedAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUpdatedAddress2(String value) {
        this.customerUpdatedAddress2 = value;
    }

    /**
     * Gets the value of the customerUpdatedAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUpdatedAddressCity() {
        return customerUpdatedAddressCity;
    }

    /**
     * Sets the value of the customerUpdatedAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUpdatedAddressCity(String value) {
        this.customerUpdatedAddressCity = value;
    }

    /**
     * Gets the value of the customerUpdatedAddressState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUpdatedAddressState() {
        return customerUpdatedAddressState;
    }

    /**
     * Sets the value of the customerUpdatedAddressState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUpdatedAddressState(String value) {
        this.customerUpdatedAddressState = value;
    }

    /**
     * Gets the value of the customerUpdatedPrimaryContactCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUpdatedPrimaryContactCountryCode() {
        return customerUpdatedPrimaryContactCountryCode;
    }

    /**
     * Sets the value of the customerUpdatedPrimaryContactCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUpdatedPrimaryContactCountryCode(String value) {
        this.customerUpdatedPrimaryContactCountryCode = value;
    }

    /**
     * Gets the value of the customerUpdatedPrimaryContactNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUpdatedPrimaryContactNumber() {
        return customerUpdatedPrimaryContactNumber;
    }

    /**
     * Sets the value of the customerUpdatedPrimaryContactNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUpdatedPrimaryContactNumber(String value) {
        this.customerUpdatedPrimaryContactNumber = value;
    }

    /**
     * Gets the value of the customerUpdatedSecContactCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUpdatedSecContactCountryCode() {
        return customerUpdatedSecContactCountryCode;
    }

    /**
     * Sets the value of the customerUpdatedSecContactCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUpdatedSecContactCountryCode(String value) {
        this.customerUpdatedSecContactCountryCode = value;
    }

    /**
     * Gets the value of the customerUpdatedSecContactNo0020 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUpdatedSecContactNo_0020() {
        return customerUpdatedSecContactNo0020;
    }

    /**
     * Sets the value of the customerUpdatedSecContactNo0020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUpdatedSecContactNo_0020(String value) {
        this.customerUpdatedSecContactNo0020 = value;
    }

    /**
     * Gets the value of the beneficiaryUpdatedFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryUpdatedFirstName() {
        return beneficiaryUpdatedFirstName;
    }

    /**
     * Sets the value of the beneficiaryUpdatedFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryUpdatedFirstName(String value) {
        this.beneficiaryUpdatedFirstName = value;
    }

    /**
     * Gets the value of the beneficiaryUpdatedMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryUpdatedMiddleName() {
        return beneficiaryUpdatedMiddleName;
    }

    /**
     * Sets the value of the beneficiaryUpdatedMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryUpdatedMiddleName(String value) {
        this.beneficiaryUpdatedMiddleName = value;
    }

    /**
     * Gets the value of the beneficiaryUpdatedLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryUpdatedLastName() {
        return beneficiaryUpdatedLastName;
    }

    /**
     * Sets the value of the beneficiaryUpdatedLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryUpdatedLastName(String value) {
        this.beneficiaryUpdatedLastName = value;
    }

    /**
     * Gets the value of the beneficiaryUpdatedAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryUpdatedAddress1() {
        return beneficiaryUpdatedAddress1;
    }

    /**
     * Sets the value of the beneficiaryUpdatedAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryUpdatedAddress1(String value) {
        this.beneficiaryUpdatedAddress1 = value;
    }

    /**
     * Gets the value of the beneficiaryUpdatedAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryUpdatedAddress2() {
        return beneficiaryUpdatedAddress2;
    }

    /**
     * Sets the value of the beneficiaryUpdatedAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryUpdatedAddress2(String value) {
        this.beneficiaryUpdatedAddress2 = value;
    }

    /**
     * Gets the value of the beneficiaryUpdatedAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryUpdatedAddressCity() {
        return beneficiaryUpdatedAddressCity;
    }

    /**
     * Sets the value of the beneficiaryUpdatedAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryUpdatedAddressCity(String value) {
        this.beneficiaryUpdatedAddressCity = value;
    }

    /**
     * Gets the value of the beneficiaryUpdatedAddressState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryUpdatedAddressState() {
        return beneficiaryUpdatedAddressState;
    }

    /**
     * Sets the value of the beneficiaryUpdatedAddressState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryUpdatedAddressState(String value) {
        this.beneficiaryUpdatedAddressState = value;
    }

    /**
     * Gets the value of the beneficiaryUpdatedPhoneCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryUpdatedPhoneCountryCode() {
        return beneficiaryUpdatedPhoneCountryCode;
    }

    /**
     * Sets the value of the beneficiaryUpdatedPhoneCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryUpdatedPhoneCountryCode(String value) {
        this.beneficiaryUpdatedPhoneCountryCode = value;
    }

    /**
     * Gets the value of the beneficiaryUpdatedPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryUpdatedPhone() {
        return beneficiaryUpdatedPhone;
    }

    /**
     * Sets the value of the beneficiaryUpdatedPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryUpdatedPhone(String value) {
        this.beneficiaryUpdatedPhone = value;
    }

    /**
     * Gets the value of the beneficiaryUpdatedMobileCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryUpdatedMobileCountryCode() {
        return beneficiaryUpdatedMobileCountryCode;
    }

    /**
     * Sets the value of the beneficiaryUpdatedMobileCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryUpdatedMobileCountryCode(String value) {
        this.beneficiaryUpdatedMobileCountryCode = value;
    }

    /**
     * Gets the value of the beneficiaryUpdatedMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryUpdatedMobile() {
        return beneficiaryUpdatedMobile;
    }

    /**
     * Sets the value of the beneficiaryUpdatedMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryUpdatedMobile(String value) {
        this.beneficiaryUpdatedMobile = value;
    }

    /**
     * Gets the value of the customerIDType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerIDType() {
        return customerIDType;
    }

    /**
     * Sets the value of the customerIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerIDType(Integer value) {
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomerIDIssueDate() {
        return customerIDIssueDate;
    }

    /**
     * Sets the value of the customerIDIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomerIDIssueDate(XMLGregorianCalendar value) {
        this.customerIDIssueDate = value;
    }

    /**
     * Gets the value of the customerIDValidThru property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomerIDValidThru() {
        return customerIDValidThru;
    }

    /**
     * Sets the value of the customerIDValidThru property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomerIDValidThru(XMLGregorianCalendar value) {
        this.customerIDValidThru = value;
    }

    /**
     * Gets the value of the customerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomerDateOfBirth() {
        return customerDateOfBirth;
    }

    /**
     * Sets the value of the customerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomerDateOfBirth(XMLGregorianCalendar value) {
        this.customerDateOfBirth = value;
    }

    /**
     * Gets the value of the amendmentReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmendmentReason() {
        return amendmentReason;
    }

    /**
     * Sets the value of the amendmentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmendmentReason(String value) {
        this.amendmentReason = value;
    }

    /**
     * Gets the value of the amendmentOtherReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmendmentOtherReason() {
        return amendmentOtherReason;
    }

    /**
     * Sets the value of the amendmentOtherReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmendmentOtherReason(String value) {
        this.amendmentOtherReason = value;
    }

}
