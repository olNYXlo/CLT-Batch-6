package day12;

class Reserve implements Runnable {
	int available = 5;
	int wanted;

	Reserve(int i) {
		wanted = i;
	}

	public void run() {
		System.out.println("Available Berths : " + available);
		if (available >= wanted) {

			// get name of passenger
			String name = Thread.currentThread().getName();
			// allot the berth for him
			System.out.println(wanted + " Berths reserved for " + name);

			try {
				Thread.sleep(2000); // wait for printing the ticket
				available -= wanted;
				
			} catch (InterruptedException e) {

			}
		} // end of if
		else {
			System.out.println("Sorry.. no berth available");

		}//end of else

	}// end of run
}// end of reserve class

public class ReservationNotSynchronized {

	public static void main(String[] args) {

		Reserve r = new Reserve(3);
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);

		t1.setName("Arthur");
		t2.setName("Ben");
		t3.setName("Chris");

		t1.start();
		t2.start();
		t3.start();

	}
}
