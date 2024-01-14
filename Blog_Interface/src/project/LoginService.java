/**
 * LoginService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package project;

public interface LoginService extends javax.xml.rpc.Service {
    public java.lang.String getLoginAddress();

    public project.Login getLogin() throws javax.xml.rpc.ServiceException;

    public project.Login getLogin(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
