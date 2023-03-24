package day08_inheritence;

public class Com_Customer extends Customer {
	
	private int phoneNo;
	private String permanantAddress;
	
	
	@Override
	public String toString() {
		return "Com_Customer [phoneNo=" + phoneNo + ", permanantAddress=" + permanantAddress + "]";
	}


	public Com_Customer(int phoneNo, String permanantAddress) {
		super();
		this.phoneNo = phoneNo;
		this.permanantAddress = permanantAddress;
	}
	
	@Override
	public void getCustomerDetails(){
		System.out.println("Overring");
	}


//	public static void main(String[] args) {
//		
//		Customer c1 = new Customer(101, "Akshay", "More", 2000.80);
//		System.out.println(c1.toString());
//
//	}

}
