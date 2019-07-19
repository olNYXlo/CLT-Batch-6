package Service;

import java.util.Scanner;

import POJO.Account;


public class DepositServiceImpl implements DepositService {
	
	Account refAcc;

	@Override
	public void deposit(double x) {
		// TODO Auto-generated method stub
		if(x > 0){
			refAcc.setBankBalance(refAcc.getBankBalance()+x);
			System.out.print(x + " dollar deposited successfully!!\n");
			System.out.print("Wish to Continue? (y\\n) ");
			Scanner sc = new Scanner(System.in);
			char ch = sc.next().charAt(0);
			Switch (ch){
				case y:
					//continue to transaction menu
					break;
				case n:
					System.out.print("Thanks for Banking With us!!!");
					//logout
					break;
				default:
					System.out.print("invalid command");
					//loop back for input
					break;
						
			}
			
		}
		else if (x<0){
			System.out.println("Amount Can't Be Negative");
		}
	}

}
