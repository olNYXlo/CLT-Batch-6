package atmservice;

import atmpojo.Account;

public interface WithdrawService {
	//checks validity of withdraw. If amount is positive or negative and if the account has enough balance
	boolean checkStatus(double amt, Account Acc);
}
