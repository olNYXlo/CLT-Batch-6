package day8;

class Singleton{
	private static Singleton single = null;

	public static Singleton getSingle() {
		return single;
	}

	public static void setSingle(Singleton single) {
		Singleton.single = single;
	}
	
	
}

public class DevCode {
	
	Singleton.getSingle();
	
	static void logic(int number) {
		
		try {
		/*int temp = number/0;
		System.out.println(temp); // logical error. ZeroDivisionError
		*/
			
		/*int a[] = {10,20,30,40,50};
		a[50] = 5000;
		System.out.println(a[50]);
		*/
		
			
		System.out.println(a);
		
		
	} 

		catch (NullPointerException e) {
			System.out.println("Null Pointer Exception caught");
		}
		
		catch (ArithmeticException e) {
		System.out.println("A number cannot be divisible by 0");
	}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Handled arrayindexoutofboundsException");
		}
		
		
		
		catch (Exception e) {
			System.out.println("Exception is the super class of all exception classes");
		}

	finally {
		System.out.println("closing files..");
	}
}
}
