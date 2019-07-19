class MasterCard{
	static void loginAuthentication1() {
		System.out.println("I am in Visa => loginAuthentication1");
	}
	
	void loginAuthentication2() {
		System.out.println("I am in Visa => loginAuthentication2");
		
	}
}

class DBSBank extends MasterCard{
	
	static void loginAuthentication1() {
		System.out.println("I am in Visa => loginAuthentication1");
	}
	
	void loginAuthentication2() {
		System.out.println("I am in Visa => loginAuthentication2");
	}
}

public class InheritanceEX{
	public static void main(String[] args) {
		
		MasterCard ref = new DBSBank();
		// up casting
		//create new DBS object which inherits from Mastercard
		DBSBank ref2 = (DBSBank) new MasterCard();
		// down casting
		ref.loginAuthentication1();
		// parent class static will be called as cannot be overridden
		ref.loginAuthentication2();
		// child class method will be called
	}
}