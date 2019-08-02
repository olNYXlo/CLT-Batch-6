package personService;

import java.sql.SQLException;
import java.util.List;

import personDAO.PersonDAO;
import personDAO.PersonDAOImpl;
import personPOJO.Person;

public class RetrieveEmployeeListServiceImpl implements RetrieveEmployeeListService {
	
	PersonDAO refDAO = null;

	

	@Override
	public List<Person> getList() throws SQLException, ClassNotFoundException {
		
		refDAO = new PersonDAOImpl();
		List<Person> Emplist = refDAO.listPerson();
		return Emplist;
		
		
	}
}
