package persistence_pac;

import java.sql.SQLException;
import java.util.List;

import entity_pac.Team;

public interface Team_declarations {
	public List<Team> display() throws ClassNotFoundException, SQLException;
	public int insertInto(Team t) throws ClassNotFoundException, SQLException;
}
