class MyGenericClass{
	void genericMethod(Object ref) {
		System.out.println(ref);
	}
}

public class WrapperClass {
	public static void main(String[] args) {
		
		MyGenericClass refMyGenericClass = new MyGenericClass();
		
		int numberVariable = 20; // value 20 is pointing to reference numbervariable
		Integer numberReference = numberVariable; // autoboxing int into Integer
		
		refMyGenericClass.genericMethod(numberReference);
		
		String reference = "Java";
		refMyGenericClass.genericMethod(reference); //Passing string reference to object
		
		Person refPerson = new Person();
		refMyGenericClass.genericMethod(refPerson);//passing person reference to object
		
		Long longReference = (long) 50000;
		long longVariable = longReference; // unboxing Long to long
		
	}

}
