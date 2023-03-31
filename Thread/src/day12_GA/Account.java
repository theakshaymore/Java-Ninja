package day12_GA;

public class Account extends Thread {
	
	private int balance = 0;
	
	public synchronized void deposit(int amount){
		try {
			balance = balance + amount;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Amount Deposited, Balance: " + balance);
	}
	
	public synchronized void withdraw(int amount){
		try {
			balance = balance - amount;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Amount Withdraw, Balance: " + balance);
	}
		
}
