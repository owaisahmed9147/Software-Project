package Project;

public class Add_EditorProxy implements Project.Add_Editor {
  private String _endpoint = null;
  private Project.Add_Editor add_Editor = null;
  
  public Add_EditorProxy() {
    _initAdd_EditorProxy();
  }
  
  public Add_EditorProxy(String endpoint) {
    _endpoint = endpoint;
    _initAdd_EditorProxy();
  }
  
  private void _initAdd_EditorProxy() {
    try {
      add_Editor = (new Project.Add_EditorServiceLocator()).getAdd_Editor();
      if (add_Editor != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)add_Editor)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)add_Editor)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (add_Editor != null)
      ((javax.xml.rpc.Stub)add_Editor)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Project.Add_Editor getAdd_Editor() {
    if (add_Editor == null)
      _initAdd_EditorProxy();
    return add_Editor;
  }
  
  public java.lang.String getInfoForAdding(java.lang.String password, java.lang.String type) throws java.rmi.RemoteException{
    if (add_Editor == null)
      _initAdd_EditorProxy();
    return add_Editor.getInfoForAdding(password, type);
  }
  
  
}