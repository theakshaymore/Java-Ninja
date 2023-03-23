package day07;

public class Encap01 {

	public static void main(String[] args) {
		Encap02 obj1 = new Encap02();
		obj1.setBase(4);
		obj1.setHeight(5);
		System.out.println(obj1.toString());
		
		Encap02 obj2 = new Encap02();
		obj2.setBase(4);
		obj2.setHeight(5);
		System.out.println(obj2.toString());
		System.out.println(obj2.area());


	}

}
