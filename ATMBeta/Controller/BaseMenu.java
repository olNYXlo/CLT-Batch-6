package Controller;

import java.util.Map;
import java.util.Scanner;

import DAO.AccountList;
import POJO.Account;
import Service.ForgotPwServiceImpl;
import Service.LoginService2Impl;
import Service.RegisterServiceImpl;

public class BaseMenu {
	
	
	
	public void launch() {
		
		//as the main method to generate the AccountList is static, can just call the method without creating an AccountList object
		//The ACL is specified here to given all services (classes) that come after it access to its variables
		Map<String, Account> ACL = AccountList.main();
		
		//this loopcheck is to ensure the Base Menu will always be displayed after each choice
		// as the value is kept at true so the while loop will always run
		//use of loopcheck makes it a "recursive" method that keeps calling itself
		
		
		boolean loopcheck = true;
		while (loopcheck) {
			//Prints available options for user to pick from
			System.out.println("User Home Page:");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Forget Password");
			System.out.println("4. Logout (exit)");
			System.out.println("Enter Your Choice :");	
			Scanner sc = new Scanner(System.in);
			int Choice = sc.nextInt();
			switch(Choice){// Depending on user input, will start the relevant service
			
				case 1:// Register Service
					
					
					
					boolean loopcheckreg = true;
					RegisterServiceImpl refRegSerImpl = new RegisterServiceImpl(); //Creates RegisterServiceImpl Object
					while (loopcheckreg) {
						
						//logical loop to check if Register service can be started
						// if user ID already exists in register, will prompt user again
						// only upon full completion of the registration process will the user
						// be able to exit back to the base menu
						
						System.out.println("Enter email address: ");
						String UserID = sc.next();
						
						if(refRegSerImpl.Register(UserID,ACL)==true) {
							
							//if RegisterCheck is true, means user ID does not exist in the records,
							// so can create a new account object and put it into the AccountList HashMap
							
							Account NewAcc = new Account();
							//creates a new account object
							
							NewAcc.setUserID(UserID);
							
							System.out.println("Enter password : ");
							String password = sc.next();
							boolean loopcheckregpw = true;
							
							//logical loop to check if the given password is the same as the re-typed password
							// will continuously show this menu until the passwords match up
							
							while (loopcheckregpw) {								
								System.out.println("Re-Type Password :");
								String repassword = sc.next();
								if (password.equals(repassword)){
									NewAcc.setPassword(repassword);
									System.out.println("What is your favourite color?");
									String SecurityKey = sc.next();
									NewAcc.setSecurityKey(SecurityKey);
									System.out.println(SecurityKey + " is your security key, in case you forget your password.");
									System.out.println("Registration Successful!!");
									System.out.println("Enter Bank Balance");
									double BankBalance = sc.nextDouble();
									NewAcc.setBankBalance(BankBalance); // links user registered account to his bank account
									ACL.put(UserID, NewAcc); // inserts the newly created account into the hashmap
									loopcheckregpw = false;
								}
								else if (!password.equals(repassword)) {//prints error message if re-typed password does not match initially typed password 
									System.out.println("Password doesn't match!!");								
								}							
								
							}
							loopcheckreg = false;// exits out of the register service loop and goes back to the base menu
							
						}// end of if condition

						}// end of while loop
					
					break;// end of case 1

				case 2:// Login Service
					
					boolean loopchecklogin = true;
					
					
					LoginService2Impl refLogSerImpl = new LoginService2Impl(); // new LoginService2Implementation object
					while (loopchecklogin) {
						//logical loop to check if the login was successful or not
						//if successful, loopchecklogin = false
						//it could be unsuccessful due to wrong password being entered
						// in which case the menu loops back to attempt the loginService again.
						
						System.out.println("Enter User ID: ");
						String UserID = sc.next();
						System.out.println("Enter Password : ");
						String pw = sc.next();
						
						if(refLogSerImpl.checkStatus(UserID, pw, ACL)==true) {
							
							//checks if the login userID and password matches the database
							//creates a reference pointing to the account in the accountList.
							
							Account refAcc = ACL.get(UserID);									
							
							//launches transaction menu based on the account that you logged in with
							TransactionMenu.main(refAcc);	
							loopchecklogin=false;
							//to close the loop for trying to login
								
							}
						else if (refLogSerImpl.checkStatus(UserID, pw, ACL)==false) {
							System.out.println("Login failed");
							//reverts back to prompt user to try to login again
						}
							
						}// end of while loop		
					break;
					//end of switch case
					
					
				case 3:// Forgot Password Service
					
					boolean loopcheckFPW = true;
					
					ForgotPwServiceImpl refFPWImpl = new ForgotPwServiceImpl(); //creates a ForgotPWServiceImpl object
					while (loopcheckFPW) {
						
						//logical check to see if the forgot password retrieval process was successful or not
						
						System.out.println("Enter User ID: ");
						String UserID = sc.next();
						System.out.println("Enter Security Key : ");
						String SK = sc.next();
						
						if(refFPWImpl.checkStatus(UserID, SK, ACL)) {
							
							//logical check to see if the security key entered matches the database
							
							String pw = ACL.get(UserID).getPassword();
							System.out.println("Your password is : "+ pw);//outputs the password of the account for the user
							loopcheckFPW=false; // closes the loop that continues to prompt the user to enter the correct security key								
							}
						else {
							System.out.println("Security Key does not match");
						}
							
						}		
					break;

				case 4:// Logout Service
					
					//loops back to base menu
					//pointless service and could be removed as you are not even logged in yet
					
					break;
				default: // Invalid Choice
					System.out.println("Invalid Choice");
					//loops back to base menu to prompt user for a valid choice
					break;			
			}
		
	}
	}
}


