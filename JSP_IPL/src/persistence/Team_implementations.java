package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Team;

public class Team_implementations implements Team_declarations{

	@Override
	public int insertInto(Team team) throws ClassNotFoundException, SQLException {
		Connection con=Global_Config.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into team(team_id,name,city,state) values(?,?,?,?)");
		ps.setInt(1, team.getTeam_id());
		ps.setString(2, team.getName());
		ps.setString(3, team.getCity());
		ps.setString(4, team.getState());
		int i=ps.executeUpdate();
		return i;
	}

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

	

}
