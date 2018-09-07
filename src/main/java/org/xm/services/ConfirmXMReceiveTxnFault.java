
package org.xm.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.4
 * 2018-07-19T19:26:59.435+05:30
 * Generated source version: 3.1.4
 */

@WebFault(name = "confirmXMReceiveTxnFault", targetNamespace = "http://services.xm.org/xsd")
public class ConfirmXMReceiveTxnFault extends Exception {
    
    private org.xm.services.xsd.ConfirmXMReceiveTxnFault confirmXMReceiveTxnFault;

    public ConfirmXMReceiveTxnFault() {
        super();
    }
    
    public ConfirmXMReceiveTxnFault(String message) {
        super(message);
    }
    
    public ConfirmXMReceiveTxnFault(String message, Throwable cause) {
        super(message, cause);
    }

    public ConfirmXMReceiveTxnFault(String message, org.xm.services.xsd.ConfirmXMReceiveTxnFault confirmXMReceiveTxnFault) {
        super(message);
        this.confirmXMReceiveTxnFault = confirmXMReceiveTxnFault;
    }

    public ConfirmXMReceiveTxnFault(String message, org.xm.services.xsd.ConfirmXMReceiveTxnFault confirmXMReceiveTxnFault, Throwable cause) {
        super(message, cause);
        this.confirmXMReceiveTxnFault = confirmXMReceiveTxnFault;
    }

    public org.xm.services.xsd.ConfirmXMReceiveTxnFault getFaultInfo() {
        return this.confirmXMReceiveTxnFault;
    }
}
