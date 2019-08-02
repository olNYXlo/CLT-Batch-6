package personService;

import java.sql.SQLException;
import java.util.List;

import personPOJO.Person;

public interface RetrieveEmployeeListService {
	

	public List<Person> getList() throws SQLException, ClassNotFoundException;

}
