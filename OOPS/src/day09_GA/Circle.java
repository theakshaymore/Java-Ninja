package day09_GA;

public class Circle extends Shape {
	
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double getArea() {
		
		return 3.14 * Math.pow(this.radius, 2);
	}

	@Override
	void printDetails() {
		String newArea = String.format("%.4f", this.getArea());
		System.out.println("Type = Circle\n"
				+ "Radius = " + this.radius + "\n"
				+ "Area = " + newArea);
	}
	
	
}
