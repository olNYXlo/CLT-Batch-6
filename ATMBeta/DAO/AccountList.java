package DAO;

import POJO.Account;


import java.util.HashMap;
import java.util.Map;

public class AccountList {
	
	//Create a hashmap of Accounts
	//Key being the userID
	//value being the Account object (userID, password, securitykey & bank balance)
	
	private static Map<String, Account> ACL = new HashMap <String, Account>();
	
	// Made the getter for the generated AccountList as public and static so it can be accessed by the various services
	
	public static Map<String, Account> getACL() {
		return ACL;
	}

	public static Map<String, Account> main () {
		
		Account a1 = new Account();
		Account a2 = new Account();
		Account a3 = new Account();
		Account a4 = new Account();
		
		a1.setUserID("abc@gmail.com");
		a1.setPassword("password");
		a1.setSecurityKey("black");
		a1.setBankBalance(1000);
		
		a2.setUserID("abcd@gmail.com");
		a2.setPassword("password");
		a2.setSecurityKey("yellow");
		a2.setBankBalance(2000);
		
		a3.setUserID("abcde@gmail.com");
		a3.setPassword("password");
		a3.setSecurityKey("blue");
		a3.setBankBalance(3000);	
		
		a4.setUserID("abcdef@gmail.com");
		a4.setPassword("password");
		a4.setSecurityKey("white");
		a4.setBankBalance(4000);		
		

		ACL.put(a1.getUserID(),a1);
		ACL.put(a2.getUserID(),a2);
		ACL.put(a3.getUserID(),a3);		
		ACL.put(a4.getUserID(),a4);	
		return ACL;	
		
		
		
	}
	

}
