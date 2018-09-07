
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
 *         &lt;element name="rateList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="rate" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="commissionCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="commissionCharges" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="payinAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="fromCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="payoutAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="toCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="totalPayinAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="otherCharges" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xchangeRate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="settlementRate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmReserved1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmReserved2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmReserved3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmReserved4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "rateList"
})
@XmlRootElement(name = "getXMRateCalculateDetailsResponse")
public class GetXMRateCalculateDetailsResponse {

    @XmlElement(required = true, nillable = true)
    protected String returnCode;
    @XmlElement(required = true, nillable = true)
    protected String returnMsg;
    @XmlElement(required = true)
    protected GetXMRateCalculateDetailsResponse.RateList rateList;

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
     * Gets the value of the rateList property.
     * 
     * @return
     *     possible object is
     *     {@link GetXMRateCalculateDetailsResponse.RateList }
     *     
     */
    public GetXMRateCalculateDetailsResponse.RateList getRateList() {
        return rateList;
    }

    /**
     * Sets the value of the rateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetXMRateCalculateDetailsResponse.RateList }
     *     
     */
    public void setRateList(GetXMRateCalculateDetailsResponse.RateList value) {
        this.rateList = value;
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
     *         &lt;element name="rate" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="commissionCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="commissionCharges" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="payinAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="fromCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="payoutAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="toCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="totalPayinAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="otherCharges" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xchangeRate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="settlementRate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmReserved1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmReserved2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmReserved3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmReserved4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "rate"
    })
    public static class RateList {

        @XmlElement(required = true)
        protected List<GetXMRateCalculateDetailsResponse.RateList.Rate> rate;

        /**
         * Gets the value of the rate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetXMRateCalculateDetailsResponse.RateList.Rate }
         * 
         * 
         */
        public List<GetXMRateCalculateDetailsResponse.RateList.Rate> getRate() {
            if (rate == null) {
                rate = new ArrayList<GetXMRateCalculateDetailsResponse.RateList.Rate>();
            }
            return this.rate;
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
         *         &lt;element name="commissionCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="commissionCharges" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="payinAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="fromCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="payoutAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="toCcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="totalPayinAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="otherCharges" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xchangeRate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="settlementRate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "commissionCcy",
            "commissionCharges",
            "payinAmount",
            "fromCcy",
            "payoutAmount",
            "toCcy",
            "totalPayinAmount",
            "tax",
            "otherCharges",
            "discount",
            "xchangeRate",
            "settlementRate",
            "xmReserved1",
            "xmReserved2",
            "xmReserved3",
            "xmReserved4"
        })
        public static class Rate {

            @XmlElement(required = true, nillable = true)
            protected String commissionCcy;
            @XmlElement(required = true, nillable = true)
            protected String commissionCharges;
            @XmlElement(required = true, nillable = true)
            protected String payinAmount;
            @XmlElement(required = true, nillable = true)
            protected String fromCcy;
            @XmlElement(required = true, nillable = true)
            protected String payoutAmount;
            @XmlElement(required = true, nillable = true)
            protected String toCcy;
            @XmlElement(required = true, nillable = true)
            protected String totalPayinAmount;
            @XmlElement(required = true, nillable = true)
            protected String tax;
            @XmlElement(required = true, nillable = true)
            protected String otherCharges;
            @XmlElement(required = true, nillable = true)
            protected String discount;
            @XmlElement(required = true, nillable = true)
            protected String xchangeRate;
            @XmlElement(required = true, nillable = true)
            protected String settlementRate;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved1;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved2;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved3;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved4;

            /**
             * Gets the value of the commissionCcy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommissionCcy() {
                return commissionCcy;
            }

            /**
             * Sets the value of the commissionCcy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommissionCcy(String value) {
                this.commissionCcy = value;
            }

            /**
             * Gets the value of the commissionCharges property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommissionCharges() {
                return commissionCharges;
            }

            /**
             * Sets the value of the commissionCharges property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommissionCharges(String value) {
                this.commissionCharges = value;
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
             * Gets the value of the discount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDiscount() {
                return discount;
            }

            /**
             * Sets the value of the discount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDiscount(String value) {
                this.discount = value;
            }

            /**
             * Gets the value of the xchangeRate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXchangeRate() {
                return xchangeRate;
            }

            /**
             * Sets the value of the xchangeRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXchangeRate(String value) {
                this.xchangeRate = value;
            }

            /**
             * Gets the value of the settlementRate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSettlementRate() {
                return settlementRate;
            }

            /**
             * Sets the value of the settlementRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSettlementRate(String value) {
                this.settlementRate = value;
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

    }

}
