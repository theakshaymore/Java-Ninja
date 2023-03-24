package day09;

public class CabCustomer {

	private int custId, distance;
	private String customerName, pickupLocation, dropLocation;
	private long phone;
	
	public CabCustomer(){
		
	}
	public CabCustomer(int custId, int distance, String customerName, String pickupLocation,String dropLocation,  long phone) {
		
		this.custId = custId;
		this.distance = distance;
		this.customerName = customerName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.phone = phone;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public double calculateBill(){
		int count = 0;
		if(distance <= 4){
			return 80.00;
		}
		else{
			for(int i = 5; i<=distance; i++){
				count++;
			}
			return 80.00 + (count * 6);
		}
	}
	
	
	
	

}
