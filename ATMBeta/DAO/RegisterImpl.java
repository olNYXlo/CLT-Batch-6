package DAO;

import POJO.Account;

public class RegisterImpl implements Register {
	
	boolean RegStatus;

	@Override
	public boolean RegisterCheck(Account ref) {

		if(ref.getUserID().contentEquals("abc@gmail.com") && ref.getPassword().contentEquals("1234xyz")) {
			RegStatus = true;			
		}
		else {
			RegStatus = false;;
		}
		
		return RegStatus;		
		
	}

}
