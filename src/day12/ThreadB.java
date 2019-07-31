package day12;



public class ThreadB implements Runnable{// more efficient method to create threads compared to Class ThreadA.
	// as can extend other classes. Allow for multiple inheritance through interfaces
	
	@Override
	public void run() {
		for (int i=1; i < 4; i++) {
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {// required to handle exception when using thread methods
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " thread is running for the " + i + "th time");
			System.out.println("=======================================================");
		}
		
	}

	public static void main(String[] args) { // default priority level 5.   Priority level ranges form 0~10. 10 being most important
		
		ThreadB tb = new ThreadB();
		
		Thread t1 = new Thread(tb);
		Thread t2 = new Thread(tb);
		Thread t3 = new Thread(tb);
		Thread t4 = new Thread(tb);
		Thread t5 = new Thread(tb);
		
		t1.setName("FIRST");
		t2.setName("SECOND");
		t3.setName("THIRD");
		t4.setName("FOURTH");
		t5.setName("FIFTH");
		
		
		t1.start();
		t2.start();
		// Threads 1 & 2 execute in random order
		try {
			t1.join();
			t2.join(); // checks if thread1 and thread2 have died. Only then will thread 3 start
		}
		catch(Exception e) {// require to handle exception when using join, sleep or other thread method
			System.out.println(e);
		}
		System.out.println("Thread 1 & 2 iz DEAD");
		System.out.println("=======================================================");
		t3.start(); // starts Thread3 once thread1 & thread2 have died
		try {
			t3.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//Starts thread4 & thread5 once thread3 have died
		System.out.println("Thread 3 iz DEAD");
		System.out.println("=======================================================");
		t4.start();
		t5.start();
		

	}
}
