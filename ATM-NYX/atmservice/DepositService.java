package atmservice;


import atmpojo.Account;

public interface DepositService {

	
	//checks validity of deposit. If amount is positive or negative
	boolean checkStatus(double amt, Account Acc);

}
