package atmcontrollers;

import java.util.Map;
import java.util.Scanner;

import atmdao.AccountList;
import atmdao.BankAccountList;
import atmpojo.Account;
import atmpojo.BankAccount;
import atmservice.ForgotPwServiceImpl;
import atmservice.LoginService2Impl;
import atmservice.RegisterServiceImpl;

public class BaseMenu {

	// launches the base menu when the application starts

	public void launch() {

		// as the main method to generate the AccountList is static, can just call the
		// method without creating an AccountList object
		// The ACL is specified here to given all services (classes) that come after it
		// access to its variables
		
		// BankAccList is also created mainly to be used in register service to link
		// newly created account
		// with existing bank account
		Map<String, Account> ACL = AccountList.main();
		Map<String, BankAccount> BankAccL = BankAccountList.main();

		// Links the 2 HashMap objects together.

		ACL.get("abc@gmail.com").setBA(BankAccL.get("1234567891"));
		BankAccL.get("1234567891").setAccountLinked(true);

		ACL.get("abcd@gmail.com").setBA(BankAccL.get("1234567892"));
		BankAccL.get("1234567892").setAccountLinked(true);

		ACL.get("abcde@gmail.com").setBA(BankAccL.get("1234567893"));
		BankAccL.get("1234567893").setAccountLinked(true);

		ACL.get("abcdef@gmail.com").setBA(BankAccL.get("1234567894"));
		BankAccL.get("1234567894").setAccountLinked(true);

		// generates list of bank accounts registered by the bank. To be used to link to
		// the customer's existing or newly set up online account

		// this loopcheck is to ensure the Base Menu will always be displayed after each
		// choice
		// as the value is kept at true so the while loop will always run
		// use of loopcheck makes it a "recursive" method that keeps calling itself

		boolean loopcheck = true; // this value will always be true, hence the user will never be able to exit
									// from this program or end it
		while (loopcheck) {
			// Prints available options for user to pick from
			System.out.println("=======DBS Bank=======");
			System.out.println("User Home Page:");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Forget Password");
			System.out.println("4. Logout (exit)");
			System.out.println("======================");
			System.out.println("Enter Your Choice :");
			Scanner sc = new Scanner(System.in);
			int Choice = sc.nextInt();
			switch (Choice) {// Depending on user input, will start the relevant service

			case 1:// Register Service
				
				RegisterServiceImpl.Reg(ACL, BankAccL); // launch Register Service
				break; // end of case 1
				

			case 2:// Login Service
				LoginService2Impl.Login(ACL);
				break; // end of case 2;


			case 3:// Forgot Password Service

				ForgotPwServiceImpl.FPW(ACL);
				break;
				//end of case 3 (forgot password service)

			case 4:// Logout Service

				// loops back to base menu
				// pointless service and could be removed as you are not even logged in yet

				break;
				//end of case 4 (logout service)
			default: // Invalid Choice
				System.out.println("Invalid Choice");
				System.out.println("======================");
				// loops back to base menu to prompt user for a valid choice
				break;
				//end of default case
				// default case replaces "exception handling"? in the case of invalid command will route users back to the base menu
			}// end of switch case

		}// end of loopcheck
	}// end of launch method
}// end of BaseMenu class
