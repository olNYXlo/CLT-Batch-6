package DAO;

import POJO.Account;

public class LoginImpl implements Login {
	
	boolean status;

	@Override
	public boolean LoginCheck(Account ref) {
		if(ref.getUserID().contentEquals("abc@gmail.com") && ref.getPassword().contentEquals("1234xyz")) {
			status = true;			
		}
		else {
			status = false;;
		}
		
		return status;

	}


}
