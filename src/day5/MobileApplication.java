package day5;

import java.util.Scanner;

public class MobileApplication {
	
	public static void main(String[] args) {
		
		//create object of all related classes.
		//set values for all the objects
		//get value of object to check
		
		Whatsapp refWhatsApp = new Whatsapp();
		
		Mobile refMobile = new Mobile();
		
		Chat refChat = new Chat();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your text : ");
		
		String myText = sc.next();
		sc.close();
		
		refChat.setChat(myText);
		
		
		refMobile.setRefWhatsApp(refWhatsApp);//have to pass reference of Whatsapp object.
		// known as SETTER INJECTION
		
		refWhatsApp.setRefChat(refChat);
		
		System.out.println(refMobile.getRefWhatsApp().getRefChat().getChat());
		
	}

}
