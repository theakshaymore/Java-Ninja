package day08_GA;

public class FullTimeEmployee extends Employee {

	private double basic, bonus;

	public FullTimeEmployee() {
		super();
		
	}

	public FullTimeEmployee(int id, String firstname, String lastname, String address, double bonus, double basic) {
		super(id, firstname, lastname, address);
		this.basic = basic;
		this.bonus = bonus;
	}
	
	public double computeSal(){
		return this.basic + this.bonus;
	}
	

	public void showDetails(){
		
		System.out.println("Full Time Employee \n"
				+ "ID = " + this.id + " \n"
				+ "Name = " + getFullName(this.firstName, this.lastName) + "\n"
				+ "Address = " + this.address + "\n"
				+ "Basic = " + this.basic + "\n"
				+ "Bonus = " + this.bonus + "\n"
				+ "Computed Salary = " + computeSal()
				);
	}
	
	

}
