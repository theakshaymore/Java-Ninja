package day07.THADay07;

public class Bowler {

	String name;
	int wickets, matches, balls_bowled, runs_conceded;

	public Bowler(){
		this.name = "";
		this.wickets = 0;
		this.matches = 5;
		this.balls_bowled = 0;
		this.runs_conceded = 0;
	}


	public Bowler(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
		super();
		this.name = name;
		this.wickets = wickets;
		this.matches = matches;
		this.balls_bowled = balls_bowled;
		this.runs_conceded = runs_conceded;
	}

	public void computeBowlingAverage(){
		System.out.println("-----------------------------------");
		if(wickets <= 0 || runs_conceded < 0 || balls_bowled < 0 || matches < 0) {
			System.out.println("Error");
		}
		if((runs_conceded > 0 || balls_bowled > 0) && matches == 0){
			System.out.println("Error");
		}
		double bowingAvg = runs_conceded / (double)wickets;
		System.out.println("Bowling Average: " + bowingAvg);
	}

	public void showStatistics(){
		System.out.println("-----------------------------------");
		if(wickets < 0 || runs_conceded < 0 || balls_bowled < 0 || matches < 0) {
			System.out.println("Error");
		}else{
			if((runs_conceded > 0 || balls_bowled > 0) && matches == 0){
				System.out.println("Error");
			}
			System.out.println("Batsman Details:");
			System.out.println("Name=" + name);
			System.out.println("Wickets=" + wickets);
			System.out.println("Matches=" + matches);
			System.out.println("balls_bowled=" + balls_bowled);
			System.out.println("runs_conceded=" + runs_conceded);

		}		

	}


	public void computeStrikeRate() {
		if(wickets < 0 || balls_bowled < 0 || runs_conceded < 0 || matches < 0) {
			System.out.println("Error");
			return;
		}
		if(matches == 0 && (runs_conceded > 0 || balls_bowled > 0)) {
			System.out.println("Error");
			return;
		}
		double strikeRate = (double)runs_conceded / balls_bowled;
		System.out.println("-----------------------------------");
		System.out.println("Name: " + name);
		System.out.printf("Strike_rate=%.8f\n", strikeRate);
		System.out.println("-----------------------------------");
	}




	public static void main(String[] args) {

		Bowler b1 = new Bowler("Akshay", 10, 5, 16, 463);
		b1.computeBowlingAverage();
		b1.showStatistics();
		b1.computeStrikeRate();       

	}

}
