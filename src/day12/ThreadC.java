package day12;

class Sample implements Runnable{
	@Override
	public void run() {
		System.out.println("Task 3");
	}
	
	
	void play() {//unique method of Sample class
		// to call this method, have to put inside run() method. if have multiple unique methods
		// can perform logical check in run() method to check which unique method to run
		
		System.out.println("Cricket");
	}
	
	
}

public class ThreadC{

	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() { // anonymous approach to creating Runnable obj
			
			@Override
			public void run() {
				System.out.println("Task 1");
			}
		}; // end of anonymous r1
		
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Task 2");
			}
		}; // end of r2
		
		Thread t1 = new Thread(r1); // creates new thread of Runnable obj
		Thread t2 = new Thread(r2);
		
		Sample s = new Sample(); // creates new Sample obj
		Thread t3 = new Thread(s); // Creates new thread of Sample obj
		
		t1.start();
		t2.start();
		t3.start();

	}
}
