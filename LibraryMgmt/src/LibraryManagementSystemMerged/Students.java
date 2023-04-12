package LibraryManagementSystemMerged;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import LibraryManagementSystemMerged.Student;


public class Students {

	Scanner input = new Scanner(System.in);
    Student theStudents[] = new Student[50];
 
    public static int count = 0;
 
    
    //Method 1 -->add student
    public void addStudent(Student s)
    {
        for (int i = 0; i < count; i++) {
 
            if (s.regNum.equalsIgnoreCase(
                    theStudents[i].regNum)) {
 
                // Print statement
                System.out.println(
                    "Student of Reg Num " + s.regNum
                    + " is Already Registered.");
 
                return;
            }
        }
 
        if (count <= 50) {
            theStudents[count] = s;
            count++;
        }
    }
    
    //Method1 over
    
    //Method2 -->show all students
    public void showAllStudents()
    {
        System.out.println("Student Name\t\tReg Number");
        for (int i = 0; i < count; i++) {
 
            System.out.println(theStudents[i].studentName
                               + "\t\t"
                               + theStudents[i].regNum);
        }
    }
 
    
    
    //Method3 -->check student
    
    public int isStudent()
    {
        // Display message only
        System.out.println("Enter Reg Number:");
 
        String regNum = input.nextLine();
 
        for (int i = 0; i < count; i++) {
 
            if (theStudents[i].regNum.equalsIgnoreCase(
                    regNum)) {
                return i;
            }
        }
 
        // Print statements
        System.out.println("Student is not Registered.");
        System.out.println("Get Registered First.");
 
        return -1;
    }
 
    
    
    //Method4 -->borrow or checkout\
    public void checkOutBook(Books book)
    {
        int studentIndex = this.isStudent();
 
        if (studentIndex != -1) {
            System.out.println("checking out");
 
            book.showAllBooks();
            Book b = book.checkOutBook();
 
            System.out.println("checking out");
            if (b != null) {
 
                if (theStudents[studentIndex].booksCount
                    <= 3) {
                	
                 	
	                //Fee logic
	                	Date currentDate = new Date();
	                    Calendar c = Calendar.getInstance();
	                    c.setTime(currentDate);
	                    c.add(Calendar.DATE, 7); // Set due date to 7 days after current date
	                    //c.add(Caledar.TIME, amount);
	                    Date dueDate = c.getTime();
	                    book.setDueDate(dueDate, b.sNo);
	                	
	               //fee logic over
	 
	                    
	                    //check fee before giving book
	                    Student s = theStudents[studentIndex];
	                    if(s.getLateFee()>0.0){
	                    	System.out.println("Please pay late fee of "+"Rs."+s.getLateFee()+" on Counter to borrow books");
	                    	return;
	                    }
	                    
	                    //
 
                    System.out.println("adding book");
                    theStudents[studentIndex].borrowedBooks
                        [theStudents[studentIndex]
                             .booksCount]
                        = b;
                    theStudents[studentIndex].booksCount++;
 
                    return;
                }
                else {
 
                    System.out.println(
                        "Student Can not Borrow more than 3 Books.");
                    return;
                }
            }
            System.out.println("Book is not Available.");
        }
    }
    
    
    
    //Mehthod5 --> return or checkin
    
    public void checkInBook(Books book)
    {
        int studentIndex = this.isStudent();
        if (studentIndex != -1) {
 
            // Printing credentials corresponding to student
            System.out.println(
                "S.No\t\t\tBook Name\t\t\tAuthor Name");
 
            Student s = theStudents[studentIndex];
 
            for (int i = 0; i < s.booksCount; i++) {
 
                System.out.println(
                    s.borrowedBooks[i].sNo + "\t\t\t"
                    + s.borrowedBooks[i].bookName + "\t\t\t"
                    + s.borrowedBooks[i].authorName);
            }
 
            // Display message only
            System.out.println(
                "Enter Serial Number of Book to be Checked In:");
 
            int sNo = input.nextInt();
 
            for (int i = 0; i < s.booksCount; i++) {
                if (sNo == s.borrowedBooks[i].sNo) {
                	
                	
                	//late fee check
    	            Date currentDate = new Date();
    	            //Date dueDate = book.getDueDate(sNo);
    	            
    	            //
    	            Calendar c = Calendar.getInstance();
    	            c.add(Calendar.DATE, -1); // Subtract one day from the current date
    	            Date yesterday = c.getTime();
    	            
    	            // hracodede it
    	            long daysLate = (currentDate.getTime() - yesterday.getTime()) / (24 * 60 * 60 * 1000);
    	            if (daysLate > 0) {
    	                //borrower.setLateFee(daysLate * 0.5); // Example late fee of 50 cents per day late
    	            	
    	            	s.setLateFee(daysLate * 0.5);
    	            }
    	            
    	            
    	            //
                    book.checkInBook(s.borrowedBooks[i]);
                    s.borrowedBooks[i] = null;
 
                    return;
                }
            }
 
            System.out.println("Book of Serial No " + sNo
                               + "not Found");
        }
    }
    
    
    
    public void dispMenu()
    {
 
        // Displaying menu
        System.out.println(
            "----------------------------------------------------------------------------------------------------------");
        	System.out.println("Press 1 to Check Out Book. ");
        	System.out.println("Press 2 to Check In Book");
        System.out.println(
            "-------------------------------------------------------------------------------------------------------");
    }
    
    public void checkLateFee(){
   	 int studentIndex = this.isStudent();
   	 
        if (studentIndex != -1) {
            System.out.println("checking out");
            
            Student s = theStudents[studentIndex];
            if(s.getLateFee()>0){
           	 System.out.println("Please pay late fee of "+"Rs."+s.getLateFee()+" on Counter to borrow books");
            }
            else{
           	 System.out.println("No pending late fees");
            }
        
   }
}

}