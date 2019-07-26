package atmdao;

import java.util.Map;

import atmpojo.Account;

public class RegisterImpl implements Register {
	Account NewAcc = new Account();
	boolean RegStatus = false;
	
	//checks if given username already exists in the records. If exists, throw an error message and prompt another input.
		//if given username does not exist, continue with registration process

	@Override
	public boolean RegisterCheck(String input, Map<String,Account> ACL) {
		
		if (!ACL.containsKey(input)) {
			RegStatus = true;
		}
		else if (ACL.containsKey(input)) {
			RegStatus = false;
		}
		return RegStatus;
		
			
		
	}

}
