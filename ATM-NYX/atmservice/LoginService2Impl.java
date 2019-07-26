package atmservice;

import java.util.Map;

import atmdao.Login;
import atmdao.LoginImpl;
import atmpojo.Account;

public class LoginService2Impl implements LoginService2 {
	
	Login refLogin;// create a reference that points to null until method is run, only then a proper reference is given

	//checks validity of login. If username exists in the records and if the specified passwords match that account
	@Override
	public boolean checkStatus(String input1, String input2, Map<String,Account> ACL) {
		boolean Status;
		refLogin = new LoginImpl();
		
		if(refLogin.LoginCheck(input1,input2,ACL)==true) {
			Status = true;
		}
		else {
			Status = false;
		}
		return Status;
		// TODO Auto-generated method stub

	}

}
