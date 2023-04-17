package com.persistance;

import java.sql.*;

public class GlobalConfiguration {
	
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection conn=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/empdb","root","root");
	    return conn;
	}
}
