package atmdao;


import atmpojo.Account;

public class DepositImpl implements Deposit {

	//checks validity of deposit. If amount is positive or negative
	@Override
	public boolean DepositCheck(double amt, Account Acc) {
		boolean status = false;
		if (amt > 0) {
			status = true;
		} 
		else if (amt<0) {
			status = false;
		}
		return status;
	}
}
