package DAO;



import POJO.Account;

public interface Withdraw {
	

	//checks validity of withdraw. If amount is positive or negative and if the account has enough balance
	public boolean WithdrawCheck(double amt, Account Acc);

}
