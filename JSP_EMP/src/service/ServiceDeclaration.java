package service;

import java.sql.SQLException;
import java.util.List;

import entity.Employee;


public interface ServiceDeclaration {
	
	public List<Employee> displayAll() throws ClassNotFoundException, SQLException;
	
	public int updateEmp(Employee emp) throws ClassNotFoundException, SQLException;
}
