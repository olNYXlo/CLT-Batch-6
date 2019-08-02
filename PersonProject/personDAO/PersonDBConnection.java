package personDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PersonDBConnection {

	private static Connection ref;

	public Connection getRef() {
		return ref;
	}

	public static void setRef(Connection ref) {
		PersonDBConnection.ref = ref;
	}

	private PersonDBConnection() throws ClassNotFoundException, SQLException { 
		// private constructor. cannot create object outside of the class
		// database URL
		// 3306 is default port for mysql
		String connectionURL = "jdbc:mysql://localhost:3306/batch6"; // batch6 is database name

		// database credentials
		String uname = "root";
		String pwd = "root";

		// Register JDBC driver
		Class.forName("com.mysql.jdbc.Driver");

		// Open a connection
		ref = DriverManager.getConnection(connectionURL, uname, pwd);
		System.out.println("Connected..."); // once constructed means is connected

	}

	public static Connection prepareConnection() throws ClassNotFoundException, SQLException{

		if (ref == null) {
			// have to check this else will create multiple objects if code runs multiple times
			PersonDBConnection DB = new PersonDBConnection(); // initiates DB connection to mySQL

		}
		return ref;

	}
}// end of PersonDBConnection Class
