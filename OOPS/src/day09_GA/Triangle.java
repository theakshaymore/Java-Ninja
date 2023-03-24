package day09_GA;

public class Triangle extends Shape {

	private double base, height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	double getArea() {
		return 0.5 * this.base * this.height;
	}

	@Override
	void printDetails() {
		System.out.println("Type = Triangle\n"
				+ "Base = " + this.base + "\n"
				+ "Height = " + this.height + "\n"
				+ "Area = " + this.getArea());
	}
	
	
}
