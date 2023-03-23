package day08_GA;

public class PartTimeEmployee extends Employee {

	private double hoursWorked, amountPerHour;

	public PartTimeEmployee() {
		super();
		
	}

	public PartTimeEmployee(int id, String firstname, String lastname, String address, double amountPerHour, double hoursWorked) {
		super(id, firstname, lastname, address);
		this.hoursWorked = hoursWorked;
		this.amountPerHour = amountPerHour;
	}
	
	public double computeSal(){
		return this.hoursWorked * this.amountPerHour;
	}
	
	public void showDetails(){
		System.out.println("Part Time Employee \n"
				+ "ID = " + this.id + " \n"
				+ "Name = " + getFullName(this.firstName, this.lastName) + "\n"
				+ "Address = " + this.address + "\n"
				+ "Hours Worked = " + this.hoursWorked + "\n"
				+ "Amount Per Hour = " + this.amountPerHour + "\n"
				+ "Computed Salary = " + computeSal()
				);
	}

}
