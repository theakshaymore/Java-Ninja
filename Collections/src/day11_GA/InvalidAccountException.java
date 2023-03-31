package day11_GA;

public class InvalidAccountException extends Exception{
	String msg;
	public InvalidAccountException(String msg) {
        System.out.println(msg);
    }
}
