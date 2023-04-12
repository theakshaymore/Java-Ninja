package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/futurefit", "root", "root");

		Statement statement = conn.createStatement();
		String query = "create table if not exists hospital(id int, name varchar(20), location varchar(20))";
		int result = statement.executeUpdate(query); 
		if(result == 0){
			System.out.println("Already exist");
			
		}else{
			System.out.println("Created Succesfully");
		}
		
		
		PreparedStatement Prestatement = conn.prepareStatement("insert into hospital values(?, ?, ?)");
		System.out.println("Enter id, name, location");
		Prestatement.setInt(1, sc.nextInt());
		Prestatement.setString(2, sc.next());
		Prestatement.setString(3, sc.next());

		int rs2 = Prestatement.executeUpdate();
		if(rs2 > 0){
			System.out.println("Data added succesfully");
			Prestatement = conn.prepareStatement("Select * from hospital");
			ResultSet rs = Prestatement.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
		}else{
			System.out.println("Error adding Data");
		}

		conn.close();
	}

}
