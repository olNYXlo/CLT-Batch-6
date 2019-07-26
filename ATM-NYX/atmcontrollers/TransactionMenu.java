package atmcontrollers;

import java.util.Scanner;

import atmpojo.Account;
import atmpojo.BankAccount;
import atmservice.DepositServiceImpl;
import atmservice.WithdrawServiceImpl;

public class TransactionMenu{
	
	//launches the TransactionMenu after logging in
	
	public static void main(Account Acc) {
		
		//similar implementation to BaseMenu
		//same concept of implementing logical loops to create "recursive" functions
		
		boolean loopcheck = true;
		BankAccount BA = Acc.getBA(); // Retrieves the bank account of the logged in user once entered this menu. As any transactions done will be based on this
		while (loopcheck) {
			
			//displays the available transaction options after loggin in
			System.out.println("=======DBS Bank=======");
			System.out.println("Transaction Home Page:");
			System.out.println("1. Check Available Balance");
			System.out.println("2. Deposit Amount");
			System.out.println("3. Withdraw Amount");
			System.out.println("======================");
			System.out.println("Enter Your Choice :");	
			Scanner sc = new Scanner(System.in);
			int Choice = sc.nextInt();
			switch(Choice){
			
			case 1:// checking available balance
				
				double Balance = BA.getBankBalance();
				System.out.println("Account Balance " + Balance + " dollars.");
				System.out.println("======================");
				char ch;
				boolean loopcheckContinue = true;
				//loop to make the checking of if the user wants to continue with another transaction until a valid response is given
				while (loopcheckContinue) {
					System.out.println("Wish to Continue? (y\\n) ");
					ch = sc.next().charAt(0);
					System.out.println("======================");
					switch (ch){
					case 'y':
						//loops back to transaction menu
						loopcheckContinue = false;
						break;
					case 'n':
						System.out.println("Thanks for Banking With us!!!");
						System.out.println("======================");
						//loops back to base menu.
						//changes the global loopcheck for the transaction menu to be false, breaking out of the while loop
						// and reverting back to the base menu
						loopcheck = false;
						loopcheckContinue = false;
						//logout
						break;
					default:
						System.out.println("invalid command");
						System.out.println("======================");
						//loop back for input
						break;
				}// end of switch case for continuation of another transaction
				}// end of while loop that checks if user wants to continue with another transaction or not
				
				break;
				//end of case 1
				
			case 2:// deposit service
				
				boolean loopcheckDep = true;
				char ch2;
				DepositServiceImpl refDepImpl = new DepositServiceImpl();// creates new depositserviceimpl object
				while (loopcheckDep) {
					
					//logical loop that repeats itself until the deposit transaction is performed successfully
					//re-prompting users to key in a valid amount if they provided an invalid one (negative value)
					System.out.println("Enter Amount : ");
					double amt = sc.nextDouble();
					System.out.println("======================");
					
					if(refDepImpl.checkStatus(amt, Acc)==true) {
						double newBalance = BA.getBankBalance() + amt;
						BA.setBankBalance(newBalance);//sets the account bank balance
						System.out.println(amt + " dollar deposited successfully!!\n");
						System.out.println("======================");
						loopcheckDep = false;
					}
					else if (refDepImpl.checkStatus(amt, Acc)==false) {
							System.out.println("Amount can't be negative!!");
							System.out.println("======================");
							//automatically loops back to the start of while loop that prompts user to key in amount
					}
					
				boolean loopcheckContinue2 = true;
				
				while (loopcheckContinue2) {
					//loop to make the checking of if the user wants to continue with another transaction until a valid response is given
					System.out.println("Wish to Continue? (y\\n) ");
					ch2 = sc.next().charAt(0);
					System.out.println("======================");
					switch (ch2){
					case 'y':
						//loops back to transaction menu
						loopcheckContinue2 = false;
						break;
					case 'n':
						System.out.println("Thanks for Banking With us!!!");
						System.out.println("======================");
						loopcheck = false;
						loopcheckContinue2 = false;
						//loops back to base menu.
						//changes the global loopcheck for the transaction menu to be false, breaking out of the while loop
						// and reverting back to the base menu
						//logout
						break;
					default:
						System.out.println("invalid command");
						System.out.println("======================");
						//loop back for input
						break;
					
					}// end of switch case for continuation of another transaction
				}// end of while loop that checks if user wants to continue with another transaction or not
				}// end of while loop for deposit service
				break;// end of case 2
				
				
				
			case 3:// withdraw service
				boolean loopcheckWith = true;
				char ch3;
				WithdrawServiceImpl refWithImpl = new WithdrawServiceImpl();// creates new WithdrawServiceImpl object
				while (loopcheckWith) {
					
					//logical loop that continuously prompts user until the withdraw service is completed successfully
					System.out.println("Enter Amount : ");
					double amt = sc.nextDouble();
					System.out.println("======================");
					
					if(refWithImpl.checkStatus(amt, Acc)==true) {// checks if the withdrawal amount is valid (lesser than bank balance and is a positive number)
						
						BA.setBankBalance(BA.getBankBalance()-amt); // sets the bank balance
						System.out.println("Transaction Successful!!");
						System.out.println("======================");
						loopcheckWith = false;
					}
					else if (refWithImpl.checkStatus(amt, Acc)==false) {
						//loops back to withdraw service
						
					}
					boolean loopcheckContinue3 = true;
					//loop to make the checking of if the user wants to continue with another transaction until a valid response is given
					while (loopcheckContinue3) {
						System.out.println("Wish to Continue? (y\\n) ");
						ch3 = sc.next().charAt(0);
						System.out.println("======================");
						switch (ch3){
						case 'y':
							//loops back to transaction menu
							loopcheckContinue3 = false;
							break;
						case 'n':
							System.out.println("Thanks for Banking With us!!!");
							System.out.println("======================");
							loopcheck = false;
							loopcheckContinue3 = false;
							//loops back to base menu.
							//changes the global loopcheck for the transaction menu to be false, breaking out of the while loop
							// and reverting back to the base menu
							//logout
							break;
						default:
							System.out.println("invalid command");
							System.out.println("======================");
							//loop back for input for continuation of transactions
							break;
						}// end of switch case for continuation of another transaction
					}// end of while loop that checks if user wants to continue with another transaction or not
				}// end of while loop for withdraw service
				break;
				//end of case 3
				
			default:
				System.out.println("Invalid Choice");
				System.out.println("======================");
				//loops back to transaction menu
				break;
					
		
	}
	


}
	}
}




