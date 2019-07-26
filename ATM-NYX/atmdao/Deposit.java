package atmdao;


import atmpojo.Account;
import atmpojo.BankAccount;

public interface Deposit {
	//checks validity of deposit. If amount is positive or negative
	public boolean DepositCheck(double amt, BankAccount bA);

}
