package Assignments;

//interface is a fully abstract class
// require use of 'implements' keyword


interface Bank{
	void deposit(); // no need to include abstract keyword as all methods are implicitly abstract
	void withdraw();
	void checkBalance();
	// int code;   cannot declare variable without value as must be final and static
	final static int code = 204050; //have to declare variable value as final and static by default
	// use Bank.code to access the code anywhere. as cannot create Bank object
	
	
}

interface UserLoginCredential{
	void userLogin();
	void userLogout();
}


//functional interface: Java 1.8 version onwards
//typically for single-responsibility principle. limit the methods available to a class to only absolutely essential methods
@FunctionalInterface
interface SingleMethod{ // functional interface can't have more than 1 abstract method

	void method1();
	// void method2();
}

// Java 1.8 now features default method in interface
interface DefaultMethod extends SingleMethod{
	public default void myMethod() {
		System.out.println("from Java 1.8 version we can have method with a body..");
	}
}

class CitiBank implements Bank, UserLoginCredential{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void userLogin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void userLogout() {
		// TODO Auto-generated method stub
		
	}
	
}


public class InterfaceEX {

}
