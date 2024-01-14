/**
 * Add_EditorServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Project;

public class Add_EditorServiceLocator extends org.apache.axis.client.Service implements Project.Add_EditorService {

    public Add_EditorServiceLocator() {
    }


    public Add_EditorServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Add_EditorServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Add_Editor
    private java.lang.String Add_Editor_address = "http://localhost:8080/Blog_Web/services/Add_Editor";

    public java.lang.String getAdd_EditorAddress() {
        return Add_Editor_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Add_EditorWSDDServiceName = "Add_Editor";

    public java.lang.String getAdd_EditorWSDDServiceName() {
        return Add_EditorWSDDServiceName;
    }

    public void setAdd_EditorWSDDServiceName(java.lang.String name) {
        Add_EditorWSDDServiceName = name;
    }

    public Project.Add_Editor getAdd_Editor() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Add_Editor_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAdd_Editor(endpoint);
    }

    public Project.Add_Editor getAdd_Editor(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Project.Add_EditorSoapBindingStub _stub = new Project.Add_EditorSoapBindingStub(portAddress, this);
            _stub.setPortName(getAdd_EditorWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAdd_EditorEndpointAddress(java.lang.String address) {
        Add_Editor_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Project.Add_Editor.class.isAssignableFrom(serviceEndpointInterface)) {
                Project.Add_EditorSoapBindingStub _stub = new Project.Add_EditorSoapBindingStub(new java.net.URL(Add_Editor_address), this);
                _stub.setPortName(getAdd_EditorWSDDServiceName());
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
        if ("Add_Editor".equals(inputPortName)) {
            return getAdd_Editor();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Project", "Add_EditorService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Project", "Add_Editor"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Add_Editor".equals(portName)) {
            setAdd_EditorEndpointAddress(address);
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
