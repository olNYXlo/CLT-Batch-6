package atmservice;

import java.util.Map;

import atmpojo.Account;

public interface ForgotPwService {
	//checks if given security key matches records. if match, will give user the password to his account
	boolean checkStatus(String input1, String input2, Map<String,Account> ACL);

}
