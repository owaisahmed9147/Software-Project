package project;

public class User_Details {
	public int userid;
	public String username;
	public String email;
	public String password;
	
	public User_Details() {
		
	}
	public User_Details(int userid,String username, String email, String password) {
		this.userid=userid;
		this.username=username;
		this.email=email;
		this.password=password;
	}
	
	public String toString() {
        return "ID: " + userid + " Username: " + username + " Email: " + email + " Password: " + password;
    }
}
