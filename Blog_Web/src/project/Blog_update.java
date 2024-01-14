package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Statement;

public class blog_update {

    public String blog_updating(int ID, String newTitle, String newContent) {
        try {
        	Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","");
			Statement stmt=con.createStatement();

            ResultSet resultSet = stmt.executeQuery("SELECT COUNT(*) FROM blog_post WHERE post_id = '" + ID + "'");
            resultSet.next(); 
            int existingCount = resultSet.getInt(1);

            if (existingCount > 0) {
                
                stmt.executeUpdate("UPDATE blog_post SET title = '" + newTitle + "', content = '" + newContent + "' WHERE post_id = '" + ID + "'");
                System.out.println("Blog post updated successfully.");
            } else {
                System.out.println("Blog post not found for ID: " + ID);
            }

            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return "";
    }
}