package service_pac;

import java.sql.SQLException;
import java.util.List;

import entity_pac.Team;
import persistence_pac.Team_implementations;

public class Service_implementations implements Service_declarations{

	@Override
	public List<Team> displayAll() throws ClassNotFoundException, SQLException {
		return new Team_implementations().display();
	}

	@Override
	public int insert(Team t) throws ClassNotFoundException, SQLException {
		return new Team_implementations().insertInto(t);
	}

}
