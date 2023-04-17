package com.controller;

import java.util.*;

import com.entity.Employee;
import com.service.Service_Implementation;

public class EmpManageSys {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		do {
			System.out.println(
					"1. All Employee Details\n"
					+ "2. Employee Details (id)\n"
					+ "3. Insert Empl Details\n"
					+ "4. Delete Empl (id)\n"
					+ "5. Print Emp and Dept Details (id)\n"
					+ "6. Update Dept Details (deptId)\n");
			int optn = sc.nextInt();
			Employee emp = null;
			int id;
			
			switch(optn) {
				case 1:
					List<Employee> el = new Service_Implementation().getEmployees();
					for(Employee e:el) {
						System.out.println(e.toString());
					}
					break;
					
				case 2:
					System.out.println("Enter employee id");
					id = sc.nextInt();
					emp = new Service_Implementation().getEmployee(id);
					System.out.println(emp.toString());
					break;
				
				case 3:
					System.out.println("Enter Employee Details ename, eadd, eloc, deptid");
					emp = new Employee(sc.next(), sc.next(), sc.next(), sc.nextInt());
					new Service_Implementation().insertEmployee(emp);
					break;
					
				case 4:
					System.out.println("Enter Employee id to delete");
					id = sc.nextInt();
					new Service_Implementation().deleteEmployee(id);
					break;
				
				case 5:
					break;
					
				case 6:
					System.out.println("Enter Department id, deptname to update");
					id = sc.nextInt();
					String deptname = sc.next();
					new Service_Implementation().updateDeptDetails(id, deptname);
					break;
					
			}
			
			System.out.print("Continue? Y/N");
			choice = sc.next();
		} while(choice.equalsIgnoreCase("y"));
		
	}

}
