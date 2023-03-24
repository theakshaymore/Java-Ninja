package day09;

public class CabCustomerServiceTester {

	public static void main(String[] args) {
		
		
		CabCustomer c1 = new CabCustomer(101, 20, "Akshay", "Pune","Mumbai", 90909090l);
		System.out.println(c1.calculateBill());
		
		CabCustomer c2 = new CabCustomer(102, 30, "Rohit", "Pune","Mumbai", 90909090l);
		System.out.println(c2.calculateBill());
		
		
		if(c1.calculateBill() > c2.calculateBill()){
			System.out.println("Akshay paid more amount");
		}else{
			System.out.println("Rohit pAID MORE AMOUNT");
		}
		
	}

}
