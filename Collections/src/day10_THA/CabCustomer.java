package day10_THA;

public class CabCustomer {

	private int custId, distance;
	private String customerName, pickupLocation, dropLocation;
	private long phone;
	public CabCustomer() {
		
	}
	public CabCustomer(int custId, int distance, String customerName, String pickupLocation, String dropLocation,
			long phone) {
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
	public String getDropLocation() {
		return dropLocation;
	}
	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "CabCustomer [custId=" + custId + ", distance=" + distance + ", customerName=" + customerName
				+ ", pickupLocation=" + pickupLocation + ", dropLocation=" + dropLocation + ", phone=" + phone + "]";
	}
	
	
	
}
