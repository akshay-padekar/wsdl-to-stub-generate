
package org.xm.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.4
 * 2018-07-19T19:26:59.463+05:30
 * Generated source version: 3.1.4
 */

@WebFault(name = "getXMAgentDetailsFault", targetNamespace = "http://services.xm.org/xsd")
public class GetXMAgentDetailsFault extends Exception {
    
    private org.xm.services.xsd.GetXMAgentDetailsFault getXMAgentDetailsFault;

    public GetXMAgentDetailsFault() {
        super();
    }
    
    public GetXMAgentDetailsFault(String message) {
        super(message);
    }
    
    public GetXMAgentDetailsFault(String message, Throwable cause) {
        super(message, cause);
    }

    public GetXMAgentDetailsFault(String message, org.xm.services.xsd.GetXMAgentDetailsFault getXMAgentDetailsFault) {
        super(message);
        this.getXMAgentDetailsFault = getXMAgentDetailsFault;
    }

    public GetXMAgentDetailsFault(String message, org.xm.services.xsd.GetXMAgentDetailsFault getXMAgentDetailsFault, Throwable cause) {
        super(message, cause);
        this.getXMAgentDetailsFault = getXMAgentDetailsFault;
    }

    public org.xm.services.xsd.GetXMAgentDetailsFault getFaultInfo() {
        return this.getXMAgentDetailsFault;
    }
}
