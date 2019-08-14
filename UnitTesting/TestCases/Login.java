package TestCases;

import java.util.Scanner;

public class Login {

	public static boolean loginValidation() {

		Scanner sc = new Scanner(System.in);
		System.out.println("input your user name : ");
		String uid = sc.nextLine();
		System.out.println("input your password : ");
		String pw = sc.nextLine();

		if (uid == "abc@gmail.com" && pw == "password") {
			System.out.println("Login successful");
			sc.close();
			return true;
		} else {
			System.out.println("Login Failed");
			sc.close();
			return false;
		}

	}
}
