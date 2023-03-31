package day13_THA;

public class Student {
	private String name;
	private int id;
	private int[] marks;

	public Student() {
		marks = new int[3];
	}

	public Student(String name, int id, int marks1, int marks2, int marks3) {
		this.name = name;
		this.id = id;
		marks = new int[3];
		marks[0] = marks1;
		marks[1] = marks2;
		marks[2] = marks3;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public int getTotalMarks() {
		int total = 0;
		for (int mark : marks) {
			total += mark;
		}
		return total;
	}

	@Override
	public String toString() {
		return "Student[" + name + ", " + id + ", " + marks[0] + ", " + marks[1] + ", " + marks[2] + "]";
	}
}
