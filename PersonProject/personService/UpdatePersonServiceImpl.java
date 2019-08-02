package personService;

import java.sql.SQLException;

import personDAO.PersonDAO;
import personDAO.PersonDAOImpl;
import personPOJO.Person;

public class UpdatePersonServiceImpl implements UpdatePersonService {
	
	PersonDAO refDAO = null; // creates DAO object pointing to null


	@Override
	public void updatePerson(Person pRef) throws ClassNotFoundException, SQLException {
		
		refDAO = new PersonDAOImpl(); // initializes DAOImpl object to DAO reference.
		refDAO.updatePerson(pRef);
		
		
		
		
	}
}
