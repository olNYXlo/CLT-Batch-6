package day7;

import java.util.Scanner;

public class DoWhileEX {

	public static void main(String[] args) {
		String Choice;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name :");
		String name = sc.next();
		System.out.println("You have entered : " + name);
		System.out.println("Wish to continue : (yes/no)");
		Choice = sc.next();
		}
		while (Choice.equals("yes"));
		System.out.println("Thank You!!");			
	}
}
