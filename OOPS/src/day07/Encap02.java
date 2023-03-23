package day07;

public class Encap02 {

	private int base, height;
	
	public Encap02(){
		
	}
	public Encap02(int base, int height){
		this.base = base;
		this.height = height;
	}
	
	
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double area(){
		return 0.5 * base * height;
	}
	@Override
	public String toString() {
		return "Encap02 [base=" + base + ", height=" + height + ", getBase()=" + getBase() + ", getHeight()="
				+ getHeight() + ", area()=" + area() + "]";
	}
	
	
	
	
	
}
