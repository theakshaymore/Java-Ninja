package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Employee;
import service.ServiceImplementation;



@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Employee> emp;
		try {
			emp = new ServiceImplementation().displayAll();
			request.setAttribute("EMP", emp);
			RequestDispatcher rd=request.getRequestDispatcher("JSP_EMP.jsp");
			rd.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String updateEmp=request.getParameter("updateEmp");
		if(updateEmp.equalsIgnoreCase("updateEmp")){
			try {
				Employee emp=new Employee();
				int id=Integer.parseInt(request.getParameter("id"));
				String name=request.getParameter("name");
				String address=request.getParameter("address");
				int deptId=Integer.parseInt(request.getParameter("deptid"));
				emp.seteId(id);
				emp.seteName(name);
				emp.seteAdd(address);
				emp.setDeptId(deptId);
				int i=new ServiceImplementation().updateEmp(emp);
				if(i!=0){
					RequestDispatcher rd=request.getRequestDispatcher("JSP_EMP.jsp");
					rd.forward(request, response);
					doGet(request, response);
				}
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
