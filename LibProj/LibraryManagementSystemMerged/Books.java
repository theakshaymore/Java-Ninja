package LibraryManagementSystemMerged;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import LibraryManagementSystemMerged.Book;

public class Books {

	Book theBooks[] = new Book[50];
    public static int count;
 
    Scanner sc = new Scanner(System.in);
    
    
 // Method 1
    //  To compare books
    	
    public int compareBookObjects(Book b1, Book b2)
    {
 
        // If book name matches
        if (b1.bookName.equalsIgnoreCase(b2.bookName)) {
 
            // Printing book exists
            System.out.println(
                "Book of this Name Already Exists.");
            return 0;
        }
 
        // if book serial matches
        if (b1.sNo == b2.sNo) {
 
            // Print book exists
            System.out.println(
                "Book of this Serial No Already Exists.");
 
            return 0;
        }
        return 1;
    }
    
    //
 
    // Method 2
    // To add book
    public void addBook(Book b){
    	for (int i = 0; i < count; i++) {
    		 
            if (this.compareBookObjects(b, this.theBooks[i])
                == 0)
                return;
        }
 
        if (count < 50) {
 
            theBooks[count] = b;
            count++;
        }
        else {
 
            System.out.println(
                "No Space to Add More Books.");
        }
    }
    //add book over
    
    
 
    // Method 3
    // To search book by serial number
    public void searchBySno() {
        try {
            System.out.println("\t\t\t\tSEARCH BY SERIAL NUMBER\n");
            int sNo;
            System.out.println("Enter Serial No of Book:");
            sNo = sc.nextInt();
            int flag = 0;
            System.out.println(
                "Serial No.\t\tName\t\tAuthor\t\tAvailable Quantity\t\tTotal Quantity");
            for (int i = 0; i < count; i++) {
                if (sNo == theBooks[i].sNo) {
                    System.out.println(
                        theBooks[i].sNo + "\t\t"
                        + theBooks[i].bookName + "\t\t"
                        + theBooks[i].authorName + "\t\t"
                        + theBooks[i].bookQtyCopy + "\t\t"
                        + theBooks[i].bookQty);
                    flag++;
                    return;
                }
            }
            if (flag == 0)
                System.out.println("No Book for Serial No "+ sNo + " Found.");
        } catch (InputMismatchException e) {
            System.err.println("Error: Invalid sc. Please enter a valid serial number.");
        } catch (NullPointerException e) {
            System.err.println("Error: Null pointer encountered. Please check the data.");
        } catch (Exception e) {
            System.err.println("An error occurred while searching by serial number: " + e.getMessage());
            e.printStackTrace();
            }
        }
    
    
    ///method3 end
 
    
    
    // Method 4
    // To search author by name
    public void searchByAuthorName() {
        try {
            System.out.println("\t\t\t\tSEARCH BY AUTHOR'S NAME");
            System.out.println("Enter Author Name:");
            String authorName = sc.nextLine();

            int flag = 0;

            System.out.println(
                "Serial No.\t\tName\t\tAuthor\t\tAvailable Quantity\t\tTotal Quantity");

            for (int i = 0; i < count; i++) {
                if (authorName.equalsIgnoreCase(
                        theBooks[i].authorName)) {

                	System.out.println(
                            theBooks[i].sNo + "\t\t"
                            + theBooks[i].bookName + "\t\t"
                            + theBooks[i].authorName + "\t\t"
                            + theBooks[i].bookQtyCopy + "\t\t"
                            + theBooks[i].bookQty);
                        flag++;
                }
            }
            if (flag == 0)
                System.out.println("No Books of " + authorName
                                   + " Found.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid sc. Please enter a valid author name.");
        } catch (Exception e) {
            System.out.println("An error occurred while searching by author's name: " + e.getMessage());
            e.printStackTrace();
            }
    }
    
    //method4  end
 
    
    
    // Method 5
    // To display all books
    public void showAllBooks() {
        System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
        System.out.println(
            "Serial No.\tName\tAuthor\tAvailable Quantity\tTotal Quantity");

        for (int i = 0; i < count; i++) {

        	System.out.println(
                    theBooks[i].sNo + "\t\t"
                    + theBooks[i].bookName + "\t\t"
                    + theBooks[i].authorName + "\t\t"
                    + theBooks[i].bookQtyCopy + "\t\t"
                    + theBooks[i].bookQty);
            }
        }
    //method5 end
 
    
    
    // Method 6
    // To edit the book
    public void updateBookQty()
    {

        System.out.println("\t\t\t\tUPDATEING THE  QUANTITY OF A BOOK\n");
        System.out.println("Enter serial number of Book name To Add The Quantity:");

        int bookId = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (bookId== theBooks[i].sNo) {
           	 
                System.out.println( "Enter No of Books to get Added:");
                
                int addQty = sc.nextInt();
                theBooks[i].bookQty += addQty;
                theBooks[i].bookQtyCopy += addQty;
                
                System.out.println("Books Quantity Updated Successfully!");
                return;
            }
        }
    }
    
    //method 6 end
 
    // Method 7
    // To create menu
    public void dispMenu()
    {
 
        // Displaying menu
        System.out.println(
            "----------------------------------------------------------------------------------------------------------");
        System.out.println("Press 1 to Add new Book.");
        System.out.println("Press 0 to Exit Application.");
        System.out.println(
            "Press 2 to Upgrade Quantity of a Book.");
        System.out.println("Press 3 to Search a Book.");
        System.out.println("Press 4 to Show All Books.");
        System.out.println("Press 5 to Register Student.");
        System.out.println(
            "Press 6 to Show All Registered Students.");
        
        System.out.println("Press 7 to Check Late Fee. ");
        System.out.println("Press 8 to Update Book Details");
        System.out.println(
            "-------------------------------------------------------------------------------------------------------");
    }
 
    // Method 8
    // To search the library
    public int isAvailable(int sNo)
    {
 
        for (int i = 0; i < count; i++) {
            if (sNo == theBooks[i].sNo) {
                if (theBooks[i].bookQtyCopy > 0) {
 
                    System.out.println(
                        "Book is Available.");
                    return i;
                }
                System.out.println("Book is Unavailable");
                return -1;
            }
        }
 
        System.out.println("No Book of Serial Number "
                           + " Available in Library.");
        return -1;
        }
   
    //method8 end
    
    
    
    
    // Method 9
    // To remove the book from the library
    public Book checkOutBook()
    {
 
        System.out.println(
            "Enter Serial No of Book to be Checked Out.");
        int sNo = sc.nextInt();
 
        int bookIndex = isAvailable(sNo);
 
        if (bookIndex != -1) {
            theBooks[bookIndex].bookQtyCopy--;
            return theBooks[bookIndex];
        }
        return null;
    }
    
    //method9 end
    
    
 
    // Method 10
    // To add the Book to the Library
    public void checkInBook(Book b)
    {
        for (int i = 0; i < count; i++) {
            if (b.equals(theBooks[i])) {
                theBooks[i].bookQtyCopy++;
                return;
            }
        }
    }
    
 

	public void setDueDate(Date dueDate, int sNo) {
		// TODO Auto-generated method stub
		int bookIndex = isAvailable(sNo);
		
		if (bookIndex != -1) {
            Book b =theBooks[bookIndex];
            b.setDueDate(dueDate);
           // return theBooks[bookIndex];
        }
		
	}
	
	
	//Rahul - Late Fee Code
	public Date getDueDate(int sNo) {
		// TODO Auto-generated method stub
		int bookIndex = isAvailable(sNo);
		
		if (bookIndex != -1) {
            Book b =theBooks[bookIndex];
            return b.getDueDate();
           // return theBooks[bookIndex];
        }
		return null;
		
	}
	//Late fee code end
	
	public void updateBookDetails() {
        System.out.println("\t\t\t\tUPDATE BOOK DETAILS\n");
        System.out.println("Enter Serial No of Book to be updated:");
        int sNo = sc.nextInt();
        boolean bookFound = false;

        for (int i = 0; i < count; i++) {
            if (sNo == theBooks[i].sNo) {
                bookFound = true;
                System.out.println("Enter New Book Name:");
                sc.nextLine();
                String newBookName = sc.nextLine();
                System.out.println("Enter New Author Name:");
                String newAuthorName = sc.nextLine();
                System.out.println("Enter New Quantity of Books:");
                int newBookQty = sc.nextInt();
                theBooks[i].bookName = newBookName;
                theBooks[i].authorName = newAuthorName;
                theBooks[i].bookQty = newBookQty;
                theBooks[i].bookQtyCopy = newBookQty;
                System.out.println("Book details updated successfully.");
                break;
            }
        }

        if (!bookFound) {
            System.out.println("Book with Serial No " + sNo + " not found.");
        }
    }
    
}
