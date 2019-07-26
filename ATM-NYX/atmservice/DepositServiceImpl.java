package atmservice;

import java.util.Scanner;

import atmcontrollers.TransactionMenu;
import atmdao.Deposit;
import atmdao.DepositImpl;
import atmpojo.Account;
import atmpojo.BankAccount;

public class DepositServiceImpl implements DepositService {

	Deposit refDep;// create a reference that points to null until method is run, only then a
					// proper reference is given
	// checks validity of deposit. If amount is positive or negative

	@Override
	public boolean checkStatus(double amt, BankAccount BA) {

		boolean Status;
		refDep = new DepositImpl();

		if (refDep.DepositCheck(amt, BA) == true) {
			Status = true;
		} else {
			Status = false;
		}
		return Status;

	}// end of checkStatus method

	public static void Deposit(BankAccount BA) {
		boolean loopcheckDep = true;
		DepositServiceImpl refDepImpl = new DepositServiceImpl();// creates new depositserviceimpl object
		Scanner sc = new Scanner(System.in);
		while (loopcheckDep) {

			// logical loop that repeats itself until the deposit transaction is performed
			// successfully
			// re-prompting users to key in a valid amount if they provided an invalid one
			// (negative value)
			System.out.println("Enter Amount : ");
			double amt = sc.nextDouble();
			System.out.println("======================");

			if (refDepImpl.checkStatus(amt, BA) == true) {
				double newBalance = BA.getBankBalance() + amt;
				BA.setBankBalance(newBalance);// sets the account bank balance
				System.out.println(amt + " dollar deposited successfully!!\n");
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

				loopcheckDep = false;
			} else if (refDepImpl.checkStatus(amt, BA) == false) {
				System.out.println("Amount can't be negative!!");
				System.out.println("======================");
				// automatically loops back to the start of while loop that prompts user to key
				// in amount
			}

			// transaction or not
		} // end of while loop for deposit service
	}// end of deposit method
}// end of depositserviceimpl class
