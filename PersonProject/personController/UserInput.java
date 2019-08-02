package personController;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import personDAO.PersonDAOImpl;
import personPOJO.Person;
import personService.AddPersonServiceImpl;
import personService.RemovePersonServiceImpl;
import personService.RetrieveEmployeeListServiceImpl;
import personService.RetrieveEmployeeViaIDServiceImpl;
import personService.UpdatePersonServiceImpl;

public class UserInput {

	public static void main() throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in); // scanner to handle user input

		boolean loopcheck = true; // loops the menu
		while (loopcheck) { // Prints out available options for Uer/ Admin
			System.out.println("=========================");
			System.out.println("Choose what you want to do : ");
			System.out.println("1. Add Employee into DB");
			System.out.println("2. Update Employee Details in DB");
			System.out.println("3. Retrieve Employee Details from DB");
			System.out.println("4. Get Employee Details from DB using ID");
			System.out.println("5. Remove Employee Details from DB");
			System.out.println("=========================");

			int Choice = sc.nextInt();
			switch (Choice) { // Switch case to determine which service to launch

			case 1:
				// Adding employee into DB service
				System.out.println("Adding Employee Into DB Service");
				System.out.println("=========================");
				Person newHire = new Person(); // creation of new Person object

				System.out.println("Enter Employee's name : ");
				String name = sc.next();
				newHire.setName(name); // set name attribute of object based on user input
				System.out.println("=========================");

				System.out.println("Enter Employee's ID : ");
				int id = sc.nextInt();
				newHire.setId(id);// set id attribute of object based on user input
				System.out.println("=========================");

				System.out.println("Enter Employee's password : ");
				String pw = sc.next();
				newHire.setPassword(pw);// set password attribute of object based on user input
				System.out.println("=========================");

				System.out.println("Enter Employee's DOB in yyyy-mm-dd format : ");
				String dob = sc.next();
				while (!dob.matches("\\d{4}-\\d{2}-\\d{2}")) { // prompts user until valid DOB format is entered
					System.out.println("Invalid DOB provided");
					System.out.println("Enter Employee's DOB in yyyy-mm-dd format : ");
					dob = sc.next();

				}
				newHire.setDOB(dob); // set dob attribute of object based on user input
				System.out.println("=========================");

				// runs add person service
				AddPersonServiceImpl AP = new AddPersonServiceImpl();
				AP.add(newHire);

				break;
			// end of case 1
			case 2:

				// Update employee details service
				System.out.println("Updating Employee Details Service");
				System.out.println("=========================");
				Person updatePerson = new Person(); // creation of new person object

				System.out.println("Enter Employee ID To Update : ");

				while (!sc.hasNextInt()) { // logical check that user has input an integer instead of a string
					System.out.println("Invalid ID");
					System.out.println("Enter Employee ID To Update : ");
					System.out.println("=========================");
					sc.next();
				}
				int existingid = sc.nextInt();
				System.out.println("=========================");

				if (PersonDAOImpl.checkIDExists(existingid)) { // Logical check to determine if ID provided exists in
																// the DB
					// if ID exists, can update records
					updatePerson.setId(existingid);// set id attribute of object based on user input

					System.out.println("Enter Employee's name : ");
					String newname = sc.next();
					updatePerson.setName(newname);// set name attribute of object based on user input
					System.out.println("=========================");

					System.out.println("Enter Employee's password : ");
					String newpw = sc.next();
					updatePerson.setPassword(newpw); // set password attribute of object based on user input
					System.out.println("=========================");

					System.out.println("Enter Employee's DOB in yyyy-mm-dd format : ");
					String newdob = sc.next();
					while (!newdob.matches("\\d{4}-\\d{2}-\\d{2}")) { // loopcheck to ensure user inputs valid DOB
																		// format
						System.out.println("Invalid DOB provided");
						System.out.println("Enter Employee's DOB in yyyy-mm-dd format : ");
						newdob = sc.next();

					}
					updatePerson.setDOB(newdob); // set dob attribute of object based on user input
					System.out.println("=========================");

					// runs update person service
					UpdatePersonServiceImpl UP = new UpdatePersonServiceImpl();
					UP.updatePerson(updatePerson);
				}
				// if ID provided does not exist in DB, will exit to base menu

				break;
			// end of case 2

			case 3:
				// Retrieval of employee details service

				System.out.println("Retrieve Employee Details Service");
				System.out.println("=========================");

				// runs retrieve person details service
				RetrieveEmployeeListServiceImpl REL = new RetrieveEmployeeListServiceImpl();
				List<Person> EmpList = REL.getList();
				System.out.println(EmpList);
				break;
			// end of case 3

			case 4:
				// Retrieve person details via ID service
				System.out.println("Retrieve Employee Details via ID Service");
				System.out.println("=========================");

				System.out.println("Enter Employee ID To Retrieve : ");

				while (!sc.hasNextInt()) { // logical check that user has input an integer instead of a string
					System.out.println("Invalid ID");
					System.out.println("Enter Employee ID To Retrieve : ");
					System.out.println("=========================");
					sc.next();
				}
				int findid = sc.nextInt();
				System.out.println("=========================");

				if (PersonDAOImpl.checkIDExists(findid)) {// logical check to see if ID exists in DB
					RetrieveEmployeeViaIDServiceImpl REVID = new RetrieveEmployeeViaIDServiceImpl();
					REVID.getEmployeeViaID(findid);
				} // only retrieves data if ID exists in DB

				break;
			// end of case 4

			case 5:
				System.out.println("Remove Employee Details Via ID Service");
				System.out.println("=========================");

				System.out.println("Enter Employee ID To Remove : ");

				while (!sc.hasNextInt()) { // logical check that user has input an integer instead of a string
					System.out.println("Invalid ID");
					System.out.println("Enter Employee ID To Remove : ");
					System.out.println("=========================");
					sc.next();
				}
				int removeid = sc.nextInt();
				System.out.println("=========================");

				if (PersonDAOImpl.checkIDExists(removeid)) {// logical check to see if ID exists in DB
					RemovePersonServiceImpl RPSL = new RemovePersonServiceImpl();
					RPSL.removePerson(removeid);
				} // only retrieves data if ID exists in DB		

				break;
			// end of case 5

			default:
				System.out.println("Invalid Choice");
				System.out.println("=========================");
				break;
			// end of default

			}// end of switch case

		} // end of loopcheck

	}// end of main method
}// end of User Input class
