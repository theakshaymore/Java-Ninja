package LibraryManagementSystemMerged;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Displaying menu
		System.out.println(
				"**********************************************************************");
		System.out.println(
				"                  Select From The Following Options:               ");
		System.out.println(
				"**********************************************************************");

		// Creating object of book class
		Books ob = new Books();
		// Creating object of students class
		Students obStudent = new Students();

		int choice;
		int searchChoice;
		String password;

		// Prompt for user role (admin or student)
		System.out.println("Enter User Role: ");
		System.out.println("1) Admin");
		System.out.println("2) Student");
		int userRole = sc.nextInt();

		// Checking user role
		if (userRole == 1) {
			// Prompt for password
			System.out.println("Enter Password: ");
			password = sc.next();

			// Checking password
			if (password.equals("abc@123")) {
				System.out.println("Access Granted!");
			} else {
				System.out.println("Access Denied! Incorrect Password.");
				return;
			}
		}

		// using do-while loop
		do {

			ob.dispMenu();
			choice = sc.nextInt();

			// Switch case
			switch (choice) {

			// Case
			case 1:
				if (userRole == 1) {
					Book b = new Book();
					ob.addBook(b);
				} else {
					System.out.println("Access Denied! Only Admin can perform this operation.");
				}
				break;

			// Case
			case 2:
				if (userRole == 1) {
					ob.updateBookQty();
				} else {
					System.out.println("Access Denied! Only Admin can perform this operation.");
				}
				break;

			// Case
			case 3:

				System.out.println("Press 1 to Search with Book Serial No.");
				System.out.println("Press 2 to Search with Book's Author Name.");
				searchChoice = sc.nextInt();

				// Nested switch
				switch (searchChoice) {

				// Case
				case 1:
					ob.searchBySno();
					break;

				// Case
				case 2:
					ob.searchByAuthorName();
				}
				break;

			// Case
			case 4:
				ob.showAllBooks();
				break;

			// Case
			case 5:
				if (userRole == 1) {
					Student s = new Student();
					obStudent.addStudent(s);
				} else {
					System.out.println("Access Denied! Only Admin can perform this operation.");
				}
				break;

			// Case
			case 6:
				if (userRole == 1) {
					obStudent.showAllStudents();
				} else {
					System.out.println("Access Denied! Only Admin can perform this operation.");
				}
				break;

			// Case
			case 7:
				if (userRole == 2) {
					obStudent.checkOutBook(ob);
				} else {
					System.out.println("Access Denied! Only Students can perform this operation.");
				}
				break;

			case 8:
			    // Check if user is student
			    if (userRole==2) {
			        obStudent.checkInBook(ob);
			    } else {
			        System.out.println("You do not have permission to perform this operation.");
			        }
			    break;
			case 9:
				obStudent.checkLateFee();
				break;
	            	
	        case 10:
	        	ob.updateBookDetails();
	            break;
	        case 11:
	        	if(userRole==1) {
	        		userRole=2;
	        	}
	        	else if(userRole==2) {
	        		System.out.println("Enter Password: ");
	    			password = sc.next();

	    			// Checking password
	    			if (password.equals("abc@123")) {
	    				System.out.println("Access Granted!");
	    			} else {
	    				System.out.println("Access Denied! Incorrect Password.");
	    				return;
	    			}
	        	}
	        	break;
	        default:
            	System.out.println("ENTER BETWEEN 0 TO 8.");
            	}
		}
	while (choice != 0);
	}
}