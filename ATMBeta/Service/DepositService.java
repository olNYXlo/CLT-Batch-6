package Service;


import POJO.Account;

public interface DepositService {

	
	//checks validity of deposit. If amount is positive or negative
	boolean checkStatus(double amt, Account Acc);

}
