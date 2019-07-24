package DAO;


import POJO.Account;

public interface Deposit {
	//checks validity of deposit. If amount is positive or negative
	public boolean DepositCheck(double amt, Account Acc);

}
