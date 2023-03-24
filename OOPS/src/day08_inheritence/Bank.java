package day08_inheritence;

//Customer-->
//id(auto_increment)
//firstName
//lastName
//balance
//
//1-create commercial customer(office_no,billing address) extends Customer
//2-create personal customer(phone_no,perminant_adddress) extends Customer
//
//Bank--> 2 methods 
//(1st method create commercial customer  
//2nd method-->-create personal customer)
//
//
//Bank_Main(1-commercial  2-personal customer)


public class Bank {

	public static void main(String[] args) {
		
		Com_Customer c1 = new Com_Customer(12345, "sssssss");
		c1.getCustomerDetails();
		
		
		Customer c2 = new Com_Customer(123344, "hjhj");
		System.out.println(c2.toString());

	}

}
