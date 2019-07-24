package Service;

import java.util.Map;

import DAO.ForgotPw;
import DAO.ForgotPwImpl;
import POJO.Account;

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

	}
}
