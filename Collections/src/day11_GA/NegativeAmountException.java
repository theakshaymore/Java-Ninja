package day11_GA;

public class NegativeAmountException extends Exception {
	String msg;
	public NegativeAmountException(String msg) {
        System.out.println(msg);
    }
}
