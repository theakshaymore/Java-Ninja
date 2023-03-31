package day10;

public class Student {

	private int id, m1, m2, m3, noOfDaysWorked, noOfDaysAttended;
	private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, int m1, int m2, int m3, String name) {
		super();
		this.id = id;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfDaysWorked() {
		return noOfDaysWorked;
	}
	public void setNoOfDaysWorked(int noOfDaysWorked) {
		this.noOfDaysWorked = noOfDaysWorked;
	}
	public int getNoOfDaysAttended() {
		return noOfDaysAttended;
	}
	public void setNoOfDaysAttended(int noOfDaysAttended) {
		this.noOfDaysAttended = noOfDaysAttended;
	}
	
	

}
