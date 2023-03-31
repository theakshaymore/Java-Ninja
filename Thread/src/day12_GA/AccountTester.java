package day12_GA;

public class AccountTester {

	public static void main(String[] args) {

		Account account =  new Account();
		Thread thread1 = new Thread(){

			public void run(){
				account.deposit(3000);
			}
		};
		thread1.start();
		
		Thread thread2 = new Thread(){

			public void run(){
				account.deposit(500);
			}
		};
		thread2.start();
		
		Thread thread3 = new Thread(){

			public void run(){
				account.withdraw(1000);
			}
		};
		thread3.start();
	}

}
