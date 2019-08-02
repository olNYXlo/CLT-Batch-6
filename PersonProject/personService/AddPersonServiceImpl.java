package personService;


import java.sql.SQLException;

import personDAO.PersonDAO;
import personDAO.PersonDAOImpl;
import personPOJO.Person;

public class AddPersonServiceImpl implements AddPersonService {
	
	PersonDAO refDAO; // creates DAO object with reference pointing to null


	@Override
	public void add(Person pRef) throws ClassNotFoundException, SQLException { 
		// name method to be "CallMethodName" or "InvokeMethodName" so can know is in service layer & not DAO layer
		
		refDAO = new PersonDAOImpl();
		refDAO.addPerson(pRef);	
		
		
	}

	
}
