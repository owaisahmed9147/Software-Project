/**
 * Blog_postService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package project;

public interface Blog_postService extends javax.xml.rpc.Service {
    public java.lang.String getBlog_postAddress();

    public project.Blog_post getBlog_post() throws javax.xml.rpc.ServiceException;

    public project.Blog_post getBlog_post(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
