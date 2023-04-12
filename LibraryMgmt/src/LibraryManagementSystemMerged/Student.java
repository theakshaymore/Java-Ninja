package LibraryManagementSystemMerged;

import java.util.Scanner;

import LibraryManagementSystemMerged.Book;

public class Student {
	String studentName;
    String regNum;
 
    Book borrowedBooks[] = new Book[3];
    public int booksCount = 0;
    private double lateFee =0.0;
 
    public double getLateFee() {
		return lateFee;
	}

	public void setLateFee(double lateFee) {
		this.lateFee = lateFee;
	}

	// Creating object of Scanner class to
    // take input from user
    Scanner input = new Scanner(System.in);
 
    // Constructor
    public Student()
    {
        // Print statement
        System.out.println("Enter Student Name:");
 
        // This keywords refers to current instance
        this.studentName = input.nextLine();
 
        // Print statement
        System.out.println("Enter Registration Number:");
        this.regNum = input.nextLine();
    }
}
