package oops_proj01;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "978-0132350884");
        Book book3 = new Book("Head First Design Patterns", "Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra", "978-0596007126");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        StudentRegistration registration = new StudentRegistration();
        
       
       
        Student student1 = new Student("John Doe", "1234");
        registration.registerStudent(student1);
        
       
        Student student2 = new Student("Jane Doe", "5678");
        registration.registerStudent(student2);
        
        Student student3 = new Student("Alice Smith", "9012");
        registration.registerStudent(student3);

        System.out.println("Registered students:");
        for (Student student : registration.getRegisteredStudents()) {
            System.out.println(student.getName() + " (ID: " + student.getId() + ")");
        }
    }
}
