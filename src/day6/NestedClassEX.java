package day6;

public class NestedClassEX {
	
	
	
	class MyInnerClass1{ // non static inner class
		
		void myMethod1() {
			System.out.println("I am in InnerClass1, calling method1");
			
		}
		/*
		static void myMethod2() {// compilation error as cannot write static method in non-static inner class
			
			
		}*/
		
	}
	
	static class MyInnerClass2{ // static inner class
		
		void myMethod3() {
			System.out.println("I am in InnerClass2, calling method3");
			
			
		}
		static void myMethod4() {
			System.out.println("I am in InnerClass2, calling method4");			
			
		}
		
	}
	
	void access1() {
		MyInnerClass1 IC1 = new MyInnerClass1();
		IC1.myMethod1();
	}
	
	void access2() {
		MyInnerClass2 IC2 = new MyInnerClass2();
		IC2.myMethod3();
	}
	
	
	
	void access3() { 
		class MyInnerClass3{ // method local inner class
			void myMethod5() {
				System.out.println("I am in InnerClass3, calling method5");
			}
			/* static void myMethod6() { // Compilation as cannot have static method in non-static inner class
				
			}*/ 
					
			
		}
		MyInnerClass3 IC3 = new MyInnerClass3();
		IC3.myMethod5();
	}
	
	public static void main(String[] args) {
		NestedClassEX NC = new NestedClassEX();
		NC.access1();
		NC.access2();
		//done to create inner class from outside the class.
		//alternative method instead of creating innerclass object inside a new method
		// can just create inner class object can call method directly
		NestedClassEX.MyInnerClass1 IC1 = NC.new MyInnerClass1();
		IC1.myMethod1();
		// can access Static method in static inner class by direct calling it instead of creating object
		NestedClassEX.MyInnerClass2.myMethod4();
		NC.access3();

		
		
		
		
		
	}

}
