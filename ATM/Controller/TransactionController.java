package Controller;

import java.util.Scanner;

import POJO.User;
import atmservice.LoginService2;
import atmservice.LoginService2Impl;

public class TransactionController {

	LoginService2 refLoginService; // null
	User refUser;
	public void userLoginController() {
		
		userInput();
		
		
	}
	
	void userInput() {
		
		System.out.print("Type 1 : Check Available Bank Balance\n");
		System.out.print("Type 2 : Deposit Amount\n");
		System.out.print("Type 3 : Withdraw Amount\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Choice : ");
		int Choice = sc.nextInt();
		
		switch (Choice){
			case 1:
				Check Balance;
				break;
			case 2:
				Deposit Amount;
				break;
			case 3:
				Withdraw Amount;
				break;
			default:
				System.out.println("Invalid Choice");
				break;			
			
				
		}
		

		sc.close();
	}	
	
	
}
