/**
 * Login.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package project;

public interface Login extends java.rmi.Remote {
    public project.User_Details login_details(java.lang.String email, java.lang.String pass) throws java.rmi.RemoteException;
}
