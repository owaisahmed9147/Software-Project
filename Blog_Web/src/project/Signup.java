package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Signup {
	public String get_info_for_signup(String name,String email,String password) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into user_table(Username,Email,password) values('"+name+"','"+email+"','"+password+"')");

			con.close();
		} catch(Exception e){
			System.out.println(e);
		}
		return "";
	}
}
