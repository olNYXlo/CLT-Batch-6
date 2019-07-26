package atmservice;

import java.util.Scanner;

import atmcontrollers.TransactionMenu;
import atmdao.Withdraw;
import atmdao.WithdrawImpl;
import atmpojo.BankAccount;

public class WithdrawServiceImpl implements WithdrawService {

	Withdraw refWith;// create a reference that points to null until method is run, only then a
						// proper reference is given

	// checks validity of withdraw. If amount is positive or negative and if the
	// account has enough balance

	@Override
	public boolean checkStatus(double amt, BankAccount BA) {

		boolean Status = false;
		refWith = new WithdrawImpl();

		if (BA.getBankBalance() >= amt && amt > 0) {
			Status = true;
		} else if (amt < 0) {
			System.out.println("Amount Can't Be Negative");
			Status = false;
		} else if (BA.getBankBalance() < amt && amt > 0) {
			Status = false;
			System.out.println("Choice not available!!");
		}
		return Status;
	}// end of checkStatus method

	public static void Withdraw(BankAccount BA) {
		boolean loopcheckWith = true;
		Scanner sc = new Scanner(System.in);
		WithdrawServiceImpl refWithImpl = new WithdrawServiceImpl();// creates new WithdrawServiceImpl object
		while (loopcheckWith) {

			// logical loop that continuously prompts user until the withdraw service is
			// completed successfully
			System.out.println("Enter Amount : ");
			double amt = sc.nextDouble();
			System.out.println("======================");

			if (refWithImpl.checkStatus(amt, BA) == true) {// checks if the withdrawal amount is valid (lesser
															// than bank balance and is a positive number)

				BA.setBankBalance(BA.getBankBalance() - amt); // sets the bank balance
				System.out.println("Transaction Successful!!");
				System.out.println("======================");

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
						// loops back to transaction menu
						CheckContinue = false;
						break;
					case 'n':
						System.out.println("Thanks for Banking With us!!!");
						System.out.println("======================");
						TransactionMenu.setLoopcheck(false);
						CheckContinue = false;
						// loops back to base menu.
						// changes the global loopcheck for the transaction menu to be false, breaking
						// out of the while loop
						// and reverting back to the base menu
						// logout
						break;
					default:
						System.out.println("invalid command");
						System.out.println("======================");
						// loop back for input for continuation of transactions
						break;
					}// end of switch case for continuation of another transaction
				} // end of while loop that checks if user wants to continue with another
					// transaction or not
				loopcheckWith = false;
			} else if (refWithImpl.checkStatus(amt, BA) == false) {
				// loops back to withdraw service

			}

		} // end of while loop for withdraw service
	}// end of withdraw service method

}// end of withdrawserviceimpl class
