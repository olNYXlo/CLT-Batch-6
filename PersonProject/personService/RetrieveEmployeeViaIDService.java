package personService;

import java.sql.SQLException;

public interface RetrieveEmployeeViaIDService {
	
	public void getEmployeeViaID(int id) throws SQLException, ClassNotFoundException;

}
