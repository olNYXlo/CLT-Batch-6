package day6;

class  SuperClass{
	int num = 20;
}

class SubClass extends SuperClass{
	final int num = 30;

	void accessNum(int number) {
		// num = number; // we cannot reassign the value of final variable
		System.out.println(num); // calls local variable called num
		System.out.println(super.num); // calls variable called num in super class
	}
}

public class SuperEX {
	public static void main(String[] args) {
		new SubClass().accessNum(10); // results in 30 as is running the subclass method


	}
}


