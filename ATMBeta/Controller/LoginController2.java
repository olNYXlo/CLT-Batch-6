package Controller;

import POJO.Account;
import Service.LoginService2;
import Service.LoginService2Impl;

import java.util.Scanner;

public class LoginController2 {
	
	LoginService2 refLoginService2;
	
	
	Account refAcc;
	
	public void LoginControl() {

		
		boolean loopcheck = true;
		while (loopcheck) {
			System.out.println("User Home Page:");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Forget Password");
			System.out.println("4. Logout (exit)");
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Your Choice :");
			int Choice = sc.nextInt();
			switch(Choice){
			case 1:
				//run register service
				loopcheck = false;
				break;
			case 2:
				//run login service
				loopcheck = false;
				break;
			case 3:
				//run forget password service
				loopcheck = false;
				break;
			case 4:
				//run logout service
				
				break;
			default:
				System.out.println("not valid selection");
				break;
				//loop back for input?
		}
		}
		
		sc.close();
		
		
		userinput();
	}
	
	 void userinput() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter User ID : ");
		String userID = sc.next();
		
		System.out.println("Enter Password : ");
		String password = sc.next();
		
		// create new object of user class
		refAcc = new Account();
		refAcc.setUserID(userID);
		refAcc.setPassword(password);
		
		// create objet of object of loginserviceimpl and refer to its interface
		refLoginService2 = new LoginService2Impl(); // have to create object. upcasting here so that the object LoginServiceImpl will be
		// declared null after use. allows for garbage collection and freeing of memory.
		// create object class referrring to Interface to allow for NULL value after use. instead of making new object of same class.
		
		refLoginService2.checkStatus(refAcc);
		sc.close();
		
	}

}
