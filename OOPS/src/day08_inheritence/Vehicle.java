package day08_inheritence;

public class Vehicle {

	private String carRegNumber;
	
	public Vehicle(){
		
	}

	public Vehicle(String carRegNumber) {
		
		this.carRegNumber = carRegNumber;
	}

	public String getCarRegNumber() {
		return carRegNumber;
	}

	public void setCarRegNumber(String carRegNumber) {
		this.carRegNumber = carRegNumber;
	}

	@Override
	public String toString() {
		return "Vehicle [carRegNumber=" + carRegNumber + "]";
	}
	
	
	
	
	

}
