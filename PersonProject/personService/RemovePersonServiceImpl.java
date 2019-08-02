package personService;

import java.sql.SQLException;

import personDAO.PersonDAO;
import personDAO.PersonDAOImpl;

public class RemovePersonServiceImpl implements RemovePersonService {
	
	PersonDAO refDAO;


	@Override
	public void removePerson(int id) throws SQLException, ClassNotFoundException {
		
		refDAO = new PersonDAOImpl();
		refDAO.removePerson(id);

	}
}
