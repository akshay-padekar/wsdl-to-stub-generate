
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
 *                             &lt;element name="branchSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="branchName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="branchAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="branchAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="branchAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="branchAddressDistrict" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="branchAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="branchAddressCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="branchAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="branchPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="branchFax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="branchEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="branchOtherInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="branchCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="branchStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="availableRecords" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlRootElement(name = "getXMBankBranchDetailsResponse")
public class GetXMBankBranchDetailsResponse {

    @XmlElement(required = true)
    protected String returnCode;
    @XmlElement(required = true)
    protected String returnMsg;
    @XmlElement(required = true)
    protected GetXMBankBranchDetailsResponse.BankList bankList;

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
     *     {@link GetXMBankBranchDetailsResponse.BankList }
     *     
     */
    public GetXMBankBranchDetailsResponse.BankList getBankList() {
        return bankList;
    }

    /**
     * Sets the value of the bankList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetXMBankBranchDetailsResponse.BankList }
     *     
     */
    public void setBankList(GetXMBankBranchDetailsResponse.BankList value) {
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
     *                   &lt;element name="branchSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="branchName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="branchAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="branchAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="branchAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="branchAddressDistrict" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="branchAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="branchAddressCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="branchAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="branchPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="branchFax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="branchEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="branchOtherInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="branchCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="branchStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="availableRecords" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        protected List<GetXMBankBranchDetailsResponse.BankList.Bank> bank;

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
         * {@link GetXMBankBranchDetailsResponse.BankList.Bank }
         * 
         * 
         */
        public List<GetXMBankBranchDetailsResponse.BankList.Bank> getBank() {
            if (bank == null) {
                bank = new ArrayList<GetXMBankBranchDetailsResponse.BankList.Bank>();
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
         *         &lt;element name="branchSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="branchName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="branchAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="branchAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="branchAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="branchAddressDistrict" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="branchAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="branchAddressCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="branchAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="branchPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="branchFax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="branchEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="branchOtherInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="branchCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="branchStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="availableRecords" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "branchSerialNo",
            "bankCode",
            "branchName",
            "branchAddress1",
            "branchAddress2",
            "branchAddressCity",
            "branchAddressDistrict",
            "branchAddressState",
            "branchAddressCountryCode",
            "branchAddressZip",
            "branchPhone",
            "branchFax",
            "branchEmail",
            "branchOtherInfo",
            "branchCode",
            "branchStatus",
            "availableRecords",
            "xmReserved1",
            "xmReserved2",
            "xmReserved3",
            "xmReserved4"
        })
        public static class Bank {

            @XmlElement(required = true, nillable = true)
            protected String branchSerialNo;
            @XmlElement(required = true, nillable = true)
            protected String bankCode;
            @XmlElement(required = true, nillable = true)
            protected String branchName;
            @XmlElement(required = true, nillable = true)
            protected String branchAddress1;
            @XmlElement(required = true, nillable = true)
            protected String branchAddress2;
            @XmlElement(required = true, nillable = true)
            protected String branchAddressCity;
            @XmlElement(required = true, nillable = true)
            protected String branchAddressDistrict;
            @XmlElement(required = true, nillable = true)
            protected String branchAddressState;
            @XmlElement(required = true, nillable = true)
            protected String branchAddressCountryCode;
            @XmlElement(required = true, nillable = true)
            protected String branchAddressZip;
            @XmlElement(required = true, nillable = true)
            protected String branchPhone;
            @XmlElement(required = true, nillable = true)
            protected String branchFax;
            @XmlElement(required = true, nillable = true)
            protected String branchEmail;
            @XmlElement(required = true, nillable = true)
            protected String branchOtherInfo;
            @XmlElement(required = true, nillable = true)
            protected String branchCode;
            @XmlElement(required = true, nillable = true)
            protected String branchStatus;
            @XmlElement(required = true)
            protected String availableRecords;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved1;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved2;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved3;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved4;

            /**
             * Gets the value of the branchSerialNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBranchSerialNo() {
                return branchSerialNo;
            }

            /**
             * Sets the value of the branchSerialNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBranchSerialNo(String value) {
                this.branchSerialNo = value;
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
             * Gets the value of the branchName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBranchName() {
                return branchName;
            }

            /**
             * Sets the value of the branchName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBranchName(String value) {
                this.branchName = value;
            }

            /**
             * Gets the value of the branchAddress1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBranchAddress1() {
                return branchAddress1;
            }

            /**
             * Sets the value of the branchAddress1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBranchAddress1(String value) {
                this.branchAddress1 = value;
            }

            /**
             * Gets the value of the branchAddress2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBranchAddress2() {
                return branchAddress2;
            }

            /**
             * Sets the value of the branchAddress2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBranchAddress2(String value) {
                this.branchAddress2 = value;
            }

            /**
             * Gets the value of the branchAddressCity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBranchAddressCity() {
                return branchAddressCity;
            }

            /**
             * Sets the value of the branchAddressCity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBranchAddressCity(String value) {
                this.branchAddressCity = value;
            }

            /**
             * Gets the value of the branchAddressDistrict property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBranchAddressDistrict() {
                return branchAddressDistrict;
            }

            /**
             * Sets the value of the branchAddressDistrict property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBranchAddressDistrict(String value) {
                this.branchAddressDistrict = value;
            }

            /**
             * Gets the value of the branchAddressState property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBranchAddressState() {
                return branchAddressState;
            }

            /**
             * Sets the value of the branchAddressState property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBranchAddressState(String value) {
                this.branchAddressState = value;
            }

            /**
             * Gets the value of the branchAddressCountryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBranchAddressCountryCode() {
                return branchAddressCountryCode;
            }

            /**
             * Sets the value of the branchAddressCountryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBranchAddressCountryCode(String value) {
                this.branchAddressCountryCode = value;
            }

            /**
             * Gets the value of the branchAddressZip property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBranchAddressZip() {
                return branchAddressZip;
            }

            /**
             * Sets the value of the branchAddressZip property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBranchAddressZip(String value) {
                this.branchAddressZip = value;
            }

            /**
             * Gets the value of the branchPhone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBranchPhone() {
                return branchPhone;
            }

            /**
             * Sets the value of the branchPhone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBranchPhone(String value) {
                this.branchPhone = value;
            }

            /**
             * Gets the value of the branchFax property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBranchFax() {
                return branchFax;
            }

            /**
             * Sets the value of the branchFax property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBranchFax(String value) {
                this.branchFax = value;
            }

            /**
             * Gets the value of the branchEmail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBranchEmail() {
                return branchEmail;
            }

            /**
             * Sets the value of the branchEmail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBranchEmail(String value) {
                this.branchEmail = value;
            }

            /**
             * Gets the value of the branchOtherInfo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBranchOtherInfo() {
                return branchOtherInfo;
            }

            /**
             * Sets the value of the branchOtherInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBranchOtherInfo(String value) {
                this.branchOtherInfo = value;
            }

            /**
             * Gets the value of the branchCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBranchCode() {
                return branchCode;
            }

            /**
             * Sets the value of the branchCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBranchCode(String value) {
                this.branchCode = value;
            }

            /**
             * Gets the value of the branchStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBranchStatus() {
                return branchStatus;
            }

            /**
             * Sets the value of the branchStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBranchStatus(String value) {
                this.branchStatus = value;
            }

            /**
             * Gets the value of the availableRecords property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAvailableRecords() {
                return availableRecords;
            }

            /**
             * Sets the value of the availableRecords property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAvailableRecords(String value) {
                this.availableRecords = value;
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
