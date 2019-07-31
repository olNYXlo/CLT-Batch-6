package day12;

import java.util.Scanner;

class Rx implements Runnable {
	static int available = 10;

	public synchronized static int getAvailable() {
		return available;
	}

	public synchronized static void setAvailable(int input) {
		Rx.available = input;
	}

	public synchronized void book() {// only 1 thread can run this method per instance

		System.out.println("Available Berths : " + available);
		// get name of passenger
		String name = Thread.currentThread().getName();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter desired number of berths for : " + name);
		int num = sc.nextInt();

		if (available >= num) {

			// allot the berth for him
			System.out.println(num + " Berths reserved for " + name);
			available -= num;

			try {
				Thread.sleep(500); // wait for printing the ticket

			} catch (InterruptedException e) {

			}
		} // end of if
		else {
			System.out.println("Sorry.. not enouch berths available for : " + name);

		} // end of else

	}

	public void run() {
		this.book();

	}// end of run
}// end of Rx class

public class ReservationSynchronizedMethod {

	public static void main(String[] args) {

		Rx r = new Rx();
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		Thread t4 = new Thread(r);
		Thread t5 = new Thread(r);
		Thread t6 = new Thread(r);

		t1.setName("Arthur");
		t2.setName("Ben");
		t3.setName("Chris");
		t4.setName("Dennis");
		t5.setName("Eric");
		t6.setName("Frankie");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();

	}// end of main method
}// end of ReservationSynchronizedEX2 class
