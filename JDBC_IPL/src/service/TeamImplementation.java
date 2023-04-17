package service;
import java.sql.SQLException;
import java.util.List;

import entity.Team;

public class TeamImplementation implements TeamDeclaration {

	@Override
	public List<Team> searchAllTeams(Team team) throws ClassNotFoundException, SQLException {
		return new persistance.TeamImplementation().displayAllTeams(team);
	}
	
//	@Override
//	public List<Team> searchAllTeams(Team team) throws ClassNotFoundException, SQLException {
//		return new persistance.TeamImplementation().displayAllTeams();
//	}
	
//	@Override
//	public List<Team> displayAllTeams() throws ClassNotFoundException, SQLException {
//		return new Team_Implementations().displayAll();
//	}

//	@Override
//	public int insertionTeam(Team team) throws ClassNotFoundException, SQLException {
//		return new Team_Implementations().insertTeam(team);
//	}
//
//	@Override
//	public int updationTeam(Team team) throws ClassNotFoundException, SQLException 
//	{
//		return new Team_Implementations().updateTeam(team);
//	}
//
//	@Override
//	public int deletionTeam(int id)throws ClassNotFoundException, SQLException 
//	{
//		return new Team_Implementations().deleteTeam(id);
//	}
}
