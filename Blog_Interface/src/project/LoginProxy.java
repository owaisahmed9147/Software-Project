package project;

public class LoginProxy implements project.Login {
  private String _endpoint = null;
  private project.Login login = null;
  
  public LoginProxy() {
    _initLoginProxy();
  }
  
  public LoginProxy(String endpoint) {
    _endpoint = endpoint;
    _initLoginProxy();
  }
  
  private void _initLoginProxy() {
    try {
      login = (new project.LoginServiceLocator()).getLogin();
      if (login != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)login)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)login)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (login != null)
      ((javax.xml.rpc.Stub)login)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public project.Login getLogin() {
    if (login == null)
      _initLoginProxy();
    return login;
  }
  
  public project.User_Details login_details(java.lang.String email, java.lang.String pass) throws java.rmi.RemoteException{
    if (login == null)
      _initLoginProxy();
    return login.login_details(email, pass);
  }
  
  
}