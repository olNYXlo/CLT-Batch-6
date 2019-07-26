package atmcontrollers;

import java.util.Scanner;

import atmpojo.Account;
import atmpojo.BankAccount;
import atmservice.CheckBalanceServiceImpl;
import atmservice.DepositServiceImpl;
import atmservice.WithdrawServiceImpl;

public class TransactionMenu {
	
	private static boolean loopcheck;

	// launches the TransactionMenu after logging in

	public static boolean isLoopcheck() {
		return loopcheck;
	}

	public static void setLoopcheck(boolean loopcheck) {
		TransactionMenu.loopcheck = loopcheck;
	}

	public static void main(Account Acc) {

		// similar implementation to BaseMenu
		// same concept of implementing logical loops to create "recursive" functions

		loopcheck = true;
		BankAccount BA = Acc.getBA(); // Retrieves the bank account of the logged in user once entered this menu. As
										// any transactions done will be based on this
		while (loopcheck) {

			// displays the available transaction options after loggin in
			System.out.println("=======DBS Bank=======");
			System.out.println("Transaction Home Page:");
			System.out.println("1. Check Available Balance");
			System.out.println("2. Deposit Amount");
			System.out.println("3. Withdraw Amount");
			System.out.println("======================");
			System.out.println("Enter Your Choice :");
			Scanner sc = new Scanner(System.in);
			int Choice = sc.nextInt();
			switch (Choice) {

			case 1:// checking available balance
				
				CheckBalanceServiceImpl.CheckBalance(BA);

				break;
			// end of case 1

			case 2:// deposit service
				
				DepositServiceImpl.Deposit(BA);
				
				break;// end of case 2

			case 3:// withdraw service
				
				WithdrawServiceImpl.Withdraw(BA);
				
				break;
			// end of case 3

			default:
				System.out.println("Invalid Choice");
				System.out.println("======================");
				// loops back to transaction menu
				break;
				//end of default case
				// default case replaces "exception handling"? in the case of invalid command will route users back to the base menu

			}// end of switch case

		}//end of loopcheck
	}// end of main method
}// end of TransactionMenu Class
