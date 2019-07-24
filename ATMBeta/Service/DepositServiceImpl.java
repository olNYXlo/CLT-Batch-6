package Service;



import DAO.Deposit;
import DAO.DepositImpl;
import POJO.Account;


public class DepositServiceImpl implements DepositService {
	
	Deposit refDep;// create a reference that points to null until method is run, only then a proper reference is given
	//checks validity of deposit. If amount is positive or negative

	@Override
	public boolean checkStatus(double amt, Account Acc) {
		
		boolean Status;
		refDep = new DepositImpl();
		
		if(refDep.DepositCheck(amt,Acc)==true) {
			Status = true;
		}
		else {
			Status = false;
		}
		return Status;


}
}

