package DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import POJO.Account;
import POJO.BankAccount;

public class BankAccountList {
	
	
	private static Map<String, BankAccount> BankAccL = new HashMap<String, BankAccount>();
	
	



	public static Map<String, BankAccount> getBankAccL() {
		return BankAccL;
	}





	public static void setBankAccL(Map<String, BankAccount> bankAccL) {
		BankAccL = bankAccL;
	}





	public static Map<String, BankAccount> main() {
		
		BankAccount ba1 = new BankAccount();
		BankAccount ba2 = new BankAccount();
		BankAccount ba3 = new BankAccount();
		BankAccount ba4 = new BankAccount();
		BankAccount ba5 = new BankAccount();
		BankAccount ba6 = new BankAccount();
		BankAccount ba7 = new BankAccount();
		BankAccount ba8 = new BankAccount();
		BankAccount ba9 = new BankAccount();
		
		ba1.setBankAcc("1234567891");
		ba1.setBankBalance(1000);
		
		ba2.setBankAcc("1234567892");
		ba2.setBankBalance(2000);
		
		ba3.setBankAcc("1234567893");
		ba3.setBankBalance(3000);
		
		ba4.setBankAcc("1234567894");
		ba4.setBankBalance(4000);
		
		ba5.setBankAcc("1234567895");
		ba5.setBankBalance(5000);
		
		ba6.setBankAcc("1234567896");
		ba6.setBankBalance(6000);
		
		ba7.setBankAcc("1234567897");
		ba7.setBankBalance(7000);
		
		ba8.setBankAcc("1234567898");
		ba8.setBankBalance(8000);
		
		ba9.setBankAcc("1234567899");
		ba9.setBankBalance(9000);
		

		BankAccL.put(ba1.getBankAcc(),ba1);
		BankAccL.put(ba2.getBankAcc(),ba2);
		BankAccL.put(ba3.getBankAcc(),ba3);
		BankAccL.put(ba4.getBankAcc(),ba4);
		BankAccL.put(ba5.getBankAcc(),ba5);
		BankAccL.put(ba6.getBankAcc(),ba6);
		BankAccL.put(ba7.getBankAcc(),ba7);
		BankAccL.put(ba8.getBankAcc(),ba8);
		BankAccL.put(ba9.getBankAcc(),ba9);
		
		return BankAccL;

	}
}
