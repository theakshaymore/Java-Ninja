package day11_THA;

public class WrongPasswordException extends Exception {
	String msg;

	public WrongPasswordException(String msg) {
		System.out.println(msg);
	}
	
}
