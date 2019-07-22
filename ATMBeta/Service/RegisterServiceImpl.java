package Service;


import java.util.Scanner;

import DAO.Register;
import DAO.RegisterImpl;
import POJO.Account;

public class RegisterServiceImpl implements RegisterService {
	
	Register refRegister;

	@Override
	public void Register() {
		
		refRegister = new RegisterImpl();
		
		boolean loopcheck = true;
		
		while (loopcheck) {
			System.out.println("Enter email address: ");
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			
			if(refRegister.RegisterCheck(input)==true) {

				//continue with register
				loopcheck = false;
				break;
			}
			else if (refRegister.RegisterCheck(input)==false){
				System.out.println("email already exists");
			}
			sc.close();
	
		// TODO Auto-generated method stub

	}
	}
}


