package atmpojo;

public class BankAccount {
	
	private String BankAcc;
	private double BankBalance;
	private boolean AccountLinked = false;
	
	public String getBankAcc() {
		return BankAcc;
	}
	public void setBankAcc(String bankAcc) {
		BankAcc = bankAcc;
	}
	public double getBankBalance() {
		return BankBalance;
	}
	public void setBankBalance(double bankBalance) {
		BankBalance = bankBalance;
	}
	public boolean isAccountLinked() {
		return AccountLinked;
	}
	public void setAccountLinked(boolean accountLinked) {
		AccountLinked = accountLinked;
	}
	

	
}
