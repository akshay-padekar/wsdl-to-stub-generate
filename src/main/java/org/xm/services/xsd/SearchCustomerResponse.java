
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
 *         &lt;element name="customerList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="customer" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="customerSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xmCustomerLoyaltyNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerPrimaryContactCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerPrimaryContactNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerRegisteredOn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerRegisteredAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="customerRegisteredAgentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "customerList"
})
@XmlRootElement(name = "searchCustomerResponse")
public class SearchCustomerResponse {

    @XmlElement(required = true)
    protected String returnCode;
    @XmlElement(required = true)
    protected String returnMsg;
    @XmlElement(required = true)
    protected SearchCustomerResponse.CustomerList customerList;

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
     * Gets the value of the customerList property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCustomerResponse.CustomerList }
     *     
     */
    public SearchCustomerResponse.CustomerList getCustomerList() {
        return customerList;
    }

    /**
     * Sets the value of the customerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCustomerResponse.CustomerList }
     *     
     */
    public void setCustomerList(SearchCustomerResponse.CustomerList value) {
        this.customerList = value;
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
     *         &lt;element name="customer" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="customerSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xmCustomerLoyaltyNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerPrimaryContactCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerPrimaryContactNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerRegisteredOn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerRegisteredAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="customerRegisteredAgentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "customer"
    })
    public static class CustomerList {

        @XmlElement(required = true)
        protected List<SearchCustomerResponse.CustomerList.Customer> customer;

        /**
         * Gets the value of the customer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchCustomerResponse.CustomerList.Customer }
         * 
         * 
         */
        public List<SearchCustomerResponse.CustomerList.Customer> getCustomer() {
            if (customer == null) {
                customer = new ArrayList<SearchCustomerResponse.CustomerList.Customer>();
            }
            return this.customer;
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
         *         &lt;element name="customerSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xmCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xmCustomerLoyaltyNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerPrimaryContactCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerPrimaryContactNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerRegisteredOn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerRegisteredAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="customerRegisteredAgentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "customerSerialNo",
            "xmCustomerNo",
            "xmCustomerLoyaltyNo",
            "customerFirstName",
            "customerMiddleName",
            "customerLastName",
            "customerPrimaryContactCountryCode",
            "customerPrimaryContactNo",
            "customerAddress",
            "customerStatus",
            "customerRegisteredOn",
            "customerRegisteredAgentCode",
            "customerRegisteredAgentName",
            "xmReserved1",
            "xmReserved2",
            "xmReserved3",
            "xmReserved4",
            "xmReserved5"
        })
        public static class Customer {

            @XmlElement(required = true, nillable = true)
            protected String customerSerialNo;
            @XmlElement(required = true, nillable = true)
            protected String xmCustomerNo;
            @XmlElement(required = true, nillable = true)
            protected String xmCustomerLoyaltyNo;
            @XmlElement(required = true, nillable = true)
            protected String customerFirstName;
            @XmlElement(required = true, nillable = true)
            protected String customerMiddleName;
            @XmlElement(required = true, nillable = true)
            protected String customerLastName;
            @XmlElement(required = true, nillable = true)
            protected String customerPrimaryContactCountryCode;
            @XmlElement(required = true, nillable = true)
            protected String customerPrimaryContactNo;
            @XmlElement(required = true, nillable = true)
            protected String customerAddress;
            @XmlElement(required = true, nillable = true)
            protected String customerStatus;
            @XmlElement(required = true, nillable = true)
            protected String customerRegisteredOn;
            @XmlElement(required = true, nillable = true)
            protected String customerRegisteredAgentCode;
            @XmlElement(required = true, nillable = true)
            protected String customerRegisteredAgentName;
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
             * Gets the value of the customerSerialNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerSerialNo() {
                return customerSerialNo;
            }

            /**
             * Sets the value of the customerSerialNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerSerialNo(String value) {
                this.customerSerialNo = value;
            }

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
             * Gets the value of the customerPrimaryContactCountryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerPrimaryContactCountryCode() {
                return customerPrimaryContactCountryCode;
            }

            /**
             * Sets the value of the customerPrimaryContactCountryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerPrimaryContactCountryCode(String value) {
                this.customerPrimaryContactCountryCode = value;
            }

            /**
             * Gets the value of the customerPrimaryContactNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerPrimaryContactNo() {
                return customerPrimaryContactNo;
            }

            /**
             * Sets the value of the customerPrimaryContactNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerPrimaryContactNo(String value) {
                this.customerPrimaryContactNo = value;
            }

            /**
             * Gets the value of the customerAddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerAddress() {
                return customerAddress;
            }

            /**
             * Sets the value of the customerAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerAddress(String value) {
                this.customerAddress = value;
            }

            /**
             * Gets the value of the customerStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerStatus() {
                return customerStatus;
            }

            /**
             * Sets the value of the customerStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerStatus(String value) {
                this.customerStatus = value;
            }

            /**
             * Gets the value of the customerRegisteredOn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerRegisteredOn() {
                return customerRegisteredOn;
            }

            /**
             * Sets the value of the customerRegisteredOn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerRegisteredOn(String value) {
                this.customerRegisteredOn = value;
            }

            /**
             * Gets the value of the customerRegisteredAgentCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerRegisteredAgentCode() {
                return customerRegisteredAgentCode;
            }

            /**
             * Sets the value of the customerRegisteredAgentCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerRegisteredAgentCode(String value) {
                this.customerRegisteredAgentCode = value;
            }

            /**
             * Gets the value of the customerRegisteredAgentName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerRegisteredAgentName() {
                return customerRegisteredAgentName;
            }

            /**
             * Sets the value of the customerRegisteredAgentName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerRegisteredAgentName(String value) {
                this.customerRegisteredAgentName = value;
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
