package Service;

import DAO.Login;
import DAO.LoginImpl;
import POJO.User;

public class LoginServiceImpl implements LoginService2 {
	
	Login refLoginDAO; // creating null reference

	@Override
	public void checkStatus(User ref) {
		
		refLoginDAO = new LoginImpl(); // upcasting
		
		if(refLoginDAO.loginValidate(ref)==true){
			System.out.println("Welcome");
		}
		else {
			System.out.println("not valid..");
		}
		// TODO Auto-generated method stub

	}

}
