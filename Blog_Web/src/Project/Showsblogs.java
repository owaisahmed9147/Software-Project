package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Showsblogs {
	public Blog[] show() {
		Blog[] blogs = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","");
			Statement stmt=con.createStatement();
			ResultSet r=stmt.executeQuery("select count(*) from blog_post");
			r.next();
			int count = r.getInt(1);
			if(count>0) {
				ResultSet rs=stmt.executeQuery("select * from blog_post");
				
				int noofblogs;
				
				rs.last();
				noofblogs = rs.getRow();
				rs.beforeFirst();
				
				blogs = new Blog[noofblogs];
				
				int i=0;
				
				while(rs.next()) {
					int postid = rs.getInt(1);
					int authorid = rs.getInt(2);
					String title = rs.getString(3);
					String content = rs.getString(4);
					blogs[i] = new Blog(postid,authorid,title,content);
					System.out.println(blogs);
					
					i++;
				}
				
			}
			else {
				System.out.println("there are no blogs");
			}
			con.close();
		} catch(Exception e) {
			System.out.println(e);
		}
		return blogs;
	}
}
