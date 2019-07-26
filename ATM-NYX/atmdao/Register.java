package atmdao;

import java.util.Map;

import atmpojo.Account;

public interface Register {
	//checks if given username already exists in the records. If exists, throw an error message and prompt another input.
	//if given username does not exist, continue with registration process
	boolean RegisterCheck(String input, Map<String,Account> ACL);

}
