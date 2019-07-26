package atmservice;

import java.util.Map;
import java.util.Scanner;

import atmdao.ForgotPw;
import atmdao.ForgotPwImpl;
import atmpojo.Account;

public class ForgotPwServiceImpl implements ForgotPwService {
	
	ForgotPw refFPW;// create a reference that points to null until method is run, only then a proper reference is given


	//checks if given security key matches records. if match, will give user the password to his account
	@Override
	public boolean checkStatus(String input1, String input2, Map<String,Account> ACL) {
		
		boolean Status;
		refFPW = new ForgotPwImpl();
		
		if(refFPW.SKCheck(input1,input2,ACL)) {
			Status = true;
		}
		else {
			Status = false;
		}
		return Status;

	}// end of checkStatus method
	
	public static void FPW(Map<String, Account> ACL) {
		boolean loopcheckFPW = true;
		Scanner sc = new Scanner(System.in);

		ForgotPwServiceImpl refFPWImpl = new ForgotPwServiceImpl(); // creates a ForgotPWServiceImpl object
		while (loopcheckFPW) {

			// logical check to see if the forgot password retrieval process was successful
			// or not
			String UserID = null;
			
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

			System.out.println("Enter Security Key : ");
			String SK = sc.next();
			System.out.println("======================");

			if (refFPWImpl.checkStatus(UserID, SK, ACL)) {

				// logical check to see if the security key entered matches the database

				String pw = ACL.get(UserID).getPassword();
				System.out.println("Your password is : " + pw);// outputs the password of the account for the
																// user
				System.out.println("======================");
				loopcheckFPW = false; // closes the loop that continues to prompt the user to enter the correct
										// security key
			} else {
				System.out.println("Security Key does not match");
				System.out.println("======================");
			}

		} // end of loopcheckFPW
	}// end of FPW method
	
}// end of ForgotPwServiceImpl class
