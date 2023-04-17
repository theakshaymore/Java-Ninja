package com.persistance;

import java.util.List;

import com.entity.Department;
import com.entity.Employee;

public interface Manage_Declaration {
	public List<Employee> getEmployees() throws Exception;
	public Employee getEmployee(int id) throws Exception;
	public void insertEmployee(Employee emp) throws Exception;
	public void deleteEmployee(int id) throws Exception;
	public void printEmpDeptDeatails(int deptId) throws Exception;
	public void updateDeptDetails(int deptId, String deptName) throws Exception;
}
