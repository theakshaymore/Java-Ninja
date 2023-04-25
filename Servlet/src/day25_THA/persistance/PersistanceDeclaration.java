package persistance;

import java.sql.SQLException;
import java.util.List;

import entity.Employee;


public interface PersistanceDeclaration {
	
	public List<Employee> searchEmp(String searchName) throws ClassNotFoundException, SQLException;
	

}
