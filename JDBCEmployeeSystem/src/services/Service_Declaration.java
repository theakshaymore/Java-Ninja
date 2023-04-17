package services;
import entity.Employee;
import java.util.List;

import com.entity.Employee;

public interface Service_Declaration {
	public List<Employee> getEmployees() throws Exception;
	public Employee getEmployee(int id) throws Exception;
	public void insertEmployee(Employee emp) throws Exception;
	public void deleteEmployee(int id) throws Exception;
	public void printEmpDeptDeatails(int deptId) throws Exception;
	public void updateDeptDetails(int deptId, String deptName) throws Exception;
}
