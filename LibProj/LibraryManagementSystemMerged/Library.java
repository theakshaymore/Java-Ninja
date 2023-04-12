package LibraryManagementSystemMerged;

import java.util.Scanner;

import LibraryManagementSystemMerged.Book;
import LibraryManagementSystemMerged.Books;
import LibraryManagementSystemMerged.Student;
import LibraryManagementSystemMerged.Students;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		 
        // Displaying menu
        System.out.println(
            "********************Welcome to the Library Management System!********************");
        System.out.println(
            "                  Select From The Following Options:               ");
        System.out.println(
            "**********************************************************************");
 
        
        //check student or Staff
        System.out.println("Please seect any one: 1)Student  2)Admin");
        int n = input.nextInt();
        switch(n){
         		case 1:
         			//check student
         			System.out.println("You have logged in as Student");
     				
    				 Books ob = new Books();
    		        // Creating object of students class
    		        Students obStudent = new Students();
    		 
    		        int choice;
    		        int searchChoice;
    		 
    		        // Creating menu
    		        // using do-while loop
    		        do {
    		 
    		            obStudent.dispMenu();
    		            choice = input.nextInt();
    		 
    		            // Switch case
    		            switch (choice) {
    		 
    		                // Case
    		            case 1:
    		            	obStudent.checkOutBook(ob);
    		                break;
    		               
    		 
    		                // Case
    		            case 2:
    		            	 obStudent.checkInBook(ob);
    		            	break;
    		            	
    		            	
    		            default:
    		         		 
     		                // Print statement
     		                System.out.println("ENTER BETWEEN 1 TO 2");
     		            }
     		          
     			}
     		   while (choice != 0);
    		      
    		            
        	 
         		case 2:
         			//check admin
         			//harcodede pass
         			String origPass ="abc#123";
         			String userName = "admin";
         			System.out.println("Enter Username");
         			String userNameIn= input.next();
         			System.out.println("Enter Password");
         			String pass = input.next();
         			if(origPass.equals(pass) && userName.equals(userNameIn) ){
         				System.out.println("You have logged in as Admin");
         				
         				 Books ob1 = new Books();
         		        // Creating object of students class
         		        Students obStudent1 = new Students();
         		 
         		        int choice1;
         		        int searchChoice1;
         		 
         		        // Creating menu
         		        // using do-while loop
         		        do {
         		 
         		            ob1.dispMenu();
         		            choice1 = input.nextInt();
         		 
         		            // Switch case
         		            switch (choice1) {
         		 
         		                // Case
         		            case 1:
         		                Book b = new Book();
         		                ob1.addBook(b);
         		                break;
         		 
         		                // Case
         		            case 2:
         		                ob1.updateBookQty();
         		                break;
         		 
         		            // Case
         		            case 3:
         		 
         		                System.out.println(
         		                    " press 1 to Search with Book Serial No.");
         		                System.out.println(
         		                    " Press 2 to Search with Book's Author Name.");
         		                searchChoice1 = input.nextInt();
         		 
         		                // Nested switch
         		                switch (searchChoice1) {
         		 
         		                    // Case
         		                case 1:
         		                    ob1.searchBySno();
         		                    break;
         		 
         		                    // Case
         		                case 2:
         		                    ob1.searchByAuthorName();
         		                }
         		                break;
         		 
         		                // Case
         		            case 4:
         		                ob1.showAllBooks();
         		                break;
         		 
         		                // Case
         		            case 5:
         		                Student s = new Student();
         		                obStudent1.addStudent(s);
         		                break;
         		 
         		                // Case
         		            case 6:
         		                obStudent1.showAllStudents();
         		                break;
         		                
         		            case 7:
         		            	obStudent1.checkLateFee();
         		            	break;
         		            	
         		            case 8:
         		            	ob1.updateBookDetails();
         		            	break;
         		            	
         		 
         		            default:
         		 
         		                // Print statement
         		                System.out.println("ENTER BETWEEN 0 TO 8.");
         		            }
         		          
         			}
         		       while (choice1 != 0);
         			}
         			else{
         				System.out.println("Wrong password!!");
         				break;
         			}
         			
        }
        
       
     
	}

}
