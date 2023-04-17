package persistance;

import java.sql.SQLException;
import java.util.List;

import entity.Team;

public interface TeamDeclaration {
	public List<Team> displayAllTeams(Team team) throws ClassNotFoundException, SQLException;
}
