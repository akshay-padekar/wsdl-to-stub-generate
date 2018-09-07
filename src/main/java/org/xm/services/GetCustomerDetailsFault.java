
package org.xm.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.4
 * 2018-07-19T19:26:59.451+05:30
 * Generated source version: 3.1.4
 */

@WebFault(name = "getCustomerDetailsFault", targetNamespace = "http://services.xm.org/xsd")
public class GetCustomerDetailsFault extends Exception {
    
    private org.xm.services.xsd.GetCustomerDetailsFault getCustomerDetailsFault;

    public GetCustomerDetailsFault() {
        super();
    }
    
    public GetCustomerDetailsFault(String message) {
        super(message);
    }
    
    public GetCustomerDetailsFault(String message, Throwable cause) {
        super(message, cause);
    }

    public GetCustomerDetailsFault(String message, org.xm.services.xsd.GetCustomerDetailsFault getCustomerDetailsFault) {
        super(message);
        this.getCustomerDetailsFault = getCustomerDetailsFault;
    }

    public GetCustomerDetailsFault(String message, org.xm.services.xsd.GetCustomerDetailsFault getCustomerDetailsFault, Throwable cause) {
        super(message, cause);
        this.getCustomerDetailsFault = getCustomerDetailsFault;
    }

    public org.xm.services.xsd.GetCustomerDetailsFault getFaultInfo() {
        return this.getCustomerDetailsFault;
    }
}