package day13;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) throws IOException 
	{
		List<Student> studentlist=new ArrayList<Student>();
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\AKSHAY\\Desktop\\Book1.csv"));
	    String row=br.readLine();
	    while(row!=null)
	    {
	    	Student s=createStudent(row);
	    	studentlist.add(s);
	    	row=br.readLine();
	    }
	    Iterator<Student> it=studentlist.iterator();
	    while(it.hasNext()){
	    	Student s=it.next();
	    	System.out.println(s);
	    }
	    System.out.println("Student belongs to Mumbai: ");
	    for (Student s : studentlist) {
	        if(s.getLocation().equals("Mumbai")) {
	            System.out.println(s);
	        }
	    }
	    System.out.println("Student belongs to Pune: ");
	    for (Student s : studentlist) {
	        if(s.getLocation().equals("Pune")) {
	            System.out.println(s);
	        }
	    }
	    

	}
	
	public static Student createStudent(String row){
		String[] str=row.split(",");
		int id=Integer.parseInt(str[0]);
		String name=str[1];
		String address=str[2];
		Student s1=new Student(id,name,address);
		return s1;
	}

}
