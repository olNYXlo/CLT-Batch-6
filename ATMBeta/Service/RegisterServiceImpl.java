package Service;


import java.util.Map;

import DAO.Register;
import DAO.RegisterImpl;
import POJO.Account;

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

	}
}




