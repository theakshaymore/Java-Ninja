package entity_pac;

public class Team {
	private int team_id;
	private String name,city,state;
	public Team() {
	}
	public Team(int team_id, String name, String city, String state) {
		super();
		this.team_id = team_id;
		this.name = name;
		this.city = city;
		this.state = state;
	}
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Team [team_id=" + team_id + ", name=" + name + ", city=" + city + ", state=" + state + "]";
	}
	
}
