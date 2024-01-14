package Project;

import java.sql.*;

public class Main {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from editor_table");

			while(rs.next()){
				System.out.println("ID: " + rs.getInt(1) + " Password: " + rs.getString(2) + " type: "
				+ rs.getString(3));
			}
			con.close();
		} catch(Exception e){
			System.out.println(e);
		}
	}

}
