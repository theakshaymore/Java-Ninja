package day17_THA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DisplayRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/futurefit", "root", "root");

		String choice;

		do {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM student02 WHERE id = ?");
			System.out.println("Enter id to get details:");
			ps.setInt(1, sc.nextInt());
			ResultSet result = ps.executeQuery();
			if (result.next()) {
				System.out.println("Id: " + result.getInt(1)
				+ "\nName: " + result.getString(2)
				+ "\nBalance: " + result.getInt(3)
				+ "\nMobile: " + result.getInt(4));
			} else {
				System.out.println("No records found");
			}
			System.out.println("Do you want to get another record? (Yes/No): ");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Yes"));
		conn.close();
		sc.close();	


	}

}
