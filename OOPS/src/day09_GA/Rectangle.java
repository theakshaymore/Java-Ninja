package day09_GA;

public class Rectangle extends Shape {
	private double length, breath;

	public Rectangle(double length, double breath) {
		this.length = length;
		this.breath = breath;
	}

	@Override
	double getArea() {
		
		return this.length * this.breath;
	}

	@Override
	void printDetails() {
		System.out.println("Type = Rectangle\n"
				+ "Length = " + this.length + "\n"
				+ "Breadth = " + this.breath + "\n"
				+ "Area = " + this.getArea());
	}
	
	
}
