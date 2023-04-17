package entity;

public class Team {
	private int id;
	private String name, city, state;
	public Team() {
	
	}
	public Team(int id, String name, String city, String state) {
		
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Team [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
}
