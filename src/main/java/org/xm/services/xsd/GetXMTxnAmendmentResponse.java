
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
 *         &lt;element name="xpin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerPrimaryContactCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerPrimaryContactNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerSecContactCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerSecContactNo " type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryMobileCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryMobile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="xmReserved1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="xmReserved2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="xmReserved3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="xmReserved4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="xmReserved5" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="xmReserved6" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "customerFirstName",
    "customerMiddleName",
    "customerLastName",
    "customerAddress1",
    "customerAddress2",
    "customerAddressCity",
    "customerAddressState",
    "customerPrimaryContactCountryCode",
    "customerPrimaryContactNo",
    "customerSecContactCountryCode",
    "customerSecContactNo0020",
    "beneficiaryFirstName",
    "beneficiaryMiddleName",
    "beneficiaryLastName",
    "beneficiaryAddress1",
    "beneficiaryAddress2",
    "beneficiaryAddressCity",
    "beneficiaryAddressState",
    "beneficiaryPhoneCountryCode",
    "beneficiaryPhone",
    "beneficiaryMobileCountryCode",
    "beneficiaryMobile",
    "xmReserved1",
    "xmReserved2",
    "xmReserved3",
    "xmReserved4",
    "xmReserved5",
    "xmReserved6"
})
@XmlRootElement(name = "getXMTxnAmendmentResponse")
public class GetXMTxnAmendmentResponse {

    @XmlElement(required = true)
    protected String returnCode;
    @XmlElement(required = true)
    protected String returnMsg;
    @XmlElement(required = true)
    protected String xpin;
    @XmlElement(required = true)
    protected String customerFirstName;
    @XmlElement(required = true)
    protected String customerMiddleName;
    @XmlElement(required = true)
    protected String customerLastName;
    @XmlElement(required = true)
    protected String customerAddress1;
    @XmlElement(required = true)
    protected String customerAddress2;
    @XmlElement(required = true)
    protected String customerAddressCity;
    @XmlElement(required = true)
    protected String customerAddressState;
    @XmlElement(required = true)
    protected String customerPrimaryContactCountryCode;
    @XmlElement(required = true)
    protected String customerPrimaryContactNo;
    @XmlElement(required = true)
    protected String customerSecContactCountryCode;
    @XmlElement(name = "customerSecContactNo ", required = true)
    protected String customerSecContactNo0020;
    @XmlElement(required = true)
    protected String beneficiaryFirstName;
    @XmlElement(required = true)
    protected String beneficiaryMiddleName;
    @XmlElement(required = true)
    protected String beneficiaryLastName;
    @XmlElement(required = true)
    protected String beneficiaryAddress1;
    @XmlElement(required = true)
    protected String beneficiaryAddress2;
    @XmlElement(required = true)
    protected String beneficiaryAddressCity;
    @XmlElement(required = true)
    protected String beneficiaryAddressState;
    @XmlElement(required = true)
    protected String beneficiaryPhoneCountryCode;
    @XmlElement(required = true)
    protected String beneficiaryPhone;
    @XmlElement(required = true)
    protected String beneficiaryMobileCountryCode;
    @XmlElement(required = true)
    protected String beneficiaryMobile;
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
     * Gets the value of the customerSecContactCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSecContactCountryCode() {
        return customerSecContactCountryCode;
    }

    /**
     * Sets the value of the customerSecContactCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSecContactCountryCode(String value) {
        this.customerSecContactCountryCode = value;
    }

    /**
     * Gets the value of the customerSecContactNo0020 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSecContactNo_0020() {
        return customerSecContactNo0020;
    }

    /**
     * Sets the value of the customerSecContactNo0020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSecContactNo_0020(String value) {
        this.customerSecContactNo0020 = value;
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
     * Gets the value of the beneficiaryPhoneCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryPhoneCountryCode() {
        return beneficiaryPhoneCountryCode;
    }

    /**
     * Sets the value of the beneficiaryPhoneCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryPhoneCountryCode(String value) {
        this.beneficiaryPhoneCountryCode = value;
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
     * Gets the value of the beneficiaryMobileCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryMobileCountryCode() {
        return beneficiaryMobileCountryCode;
    }

    /**
     * Sets the value of the beneficiaryMobileCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryMobileCountryCode(String value) {
        this.beneficiaryMobileCountryCode = value;
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

}
