package day12_THA;

public class TicketDispenser extends Thread{


	private int allotedSeats = 0;
	private final int maxSeatsAllowed = 100;

	synchronized public String allotSeatNumber(int noOfSeats) {

		if (allotedSeats + noOfSeats > maxSeatsAllowed) {
			return "No Seats Available";
		}

		String seats = "";


		try {
//			Thread.sleep(1000);
			for(int i = 1; i <= noOfSeats; i++){


				seats += (allotedSeats + i) + ",";

			}
		} catch (Exception e) {
			e.getStackTrace();
		}


		allotedSeats += noOfSeats;

		return seats;
	}

}
