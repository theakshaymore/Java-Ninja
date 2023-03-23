package day08_inheritence;

public class Per_Customer {
	
	
	private int officeNo;
	private String billingAddress;
	
	

	@Override
	public String toString() {
		return "Per_Customer [officeNo=" + officeNo + ", billingAddress=" + billingAddress + "]";
	}



	public Per_Customer(int officeNo, String billingAddress) {
		super();
		this.officeNo = officeNo;
		this.billingAddress = billingAddress;
	}



	public static void main(String[] args) {
		

		Customer c1 = new Customer(102, "Sai", "Lath", 3000.80);
		System.out.println(c1.toString());
	}

}
