package controller_ui_pac;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity_pac.Team;
import service_pac.Service_implementations;

/**
 * Servlet implementation class UI_serv
 */
@WebServlet("/UI_serv")
public class UI_serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UI_serv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		List<Team> t;
		try {
			t = new Service_implementations().displayAll();
			request.setAttribute("Team", t);
			RequestDispatcher rd=request.getRequestDispatcher("UI_out.jsp");
			rd.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		Team t=new Team();
		int id=Integer.parseInt(request.getParameter("t_id"));
		String name=request.getParameter("t_name");
		String city=request.getParameter("t_city");
		String state=request.getParameter("t_stat");
		t.setTeam_id(id);t.setName(name);t.setCity(city);t.setState(state);
		try {
			int i=new Service_implementations().insert(t);
			if(i!=0){
				RequestDispatcher rd=request.getRequestDispatcher("success.html");
				rd.forward(request, response);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
