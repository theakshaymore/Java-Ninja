package day10;

public class Jntu extends Student implements Attendence, Score {

	@Override
	public float getScore() {
		return (float)((getM1() + getM2() + getM3()) / 3);
		
	}

	@Override
	public float getAttendence() {
		
		return (float)(getNoOfDaysWorked() / getNoOfDaysAttended());
		
	}
	
	
	

	

}
