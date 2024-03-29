package day07.day07;

public class Student {
	
	//instance variables
	private int id;
	private String name;
	private int marks1, marks2, marks3;
	public static int idIncrementor = 101;
	
	//constructor
	public Student(){
		id = idIncrementor++;
	}
	public Student(String name, int marks1, int marks2, int marks3) {
		this();
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	
	//getters and setters
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
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	public static int getIdIncrementor() {
		return idIncrementor;
	}
	public static void setIdIncrementor(int idIncrementor) {
		Student.idIncrementor = idIncrementor;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks1=" + marks1 + ", marks2=" + marks2 + ", marks3="
				+ marks3 + ", getId()=" + getId() + ", getName()=" + getName() + ", getMarks1()=" + getMarks1()
				+ ", getMarks2()=" + getMarks2() + ", getMarks3()=" + getMarks3() + "]";
	}
	
	
	
	
	

}
