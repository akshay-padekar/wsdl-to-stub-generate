
package org.xm.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.4
 * 2018-07-19T19:26:59.358+05:30
 * Generated source version: 3.1.4
 */

@WebFault(name = "updateAllOutstandingtxnlistFault", targetNamespace = "http://services.xm.org/xsd")
public class UpdateAllOutstandingtxnlistFault extends Exception {
    
    private org.xm.services.xsd.UpdateAllOutstandingtxnlistFault updateAllOutstandingtxnlistFault;

    public UpdateAllOutstandingtxnlistFault() {
        super();
    }
    
    public UpdateAllOutstandingtxnlistFault(String message) {
        super(message);
    }
    
    public UpdateAllOutstandingtxnlistFault(String message, Throwable cause) {
        super(message, cause);
    }

    public UpdateAllOutstandingtxnlistFault(String message, org.xm.services.xsd.UpdateAllOutstandingtxnlistFault updateAllOutstandingtxnlistFault) {
        super(message);
        this.updateAllOutstandingtxnlistFault = updateAllOutstandingtxnlistFault;
    }

    public UpdateAllOutstandingtxnlistFault(String message, org.xm.services.xsd.UpdateAllOutstandingtxnlistFault updateAllOutstandingtxnlistFault, Throwable cause) {
        super(message, cause);
        this.updateAllOutstandingtxnlistFault = updateAllOutstandingtxnlistFault;
    }

    public org.xm.services.xsd.UpdateAllOutstandingtxnlistFault getFaultInfo() {
        return this.updateAllOutstandingtxnlistFault;
    }
}
