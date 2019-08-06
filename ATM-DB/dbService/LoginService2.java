package dbService;

import java.sql.SQLException;

public interface LoginService2 {
	//checks validity of login. If username exists in the records and if the specified passwords match that account
	public void Login() throws ClassNotFoundException, SQLException;

}
