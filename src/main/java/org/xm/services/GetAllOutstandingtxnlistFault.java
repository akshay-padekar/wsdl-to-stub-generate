
package org.xm.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.4
 * 2018-07-19T19:26:59.371+05:30
 * Generated source version: 3.1.4
 */

@WebFault(name = "getAllOutstandingtxnlistFault", targetNamespace = "http://services.xm.org/xsd")
public class GetAllOutstandingtxnlistFault extends Exception {
    
    private org.xm.services.xsd.GetAllOutstandingtxnlistFault getAllOutstandingtxnlistFault;

    public GetAllOutstandingtxnlistFault() {
        super();
    }
    
    public GetAllOutstandingtxnlistFault(String message) {
        super(message);
    }
    
    public GetAllOutstandingtxnlistFault(String message, Throwable cause) {
        super(message, cause);
    }

    public GetAllOutstandingtxnlistFault(String message, org.xm.services.xsd.GetAllOutstandingtxnlistFault getAllOutstandingtxnlistFault) {
        super(message);
        this.getAllOutstandingtxnlistFault = getAllOutstandingtxnlistFault;
    }

    public GetAllOutstandingtxnlistFault(String message, org.xm.services.xsd.GetAllOutstandingtxnlistFault getAllOutstandingtxnlistFault, Throwable cause) {
        super(message, cause);
        this.getAllOutstandingtxnlistFault = getAllOutstandingtxnlistFault;
    }

    public org.xm.services.xsd.GetAllOutstandingtxnlistFault getFaultInfo() {
        return this.getAllOutstandingtxnlistFault;
    }
}