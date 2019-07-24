package Service;


import DAO.DepositImpl;
import DAO.Withdraw;
import DAO.WithdrawImpl;
import POJO.Account;

public class WithdrawServiceImpl implements WithdrawService {
	
	Withdraw refWith;// create a reference that points to null until method is run, only then a proper reference is given
	
	//checks validity of withdraw. If amount is positive or negative and if the account has enough balance

	@Override
	public boolean checkStatus(double amt, Account Acc) {
		
		boolean Status = false;
		refWith = new WithdrawImpl();

		if(Acc.getBankBalance()>= amt && amt > 0){
			Status = true;
		}
		else if (amt<0){
			System.out.println("Amount Can't Be Negative");
			Status = false;
		}
		else if (Acc.getBankBalance()<amt && amt>0) {
			Status = false;
			System.out.println("Choice not available!!");
		}
		return Status;
	}

}
