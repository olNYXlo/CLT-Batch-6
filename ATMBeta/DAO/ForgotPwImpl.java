package DAO;

import java.util.Map;

import POJO.Account;

public class ForgotPwImpl implements ForgotPw {


	//checks if given security key matches records. if match, will give user the password to his account
	@Override
	public boolean SKCheck(String input1, String input2, Map<String,Account> ACL) {
		boolean status=false;
		
		if(ACL.containsKey(input1) && ACL.get(input1).getSecurityKey().equals(input2)) {			
			status = true;			
		}
		else {
			status = false;;
		}
		
		return status;
		
	}
}
