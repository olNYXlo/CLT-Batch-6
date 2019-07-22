package day6PackA;

public class B {

	
	void accessAFromB() {// declared within class
		A refA = new A();
		System.out.println(refA.num1); // unable to access as it is private
		System.out.println(refA.num2);
		System.out.println(refA.num3);
		System.out.println(refA.num4);		
	}
	
public static void main(String[] args){

}
}
