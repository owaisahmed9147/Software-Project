/**
 * Blog_postServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package project;

public class Blog_postServiceLocator extends org.apache.axis.client.Service implements project.Blog_postService {

    public Blog_postServiceLocator() {
    }


    public Blog_postServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Blog_postServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Blog_post
    private java.lang.String Blog_post_address = "http://localhost:8080/Blog_Web/services/Blog_post";

    public java.lang.String getBlog_postAddress() {
        return Blog_post_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Blog_postWSDDServiceName = "Blog_post";

    public java.lang.String getBlog_postWSDDServiceName() {
        return Blog_postWSDDServiceName;
    }

    public void setBlog_postWSDDServiceName(java.lang.String name) {
        Blog_postWSDDServiceName = name;
    }

    public project.Blog_post getBlog_post() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Blog_post_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBlog_post(endpoint);
    }

    public project.Blog_post getBlog_post(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            project.Blog_postSoapBindingStub _stub = new project.Blog_postSoapBindingStub(portAddress, this);
            _stub.setPortName(getBlog_postWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBlog_postEndpointAddress(java.lang.String address) {
        Blog_post_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (project.Blog_post.class.isAssignableFrom(serviceEndpointInterface)) {
                project.Blog_postSoapBindingStub _stub = new project.Blog_postSoapBindingStub(new java.net.URL(Blog_post_address), this);
                _stub.setPortName(getBlog_postWSDDServiceName());
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
        if ("Blog_post".equals(inputPortName)) {
            return getBlog_post();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://project", "Blog_postService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://project", "Blog_post"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Blog_post".equals(portName)) {
            setBlog_postEndpointAddress(address);
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
