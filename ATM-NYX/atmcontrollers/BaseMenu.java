package atmcontrollers;

import java.util.Map;
import java.util.Scanner;

import atmdao.AccountList;
import atmdao.BankAccountList;
import atmpojo.Account;
import atmpojo.BankAccount;
import atmservice.ForgotPwServiceImpl;
import atmservice.LoginService2Impl;
import atmservice.RegisterServiceImpl;

public class BaseMenu {

	// launches the base menu when the application starts

	public void launch() {

		// as the main method to generate the AccountList is static, can just call the
		// method without creating an AccountList object
		// The ACL is specified here to given all services (classes) that come after it
		// access to its variables
		
		// BankAccList is also created mainly to be used in register service to link
		// newly created account
		// with existing bank account
		Map<String, Account> ACL = AccountList.main();
		Map<String, BankAccount> BankAccL = BankAccountList.main();

		// Links the 2 HashMap objects together.

		ACL.get("abc@gmail.com").setBA(BankAccL.get("1234567891"));
		BankAccL.get("1234567891").setAccountLinked(true);

		ACL.get("abcd@gmail.com").setBA(BankAccL.get("1234567892"));
		BankAccL.get("1234567892").setAccountLinked(true);

		ACL.get("abcde@gmail.com").setBA(BankAccL.get("1234567893"));
		BankAccL.get("1234567893").setAccountLinked(true);

		ACL.get("abcdef@gmail.com").setBA(BankAccL.get("1234567894"));
		BankAccL.get("1234567894").setAccountLinked(true);

		// generates list of bank accounts registered by the bank. To be used to link to
		// the customer's existing or newly set up online account

		// this loopcheck is to ensure the Base Menu will always be displayed after each
		// choice
		// as the value is kept at true so the while loop will always run
		// use of loopcheck makes it a "recursive" method that keeps calling itself

		boolean loopcheck = true; // this value will always be true, hence the user will never be able to exit
									// from this program or end it
		while (loopcheck) {
			// Prints available options for user to pick from
			System.out.println("=======DBS Bank=======");
			System.out.println("User Home Page:");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Forget Password");
			System.out.println("4. Logout (exit)");
			System.out.println("======================");
			System.out.println("Enter Your Choice :");
			Scanner sc = new Scanner(System.in);
			int Choice = sc.nextInt();
			switch (Choice) {// Depending on user input, will start the relevant service

			case 1:// Register Service

				boolean loopcheckreg = true;
				RegisterServiceImpl refRegSerImpl = new RegisterServiceImpl(); // Creates RegisterServiceImpl Object
				while (loopcheckreg) {

					// logical loop to check if Register service can be started
					// if user ID already exists in register, will prompt user again
					// only upon full completion of the registration process will the user
					// be able to exit back to the base menu

					System.out.println("Enter email address: ");
					String UserID = sc.next();
					System.out.println("======================");
					if (refRegSerImpl.Register(UserID, ACL) == true
							&& (UserID.contains("@gmail.com") || UserID.contains("@hotmail.com"))) {
						// ensures a proper email address is used

						// if RegisterCheck is true, means user ID does not exist in the records,
						// so can create a new account object and put it into the AccountList HashMap

						Account NewAcc = new Account();
						// creates a new account object

						NewAcc.setUserID(UserID);

						System.out.println("Enter password : ");
						String password = sc.next();
						System.out.println("======================");
						boolean loopcheckregpw = true;

						// logical loop to check if the given password is the same as the re-typed
						// password
						// will continuously show this menu until the passwords match up

						while (loopcheckregpw) {
							System.out.println("Re-Type Password :");
							String repassword = sc.next();
							System.out.println("======================");
							if (password.equals(repassword)) {
								NewAcc.setPassword(repassword);
								System.out.println("What is your favourite color?");
								String SecurityKey = sc.next();
								System.out.println("======================");
								NewAcc.setSecurityKey(SecurityKey);
								System.out.println(
										SecurityKey + " is your security key, in case you forget your password.");
								System.out.println("======================");

								boolean loopcheckregBankAcc = true;

								while (loopcheckregBankAcc) {
									System.out.println("Enter Your 10 Digit Bank Account");
									String BankAccNo = sc.next();
									System.out.println("======================");
									if (BankAccNo.length() == 10 && BankAccL.containsKey(BankAccNo)) {
										if (BankAccL.get(BankAccNo).isAccountLinked() == false) {
											BankAccount BA = BankAccL.get(BankAccNo);
											NewAcc.setBA(BA);
											BA.setAccountLinked(true); // updates the BankAccountList to notify that the
																		// bank account has been linked
											System.out.println("Bank Account is successfully linked to your account");
											System.out.println("======================");
											loopcheckregBankAcc = false; // breaks out of the logical loop to check if
																			// bank account exists and is linked to
																			// another account
										} else if (BankAccL.get(BankAccNo).isAccountLinked() == true) {
											System.out.println("Bank Account is already linked to another account");
											System.out.println("======================");
										} // end of inner if-else loop

									} else {
										System.out.println("Invalid Bank Account Number");
										System.out.println("======================");
									} // end of if-else loop

								} // end of processing if bank account number exists in record & take the
									// necessary actions

								System.out.println("Registration Successful!!");
								System.out.println("======================");
								ACL.put(UserID, NewAcc); // inserts the newly created account into the AccountList
															// HashMap
								loopcheckregpw = false;
							} else if (!password.equals(repassword)) {// prints error message if re-typed password does
																		// not match initially typed password
								System.out.println("Password doesn't match!!");
								System.out.println("======================");
							}

						}
						loopcheckreg = false;// exits out of the register service loop and goes back to the base menu

					} // end of if condition
					else {
						System.out.println("invalid email address provided");
						System.out.println("======================");
						// prints error message for user who input invalid email address
					}

				} // end of while loop

				break;// end of case 1

			case 2:// Login Service

				boolean loopchecklogin = true;

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
				break;
			// end of switch case

			case 3:// Forgot Password Service

				boolean loopcheckFPW = true;

				ForgotPwServiceImpl refFPWImpl = new ForgotPwServiceImpl(); // creates a ForgotPWServiceImpl object
				while (loopcheckFPW) {

					// logical check to see if the forgot password retrieval process was successful
					// or not

					System.out.println("Enter User ID: ");
					String UserID = sc.next();
					System.out.println("======================");
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
				break;
				//end of case 3 (forgot password service)

			case 4:// Logout Service

				// loops back to base menu
				// pointless service and could be removed as you are not even logged in yet

				break;
				//end of case 4 (logout service)
			default: // Invalid Choice
				System.out.println("Invalid Choice");
				System.out.println("======================");
				// loops back to base menu to prompt user for a valid choice
				break;
				//end of default case
				// default case replaces "exception handling"? in the case of invalid command will route users back to the base menu
			}// end of switch case

		}// end of loopcheck
	}// end of launch method
}// end of BaseMenu class
