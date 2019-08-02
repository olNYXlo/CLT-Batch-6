package personService;

import java.sql.SQLException;

public interface RemovePersonService {
	
	public void removePerson (int id) throws SQLException, ClassNotFoundException;

}
