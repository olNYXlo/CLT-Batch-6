package DAO;

import POJO.User;
import atmdao.Login;

public class LoginDAOImpl implements LoginDAO {
	
	boolean status;
	
	// connect with the DB

	@Override
	public boolean loginValidate(User ref) {
		if (ref.getUserID().equals("abc@gmail.com") && ref.getUserPassword().equals("password")) {
			status = true;
		}
		else {
			status = false;
		}
		return status;
	}

}
