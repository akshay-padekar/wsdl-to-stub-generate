
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
 *         &lt;element name="resultList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="result" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="xpin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="returnMsg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "resultList"
})
@XmlRootElement(name = "confirmAllOutstandingReceiveTxnResponse")
public class ConfirmAllOutstandingReceiveTxnResponse {

    @XmlElement(required = true)
    protected ConfirmAllOutstandingReceiveTxnResponse.ResultList resultList;

    /**
     * Gets the value of the resultList property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmAllOutstandingReceiveTxnResponse.ResultList }
     *     
     */
    public ConfirmAllOutstandingReceiveTxnResponse.ResultList getResultList() {
        return resultList;
    }

    /**
     * Sets the value of the resultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmAllOutstandingReceiveTxnResponse.ResultList }
     *     
     */
    public void setResultList(ConfirmAllOutstandingReceiveTxnResponse.ResultList value) {
        this.resultList = value;
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
     *         &lt;element name="result" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="xpin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="returnMsg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "result"
    })
    public static class ResultList {

        @XmlElement(required = true)
        protected List<ConfirmAllOutstandingReceiveTxnResponse.ResultList.Result> result;

        /**
         * Gets the value of the result property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the result property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResult().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConfirmAllOutstandingReceiveTxnResponse.ResultList.Result }
         * 
         * 
         */
        public List<ConfirmAllOutstandingReceiveTxnResponse.ResultList.Result> getResult() {
            if (result == null) {
                result = new ArrayList<ConfirmAllOutstandingReceiveTxnResponse.ResultList.Result>();
            }
            return this.result;
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
         *         &lt;element name="xpin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="returnMsg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "xpin",
            "returnCode",
            "returnMsg"
        })
        public static class Result {

            @XmlElement(required = true, nillable = true)
            protected String xpin;
            @XmlElement(required = true, nillable = true)
            protected String returnCode;
            @XmlElement(required = true, nillable = true)
            protected String returnMsg;

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

        }

    }

}
