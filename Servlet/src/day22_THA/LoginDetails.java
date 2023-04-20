package day22_THA;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginDetails
 */
@WebServlet("/LoginDetails")
public class LoginDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginDetails() {
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
		doGet(request, response);
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String hobbies = request.getParameter("hobbies");
		String address = request.getParameter("address");
		String color = request.getParameter("color");
		String date = request.getParameter("dob");
		String gender = request.getParameter("gender");
		

	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    LocalDate newDate = LocalDate.parse(date, formatter);
		
		PrintWriter output = response.getWriter();
		output.write("<html><body>");
		
		output.write("<h1>USER INFORMATION</h1>");
		output.write("<ol>"
				+ "<li>Name: " + name + "</li>"
				+ "<li>Password: " + password + "</li>"
				+ "<li>Hobbies: " + hobbies + "</li>"
				+ "<li>Address: " + address + "</li>"
				+ "<li>Name: " + name + "</li>"
				+ "<li>Fav. Color: " + color + "</li>"
				+ "<li>Date Of Birth: " + newDate + "</li>"
				+ "<li>Gender: " + gender + "</li></ol>"
				);
		
		output.write("</body></html>");
	}

}
