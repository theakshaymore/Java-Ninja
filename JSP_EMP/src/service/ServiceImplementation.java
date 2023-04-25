package service;

import java.sql.SQLException;
import java.util.List;

import entity.Employee;
import persistance.PersistanceImplementation;


public class ServiceImplementation implements ServiceDeclaration {


	@Override
	public List<Employee> displayAll() throws ClassNotFoundException, SQLException {
		return new PersistanceImplementation().display();
	}

	@Override
	public int updateEmp(Employee emp) throws ClassNotFoundException, SQLException {
		return new PersistanceImplementation().updateEmp(emp);
	}

	@Override
	public List<Employee> searchEmp(String searchName) throws ClassNotFoundException, SQLException {
		return new PersistanceImplementation().searchEmp(searchName);
	}

}
