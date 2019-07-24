package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;



public class DevCode2 {
	
	//handle NullPointerException (Pointer -> null)
	//handle NumberFormatException (BufferedReader)
	//handle InputMismatchException (Scanner)

	public static void logic() throws IOException {// throws is due to BufferedReader function
		//Throwing NumberFormatException is Optional. Without throwing this, if we have an InputMismatch, will display NumberFormatExceptions
		//Throwing IOException is mandatory
		
		String ptr = null;
		try {
			if(ptr.equals("abc")) {
				System.out.println("same");
			}
			else if (ptr.equals("abc")) {
				System.out.println("different");
			}
		}
		
		catch (NullPointerException e) {
			System.out.println("Pointer is pointing to null");
		}
		finally {
			System.out.println("Shutting down");
		}
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int number = sc.nextInt();
		System.out.println(number);
		}
		
		catch (InputMismatchException e) {
			System.out.println("Scanner is taking in a wrong data type as input");			
			
		}
		finally {
			System.out.println("Shutting down");
		}
		
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter another number:");
		int anothernumber = Integer.parseInt(br.readLine());
		System.out.println(anothernumber);
		}
		
		catch (NumberFormatException e) {
			System.out.println("BufferedReader is taking in a wrong data type as input");
			
		}
		
		finally {
			System.out.println("Shutting down");
		}
	}
}
