
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
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="amountType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deliveryOption" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sendingAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fromCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fromCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receivingAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="toCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="toCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="includeCharges" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paymentMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transactionSource" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "amount",
    "amountType",
    "deliveryOption",
    "sendingAgentCode",
    "fromCountry",
    "fromCcy",
    "receivingAgentCode",
    "toCcy",
    "toCountry",
    "includeCharges",
    "paymentMode",
    "transactionSource",
    "serviceProvider",
    "xmReserved1",
    "xmReserved2",
    "xmReserved3",
    "xmReserved4"
})
@XmlRootElement(name = "getXMRateCalculateDetails")
public class GetXMRateCalculateDetails {

    @XmlElement(required = true, nillable = true)
    protected String authenticationAgentCode;
    @XmlElement(required = true, nillable = true)
    protected String userID;
    @XmlElement(required = true, nillable = true)
    protected String password;
    @XmlElement(required = true, nillable = true)
    protected String pin;
    @XmlElement(required = true, nillable = true)
    protected String amount;
    @XmlElement(required = true, nillable = true)
    protected String amountType;
    @XmlElement(required = true, nillable = true)
    protected String deliveryOption;
    @XmlElement(required = true, nillable = true)
    protected String sendingAgentCode;
    @XmlElement(required = true, nillable = true)
    protected String fromCountry;
    @XmlElement(required = true, nillable = true)
    protected String fromCcy;
    @XmlElement(required = true, nillable = true)
    protected String receivingAgentCode;
    @XmlElement(required = true, nillable = true)
    protected String toCcy;
    @XmlElement(required = true, nillable = true)
    protected String toCountry;
    @XmlElement(required = true, nillable = true)
    protected String includeCharges;
    @XmlElement(required = true, nillable = true)
    protected String paymentMode;
    @XmlElement(required = true, nillable = true)
    protected String transactionSource;
    @XmlElement(required = true, nillable = true)
    protected String serviceProvider;
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
     * Gets the value of the amountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountType() {
        return amountType;
    }

    /**
     * Sets the value of the amountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountType(String value) {
        this.amountType = value;
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
     * Gets the value of the fromCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCountry() {
        return fromCountry;
    }

    /**
     * Sets the value of the fromCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCountry(String value) {
        this.fromCountry = value;
    }

    /**
     * Gets the value of the fromCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCcy() {
        return fromCcy;
    }

    /**
     * Sets the value of the fromCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCcy(String value) {
        this.fromCcy = value;
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
     * Gets the value of the toCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCcy() {
        return toCcy;
    }

    /**
     * Sets the value of the toCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCcy(String value) {
        this.toCcy = value;
    }

    /**
     * Gets the value of the toCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCountry() {
        return toCountry;
    }

    /**
     * Sets the value of the toCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCountry(String value) {
        this.toCountry = value;
    }

    /**
     * Gets the value of the includeCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeCharges() {
        return includeCharges;
    }

    /**
     * Sets the value of the includeCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeCharges(String value) {
        this.includeCharges = value;
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
     * Gets the value of the transactionSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionSource() {
        return transactionSource;
    }

    /**
     * Sets the value of the transactionSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionSource(String value) {
        this.transactionSource = value;
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
