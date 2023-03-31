package day13_GA;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails {
	
	private List<Employee> employeeList = new ArrayList<>();

	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	public List<Employee> readEmployeeDetails(String fileName) throws FileReadException{
		

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String row;
			while((row = br.readLine()) != null){
				Employee e = createEmployee(row);
				employeeList.add(e);
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			throw new FileReadException("File not found");
		} catch (IOException e){
			throw new FileReadException("IO exception");
		}
		
		return employeeList;		
	}

	private Employee createEmployee(String row) {
		String[] str = row.split(";");
		int id = Integer.parseInt(str[0]);
		String name = str[1];
		String designation = str[2];
		double salary = Double.parseDouble(str[3]);
		Employee e=new Employee(id, name, designation, salary);
		return e;
	}
}
