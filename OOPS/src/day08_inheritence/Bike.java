package day08_inheritence;

public class Bike extends Car {

	protected String model;
	
	public Bike(){

	super();
}
	public Bike(String model, String carRegNumber, String carColor, int carNumber) {
		super(carRegNumber);
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Bike [model=" + model + "]";
	}
	
	

}
