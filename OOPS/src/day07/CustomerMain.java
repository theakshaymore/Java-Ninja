package day07;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer obj1 = new Customer();
		System.out.println(obj1.toString());
		
		Customer obj2 = new Customer("Akshay", "More", 2000.30, 101);
		System.out.println(obj2.toString());

	}

}
