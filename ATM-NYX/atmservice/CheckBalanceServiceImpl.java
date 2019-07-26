package atmservice;

import java.util.Scanner;

import atmcontrollers.TransactionMenu;
import atmpojo.BankAccount;

public class CheckBalanceServiceImpl {

	public static void CheckBalance(BankAccount BA) {

		double Balance = BA.getBankBalance();
		System.out.println("Account Balance " + Balance + " dollars.");
		System.out.println("======================");
		Scanner sc = new Scanner(System.in);

		boolean CheckContinue = true;
		// loop to make the checking of if the user wants to continue with another
		// transaction until a valid response is given

		while (CheckContinue) {
			System.out.println("Wish to Continue? (y\\n) ");
			System.out.println("======================");
			char ch;
			ch = sc.next().charAt(0);
			switch (ch) {
			case 'y':
				CheckContinue = false;
				// breaks out of checking for valid input of continue
				// loops back to transaction menu
				break;
			case 'n':
				System.out.println("Thanks for Banking With us!!!");
				System.out.println("======================");
				CheckContinue = false;
				TransactionMenu.setLoopcheck(false);
				break;
			// loops back to base menu.
			// changes the global loopcheck for the transaction menu to be false, breaking
			// out of the while loop
			// and reverting back to the base menu
			// logout
			default:
				System.out.println("invalid command");
				System.out.println("======================");
				// loop back for input
				break;

			}// end of switch case for continuation of another transaction
		} // end of while loop that checks if user wants to continue with another

	}// end of checkbalance method

}// end of checkbalanceserviceimpl class
