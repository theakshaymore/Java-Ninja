package service;

import java.sql.SQLException;
import java.util.List;

import entity.Employee;
import persistance.PersistanceImplementation;


public class ServiceImplementation implements ServiceDeclaration {


	@Override
	public List<Employee> searchEmp(String searchName) throws ClassNotFoundException, SQLException {
		return new PersistanceImplementation().searchEmp(searchName);
	}

}
