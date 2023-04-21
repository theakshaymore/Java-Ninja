package day23_THA;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpHome
 */
@WebServlet("/EmpHome")
public class EmpHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name = (String) request.getAttribute("NAME");
		String password = (String) request.getAttribute("PASSWORD");
		PrintWriter output = response.getWriter();
		output.write("<div style='float: left;'>Welcome " + name + "!</div><br>");
		output.write("<div style='float: right;'>"
		        + "<a style='margin-right: 10px;' href='#'>Home</a>"
		        + "<a href='#'>Logout</a>"
		        + "</div><br>");
		output.write("<div style='text-align:center; margin-top: 50px;'>"
		        + "<h1>Welcome to Employee Home Page</h1>"
		        + "</div>");


	}

}
