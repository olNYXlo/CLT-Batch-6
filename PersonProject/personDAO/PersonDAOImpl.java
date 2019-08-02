package personDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import personPOJO.Person;



public class PersonDAOImpl implements PersonDAO {
	
	Connection con;
	PreparedStatement ps;
	
	void getConnection() {
		try {
			con = PersonDBConnection.prepareConnection();
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("DB Connection Error..");
		}
	}// end of getConnection
	
	/* Connection conRef;
	 * PreparedStatement psRef; // PreparedStatement performance better than Statement
	 * 
	 * void getConnection(){
	 * try{
	 * conRef = DBConnection.prepareConnection();
	 * }
	 * catch(ClassNotFoundException | SQLException e){
	 * System.out.println("DB Connection Error..");
	 * }
	 * }
	
	
	
	
	*/

	@Override
	public void addPerson(Person pRef) throws ClassNotFoundException, SQLException {
		
		// getConnection();

		getConnection();

		// Statement st = con.createStatement(); // Create statement using SQL connection
		


		//String sql = "INSERT INTO Persons " + "VALUES ( '" + pRef.getName() + "', " + pRef.getId() + ", '" + pRef.getPassword() + "', STR_TO_DATE('" + pRef.getDOB() + "', '%d-%m-%Y'))";
		// use STR_TO_DATE to manually convert string to date format in SQL
		// the %d-%m-%y is the format of your value before it so if you use  1990-01-01, it should be %y-%m-%d
		
		
		
		// String sql = "INSERT INTO Persons " + "VALUES ( '" + pRef.getName() + "', " + pRef.getId() + ", '" + pRef.getPassword() + "', '" + pRef.getDOB() + "')";
		// Works without using STR_TO_DATE but only if the user inputs a proper DOB in the format YYYY-MM-DD
		
		ps = con.prepareStatement("INSERT INTO Persons VALUES( ?, ?, ?, ?)"); // Create statement using SQL connection
		ps.setString(1, pRef.getName());
		ps.setInt(2,pRef.getId());
		ps.setString(3, pRef.getPassword());
		ps.setString(4, pRef.getDOB());
		
		ps.executeUpdate();
		
		
		// st.executeUpdate(sql);
		System.out.println("Addition of Person into Employee List Successfully");
		con.close();
		PersonDBConnection.setRef(null); // have to set to null. else even though connection closed, Connection ref is has some value

	}// end of addPerson
	
	
	public static boolean checkIDExists(int id) throws ClassNotFoundException, SQLException{
		
		boolean check = false;
		
		Connection con = PersonDBConnection.prepareConnection();

		PreparedStatement ps = con.prepareStatement("SELECT * from Persons Where ID = ?"); // Create statement using SQL connection
		
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		if (rs.next() == false) {
			System.out.println("Employee ID does not exist in DB");
			System.out.println("=========================");
		}else {
			System.out.println("Employee ID exists in DB");
			System.out.println("=========================");
			check = true;
		}
		con.close();
		PersonDBConnection.setRef(null);
		return check;
		// do not close connection here else will not run properly
		
	}

	@Override
	public void updatePerson(Person pRef) throws ClassNotFoundException, SQLException {
		
		getConnection();

		ps = con.prepareStatement("UPDATE Persons SET name = ?, Password = ?, DOB = ? WHERE id = ?"); // Create statement using SQL connection
		
		ps.setString(1, pRef.getName());
		ps.setString(2, pRef.getPassword());
		ps.setString(3, pRef.getDOB());
		ps.setInt(4, pRef.getId());
		
		ps.executeUpdate();
		System.out.println("Record updated Successfully");
		con.close();
		PersonDBConnection.setRef(null);
		

	}

	@Override
	public List<Person> listPerson() throws SQLException, ClassNotFoundException {
		
		getConnection();

		ps = con.prepareStatement("SELECT * FROM Persons"); // Create statement using SQL connection
		
		ResultSet rs = ps.executeQuery();
		
		//System.out.println("Printing ResultSet");
		//System.out.println(rs);
		//System.out.println("=========================");
		List <Person> EmpList = new ArrayList<Person>();
		
		
		
		while(rs.next()) {
			Person Emp = new Person();
			Emp.setDOB(rs.getString("DOB"));
			Emp.setId(rs.getInt("ID"));
			Emp.setName(rs.getString("Name"));
			Emp.setPassword(rs.getString("Password"));
			EmpList.add(Emp);
			System.out.println("=========================");
			System.out.println("name =" + rs.getString("Name") + " " + "DOB =" + rs.getString("DOB") +" " + "ID =" + rs.getInt("ID") + " " + "Password =" + rs.getString("Password"));
		}
		System.out.println("=========================");
		System.out.println("Printed ArrayList");
		con.close();
		PersonDBConnection.setRef(null);
		return EmpList;
		
	}

	@Override
	public void getPersonById(int id) throws ClassNotFoundException, SQLException {
		
		getConnection();

		ps = con.prepareStatement("SELECT * FROM Persons Where ID = ?"); // Create statement using SQL connection
		
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		//System.out.println("Printing ResultSet");
		//System.out.println(rs);
		
		while(rs.next()) { // have to include this line when processing result set else will not be able to access rs.getString or anything not sure why
		System.out.println("Printing Person Details");
		System.out.println("name = " + rs.getString("Name") + " " + "DOB = " + rs.getString("DOB") +" " + "ID = " + rs.getInt("ID") + " " + "Password = " + rs.getString("Password"));
		}
		con.close();
		PersonDBConnection.setRef(null);
		System.out.println("Printed Employee Details of ID = " + id);
		

	}

	@Override
	public void removePerson(int id) throws SQLException{
		getConnection();
		
		ps = con.prepareStatement("DELETE FROM Persons WHERE ID = ?"); // Create statement using SQL connection
		ps.setInt(1, id);
		ps.executeUpdate();
		con.close();
		PersonDBConnection.setRef(null);
		System.out.println("Removed Employee Details of ID = " + id + " successfully.");

	}
}
