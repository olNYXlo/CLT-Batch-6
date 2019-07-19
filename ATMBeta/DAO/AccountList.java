package DAO;

import POJO.Account;
import java.util.HashMap;

public class AccountList {
	
	public static void main (String[] args) {
		
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
		
		
		HashMap <String, Account> AccList = new HashMap <String, Account>();
		AccList.put(a1.getUserID(),a1);
		AccList.put(a2.getUserID(),a2);
		AccList.put(a3.getUserID(),a3);		
		AccList.put(a4.getUserID(),a4);	
	
		
		
		
		
	}
	

}
