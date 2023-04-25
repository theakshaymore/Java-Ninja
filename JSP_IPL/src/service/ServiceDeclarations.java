package service;

import java.sql.SQLException;
import java.util.List;

import entity.Team;

public interface ServiceDeclarations {
	
	public List<Team> displayAll() throws ClassNotFoundException, SQLException;
	
	public int insert(Team t) throws ClassNotFoundException, SQLException;
}
