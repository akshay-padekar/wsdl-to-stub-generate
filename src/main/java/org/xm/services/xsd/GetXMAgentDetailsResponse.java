
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
 *         &lt;element name="agentList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="agent" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="agentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="agentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="agentBranch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="cityOrDistrict" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="hoursOfOpertation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="services" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="agentHolidays" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "agentList"
})
@XmlRootElement(name = "getXMAgentDetailsResponse")
public class GetXMAgentDetailsResponse {

    @XmlElement(required = true, nillable = true)
    protected String returnCode;
    @XmlElement(required = true, nillable = true)
    protected String returnMsg;
    @XmlElement(required = true)
    protected GetXMAgentDetailsResponse.AgentList agentList;

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
     * Gets the value of the agentList property.
     * 
     * @return
     *     possible object is
     *     {@link GetXMAgentDetailsResponse.AgentList }
     *     
     */
    public GetXMAgentDetailsResponse.AgentList getAgentList() {
        return agentList;
    }

    /**
     * Sets the value of the agentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetXMAgentDetailsResponse.AgentList }
     *     
     */
    public void setAgentList(GetXMAgentDetailsResponse.AgentList value) {
        this.agentList = value;
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
     *         &lt;element name="agent" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="agentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="agentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="agentBranch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="cityOrDistrict" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="hoursOfOpertation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="services" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="agentHolidays" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "agent"
    })
    public static class AgentList {

        @XmlElement(required = true)
        protected List<GetXMAgentDetailsResponse.AgentList.Agent> agent;

        /**
         * Gets the value of the agent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the agent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAgent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetXMAgentDetailsResponse.AgentList.Agent }
         * 
         * 
         */
        public List<GetXMAgentDetailsResponse.AgentList.Agent> getAgent() {
            if (agent == null) {
                agent = new ArrayList<GetXMAgentDetailsResponse.AgentList.Agent>();
            }
            return this.agent;
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
         *         &lt;element name="agentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="agentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="agentBranch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="cityOrDistrict" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="hoursOfOpertation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="services" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="agentHolidays" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "agentCode",
            "agentName",
            "agentBranch",
            "address",
            "cityOrDistrict",
            "state",
            "countryCode",
            "phone",
            "hoursOfOpertation",
            "services",
            "agentHolidays",
            "xmReserved1",
            "xmReserved2",
            "xmReserved3",
            "xmReserved4"
        })
        public static class Agent {

            @XmlElement(required = true, nillable = true)
            protected String agentCode;
            @XmlElement(required = true, nillable = true)
            protected String agentName;
            @XmlElement(required = true, nillable = true)
            protected String agentBranch;
            @XmlElement(required = true, nillable = true)
            protected String address;
            @XmlElement(required = true, nillable = true)
            protected String cityOrDistrict;
            @XmlElement(required = true, nillable = true)
            protected String state;
            @XmlElement(required = true, nillable = true)
            protected String countryCode;
            @XmlElement(required = true, nillable = true)
            protected String phone;
            @XmlElement(required = true, nillable = true)
            protected String hoursOfOpertation;
            @XmlElement(required = true, nillable = true)
            protected String services;
            @XmlElement(required = true, nillable = true)
            protected String agentHolidays;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved1;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved2;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved3;
            @XmlElement(required = true, nillable = true)
            protected String xmReserved4;

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
             * Gets the value of the agentName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgentName() {
                return agentName;
            }

            /**
             * Sets the value of the agentName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgentName(String value) {
                this.agentName = value;
            }

            /**
             * Gets the value of the agentBranch property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgentBranch() {
                return agentBranch;
            }

            /**
             * Sets the value of the agentBranch property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgentBranch(String value) {
                this.agentBranch = value;
            }

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress(String value) {
                this.address = value;
            }

            /**
             * Gets the value of the cityOrDistrict property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCityOrDistrict() {
                return cityOrDistrict;
            }

            /**
             * Sets the value of the cityOrDistrict property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCityOrDistrict(String value) {
                this.cityOrDistrict = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

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
             * Gets the value of the phone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhone() {
                return phone;
            }

            /**
             * Sets the value of the phone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhone(String value) {
                this.phone = value;
            }

            /**
             * Gets the value of the hoursOfOpertation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHoursOfOpertation() {
                return hoursOfOpertation;
            }

            /**
             * Sets the value of the hoursOfOpertation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHoursOfOpertation(String value) {
                this.hoursOfOpertation = value;
            }

            /**
             * Gets the value of the services property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServices() {
                return services;
            }

            /**
             * Sets the value of the services property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServices(String value) {
                this.services = value;
            }

            /**
             * Gets the value of the agentHolidays property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgentHolidays() {
                return agentHolidays;
            }

            /**
             * Sets the value of the agentHolidays property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgentHolidays(String value) {
                this.agentHolidays = value;
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
