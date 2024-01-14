/**
 * Blog_updateServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package project;

public class Blog_updateServiceLocator extends org.apache.axis.client.Service implements project.Blog_updateService {

    public Blog_updateServiceLocator() {
    }


    public Blog_updateServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Blog_updateServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Blog_update
    private java.lang.String Blog_update_address = "http://localhost:8080/Blog_Web/services/Blog_update";

    public java.lang.String getBlog_updateAddress() {
        return Blog_update_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Blog_updateWSDDServiceName = "Blog_update";

    public java.lang.String getBlog_updateWSDDServiceName() {
        return Blog_updateWSDDServiceName;
    }

    public void setBlog_updateWSDDServiceName(java.lang.String name) {
        Blog_updateWSDDServiceName = name;
    }

    public project.Blog_update getBlog_update() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Blog_update_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBlog_update(endpoint);
    }

    public project.Blog_update getBlog_update(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            project.Blog_updateSoapBindingStub _stub = new project.Blog_updateSoapBindingStub(portAddress, this);
            _stub.setPortName(getBlog_updateWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBlog_updateEndpointAddress(java.lang.String address) {
        Blog_update_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (project.Blog_update.class.isAssignableFrom(serviceEndpointInterface)) {
                project.Blog_updateSoapBindingStub _stub = new project.Blog_updateSoapBindingStub(new java.net.URL(Blog_update_address), this);
                _stub.setPortName(getBlog_updateWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Blog_update".equals(inputPortName)) {
            return getBlog_update();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://project", "Blog_updateService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://project", "Blog_update"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Blog_update".equals(portName)) {
            setBlog_updateEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
