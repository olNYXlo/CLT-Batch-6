package DAO;

import POJO.User;

public class LoginDAOImpl implements Login {
	
	boolean status;
	
	// connect with the DB

	@Override
	public boolean loginValidate(User ref) {
		if (ref.getUserID()=="abc@gmail.com" && ref.getUserPassword().contentEquals("password")) {
			status = true;
		}
		else {
			status = false;
		}
		return status;
	}

}
