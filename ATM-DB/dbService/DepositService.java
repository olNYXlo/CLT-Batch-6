package dbService;


import java.sql.SQLException;

import dbPOJO.BankAccount;

public interface DepositService {

	
	//checks validity of deposit. If amount is positive or negative

	public void Deposit(BankAccount BA) throws ClassNotFoundException, SQLException;

}
