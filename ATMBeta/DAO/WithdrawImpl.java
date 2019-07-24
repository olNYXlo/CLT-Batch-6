package DAO;


import POJO.Account;

public class WithdrawImpl implements Withdraw {

	//checks validity of withdraw. If amount is positive or negative and if the account has enough balance
	@Override
	public boolean WithdrawCheck(double amt, Account Acc) {
		boolean status = false;
		if (amt > 0 && amt < Acc.getBankBalance()) {
			status = true;
		} 
		else if (amt<0){
			System.out.println("Amount Can't Be Negative!!");
			status = false;
		}
		else {
			System.out.println("Sorry! Insufficient Balance");
			status = false;
		}
		return status;
		
	}
}
