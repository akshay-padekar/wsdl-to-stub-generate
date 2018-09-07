
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
 *         &lt;element name="xmwsSessionID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="xpin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryIDOtherType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryIDIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryIDIssuedAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryIDIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryIDValidThru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryNationalityCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="purposeOfTxn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "authenticationAgentCode",
    "userID",
    "password",
    "pin",
    "xmwsSessionID",
    "xpin",
    "beneficiaryIDType",
    "beneficiaryIDOtherType",
    "beneficiaryID",
    "beneficiaryIDIssuedBy",
    "beneficiaryIDIssuedAt",
    "beneficiaryIDIssueDate",
    "beneficiaryIDValidThru",
    "beneficiaryDateOfBirth",
    "beneficiaryNationalityCode",
    "purposeOfTxn",
    "xmReserved1",
    "xmReserved2",
    "xmReserved3",
    "xmReserved4"
})
@XmlRootElement(name = "confirmXMReceiveTxn")
public class ConfirmXMReceiveTxn {

    @XmlElement(required = true, nillable = true)
    protected String authenticationAgentCode;
    @XmlElement(required = true, nillable = true)
    protected String userID;
    @XmlElement(required = true, nillable = true)
    protected String password;
    @XmlElement(required = true, nillable = true)
    protected String pin;
    @XmlElement(required = true, nillable = true)
    protected String xmwsSessionID;
    @XmlElement(required = true, nillable = true)
    protected String xpin;
    @XmlElement(required = true)
    protected String beneficiaryIDType;
    @XmlElement(required = true, nillable = true)
    protected String beneficiaryIDOtherType;
    @XmlElement(required = true, nillable = true)
    protected String beneficiaryID;
    @XmlElement(required = true, nillable = true)
    protected String beneficiaryIDIssuedBy;
    @XmlElement(required = true, nillable = true)
    protected String beneficiaryIDIssuedAt;
    @XmlElement(required = true, nillable = true)
    protected String beneficiaryIDIssueDate;
    @XmlElement(required = true, nillable = true)
    protected String beneficiaryIDValidThru;
    @XmlElement(required = true, nillable = true)
    protected String beneficiaryDateOfBirth;
    @XmlElement(required = true, nillable = true)
    protected String beneficiaryNationalityCode;
    @XmlElement(required = true, nillable = true)
    protected String purposeOfTxn;
    @XmlElement(required = true, nillable = true)
    protected String xmReserved1;
    @XmlElement(required = true, nillable = true)
    protected String xmReserved2;
    @XmlElement(required = true, nillable = true)
    protected String xmReserved3;
    @XmlElement(required = true, nillable = true)
    protected String xmReserved4;

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
     * Gets the value of the beneficiaryIDIssuedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryIDIssuedBy() {
        return beneficiaryIDIssuedBy;
    }

    /**
     * Sets the value of the beneficiaryIDIssuedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryIDIssuedBy(String value) {
        this.beneficiaryIDIssuedBy = value;
    }

    /**
     * Gets the value of the beneficiaryIDIssuedAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryIDIssuedAt() {
        return beneficiaryIDIssuedAt;
    }

    /**
     * Sets the value of the beneficiaryIDIssuedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryIDIssuedAt(String value) {
        this.beneficiaryIDIssuedAt = value;
    }

    /**
     * Gets the value of the beneficiaryIDIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryIDIssueDate() {
        return beneficiaryIDIssueDate;
    }

    /**
     * Sets the value of the beneficiaryIDIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryIDIssueDate(String value) {
        this.beneficiaryIDIssueDate = value;
    }

    /**
     * Gets the value of the beneficiaryIDValidThru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryIDValidThru() {
        return beneficiaryIDValidThru;
    }

    /**
     * Sets the value of the beneficiaryIDValidThru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryIDValidThru(String value) {
        this.beneficiaryIDValidThru = value;
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
