package atmservice;


import java.util.Map;
import java.util.Scanner;

import atmdao.Register;
import atmdao.RegisterImpl;
import atmpojo.Account;
import atmpojo.BankAccount;

public class RegisterServiceImpl implements RegisterService {
	
	Register refRegister;// create a reference that points to null until method is run, only then a proper reference is given
	boolean Status = false;

	//checks if given username already exists in the records. If exists, throw an error message and prompt another input.
		//if given username does not exist, continue with registration process
	@Override
	public boolean Register(String input, Map<String,Account> ACL) {
		
		refRegister = new RegisterImpl();
		
		if(!refRegister.RegisterCheck(input, ACL)) {
			System.out.println("email already exists");
			Status = false;
			
		}
		else if (refRegister.RegisterCheck(input, ACL)) {
			Status = true;
			
		}
		
		return Status;

	}// end of register method
	
	
	
public static void Reg(Map<String, Account> ACL, Map<String, BankAccount> BankAccL) {//Full register service
		
		boolean loopcheckreg = true;
		RegisterServiceImpl refRegSerImpl = new RegisterServiceImpl(); // Creates RegisterServiceImpl Object
		while (loopcheckreg) {

			// logical loop to check if Register service can be started
			// if user ID already exists in register, will prompt user again
			// only upon full completion of the registration process will the user
			// be able to exit back to the base menu

			Scanner sc = new Scanner(System.in);

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
						System.out.println(SecurityKey + " is your security key, in case you forget your password.");
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

	}// end of reg method
}// end of RegisterServiceImpl Class




