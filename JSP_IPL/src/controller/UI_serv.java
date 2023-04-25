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
import entity.Team;
import service.ServiceImplementations;

@WebServlet("/UI_serv")
public class UI_serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UI_serv() {
        super();  
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Team> team;
		try {
			team = new ServiceImplementations().displayAll();
			request.setAttribute("Team", team);
			RequestDispatcher rd=request.getRequestDispatcher("JSP_IPL.jsp");
			rd.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String insertTeam=request.getParameter("insertTeam");
		if(insertTeam.equalsIgnoreCase("insertTeam")){
			try {
				Team team=new Team();
				int id=Integer.parseInt(request.getParameter("id"));
				String name=request.getParameter("name");
				String city=request.getParameter("city");
				String state=request.getParameter("state");
				team.setTeam_id(id);
				team.setName(name);
				team.setCity(city);
				team.setState(state);
				int i=new ServiceImplementations().insert(team);
				if(i!=0){
					RequestDispatcher rd=request.getRequestDispatcher("JSP_IPL.jsp");
					rd.forward(request, response);
					doGet(request, response);
				}
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
