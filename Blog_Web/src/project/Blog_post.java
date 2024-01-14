package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Blog_post {
 public String blog_posting(int ID ,String title,String content)
 {

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("Insert into blog_post(author_id,title,content) values('"+ID+"','"+title+"','"+content+"')");

			
			
			
			con.close();
		} catch(Exception e){
			System.out.println(e);
		}
	 
	   
 return "";
}
}
