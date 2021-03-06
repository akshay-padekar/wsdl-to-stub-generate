
package org.xm.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.4
 * 2018-07-19T19:26:59.396+05:30
 * Generated source version: 3.1.4
 */

@WebFault(name = "confirmXMSCancelTxnFault", targetNamespace = "http://services.xm.org/xsd")
public class ConfirmXMSCancelTxnFault extends Exception {
    
    private org.xm.services.xsd.ConfirmXMSCancelTxnFault confirmXMSCancelTxnFault;

    public ConfirmXMSCancelTxnFault() {
        super();
    }
    
    public ConfirmXMSCancelTxnFault(String message) {
        super(message);
    }
    
    public ConfirmXMSCancelTxnFault(String message, Throwable cause) {
        super(message, cause);
    }

    public ConfirmXMSCancelTxnFault(String message, org.xm.services.xsd.ConfirmXMSCancelTxnFault confirmXMSCancelTxnFault) {
        super(message);
        this.confirmXMSCancelTxnFault = confirmXMSCancelTxnFault;
    }

    public ConfirmXMSCancelTxnFault(String message, org.xm.services.xsd.ConfirmXMSCancelTxnFault confirmXMSCancelTxnFault, Throwable cause) {
        super(message, cause);
        this.confirmXMSCancelTxnFault = confirmXMSCancelTxnFault;
    }

    public org.xm.services.xsd.ConfirmXMSCancelTxnFault getFaultInfo() {
        return this.confirmXMSCancelTxnFault;
    }
}
