package atmdao;


import atmpojo.BankAccount;

public class WithdrawImpl implements Withdraw {

	//checks validity of withdraw. If amount is positive or negative and if the account has enough balance
	@Override
	public boolean WithdrawCheck(double amt, BankAccount BA) {
		boolean status = false;
		if (amt > 0 && amt < BA.getBankBalance()) {
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
