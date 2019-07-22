package day6;


//DBConnection class would be example of singleton class
class SingletonClass{
	private static SingletonClass ref;
	
	private SingletonClass(){ // private constructor. cannot create object outside of the class
		System.out.println("NiHao");
		
	}
	
	public static SingletonClass getMethod() { // return type is Singleton Class
		
		if (ref==null) {// have to check this else will create multiple objects if code runs multiple times.
			ref = new SingletonClass();
		}
		return ref;
	}
}




public class SingletonDesignPattern {
	
	
	
	
	public static void main(String[] args) {
		
		SingletonClass.getMethod();
		SingletonClass.getMethod();
		SingletonClass.getMethod();
		SingletonClass.getMethod();

	}
}
