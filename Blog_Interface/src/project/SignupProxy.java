package project;

public class SignupProxy implements project.Signup {
  private String _endpoint = null;
  private project.Signup signup = null;
  
  public SignupProxy() {
    _initSignupProxy();
  }
  
  public SignupProxy(String endpoint) {
    _endpoint = endpoint;
    _initSignupProxy();
  }
  
  private void _initSignupProxy() {
    try {
      signup = (new project.SignupServiceLocator()).getSignup();
      if (signup != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)signup)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)signup)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (signup != null)
      ((javax.xml.rpc.Stub)signup)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public project.Signup getSignup() {
    if (signup == null)
      _initSignupProxy();
    return signup;
  }
  
  public java.lang.String get_info_for_signup(java.lang.String name, java.lang.String email, java.lang.String password) throws java.rmi.RemoteException{
    if (signup == null)
      _initSignupProxy();
    return signup.get_info_for_signup(name, email, password);
  }
  
  
}