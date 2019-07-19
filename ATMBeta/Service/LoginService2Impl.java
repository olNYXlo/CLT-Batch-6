package Service;

import DAO.Login;
import DAO.LoginImpl;
import POJO.Account;

public class LoginService2Impl implements LoginService2 {
	
	Login refLogin;

	@Override
	public void checkStatus(Account ref) {
		
		refLogin = new LoginImpl();
		
		if(refLogin.LoginCheck(ref)==true) {
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
