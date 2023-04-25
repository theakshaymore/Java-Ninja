package persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Employee;

import persistance.Global_Config;

public class PersistanceImplementation implements PersistanceDeclaration {

	@Override
	public List<Employee> searchEmp(String searchName) throws ClassNotFoundException, SQLException {
		Employee emp=null;
		ArrayList<Employee> EmpList=new ArrayList<>();
		Connection con=Global_Config.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from employee where ename = ?");
		ps.setString(1, searchName);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			emp=new Employee();
			emp.seteId(rs.getInt(1));
			emp.seteName(rs.getString(2));
			emp.seteAdd(rs.getString(3));
			emp.setDeptId(rs.getInt(4));
			EmpList.add(emp);
		}
		return EmpList;
	}

}
