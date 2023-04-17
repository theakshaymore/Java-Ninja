package persistance;
import entity.Employee;
import java.sql.*;
import java.util.*;

import com.entity.Department;
import com.entity.Employee;

public class Manage_Implementation implements Manage_Declaration {

	@Override
	public List<Employee> getEmployees() throws Exception {
		List<Employee> emp = new ArrayList<>();;
		Connection conn = GlobalConfiguration.getConnection();
		PreparedStatement ps = conn.prepareStatement("Select * From Employee");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Employee e = new Employee();
			e.setEmpid(rs.getInt(1));
			e.setEname(rs.getString(2));
			e.setEadd(rs.getString(3));
			e.setEloc(rs.getString(4));
			e.setDeptid(rs.getInt(5));
			emp.add(e);
		}
		return emp;
	}

	@Override
	public Employee getEmployee(int id) throws Exception {
		Employee emp = null;
		Connection conn = GlobalConfiguration.getConnection();
		PreparedStatement ps = conn.prepareStatement("Select * From Employee Where eid=?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			emp = new Employee();
			emp.setEmpid(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setEadd(rs.getString(3));
			emp.setEloc(rs.getString(4));
			emp.setDeptid(rs.getInt(5));
		}
		return emp;
	}

	@Override
	public void insertEmployee(Employee emp) throws Exception {
		Connection conn = GlobalConfiguration.getConnection();
		PreparedStatement ps = conn.prepareStatement("Insert Into Employee (ename, eadd, eloc, deptid) Values (?, ?, ?, ?)");
		ps.setString(1, emp.getEname());
		ps.setString(2, emp.getEadd());
		ps.setString(3, emp.getEloc());
		ps.setInt(4, emp.getDeptid());
		if(ps.executeUpdate() == 1) {
			System.out.println("Employee Added");
		} else {
			System.out.println("Error!");
		}
	}

	@Override
	public void deleteEmployee(int id) throws Exception {
		Connection conn = GlobalConfiguration.getConnection();
		PreparedStatement ps = conn.prepareStatement("Delete From Employee Where eid=?");
		ps.setInt(1, id);
		if(ps.executeUpdate() == 1) {
			System.out.println("Employee Deleted");
		} else {
			System.out.println("Error!");
		}
	}

	@Override
	public void printEmpDeptDeatails(int deptId) {
		
		
	}

	@Override
	public void updateDeptDetails(int deptId, String deptName) throws Exception {
		Connection conn = GlobalConfiguration.getConnection();
		PreparedStatement ps = conn.prepareStatement("Update Department Set deptname=? Where deptid=?");
		ps.setString(1, deptName);
		ps.setInt(2, deptId);
		if(ps.executeUpdate() == 1) {
			System.out.println("Department details updated");
		} else {
			System.out.println("Error!");
		}
	}

}
