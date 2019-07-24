package DAO;

import java.util.Map;

import POJO.Account;

public class testclass {

	public static void main(String[] args) {
		
		Map<String, Account> ACL = AccountList.main();
		System.out.print(ACL.get("abc@gmail.com").getSecurityKey()
				);
		

	}
}
