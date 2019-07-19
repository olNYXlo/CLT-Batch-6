package day4;


abstract class Oracle{
	
	abstract void driverConnection();
	
	
}

abstract class Microsoft{
	
	abstract void getSoftware();
	
}

class MyClass{
	
	//MyClass needs to access driverConnection and getSoftware. how to solve?
	//create a method that creates 2 reference of both abstract classes and override the methods
	// within this method, use the reference to call the different methods
	// allows for "multiple" inheritance
	
	//anonymous nested class
	
	void display() {
		Oracle refOracle = new Oracle() {
			@Override
			void driverConnection() {
				System.out.println("Oracle Driver Connected..");
			}
		};
		//end of oracle
		
		Microsoft refMicrosoft = new Microsoft() {
			@Override
			void getSoftware() {
				System.out.println("Microsoft Software loaded..");
			}
		//end of microsoft
	};
	refOracle.driverConnection();
	refMicrosoft.getSoftware();
	
}
	// end of display



}
public class AbstractionEX2 {	
	
	public static void main(String[] args) {
		MyClass refMyClass = new MyClass();
		refMyClass.display();
		
	}

}
