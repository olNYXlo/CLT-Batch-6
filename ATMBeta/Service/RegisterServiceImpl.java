package Service;


import DAO.Register;
import POJO.Account;

public class RegisterServiceImpl implements RegisterService {
	
	Register refRegister;

	@Override
	public void Register(Account ref) {
		
		refRegister = new LoginImpl();
		
		if(refRegister.RegisterCheck(ref)==true) {
			System.out.print("logged in");
			//launch transaction controller?
		}
		else {
			System.out.print("logged out");
			//launch login controller?
		}		
		// TODO Auto-generated method stub

	}

}
