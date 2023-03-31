package day13_GA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeTester {

	public static void main(String[] args) throws FileReadException {
    
    EmployeeDetails employeeDetails = new EmployeeDetails();
    
    try {
        List<Employee> employees = employeeDetails.readEmployeeDetails("C:\\Users\\AKSHAY\\Desktop\\Book1.csv");
        System.out.println("Employee List:");
        for (Employee employee : employees) {
        	System.out.println(employee);
		}
        
    } catch (FileReadException e) {
        System.out.println(e.getMessage());
    }
}
}
