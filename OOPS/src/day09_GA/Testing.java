package day09_GA;

public class Testing {

	public static void main(String[] args) {
		
		System.out.println("Program 01 ====================================");
		MyCalculator m1 = new MyCalculator();
		System.out.println("The sum of divisors: " + m1.divisorSum(6));
		
		System.out.println("Program 02 ====================================");
		Rectangle r1 = new Rectangle(30.3, 45.4);
		r1.printDetails();
		System.out.println("---------------------------------");
		Circle c1 = new Circle(23.2);
		c1.printDetails();
		System.out.println("---------------------------------");
		Triangle t1 = new Triangle(146.2, 40.0);
		t1.printDetails();

	}

}
