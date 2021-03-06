
package org.xm.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.4
 * 2018-07-19T19:26:59.260+05:30
 * Generated source version: 3.1.4
 */

@WebFault(name = "getXMBankDetailsFault", targetNamespace = "http://services.xm.org/xsd")
public class GetXMBankDetailsFault extends Exception {
    
    private org.xm.services.xsd.GetXMBankDetailsFault getXMBankDetailsFault;

    public GetXMBankDetailsFault() {
        super();
    }
    
    public GetXMBankDetailsFault(String message) {
        super(message);
    }
    
    public GetXMBankDetailsFault(String message, Throwable cause) {
        super(message, cause);
    }

    public GetXMBankDetailsFault(String message, org.xm.services.xsd.GetXMBankDetailsFault getXMBankDetailsFault) {
        super(message);
        this.getXMBankDetailsFault = getXMBankDetailsFault;
    }

    public GetXMBankDetailsFault(String message, org.xm.services.xsd.GetXMBankDetailsFault getXMBankDetailsFault, Throwable cause) {
        super(message, cause);
        this.getXMBankDetailsFault = getXMBankDetailsFault;
    }

    public org.xm.services.xsd.GetXMBankDetailsFault getFaultInfo() {
        return this.getXMBankDetailsFault;
    }
}
