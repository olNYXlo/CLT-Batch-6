package personDAO;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PersonDBConnection2 {
	
	public static Connection myConnection() { 
		// Static to allow for execution of method without creating object
		Connection con = null;
		FileReader fReader = null;
		
		//create properties object
		Properties propRef = new Properties();
		
		try {
			fReader = new FileReader("db.properties");
			//load jdbc related properties in above file
			propRef.load(fReader);
			//load the Driver class
			Class.forName(propRef.getProperty("db_driver_class"));
			//this "key" can be anything. Has to match "key" in the properties file
			
			//create the connection
			con = DriverManager.getConnection(
					propRef.getProperty("db_url"), 
					// has to match what is written in the properties file
					propRef.getProperty("db_username"),
					propRef.getProperty("db_password"));
					
		} // end of try
		//FileNotFoundException is already caught in IOException
		catch (IOException | ClassNotFoundException | SQLException e) {
			System.out.println("PersonDBConnection 2 => DB Connection Error..");
		}// end of catch
		return con;	
		
	} // end of myConnection method
	
	
}// end of PersonDBConnection2
