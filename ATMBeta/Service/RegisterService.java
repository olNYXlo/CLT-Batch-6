package Service;

import java.util.Map;

import POJO.Account;

public interface RegisterService {
	//checks if given username already exists in the records. If exists, throw an error message and prompt another input.
		//if given username does not exist, continue with registration process
	boolean Register(String input, Map<String,Account> ACL);

}
