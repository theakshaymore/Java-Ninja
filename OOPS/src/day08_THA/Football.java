package day08_THA;

public class Football extends Sport {
	
	@Override
	public String getName(){
		return "Football";
	}
	
	@Override
	public String getNumberOfTeamMembers(){
		return "In sports" + getName() + ", each team has 11 players";
	}
	
}
