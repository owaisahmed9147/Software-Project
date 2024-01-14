package project;

public class ShowsblogsProxy implements project.Showsblogs {
  private String _endpoint = null;
  private project.Showsblogs showsblogs = null;
  
  public ShowsblogsProxy() {
    _initShowsblogsProxy();
  }
  
  public ShowsblogsProxy(String endpoint) {
    _endpoint = endpoint;
    _initShowsblogsProxy();
  }
  
  private void _initShowsblogsProxy() {
    try {
      showsblogs = (new project.ShowsblogsServiceLocator()).getShowsblogs();
      if (showsblogs != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)showsblogs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)showsblogs)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (showsblogs != null)
      ((javax.xml.rpc.Stub)showsblogs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public project.Showsblogs getShowsblogs() {
    if (showsblogs == null)
      _initShowsblogsProxy();
    return showsblogs;
  }
  
  public project.Blog[] show() throws java.rmi.RemoteException{
    if (showsblogs == null)
      _initShowsblogsProxy();
    return showsblogs.show();
  }
  
  
}