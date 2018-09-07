
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
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="returnMsg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payoutCcyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="settlementRatePayinToPayout" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="otherCharges" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payoutAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payinCcyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payinAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payoutInSettlementCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="settlementCcyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="agentRatePayinToPayout" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="otherChargesInSettlementCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="commissionInSettlementCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="totalPayinAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="commission" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxInSettlementCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="XRateUSDToPayout" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="totalDiscount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NetPayinAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="xpin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "returnCode",
    "returnMsg",
    "payoutCcyCode",
    "settlementRatePayinToPayout",
    "otherCharges",
    "payoutAmount",
    "payinCcyCode",
    "payinAmount",
    "payoutInSettlementCcy",
    "settlementCcyCode",
    "tax",
    "agentRatePayinToPayout",
    "otherChargesInSettlementCcy",
    "commissionInSettlementCcy",
    "totalPayinAmount",
    "commission",
    "taxInSettlementCcy",
    "xRateUSDToPayout",
    "totalDiscount",
    "netPayinAmount",
    "xpin",
    "prn",
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
@XmlRootElement(name = "confirmXMTransactionResponse")
public class ConfirmXMTransactionResponse {

    @XmlElement(required = true, nillable = true)
    protected String returnCode;
    @XmlElement(required = true, nillable = true)
    protected String returnMsg;
    @XmlElement(required = true, nillable = true)
    protected String payoutCcyCode;
    @XmlElement(required = true, nillable = true)
    protected String settlementRatePayinToPayout;
    @XmlElement(required = true, nillable = true)
    protected String otherCharges;
    @XmlElement(required = true, nillable = true)
    protected String payoutAmount;
    @XmlElement(required = true, nillable = true)
    protected String payinCcyCode;
    @XmlElement(required = true, nillable = true)
    protected String payinAmount;
    @XmlElement(required = true, nillable = true)
    protected String payoutInSettlementCcy;
    @XmlElement(required = true, nillable = true)
    protected String settlementCcyCode;
    @XmlElement(required = true, nillable = true)
    protected String tax;
    @XmlElement(required = true, nillable = true)
    protected String agentRatePayinToPayout;
    @XmlElement(required = true, nillable = true)
    protected String otherChargesInSettlementCcy;
    @XmlElement(required = true, nillable = true)
    protected String commissionInSettlementCcy;
    @XmlElement(required = true, nillable = true)
    protected String totalPayinAmount;
    @XmlElement(required = true, nillable = true)
    protected String commission;
    @XmlElement(required = true, nillable = true)
    protected String taxInSettlementCcy;
    @XmlElement(name = "XRateUSDToPayout", required = true, nillable = true)
    protected String xRateUSDToPayout;
    @XmlElement(required = true, nillable = true)
    protected String totalDiscount;
    @XmlElement(name = "NetPayinAmount", required = true, nillable = true)
    protected String netPayinAmount;
    @XmlElement(required = true, nillable = true)
    protected String xpin;
    @XmlElement(required = true, nillable = true)
    protected String prn;
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
     * Gets the value of the settlementRatePayinToPayout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementRatePayinToPayout() {
        return settlementRatePayinToPayout;
    }

    /**
     * Sets the value of the settlementRatePayinToPayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementRatePayinToPayout(String value) {
        this.settlementRatePayinToPayout = value;
    }

    /**
     * Gets the value of the otherCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCharges() {
        return otherCharges;
    }

    /**
     * Sets the value of the otherCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCharges(String value) {
        this.otherCharges = value;
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
     * Gets the value of the payinAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayinAmount() {
        return payinAmount;
    }

    /**
     * Sets the value of the payinAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayinAmount(String value) {
        this.payinAmount = value;
    }

    /**
     * Gets the value of the payoutInSettlementCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutInSettlementCcy() {
        return payoutInSettlementCcy;
    }

    /**
     * Sets the value of the payoutInSettlementCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutInSettlementCcy(String value) {
        this.payoutInSettlementCcy = value;
    }

    /**
     * Gets the value of the settlementCcyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementCcyCode() {
        return settlementCcyCode;
    }

    /**
     * Sets the value of the settlementCcyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementCcyCode(String value) {
        this.settlementCcyCode = value;
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
     * Gets the value of the agentRatePayinToPayout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentRatePayinToPayout() {
        return agentRatePayinToPayout;
    }

    /**
     * Sets the value of the agentRatePayinToPayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentRatePayinToPayout(String value) {
        this.agentRatePayinToPayout = value;
    }

    /**
     * Gets the value of the otherChargesInSettlementCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherChargesInSettlementCcy() {
        return otherChargesInSettlementCcy;
    }

    /**
     * Sets the value of the otherChargesInSettlementCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherChargesInSettlementCcy(String value) {
        this.otherChargesInSettlementCcy = value;
    }

    /**
     * Gets the value of the commissionInSettlementCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionInSettlementCcy() {
        return commissionInSettlementCcy;
    }

    /**
     * Sets the value of the commissionInSettlementCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionInSettlementCcy(String value) {
        this.commissionInSettlementCcy = value;
    }

    /**
     * Gets the value of the totalPayinAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPayinAmount() {
        return totalPayinAmount;
    }

    /**
     * Sets the value of the totalPayinAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPayinAmount(String value) {
        this.totalPayinAmount = value;
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
     * Gets the value of the taxInSettlementCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxInSettlementCcy() {
        return taxInSettlementCcy;
    }

    /**
     * Sets the value of the taxInSettlementCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxInSettlementCcy(String value) {
        this.taxInSettlementCcy = value;
    }

    /**
     * Gets the value of the xRateUSDToPayout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXRateUSDToPayout() {
        return xRateUSDToPayout;
    }

    /**
     * Sets the value of the xRateUSDToPayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXRateUSDToPayout(String value) {
        this.xRateUSDToPayout = value;
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
     * Gets the value of the prn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrn() {
        return prn;
    }

    /**
     * Sets the value of the prn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrn(String value) {
        this.prn = value;
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
