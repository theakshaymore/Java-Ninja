package day23;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class user
 */
@WebServlet("/user")
public class user extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public user() {
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
		
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			UserInfo user = getUserInfo(id, name);
			RequestDispatcher reqDispatcher = null;
			request.setAttribute("USER", user);
			if(user != null){
				reqDispatcher = request.getRequestDispatcher("UserFound");
				reqDispatcher.forward(request, response);
			}else{
				reqDispatcher = request.getRequestDispatcher("UserNotFound");
				reqDispatcher.forward(request, response);
			}
				
				
				
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	public UserInfo getUserInfo(int id, String name) throws ClassNotFoundException, SQLException {

		UserInfo user = null; 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/futurefit", "root", "root");
		
		PreparedStatement statement = conn.prepareStatement("SELECT * FROM student02 WHERE id = ? AND name = ?");
		statement.setInt(1, id);
		statement.setString(2, name);
		ResultSet result = statement.executeQuery();
		while(result.next()){
			user = new UserInfo();
			user.setId(result.getInt(1));
			user.setName(result.getString(2));
			user.setAmount(result.getInt(3));
			user.setMobile(result.getInt(4));
		}
		return user;
	}

}
