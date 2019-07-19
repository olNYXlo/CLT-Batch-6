package ATM;

import java.util.HashMap;

public class account {
	private HashMap<String,String> acclist;
	private String userID;
	private String pw;
	private int login;
	private int balance;
	// use 0 and 1 to indicate login status. check this value when trying to use the methods
	public static void main(String[] args) {
		HashMap<String,String> acclist = new HashMap <String,String>();
		acclist.put(userID,pw);
	}
	public void checkBalance(Strings[] args) {
		System.out.println(account.balance);
	}
	
	public void deposit(int n) {
		if (n>0) {
		account.balance += n;
	}
	}
	public void withdraw(int n) {
		if (n<=account.balance) {
			account.balance -= n;
		}
		else if (n<0) {
			System.out.println("Amount can't be negative!");
		}
		else if(n>account.balance) {
			System.out.println("Sorry!! insufficient balance.");s
		}
	}

}
