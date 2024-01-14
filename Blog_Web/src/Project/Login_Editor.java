package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login_Editor {
	public User_Details logineditor(String Username,String password) {
		User_Details user = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select editor_id,username,editor_password from editor_table where username='"+Username+"' and editor_password='"+password+"'");
			
			if(rs.next()){
				int userid = rs.getInt(1);
				String username = rs.getString(2);
				String Password= rs.getString(3);
				user = new User_Details(userid,username,Password);
				System.out.println(user);
			}
			else {
                System.out.println("No user found with the provided Username and Password.");
            }
			con.close();
		} catch(Exception e){
			System.out.println(e);
		}
		return user;
	}
}
