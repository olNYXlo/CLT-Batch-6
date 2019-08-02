package personService;

import java.sql.SQLException;

import personPOJO.Person;

public interface AddPersonService {
	
	public void add(Person pRef) throws ClassNotFoundException, SQLException;

}
