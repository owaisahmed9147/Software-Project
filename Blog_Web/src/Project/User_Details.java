package Project;

public class User_Details {
	public int userid;
	public String username;
	public String password;
	
	public User_Details() {
		
	}
	public User_Details(int userid,String username ,String password) {
		this.userid=userid;
		this.username=username;
		this.password=password;
	}
	
	public String toString() {
        return "ID: " + userid + " Username: " + username + "Password: " + password;
    }
}