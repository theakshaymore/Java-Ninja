package service_pac;

import java.sql.SQLException;
import java.util.List;

import entity_pac.Team;

public interface Service_declarations {
	public List<Team> displayAll() throws ClassNotFoundException, SQLException;
	public int insert(Team t) throws ClassNotFoundException, SQLException;
}
