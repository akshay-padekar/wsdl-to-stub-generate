
package org.xm.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.4
 * 2018-07-19T19:26:59.347+05:30
 * Generated source version: 3.1.4
 */

@WebFault(name = "searchCustomerFault", targetNamespace = "http://services.xm.org/xsd")
public class SearchCustomerFault extends Exception {
    
    private org.xm.services.xsd.SearchCustomerFault searchCustomerFault;

    public SearchCustomerFault() {
        super();
    }
    
    public SearchCustomerFault(String message) {
        super(message);
    }
    
    public SearchCustomerFault(String message, Throwable cause) {
        super(message, cause);
    }

    public SearchCustomerFault(String message, org.xm.services.xsd.SearchCustomerFault searchCustomerFault) {
        super(message);
        this.searchCustomerFault = searchCustomerFault;
    }

    public SearchCustomerFault(String message, org.xm.services.xsd.SearchCustomerFault searchCustomerFault, Throwable cause) {
        super(message, cause);
        this.searchCustomerFault = searchCustomerFault;
    }

    public org.xm.services.xsd.SearchCustomerFault getFaultInfo() {
        return this.searchCustomerFault;
    }
}
