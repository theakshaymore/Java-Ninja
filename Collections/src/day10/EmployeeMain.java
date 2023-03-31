package day10;

import java.util.Collection;
import java.util.Iterator;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee ae = new Employee(101, "Akshay");
		Employee ae2 = new Employee(104, "Rohit");
		Employee ae3 = new Employee(102, "Sai");
		Employee ae4 = new Employee(111, "latha");
		
		Iterator<Employee> e=ae.Iterator<Employee>();
		while(e.hasNext())
		 {
			 Employee e1=e.next();
			 System.out.println(e1);
		 }
		 Collection.sort(ae);
		 System.out.println("....................");
	    
		}

	}


