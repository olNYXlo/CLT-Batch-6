class Bank{
	
	Bank(){
		System.out.println("I am in default constructor ==> Bank");
	}

}

class DigitalBank extends Bank {
	DigitalBank(int code){
		System.out.println("Bank " + code);
	}
	
}


class ChildClassOfDigitalBank extends DigitalBank{
	ChildClassOfDigitalBank(int code){
		super(code);
	}
	
}


public class InheritanceEX2 {
	
	public static void main(String[] args) {
		new DigitalBank(23);
		new ChildClassOfDigitalBank(2);
	}

}

/*
class DigitalBank extends Bank{

DigitalBank(String location, int code){
super(location);	calls parent class constructor
}
}

class Bank{

Bank(String location){
System.out.println("I am in default constructor ==> Bank");
}
*/

