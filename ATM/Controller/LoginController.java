package Controller;

import java.util.Scanner;

import POJO.User;
import Service.LoginService;


public class LoginController {
	
	//loose coupling through reference of the interface
	LoginService refLoginService; // LoginService is an interface. initialized with null value at start only at line 37 is an object created
	// with reference to this memory location
	User refUser; // user is a POJO class
	public void userLoginController() {
		
		userInput();
		
		
	}
	
	void userInput() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter User ID : ");
		String userID = sc.next();
		
		System.out.println("Enter Password : ");
		String password = sc.next();
		
		// create new object of user class
		refUser = new User();
		refUser.setUserID(userID);
		refUser.setUserPassword(password);
		
		// create objet of object of loginserviceimpl and refer to its interface
		refLoginService = new LoginServiceImpl(); // have to create object. upcasting here so that the object LoginServiceImpl will be
		// declared null after use. allows for garbage collection and freeing of memory.
		// create object class referrring to Interface to allow for NULL value after use. instead of making new object of same class.
		
		refLoginService.checkStatus(refUser);
		sc.close();
	}

}
