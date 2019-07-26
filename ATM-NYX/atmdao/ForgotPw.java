package atmdao;

import java.util.Map;

import atmpojo.Account;

public interface ForgotPw {
	//checks if given security key matches records. if match, will give user the password to his account
	public boolean SKCheck(String input1, String input2, Map<String,Account> ACL);

}
