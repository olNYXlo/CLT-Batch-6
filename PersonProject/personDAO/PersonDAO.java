package personDAO;

import java.sql.SQLException;
import java.util.List;

import personPOJO.Person;

public interface PersonDAO {
	
	public void addPerson(Person pRef) throws ClassNotFoundException, SQLException;
	
	public void updatePerson(Person pRef) throws ClassNotFoundException, SQLException;
	
	public List<Person> listPerson() throws SQLException, ClassNotFoundException;
	
	public void getPersonById(int id) throws ClassNotFoundException, SQLException;
	
	public void removePerson(int id) throws SQLException;

}
