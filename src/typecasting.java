class Parent{}
class Child extends Parent{}


public class typecasting {
	int num1 = 10;
	long num2 = num1;
	//implicit type casting
	
	long num3 = 500;
	int num4 = (int) num3;
	//explicit type casting. 
	
	//up casting and down casting
	String ref1 = "Java";
	// object is super class (root class) of all the classes in Java
	Object ref2 = ref1;
	
	Parent refParent = new Child();
	//up casting
	
	Object ref3 = "Python";
	String ref4 = (String) ref3;
	
	// down casting
	
	

}
