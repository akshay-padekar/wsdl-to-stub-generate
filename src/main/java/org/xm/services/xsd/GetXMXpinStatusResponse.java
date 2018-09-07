
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
 *         &lt;element name="xpin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="txnStatusList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="txnStatus" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="gmtDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "xpin",
    "txnStatusList"
})
@XmlRootElement(name = "getXMXpinStatusResponse")
public class GetXMXpinStatusResponse {

    @XmlElement(required = true, nillable = true)
    protected String returnCode;
    @XmlElement(required = true, nillable = true)
    protected String returnMsg;
    @XmlElement(required = true, nillable = true)
    protected String xpin;
    @XmlElement(required = true)
    protected GetXMXpinStatusResponse.TxnStatusList txnStatusList;

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
     * Gets the value of the txnStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link GetXMXpinStatusResponse.TxnStatusList }
     *     
     */
    public GetXMXpinStatusResponse.TxnStatusList getTxnStatusList() {
        return txnStatusList;
    }

    /**
     * Sets the value of the txnStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetXMXpinStatusResponse.TxnStatusList }
     *     
     */
    public void setTxnStatusList(GetXMXpinStatusResponse.TxnStatusList value) {
        this.txnStatusList = value;
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
     *         &lt;element name="txnStatus" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="gmtDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "txnStatus"
    })
    public static class TxnStatusList {

        @XmlElement(required = true)
        protected List<GetXMXpinStatusResponse.TxnStatusList.TxnStatus> txnStatus;

        /**
         * Gets the value of the txnStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the txnStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTxnStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetXMXpinStatusResponse.TxnStatusList.TxnStatus }
         * 
         * 
         */
        public List<GetXMXpinStatusResponse.TxnStatusList.TxnStatus> getTxnStatus() {
            if (txnStatus == null) {
                txnStatus = new ArrayList<GetXMXpinStatusResponse.TxnStatusList.TxnStatus>();
            }
            return this.txnStatus;
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
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="gmtDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "description",
            "userId",
            "gmtDate"
        })
        public static class TxnStatus {

            @XmlElement(required = true, nillable = true)
            protected String description;
            @XmlElement(required = true, nillable = true)
            protected String userId;
            @XmlElement(required = true, nillable = true)
            protected String gmtDate;

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the userId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUserId() {
                return userId;
            }

            /**
             * Sets the value of the userId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUserId(String value) {
                this.userId = value;
            }

            /**
             * Gets the value of the gmtDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGmtDate() {
                return gmtDate;
            }

            /**
             * Sets the value of the gmtDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGmtDate(String value) {
                this.gmtDate = value;
            }

        }

    }

}
