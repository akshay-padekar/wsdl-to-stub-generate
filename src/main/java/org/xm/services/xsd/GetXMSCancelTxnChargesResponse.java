
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
 *         &lt;element name="agentTxnRefNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="xpin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sendingAgentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receivingAgentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sendingAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receivingAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deliveryOption" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deliveryOptionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payinCcyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payoutCcyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payoutAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="refundPayinAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="refundCommission" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="refundTax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="refundOtherCharges" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cancellationCharges" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="totalRefundPayinAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="totalDiscount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NetPayinAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="customerPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerMobile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerFax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sourceOfIncome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="purposeOfTxn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryPOBox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryAddressCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryMobile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryFax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryTestQuestion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryTestAnswer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="messageToBeneficiary" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="returnMsg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "agentTxnRefNo",
    "xpin",
    "sendingAgentName",
    "receivingAgentName",
    "sendingAgentCode",
    "receivingAgentCode",
    "deliveryOption",
    "deliveryOptionName",
    "payinCcyCode",
    "payoutCcyCode",
    "payoutAmount",
    "refundPayinAmount",
    "refundCommission",
    "refundTax",
    "refundOtherCharges",
    "cancellationCharges",
    "totalRefundPayinAmount",
    "totalDiscount",
    "netPayinAmount",
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
    "customerPhone",
    "customerMobile",
    "customerFax",
    "customerEmail",
    "sourceOfIncome",
    "purposeOfTxn",
    "beneficiaryFirstName",
    "beneficiaryMiddleName",
    "beneficiaryLastName",
    "beneficiaryPOBox",
    "beneficiaryAddress1",
    "beneficiaryAddress2",
    "beneficiaryAddressCity",
    "beneficiaryAddressState",
    "beneficiaryAddressCountryCode",
    "beneficiaryAddressZip",
    "beneficiaryPhone",
    "beneficiaryMobile",
    "beneficiaryFax",
    "beneficiaryEmail",
    "beneficiaryTestQuestion",
    "beneficiaryTestAnswer",
    "messageToBeneficiary",
    "returnCode",
    "returnMsg",
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
@XmlRootElement(name = "getXMSCancelTxnChargesResponse")
public class GetXMSCancelTxnChargesResponse {

    @XmlElement(required = true, nillable = true)
    protected String xmwsSessionID;
    @XmlElement(required = true, nillable = true)
    protected String agentTxnRefNo;
    @XmlElement(required = true, nillable = true)
    protected String xpin;
    @XmlElement(required = true, nillable = true)
    protected String sendingAgentName;
    @XmlElement(required = true, nillable = true)
    protected String receivingAgentName;
    @XmlElement(required = true, nillable = true)
    protected String sendingAgentCode;
    @XmlElement(required = true, nillable = true)
    protected String receivingAgentCode;
    @XmlElement(required = true, nillable = true)
    protected String deliveryOption;
    @XmlElement(required = true, nillable = true)
    protected String deliveryOptionName;
    @XmlElement(required = true, nillable = true)
    protected String payinCcyCode;
    @XmlElement(required = true, nillable = true)
    protected String payoutCcyCode;
    @XmlElement(required = true, nillable = true)
    protected String payoutAmount;
    @XmlElement(required = true, nillable = true)
    protected String refundPayinAmount;
    @XmlElement(required = true, nillable = true)
    protected String refundCommission;
    @XmlElement(required = true, nillable = true)
    protected String refundTax;
    @XmlElement(required = true, nillable = true)
    protected String refundOtherCharges;
    @XmlElement(required = true, nillable = true)
    protected String cancellationCharges;
    @XmlElement(required = true, nillable = true)
    protected String totalRefundPayinAmount;
    @XmlElement(required = true, nillable = true)
    protected String totalDiscount;
    @XmlElement(name = "NetPayinAmount", required = true, nillable = true)
    protected String netPayinAmount;
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
    protected String customerPhone;
    @XmlElement(required = true, nillable = true)
    protected String customerMobile;
    @XmlElement(required = true, nillable = true)
    protected String customerFax;
    @XmlElement(required = true, nillable = true)
    protected String customerEmail;
    @XmlElement(required = true, nillable = true)
    protected String sourceOfIncome;
    @XmlElement(required = true, nillable = true)
    protected String purposeOfTxn;
    @XmlElement(required = true, nillable = true)
    protected String beneficiaryFirstName;
    @XmlElement(required = true, nillable = true)
    protected String beneficiaryMiddleName;
    @XmlElement(required = true, nillable = true)
    protected String beneficiaryLastName;
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
    protected String beneficiaryAddressCountryCode;
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
     * Gets the value of the deliveryOptionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryOptionName() {
        return deliveryOptionName;
    }

    /**
     * Sets the value of the deliveryOptionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryOptionName(String value) {
        this.deliveryOptionName = value;
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
     * Gets the value of the refundPayinAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundPayinAmount() {
        return refundPayinAmount;
    }

    /**
     * Sets the value of the refundPayinAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundPayinAmount(String value) {
        this.refundPayinAmount = value;
    }

    /**
     * Gets the value of the refundCommission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundCommission() {
        return refundCommission;
    }

    /**
     * Sets the value of the refundCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundCommission(String value) {
        this.refundCommission = value;
    }

    /**
     * Gets the value of the refundTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundTax() {
        return refundTax;
    }

    /**
     * Sets the value of the refundTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundTax(String value) {
        this.refundTax = value;
    }

    /**
     * Gets the value of the refundOtherCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundOtherCharges() {
        return refundOtherCharges;
    }

    /**
     * Sets the value of the refundOtherCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundOtherCharges(String value) {
        this.refundOtherCharges = value;
    }

    /**
     * Gets the value of the cancellationCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationCharges() {
        return cancellationCharges;
    }

    /**
     * Sets the value of the cancellationCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationCharges(String value) {
        this.cancellationCharges = value;
    }

    /**
     * Gets the value of the totalRefundPayinAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRefundPayinAmount() {
        return totalRefundPayinAmount;
    }

    /**
     * Sets the value of the totalRefundPayinAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRefundPayinAmount(String value) {
        this.totalRefundPayinAmount = value;
    }

    /**
     * Gets the value of the totalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDiscount() {
        return totalDiscount;
    }

    /**
     * Sets the value of the totalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDiscount(String value) {
        this.totalDiscount = value;
    }

    /**
     * Gets the value of the netPayinAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetPayinAmount() {
        return netPayinAmount;
    }

    /**
     * Sets the value of the netPayinAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetPayinAmount(String value) {
        this.netPayinAmount = value;
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
     * Gets the value of the beneficiaryAddressCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryAddressCountryCode() {
        return beneficiaryAddressCountryCode;
    }

    /**
     * Sets the value of the beneficiaryAddressCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryAddressCountryCode(String value) {
        this.beneficiaryAddressCountryCode = value;
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
