package atmservice;


import atmpojo.Account;
import atmpojo.BankAccount;

public interface DepositService {

	
	//checks validity of deposit. If amount is positive or negative

	boolean checkStatus(double amt, BankAccount BA);

}
