package day10_THA;

public class CabCustomerServiceTester {

	public static void main(String[] args) {
		
		CabCustomer cc1 = new CabCustomer(101, 6, "Akshay", "Mumbai", "Pune", 12345678L);
		CabCustomer cc2 = new CabCustomer(102, 4, "Rohit", "Mumbai", "Bandra", 123453L);
		CabCustomer cc3 = new CabCustomer(103, 20, "Hardik", "Mumbai", "Delhi", 23423425678L);
		CabCustomerService cs1 = new CabCustomerService();
		cs1.addCabCustomer(cc1);
		cs1.addCabCustomer(cc2);
		cs1.addCabCustomer(cc3);
		System.out.println("=================================================");
		System.out.println("Calculating Bill: ");
		System.out.println(cs1.calculateBill(cc1));
		System.out.println(cs1.calculateBill(cc2));
		System.out.println(cs1.calculateBill(cc3));
		System.out.println("=================================================");
		System.out.println("Printing Bill: ");
		System.out.println(cs1.printBill(cc1));
		System.out.println(cs1.printBill(cc2));
		System.out.println(cs1.printBill(cc3));

	}

}
