package day17_GA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/futurefit", "root", "root");

		String choice;

		do {
			PreparedStatement ps = conn.prepareStatement("update student02 set amount = amount + ? where id = ?");
			System.out.println("Enter id and amount:");
			ps.setInt(2, sc.nextInt());
			ps.setInt(1, sc.nextInt());
			int result = ps.executeUpdate();
			if (result > 0) {
				System.out.println("Amount updated successfully !!!!!!");
			} else {
				System.out.println("No records found");
			}
			System.out.println("Do you want to update another record? (Yes/No): ");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Yes"));
		conn.close();
		sc.close();
	}

}
