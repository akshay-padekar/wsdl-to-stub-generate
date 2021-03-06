
package org.xm.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.4
 * 2018-07-19T19:26:59.365+05:30
 * Generated source version: 3.1.4
 */

@WebFault(name = "getXMBankBranchDetailsFault", targetNamespace = "http://services.xm.org/xsd")
public class GetXMBankBranchDetailsFault extends Exception {
    
    private org.xm.services.xsd.GetXMBankBranchDetailsFault getXMBankBranchDetailsFault;

    public GetXMBankBranchDetailsFault() {
        super();
    }
    
    public GetXMBankBranchDetailsFault(String message) {
        super(message);
    }
    
    public GetXMBankBranchDetailsFault(String message, Throwable cause) {
        super(message, cause);
    }

    public GetXMBankBranchDetailsFault(String message, org.xm.services.xsd.GetXMBankBranchDetailsFault getXMBankBranchDetailsFault) {
        super(message);
        this.getXMBankBranchDetailsFault = getXMBankBranchDetailsFault;
    }

    public GetXMBankBranchDetailsFault(String message, org.xm.services.xsd.GetXMBankBranchDetailsFault getXMBankBranchDetailsFault, Throwable cause) {
        super(message, cause);
        this.getXMBankBranchDetailsFault = getXMBankBranchDetailsFault;
    }

    public org.xm.services.xsd.GetXMBankBranchDetailsFault getFaultInfo() {
        return this.getXMBankBranchDetailsFault;
    }
}
