package project;

public class Blog_postProxy implements project.Blog_post {
  private String _endpoint = null;
  private project.Blog_post blog_post = null;
  
  public Blog_postProxy() {
    _initBlog_postProxy();
  }
  
  public Blog_postProxy(String endpoint) {
    _endpoint = endpoint;
    _initBlog_postProxy();
  }
  
  private void _initBlog_postProxy() {
    try {
      blog_post = (new project.Blog_postServiceLocator()).getBlog_post();
      if (blog_post != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)blog_post)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)blog_post)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (blog_post != null)
      ((javax.xml.rpc.Stub)blog_post)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public project.Blog_post getBlog_post() {
    if (blog_post == null)
      _initBlog_postProxy();
    return blog_post;
  }
  
  public java.lang.String blog_posting(int ID, java.lang.String title, java.lang.String content) throws java.rmi.RemoteException{
    if (blog_post == null)
      _initBlog_postProxy();
    return blog_post.blog_posting(ID, title, content);
  }
  
  
}