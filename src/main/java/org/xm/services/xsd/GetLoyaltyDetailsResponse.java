
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
 *         &lt;element name="loyaltyList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="loyalty" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="xmCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmCustomerLoyaltyNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerReferred" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerReferredBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="loyaltyCcyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="loyaltyPoints" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="loyaltyPoints4FirstTxn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="loyaltyReferralPoints" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="loyaltyReferralTxnsCount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="amountPerLoyaltyPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="minimumPointsReedemable" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="maximumPointsReedemable" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="totalLoyaltyPointsAvailable" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="totalLoyaltyPointsEquivalentAmt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmReserved1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmReserved2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmReserved3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmReserved4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmReserved5" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "loyaltyList"
})
@XmlRootElement(name = "getLoyaltyDetailsResponse")
public class GetLoyaltyDetailsResponse {

    @XmlElement(required = true)
    protected String returnCode;
    @XmlElement(required = true)
    protected String returnMsg;
    @XmlElement(required = true)
    protected GetLoyaltyDetailsResponse.LoyaltyList loyaltyList;

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
     * Gets the value of the loyaltyList property.
     * 
     * @return
     *     possible object is
     *     {@link GetLoyaltyDetailsResponse.LoyaltyList }
     *     
     */
    public GetLoyaltyDetailsResponse.LoyaltyList getLoyaltyList() {
        return loyaltyList;
    }

    /**
     * Sets the value of the loyaltyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLoyaltyDetailsResponse.LoyaltyList }
     *     
     */
    public void setLoyaltyList(GetLoyaltyDetailsResponse.LoyaltyList value) {
        this.loyaltyList = value;
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
     *         &lt;element name="loyalty" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="xmCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmCustomerLoyaltyNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerReferred" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerReferredBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="loyaltyCcyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="loyaltyPoints" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="loyaltyPoints4FirstTxn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="loyaltyReferralPoints" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="loyaltyReferralTxnsCount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="amountPerLoyaltyPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="minimumPointsReedemable" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="maximumPointsReedemable" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="totalLoyaltyPointsAvailable" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="totalLoyaltyPointsEquivalentAmt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "loyalty"
    })
    public static class LoyaltyList {

        @XmlElement(required = true)
        protected List<GetLoyaltyDetailsResponse.LoyaltyList.Loyalty> loyalty;

        /**
         * Gets the value of the loyalty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the loyalty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLoyalty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetLoyaltyDetailsResponse.LoyaltyList.Loyalty }
         * 
         * 
         */
        public List<GetLoyaltyDetailsResponse.LoyaltyList.Loyalty> getLoyalty() {
            if (loyalty == null) {
                loyalty = new ArrayList<GetLoyaltyDetailsResponse.LoyaltyList.Loyalty>();
            }
            return this.loyalty;
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
         *         &lt;element name="xmCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xmCustomerLoyaltyNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerReferred" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerReferredBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="loyaltyCcyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="loyaltyPoints" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="loyaltyPoints4FirstTxn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="loyaltyReferralPoints" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="loyaltyReferralTxnsCount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="amountPerLoyaltyPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="minimumPointsReedemable" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="maximumPointsReedemable" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="totalLoyaltyPointsAvailable" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="totalLoyaltyPointsEquivalentAmt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "xmCustomerNo",
            "xmCustomerLoyaltyNo",
            "customerReferred",
            "customerReferredBy",
            "loyaltyCcyCode",
            "loyaltyPoints",
            "loyaltyPoints4FirstTxn",
            "loyaltyReferralPoints",
            "loyaltyReferralTxnsCount",
            "amountPerLoyaltyPoint",
            "minimumPointsReedemable",
            "maximumPointsReedemable",
            "status",
            "totalLoyaltyPointsAvailable",
            "totalLoyaltyPointsEquivalentAmt",
            "xmReserved1",
            "xmReserved2",
            "xmReserved3",
            "xmReserved4",
            "xmReserved5"
        })
        public static class Loyalty {

            @XmlElement(required = true, nillable = true)
            protected String xmCustomerNo;
            @XmlElement(required = true, nillable = true)
            protected String xmCustomerLoyaltyNo;
            @XmlElement(required = true, nillable = true)
            protected String customerReferred;
            @XmlElement(required = true, nillable = true)
            protected String customerReferredBy;
            @XmlElement(required = true, nillable = true)
            protected String loyaltyCcyCode;
            @XmlElement(required = true, nillable = true)
            protected String loyaltyPoints;
            @XmlElement(required = true, nillable = true)
            protected String loyaltyPoints4FirstTxn;
            @XmlElement(required = true, nillable = true)
            protected String loyaltyReferralPoints;
            @XmlElement(required = true, nillable = true)
            protected String loyaltyReferralTxnsCount;
            @XmlElement(required = true, nillable = true)
            protected String amountPerLoyaltyPoint;
            @XmlElement(required = true, nillable = true)
            protected String minimumPointsReedemable;
            @XmlElement(required = true, nillable = true)
            protected String maximumPointsReedemable;
            @XmlElement(required = true, nillable = true)
            protected String status;
            @XmlElement(required = true, nillable = true)
            protected String totalLoyaltyPointsAvailable;
            @XmlElement(required = true, nillable = true)
            protected String totalLoyaltyPointsEquivalentAmt;
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
             * Gets the value of the xmCustomerLoyaltyNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXmCustomerLoyaltyNo() {
                return xmCustomerLoyaltyNo;
            }

            /**
             * Sets the value of the xmCustomerLoyaltyNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXmCustomerLoyaltyNo(String value) {
                this.xmCustomerLoyaltyNo = value;
            }

            /**
             * Gets the value of the customerReferred property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerReferred() {
                return customerReferred;
            }

            /**
             * Sets the value of the customerReferred property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerReferred(String value) {
                this.customerReferred = value;
            }

            /**
             * Gets the value of the customerReferredBy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerReferredBy() {
                return customerReferredBy;
            }

            /**
             * Sets the value of the customerReferredBy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerReferredBy(String value) {
                this.customerReferredBy = value;
            }

            /**
             * Gets the value of the loyaltyCcyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLoyaltyCcyCode() {
                return loyaltyCcyCode;
            }

            /**
             * Sets the value of the loyaltyCcyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLoyaltyCcyCode(String value) {
                this.loyaltyCcyCode = value;
            }

            /**
             * Gets the value of the loyaltyPoints property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLoyaltyPoints() {
                return loyaltyPoints;
            }

            /**
             * Sets the value of the loyaltyPoints property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLoyaltyPoints(String value) {
                this.loyaltyPoints = value;
            }

            /**
             * Gets the value of the loyaltyPoints4FirstTxn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLoyaltyPoints4FirstTxn() {
                return loyaltyPoints4FirstTxn;
            }

            /**
             * Sets the value of the loyaltyPoints4FirstTxn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLoyaltyPoints4FirstTxn(String value) {
                this.loyaltyPoints4FirstTxn = value;
            }

            /**
             * Gets the value of the loyaltyReferralPoints property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLoyaltyReferralPoints() {
                return loyaltyReferralPoints;
            }

            /**
             * Sets the value of the loyaltyReferralPoints property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLoyaltyReferralPoints(String value) {
                this.loyaltyReferralPoints = value;
            }

            /**
             * Gets the value of the loyaltyReferralTxnsCount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLoyaltyReferralTxnsCount() {
                return loyaltyReferralTxnsCount;
            }

            /**
             * Sets the value of the loyaltyReferralTxnsCount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLoyaltyReferralTxnsCount(String value) {
                this.loyaltyReferralTxnsCount = value;
            }

            /**
             * Gets the value of the amountPerLoyaltyPoint property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAmountPerLoyaltyPoint() {
                return amountPerLoyaltyPoint;
            }

            /**
             * Sets the value of the amountPerLoyaltyPoint property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAmountPerLoyaltyPoint(String value) {
                this.amountPerLoyaltyPoint = value;
            }

            /**
             * Gets the value of the minimumPointsReedemable property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMinimumPointsReedemable() {
                return minimumPointsReedemable;
            }

            /**
             * Sets the value of the minimumPointsReedemable property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMinimumPointsReedemable(String value) {
                this.minimumPointsReedemable = value;
            }

            /**
             * Gets the value of the maximumPointsReedemable property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaximumPointsReedemable() {
                return maximumPointsReedemable;
            }

            /**
             * Sets the value of the maximumPointsReedemable property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaximumPointsReedemable(String value) {
                this.maximumPointsReedemable = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Gets the value of the totalLoyaltyPointsAvailable property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalLoyaltyPointsAvailable() {
                return totalLoyaltyPointsAvailable;
            }

            /**
             * Sets the value of the totalLoyaltyPointsAvailable property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalLoyaltyPointsAvailable(String value) {
                this.totalLoyaltyPointsAvailable = value;
            }

            /**
             * Gets the value of the totalLoyaltyPointsEquivalentAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalLoyaltyPointsEquivalentAmt() {
                return totalLoyaltyPointsEquivalentAmt;
            }

            /**
             * Sets the value of the totalLoyaltyPointsEquivalentAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalLoyaltyPointsEquivalentAmt(String value) {
                this.totalLoyaltyPointsEquivalentAmt = value;
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

        }

    }

}
