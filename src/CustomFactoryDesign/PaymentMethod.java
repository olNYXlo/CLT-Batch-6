package CustomFactoryDesign;

import java.util.Scanner;

public class PaymentMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Payment Choice :");
		String Choice = sc.next();
		
		PaymentCard refPC = PaymentLogic.FactoryMethod(Choice);
		refPC.paybills();
		sc.close();

	}
}
