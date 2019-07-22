package day5;

class A {
	
	// can use either contructor or setter method for association
	B refB;


	public B getRefB() {
		return refB;
	}


	public void setRefB(B refB) {
		this.refB = refB;
	}
	
	
	//to use constructor instead of setter method
	/* 
	 A(B refB){
	 	this.refB = refB
	 } 
	 
	 */

}


class B{
	C refC;
	public C getRefC() {
		return refC;
	}
	public void setRefC(C refC) {
		this.refC = refC;
	}
	void show() {
		System.out.println("I am in class B..");
	}
	
	void bypass() {
		this.refC.display();
	}
}

class C{
	String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	void display() {
		System.out.println("I am in Class C..");
	}
	
}




public class SimpleApplication {

	
	public static void main(String[] args) {
		
		A refA = new A();
		B refB = new B();
		C refC = new C();
		refA.setRefB(refB);
		refB.setRefC(refC);
		refA.getRefB().show(); // as refA.getRefB() returns the object B. so to call B's method, use .show()
		refA.getRefB().getRefC().display();
		refA.getRefB().bypass();
		
		
	
		
		
	}
	
	
}
