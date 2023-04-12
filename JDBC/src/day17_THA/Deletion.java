package day17_THA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Deletion {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/futurefit", "root", "root");

		String choice;

		do {
			PreparedStatement ps = conn.prepareStatement("DELETE FROM student02 WHERE id = ?");
			System.out.println("Enter id to delete record:");
			ps.setInt(1, sc.nextInt());
			int result = ps.executeUpdate();
			if (result > 0) {
				System.out.println("Record deleted successfully !!!!!!");
			} else {
				System.out.println("No records found");
			}
			System.out.println("Do you want to delete another record? (Yes/No): ");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Yes"));
		conn.close();
		sc.close();	

	}

}
