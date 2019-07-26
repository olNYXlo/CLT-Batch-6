package atmdao;

import java.util.HashMap;
import java.util.Map;

import atmpojo.Account;

public class LoginImpl implements Login {
	
	boolean status;

	//checks validity of login. If username exists in the records and if the specified passwords match that account
	@Override
	public boolean LoginCheck(String input1, String input2, Map<String,Account> ACL) {
		
		if(ACL.containsKey(input1) && ACL.get(input1).getPassword().equals(input2)) {			
			status = true;			
		}
		else {
			status = false;;
		}
		
		return status;

	}


}
