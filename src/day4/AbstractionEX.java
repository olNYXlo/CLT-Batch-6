package day4;

class Parent{
	
}

class Child extends Parent{
	
}


abstract class Visa{
	
	abstract void login(); //abstract method, without body
	abstract String login2();
	abstract void login3();

	
	// cannot have STATIC abstract method as child class cannot override static method of parent class
	// static abstract method defined without body, so will produce error
	//All abstract methods declared, must be defined in its subclass
	
	
	void logout() { //non-abstract method with body hence not required to be defined in sub class
		
	}
	
}


class HSBC extends Visa{

	@Override
	void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	String login2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void login3() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

public class AbstractionEX {

}
