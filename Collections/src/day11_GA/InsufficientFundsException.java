package day11_GA;

public class InsufficientFundsException extends Exception {
	String msg;
	public InsufficientFundsException(String msg) {
        System.out.println(msg);
    }
}
