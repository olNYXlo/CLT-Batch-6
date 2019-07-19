package DAO;

import POJO.Account;
import java.util.HashMap;

public class LoginImpl implements Login {
	
	boolean status;

	@Override
	public boolean LoginCheck(Account ref) {
		
		if(AccList.containsKey(ref.getUserID()) && ref.getPassword().contentEquals(AccList.get(ref.getUserID()).getPassword())) {
			status = true;			
		}
		else {
			status = false;;
		}
		
		return status;

	}


}
