package persistence_pac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity_pac.Team;

public class Team_implementations implements Team_declarations{

	@Override
	public List<Team> display() throws ClassNotFoundException, SQLException {
		Team t=null;
		ArrayList<Team> team=new ArrayList<>();
		Connection con=Global_Config.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from team");
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			t=new Team();
			t.setTeam_id(rs.getInt(1));
			t.setName(rs.getString(2));
			t.setCity(rs.getString(3));
			t.setState(rs.getString(4));
			team.add(t);
		}
		return team;
	}

	@Override
	public int insertInto(Team t) throws ClassNotFoundException, SQLException {
		Connection con=Global_Config.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into team(team_id,name,city,state) values(?,?,?,?)");
		ps.setInt(1, t.getTeam_id());
		ps.setString(2, t.getName());
		ps.setString(3, t.getCity());
		ps.setString(4, t.getState());
		int i=ps.executeUpdate();
		return i;
	}

	

}
