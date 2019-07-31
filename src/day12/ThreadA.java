package day12;

public class ThreadA extends Thread{
	
	@Override
	public void run() { // overrides the default run() method for Thread class
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		
		
		ThreadA ta = new ThreadA(); // creating object of ThreadA class
		Thread t = new Thread(ta);// create object of thread class. Thread constructor requires Class as an input
		//ta.start(); // not a good practice
		t.start(); // once start() is called, it invokes run() automatically
		// ta.run();    // not a good practice. can execute but do no get help from Thread class. No thread concept as no thread created, simple running of method
		// t.run();     // not a good practice

	}
}
