package day12;

public class WorkerThread implements Runnable{
	
	public int ID;
	
	WorkerThread(int i){
		ID = i;
	}

	public static void main(String[] args) {

	}

	@Override
	public void run() {
		System.out.println("Work,Work~" + ID);
		
	}
}
