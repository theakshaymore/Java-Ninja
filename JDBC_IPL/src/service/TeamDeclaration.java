package service;

import java.sql.SQLException;
import java.util.List;

import entity.Team;

public interface TeamDeclaration {
	public List<Team> searchAllTeams(Team team)throws ClassNotFoundException, SQLException;
}
