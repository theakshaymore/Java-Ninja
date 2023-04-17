package com.service;

import java.util.List;

import com.entity.Department;
import com.entity.Employee;
import com.persistance.Manage_Implementation;

public class Service_Implementation implements Service_Declaration{

	@Override
	public List<Employee> getEmployees() throws Exception {
		return new Manage_Implementation().getEmployees();
	}

	@Override
	public Employee getEmployee(int id) throws Exception {
		return new Manage_Implementation().getEmployee(id);
	}

	@Override
	public void insertEmployee(Employee emp) throws Exception {
		new Manage_Implementation().insertEmployee(emp);
	}

	@Override
	public void deleteEmployee(int id) throws Exception {
		new Manage_Implementation().deleteEmployee(id);;
	}

	@Override
	public void printEmpDeptDeatails(int deptId) throws Exception {
		
	}

	@Override
	public void updateDeptDetails(int deptId, String deptName) throws Exception {
		new Manage_Implementation().updateDeptDetails(deptId, deptName);
	}

}
