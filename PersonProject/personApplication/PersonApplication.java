package personApplication;

import java.sql.SQLException;

import personController.UserInput;

public class PersonApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//execute controller
		UserInput.main();

	}
}

