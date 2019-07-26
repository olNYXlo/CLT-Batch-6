package Service;

import DAO.LoginDAO;
import DAO.LoginDAOImpl;
import POJO.User;


public class LoginServiceImpl implements LoginService {
	
	LoginDAO refLoginDAO; // creating null reference

	@Override
	public void checkStatus(User ref) {
		
		refLoginDAO = new LoginDAOImpl(); // upcasting
		
		if(refLoginDAO.loginValidate(ref)==true){
			System.out.println("Welcome");
		}
		else {
			System.out.println("not valid..");
		}
		// TODO Auto-generated method stub

	}

}
