package project;
import java.sql.*;

public class Add_Editor {
	
	public String getInfoForAdding(String password , String type ) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","");
			Statement stmt=con.createStatement();
			
			 int x = stmt.executeUpdate("insert into editor_table(editor_password , editor_type) values('"+password+"' , '"+type+"')");

			 if(x > 0) {
				 System.out.println("Query executed successfully");
			 }
			 else {
				 System.out.println("Query not executed");
			 }
			con.close();
			} catch(Exception e)
			{
			System.out.println(e);
			}
		
		return "";
	}

}
