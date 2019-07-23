package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputEX {
	
	void userAccess() throws IOException {
		BufferedReader brRef = new BufferedReader(new InputStreamReader(System.in));
		//InputStreamReader is a Class. A Constructor is instantiated with the System.in
		// BufferedReader is a class. A Constructor is instantiated with the InputStreamReader
		//Association via Constructor method
		// any input will be stored in object form (brRef)
		
		/*
		System.out.println("Enter a character :");
		
		// char is a primitive data type
		
		char c; 
		brRef.read();
		brRef.read();
		char d = brRef.readLine().charAt(2); // alternative method to get 3rd element.
		//Reader processes the whole line or string then accesses the element based on the index
		
		//to get 3rd element
		c = (char) brRef.read(); //have to explicit cast object into data type
		System.out.println(c);
		System.out.println(d);
		*/
		
		
		System.out.println("Enter a Number: ");
		int number = Integer.parseInt(brRef.readLine());
		
		
		System.out.println("You have entered : " + number);
		
	}

	public static void main(String[] args) throws IOException {
		
		UserInputEX ref = new UserInputEX();
		ref.userAccess();

	}
}
