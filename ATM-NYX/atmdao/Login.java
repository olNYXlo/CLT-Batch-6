package atmdao;

import java.util.Map;

import atmpojo.Account;

public interface Login {
	

	//checks validity of login. If username exists in the records and if the specified passwords match that account
	public boolean LoginCheck(String input1, String input2, Map<String, Account> ACL);

}
