package day12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Java Thread pool represents a group of worker that are waiting for the job
// and reused many times

//In case of thread pool, a group of fixed size threads are created.
// a thread from the thread pool is pulled out and assigned a job by the service provider
// after completion of the job, thread is contained in the thread pool again

// better performance & saves time because there is no need to create new thread.



public class ThreadPoolEX {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(5); // Creating pool of 5 threads
		for (int i = 0; i < 5; i++) {
			Runnable worker = new WorkerThread("" + i);
			executor.execute(worker); // calling execute method of ExecutorService
		}// end of for loop
		executor.shutdown();
		while (!executor.isTerminated()) {
			
		}

	}
}
