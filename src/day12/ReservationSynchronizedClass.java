package day12;

class Reservation implements Runnable {
	static int available; // set to be static, so all instances of Reservation class will share the same value
	int wanted;

	public static int getAvailable() {
		return available;
	}

	public static void setAvailable(int input) {
		available = input;
	}

	Reservation(int i) {
		wanted = i;
	}// Reservation constructor

	public void bookBerth() { // synchronized method
		// get name of passenger
		String name = Thread.currentThread().getName();

		synchronized (Reservation.class) { // synchronize class to ensure only 1 thread can run a method of the Reservation class at a time
			// Same result as if using Static Synchronized method
			// but sa wanted is non-static variable, have to synchronize the class instead

			if (available >= wanted) {
				System.out.println("Available Berths : " + available);

				// allot the berth for him
				System.out.println(wanted + " Berths reserved for " + name);
				available -= wanted;

				try {
					Thread.sleep(500); // wait for printing the ticket

				} catch (InterruptedException e) {

				}

			} // end of if
			else {
				System.out.println("Available Berths : " + available);
				System.out.println("Sorry.. not enough berths available for : " + name);

			} // end of else
		}

	}// end of bookBerth

	public void run() {
		this.bookBerth();

	}// end of run

}// end of reserve class

public class ReservationSynchronizedClass {

	public static void main(String[] args) {

		Reservation.setAvailable(10);

		Reservation r = new Reservation(3);
		Reservation r2 = new Reservation(2);
		Reservation r3 = new Reservation(2);
		Reservation r4= new Reservation(2);
		Reservation r5 = new Reservation(3);
		Reservation r6 = new Reservation(2);
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);
		Thread t5 = new Thread(r5);
		Thread t6 = new Thread(r6);

		t1.setName("Arthur");
		t2.setName("Bill");
		t3.setName("Ciao");
		t4.setName("Drake");
		t5.setName("Eminem");
		t6.setName("Frank");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();

	}
}
