package day10;

// List<T> interface
interface Book<Programming>{ // Java is Type of book <T>. Book is a list interface of Programming type objects
	
	void showDetails(Programming pRef); // void add(T ref)
	
}// end of book


class CoreJava<Java> implements Book<Java>{// Declared Type has to be same throughout class. ArrayList<T> implements List<T>

	@Override
	public void showDetails(Java jRef) {// 50			//void add(T ref)
		
		System.out.println(jRef);// 50
		
	}// end of showDetails

	
}// end of CoreJava


public class GenericsApplication {

	public static void main(String[] args) {
		
		// int price = 50;
		Integer price = 60; // wrapper class
		
		CoreJava<Integer> ref1 = new CoreJava<Integer>();
		ref1.showDetails(price);
		String name = "Complete Reference"; // Java API defined class
		
		CoreJava<String> ref2 = new CoreJava<String>();
		ref2.showDetails(name);
		
		Person pRef = new Person();
		pRef.setName("Ben");
		CoreJava<Person> ref3 = new CoreJava<Person>(); // person is a user defined class in Java
		
		ref3.showDetails(pRef);

	}
}


class Person{
	String name;
	
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	@Override
	public String toString() {
		return name;
		
	}
	
	
	
}
