package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mydatabase", "root", "root");
		
		PreparedStatement statement = conn.prepareStatement();
		
		String query = "select 8 from student01";
		
		ResultSet rs = 
	}

}
