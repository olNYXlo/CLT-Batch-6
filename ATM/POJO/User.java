package POJO;

public class User {
	
	private String userID;
	private String userPassword;
	private String SecurityKey;
	private int LoginStatus;
	private int BankBalance;
	
	public String getUserID() {
		return userID;
	}
	
	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getSecurityKey() {
		return SecurityKey;
	}

	public void setSecurityKey(String securityKey) {
		SecurityKey = securityKey;
	}

	public int getLoginStatus() {
		return LoginStatus;
	}

	public void setLoginStatus(int loginStatus) {
		LoginStatus = loginStatus;
	}

	public int getBankBalance() {
		return BankBalance;
	}

	public void setBankBalance(int bankBalance) {
		BankBalance = bankBalance;
	}

}
