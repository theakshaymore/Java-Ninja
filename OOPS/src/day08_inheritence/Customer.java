package day08_inheritence;

abstract class Customer {

	private int id;
	private String firstname, lastName;
	private double balance;
	
	public Customer(){
		
	}

	public Customer(int id, String firstname, String lastName, double balance) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastName=" + lastName + ", balance=" + balance
				+ "]";
	}
	
	abstract void getCustomerDetails();
	
	
}
