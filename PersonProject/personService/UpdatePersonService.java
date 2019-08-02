package personService;

import java.sql.SQLException;

import personPOJO.Person;

public interface UpdatePersonService {
	
	public void updatePerson(Person pRef) throws ClassNotFoundException, SQLException;

}
