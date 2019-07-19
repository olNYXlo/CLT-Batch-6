package Service;


import POJO.Account;

public class WithdrawServiceImpl implements WithdrawService {
	
	Account refAcc;

	@Override
	public void withdraw(double x) {

		if(refAcc.getBankBalance()>= x && x > 0){
			refAcc.setBankBalance(refAcc.getBankBalance()-x);
			System.out.println("Transaction Successful!!");
		}
		else if (x<0){
			System.out.println("Amount Can't Be Negative");
		}
		else if (refAcc.getBankBalance()<x && x>0) {
			System.out.println("Choice not available!!");
		}
	}

}
