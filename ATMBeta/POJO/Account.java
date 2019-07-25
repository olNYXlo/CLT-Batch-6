package POJO;

public class Account {
	// Account details of userID, Password, SecurityKey & Bank Balance
	private String userID;
	private String password;
	private String SecurityKey;
	private double BankBalance;
	
	
	private BankAccount BA;
	
	public BankAccount getBA() {
		return BA;
	}
	public void setBA(BankAccount bA) {
		BA = bA;
	}
	
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecurityKey() {
		return SecurityKey;
	}

	public void setSecurityKey(String securityKey) {
		SecurityKey = securityKey;
	}

	

}
