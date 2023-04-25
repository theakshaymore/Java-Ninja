package service;

import java.sql.SQLException;
import java.util.List;

import entity.Team;
import persistence.Team_implementations;

public class ServiceImplementations implements ServiceDeclarations{

	@Override
	public List<Team> displayAll() throws ClassNotFoundException, SQLException {
		return new Team_implementations().display();
	}

	@Override
	public int insert(Team team) throws ClassNotFoundException, SQLException {
		return new Team_implementations().insertInto(team);
	}

}
