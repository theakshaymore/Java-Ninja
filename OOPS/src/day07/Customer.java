package day07;

public class Customer {
	

	private String firstname, lastName;
	private double balance;
	private long id;
	
	
	public Customer(){
		
	}
	
	public Customer(String firstname, String lastName, double balance, long id) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.balance = balance;
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastName=" + lastName + ", balance=" + balance + ", id=" + id
				+ ", getFirstname()=" + getFirstname() + ", getLastName()=" + getLastName() + ", getBalance()="
				+ getBalance() + ", getId()=" + getId() + "]";
	}
	
	

}
