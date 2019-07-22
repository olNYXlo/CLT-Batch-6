package FactoryDesignPattern;

import java.util.Scanner;

public class FactoryDesignPatternEX {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Bank : ");
		String nameBank = sc.next();
		
		// at runtime, calling implemented class reference through the interface reference
		// implements the class using the interface reference at its runtime.
		// implemented class must have relationship with interface
		
		Bank refBank = BusinessLogic.myFactoryMethod(nameBank);
		refBank.offerCreditCard();
		sc.close();

	}
}
