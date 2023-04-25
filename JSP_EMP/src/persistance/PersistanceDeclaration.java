package persistance;

import java.sql.SQLException;
import java.util.List;

import entity.Employee;


public interface PersistanceDeclaration {
	public List<Employee> display() throws ClassNotFoundException, SQLException;
	public int updateEmp(Employee emp) throws ClassNotFoundException, SQLException;
}
