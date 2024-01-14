package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login_Author {
	public User_Details loginauthor(String Username,String password) {
		User_Details user = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select author_id,author_username,author_password from author_info where author_username='"+Username+"' and author_password='"+password+"'");
			
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
