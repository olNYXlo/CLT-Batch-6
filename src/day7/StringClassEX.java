package day7;

public class StringClassEX {
	
	String ProgLang = "Python";
	String ProgLang2 = "Python";
	//if compare these 2 in both scenarios will get same same
	
	
	String ProgLang3 = "Java";
	
	String ProgLang4 = new String ("Scala");
	String ProgLang5 = new String ("Scala");
	
	//if compare these 2 in both scenario will get different same. memory location/ hashcode is same
			
			
	Person Me = new Person("Xiao Ming");
	Person You = new Person("Xiao Ming");
	
	//if compare these 2 in both scenario will get different same. Memory location/ hashcode is same
	
	void scenario1() {
		if (ProgLang4 == ProgLang5) {
			System.out.println("same");
		}
		else {
			System.out.println("different");
		}
		
		
		
	}
	
	//use of new keyword changes the memory location of the variable
	// if dealing with new objects, use .equals() method to compare. only works for String class objects
	// .equals method does not work when comparing other class objects
	
	//hashcode() & .equals() method
	//if user defined class has hashcode and .equals() code implemented, logical check can be done on the class object
	// hashcode == memory location
	//if both memory location has same hashcode, means the type is the same
	//hashcode() checks what kind of object it is and memory storage location
	// only then can use .equals() method as is of same type
	
	// .equals() used to compare and check value

	void scenario2() {
		if (ProgLang4.equals(ProgLang5)) {
			System.out.println(Me.hashCode());
			System.out.println(You.hashCode());
			System.out.println("same");
		}
		else {
			System.out.println(Me.hashCode());
			System.out.println(You.hashCode());
			System.out.println("different");
		}
		
		
		
	}
	

	public static void main(String[] args) {
		
		StringClassEX SC = new StringClassEX();
		SC.scenario1();
		SC.scenario2();
		

	}
}
