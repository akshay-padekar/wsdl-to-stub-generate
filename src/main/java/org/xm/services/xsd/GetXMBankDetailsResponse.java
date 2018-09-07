
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
 *         &lt;element name="bankList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="bank" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="agentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="bankAdditionalInfo1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="bankAdditionalInfo2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "bankList"
})
@XmlRootElement(name = "getXMBankDetailsResponse")
public class GetXMBankDetailsResponse {

    @XmlElement(required = true, nillable = true)
    protected String returnCode;
    @XmlElement(required = true, nillable = true)
    protected String returnMsg;
    @XmlElement(required = true)
    protected GetXMBankDetailsResponse.BankList bankList;

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
     * Gets the value of the bankList property.
     * 
     * @return
     *     possible object is
     *     {@link GetXMBankDetailsResponse.BankList }
     *     
     */
    public GetXMBankDetailsResponse.BankList getBankList() {
        return bankList;
    }

    /**
     * Sets the value of the bankList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetXMBankDetailsResponse.BankList }
     *     
     */
    public void setBankList(GetXMBankDetailsResponse.BankList value) {
        this.bankList = value;
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
     *         &lt;element name="bank" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="agentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="bankAdditionalInfo1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="bankAdditionalInfo2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "bank"
    })
    public static class BankList {

        @XmlElement(required = true)
        protected List<GetXMBankDetailsResponse.BankList.Bank> bank;

        /**
         * Gets the value of the bank property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bank property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBank().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetXMBankDetailsResponse.BankList.Bank }
         * 
         * 
         */
        public List<GetXMBankDetailsResponse.BankList.Bank> getBank() {
            if (bank == null) {
                bank = new ArrayList<GetXMBankDetailsResponse.BankList.Bank>();
            }
            return this.bank;
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
         *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="agentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="bankAdditionalInfo1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="bankAdditionalInfo2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "countryCode",
            "bankCode",
            "agentCode",
            "bankName",
            "countryName",
            "bankAdditionalInfo1",
            "bankAdditionalInfo2",
            "xmReserved1",
            "xmReserved2",
            "xmReserved3",
            "xmReserved4"
        })
        public static class Bank {

            @XmlElement(required = true, nillable = true)
            protected String countryCode;
            @XmlElement(required = true, nillable = true)
            protected String bankCode;
            @XmlElement(required = true, nillable = true)
            protected String agentCode;
            @XmlElement(required = true, nillable = true)
            protected String bankName;
            @XmlElement(required = true, nillable = true)
            protected String countryName;
            @XmlElement(required = true, nillable = true)
            protected String bankAdditionalInfo1;
            @XmlElement(required = true, nillable = true)
            protected String bankAdditionalInfo2;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved1;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved2;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved3;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved4;

            /**
             * Gets the value of the countryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryCode() {
                return countryCode;
            }

            /**
             * Sets the value of the countryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryCode(String value) {
                this.countryCode = value;
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
             * Gets the value of the agentCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgentCode() {
                return agentCode;
            }

            /**
             * Sets the value of the agentCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgentCode(String value) {
                this.agentCode = value;
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
             * Gets the value of the countryName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryName() {
                return countryName;
            }

            /**
             * Sets the value of the countryName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryName(String value) {
                this.countryName = value;
            }

            /**
             * Gets the value of the bankAdditionalInfo1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankAdditionalInfo1() {
                return bankAdditionalInfo1;
            }

            /**
             * Sets the value of the bankAdditionalInfo1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankAdditionalInfo1(String value) {
                this.bankAdditionalInfo1 = value;
            }

            /**
             * Gets the value of the bankAdditionalInfo2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankAdditionalInfo2() {
                return bankAdditionalInfo2;
            }

            /**
             * Sets the value of the bankAdditionalInfo2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankAdditionalInfo2(String value) {
                this.bankAdditionalInfo2 = value;
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
