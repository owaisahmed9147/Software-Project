package main;

import java.sql.*;

public class Blog {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","");
			Statement stmt=con.createStatement();
			
			con.close();
		} catch(Exception e){
				System.out.println(e);
		}
	}

}
