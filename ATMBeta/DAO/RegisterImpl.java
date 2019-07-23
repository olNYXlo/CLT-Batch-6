package DAO;

import java.util.Scanner;

import POJO.Account;

public class RegisterImpl implements Register {
	Account NewAcc = new Account();
	boolean RegStatus;

	@Override
	public boolean RegisterCheck(String ref) {

			if(!AccList.containsKey(ref)) {
				RegStatus = true;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter email address :");
				String UserID = sc.nextLine();
				System.out.println("Enter password :");
				String password = sc.nextLine();
				System.out.println("Re-Type Password :");
				String repassword = sc.nextLine();
				if (password.equals(repassword)){
					NewAcc.setPassword(repassword);
					System.out.println("What is your favourite color?");
					String SecurityKey = sc.nextLine();
					NewAcc.setSecurityKey(SecurityKey);
					System.out.println(SecurityKey + " is your security key, in case you forget your password.");
					
				}
			}
			else if (AccList.containsKey(ref)){
				RegStatus = false;
				System.out.println("email already exists!!");
			}			

		
		return RegStatus;		
		
	}

}
