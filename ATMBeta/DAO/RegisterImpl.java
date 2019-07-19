package DAO;

import POJO.Account;

public class RegisterImpl implements Register {
	
	boolean RegStatus;

	@Override
	public boolean RegisterCheck(String ref) {

			if(!AccList.containsKey(ref.getUserID())) {
				RegStatus = true;
			}
			else if (AccList.containsKey(ref.getUserID())){
				RegStatus = false;
			}			

		
		return RegStatus;		
		
	}

}
