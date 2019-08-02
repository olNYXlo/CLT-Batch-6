package personService;

import java.sql.SQLException;

import personDAO.PersonDAO;
import personDAO.PersonDAOImpl;

public class RetrieveEmployeeViaIDServiceImpl implements RetrieveEmployeeViaIDService {
	
	PersonDAO refDAO = null;



	@Override
	public void getEmployeeViaID(int id) throws SQLException, ClassNotFoundException{
		
		refDAO = new PersonDAOImpl();
		refDAO.getPersonById(id);
		
		
		
	}
}
