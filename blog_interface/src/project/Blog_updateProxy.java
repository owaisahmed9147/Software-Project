package project;

public class Blog_updateProxy implements project.Blog_update {
  private String _endpoint = null;
  private project.Blog_update blog_update = null;
  
  public Blog_updateProxy() {
    _initBlog_updateProxy();
  }
  
  public Blog_updateProxy(String endpoint) {
    _endpoint = endpoint;
    _initBlog_updateProxy();
  }
  
  private void _initBlog_updateProxy() {
    try {
      blog_update = (new project.Blog_updateServiceLocator()).getBlog_update();
      if (blog_update != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)blog_update)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)blog_update)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (blog_update != null)
      ((javax.xml.rpc.Stub)blog_update)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public project.Blog_update getBlog_update() {
    if (blog_update == null)
      _initBlog_updateProxy();
    return blog_update;
  }
  
  public java.lang.String blog_updating(int ID, java.lang.String newTitle, java.lang.String newContent) throws java.rmi.RemoteException{
    if (blog_update == null)
      _initBlog_updateProxy();
    return blog_update.blog_updating(ID, newTitle, newContent);
  }
  
  
}