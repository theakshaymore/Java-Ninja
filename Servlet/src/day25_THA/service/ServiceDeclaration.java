package service;

import java.sql.SQLException;
import java.util.List;

import entity.Employee;


public interface ServiceDeclaration {
	
	public List<Employee> searchEmp(String searchName) throws ClassNotFoundException, SQLException;
}
