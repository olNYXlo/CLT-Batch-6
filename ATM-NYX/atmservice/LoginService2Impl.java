package atmservice;

import java.util.Map;
import java.util.Scanner;

import atmcontrollers.TransactionMenu;
import atmdao.Login;
import atmdao.LoginImpl;
import atmpojo.Account;

public class LoginService2Impl implements LoginService2 {
	
	Login refLogin;// create a reference that points to null until method is run, only then a proper reference is given

	//checks validity of login. If username exists in the records and if the specified passwords match that account
	@Override
	public boolean checkStatus(String input1, String input2, Map<String,Account> ACL) {
		boolean Status;
		refLogin = new LoginImpl();
		
		if(refLogin.LoginCheck(input1,input2,ACL)==true) {
			Status = true;
		}
		else {
			Status = false;
		}
		return Status;

	}// end of checkStatus method
	
	
	public static void Login(Map<String, Account> ACL) {
		boolean loopchecklogin = true;
		Scanner sc = new Scanner(System.in);

		LoginService2Impl refLogSerImpl = new LoginService2Impl(); // new LoginService2Implementation object
		while (loopchecklogin) {
			// logical loop to check if the login was successful or not
			// if successful, loopchecklogin = false
			// it could be unsuccessful due to wrong password being entered
			// in which case the menu loops back to attempt the loginService again.
			String UserID= null;
			
			
			//in the case of login failure due to wrong password entered, user will be directed back to start of login service
			// where he has to enter a user id and password again
			boolean loopcheckLoginUID = true;
			while(loopcheckLoginUID) {
				System.out.println("Enter User ID: ");
				UserID = sc.next();
				System.out.println("======================");
				if (ACL.containsKey(UserID)==true) {							
					loopcheckLoginUID = false;
					//breaks out of the loop prompting valid user ID
					
				}
				else {
					System.out.println("User ID Account does not exist");
					System.out.println("======================");
					//loops back to prompt valid ID
				}					
				
				
			}// end of loopcheckLoginUID loop. Checking for valid user account that exists
			
			
			System.out.println("Enter Password : ");
			String pw = sc.next();
			System.out.println("======================");				
			

			if (refLogSerImpl.checkStatus(UserID, pw, ACL) == true) {

				// checks if the login userID and password matches the database
				// creates a reference pointing to the account in the accountList.

				Account refAcc = ACL.get(UserID);

				// launches transaction menu based on the account that you logged in with
				TransactionMenu.main(refAcc);
				loopchecklogin = false;
				// to close the loop for trying to login

			} else if (refLogSerImpl.checkStatus(UserID, pw, ACL) == false) {
				System.out.println("Login failed");
				System.out.println("======================");
				// reverts back to prompt user to try to login again
			}

		} // end of while loop
	}// end of Login method

}// end of loginService2Impl class
