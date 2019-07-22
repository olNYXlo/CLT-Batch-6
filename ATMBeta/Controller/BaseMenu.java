package Controller;

import java.util.Scanner;

public class BaseMenu {
	
	public void Option1() {

		boolean loopcheck = true;
		
		while (loopcheck) {
			System.out.println("Enter email address: ");
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			
			if(AccList.containsKey(input)==false) {
				

				//continue with register
				loopcheck = false;
				break;
			}
			else if (AccList.containsKey(input)==true){
				System.out.println("email already exists");
			}
			sc.close();
		
		
	}
		
	}
	
	
	
	
	public void main(String[] args) {
		boolean loopcheck = true;
		while (loopcheck) {
			System.out.println("User Home Page:");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Forget Password");
			System.out.println("4. Logout (exit)");
			System.out.println("Enter Your Choice :");	
			Scanner sc = new Scanner(System.in);
			int Choice = sc.nextInt();
			switch(Choice){
				case 1:
					//launch register
					loopcheck=false;
					break;
				case 2:
					//launch login
					loopcheck=false;
					break;
				case 3:
					//launch forgot password
					loopcheck=false;
					break;
				case 4:
					//relaunch basemenu
					break;
				default:
					System.out.println("Invalid Choice");
					//launch base menu again
					break;			
			}
			sc.close();
		
	}
	}
}


