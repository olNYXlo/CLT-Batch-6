package atmservice;

import java.util.Map;

import atmpojo.Account;

public interface LoginService2 {
	//checks validity of login. If username exists in the records and if the specified passwords match that account
	boolean checkStatus(String input1, String input2, Map<String,Account> ACL);

}
