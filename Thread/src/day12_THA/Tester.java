package day12_THA;

public class Tester {

	public static void main(String[] args) {

		TicketDispenser t = new TicketDispenser();
		Thread t1 = new Thread(){
			public void run(){
				String allotSeat = t.allotSeatNumber(5);
				System.out.println("allotted seat numbers are: " + allotSeat);
			}
		};
		t1.start();
		Thread t2 = new Thread(){
			public void run(){
				String allotSeat = t.allotSeatNumber(5);
				System.out.println("allotted seat numbers are: "+allotSeat);
			}
		};
		t2.start();
		Thread t3 = new Thread(){
			public void run(){
				String allotSeat = t.allotSeatNumber(5);
				System.out.println("allotted seat numbers ares: "+allotSeat);
			}
		};
		t3.start();
	}

}
