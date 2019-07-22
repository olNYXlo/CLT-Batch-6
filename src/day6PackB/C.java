package day6PackB;

import day6PackA.A;

public class C extends A{
	
	
	void accessAFromC() {// declared within class
		A refA = new A();
		System.out.println(refA.num1); // unable to access as it is private
		System.out.println(refA.num2); // unable to access default from outside package
		System.out.println(super.num3); //unable to access from protected as is not extended
		//if is extended, can just call the variable itself without creating object
		// use of super keyword is optional (without keyword will run this.num3)
		// considered a 'global' variable
		System.out.println(refA.num4);		
	}
	
	
	
public static void main(String[] args){

}
}
