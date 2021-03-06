
package org.xm.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.4
 * 2018-07-19T19:26:59.482+05:30
 * Generated source version: 3.1.4
 */

@WebFault(name = "getXMCountryDetailsFault", targetNamespace = "http://services.xm.org/xsd")
public class GetXMCountryDetailsFault extends Exception {
    
    private org.xm.services.xsd.GetXMCountryDetailsFault getXMCountryDetailsFault;

    public GetXMCountryDetailsFault() {
        super();
    }
    
    public GetXMCountryDetailsFault(String message) {
        super(message);
    }
    
    public GetXMCountryDetailsFault(String message, Throwable cause) {
        super(message, cause);
    }

    public GetXMCountryDetailsFault(String message, org.xm.services.xsd.GetXMCountryDetailsFault getXMCountryDetailsFault) {
        super(message);
        this.getXMCountryDetailsFault = getXMCountryDetailsFault;
    }

    public GetXMCountryDetailsFault(String message, org.xm.services.xsd.GetXMCountryDetailsFault getXMCountryDetailsFault, Throwable cause) {
        super(message, cause);
        this.getXMCountryDetailsFault = getXMCountryDetailsFault;
    }

    public org.xm.services.xsd.GetXMCountryDetailsFault getFaultInfo() {
        return this.getXMCountryDetailsFault;
    }
}
