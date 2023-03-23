
package day08_GA;

public class Employee {

	protected int id;
	protected String firstName, lastName, address;
	
	public Employee(){
		
	}
	public Employee(int id, String firstname, String lastname, String address) {
		
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastname;
		this.address = address;
	}
	
	public static String getFullName(String firstName, String lastName){
		return firstName + " " + lastName;
	}
	

}
