package persistance;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Team;

public class TeamImplementation implements TeamDeclaration {
	
//	public List<Team> displayAll() throws ClassNotFoundException, SQLException 
//	{
//		Team t=null;
//		ArrayList<Team> teamlist=new ArrayList<Team>();
//		Connection con=GlobalConfiguration.getConnection();
//		PreparedStatement ps=con.prepareStatement("select * from Team");
//		ResultSet rs=ps.executeQuery();
//		while(rs.next())
//		{
//			t=new Team();
//			t.setTeam_id(rs.getInt(1));
//			t.setName(rs.getString(2));
//			t.setCity(rs.getString(3));
//			t.setState(rs.getString(4));
//			teamlist.add(t);
//		}
//		return teamlist;
//	}

	@Override
	public List<Team> displayAllTeams(Team team) throws ClassNotFoundException, SQLException {
		Team t=null;
		ArrayList<Team> teamlist=new ArrayList<Team>();
		Connection con=GlobalConfig.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from Student02 where name = ?");
		ps.setString(1, team.getName());
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			t=new Team();
			t.setName(rs.getString(1));
			teamlist.add(t);
		}
		return teamlist;
	}

}
