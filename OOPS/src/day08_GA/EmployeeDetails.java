package day08_GA;

public class EmployeeDetails {

	public static void main(String[] args) {
	
		
		FullTimeEmployee fe1 = new FullTimeEmployee(101, "Akshay", "More", "Mumbai", 2000.00, 10000.90);
		fe1.showDetails();
		
		
		System.out.println("-----------------------------------------------------");
		
		
		PartTimeEmployee pe1 = new PartTimeEmployee(102, "Rohit", "Sawant", "Bandra", 100.00, 10.00);
		pe1.showDetails();
		
	}

}
