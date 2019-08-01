package day13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationEX implements Serializable{
	
	//public class SerializationEX {
	String name, city;
	transient int mobile; // transcient used to ensure data is not serialized.
	// we can also make static, if we don't want to serialize the variable
	int age;

	public static void main(String[] args) {
		
		SerializationEX e = new SerializationEX();
		
		e.name = "David";
		e.city = "Melbourne";
		e.mobile = 11223344;
		e.age = 30;
		
		
		try {
			FileOutputStream fileOut = new FileOutputStream("david.txt"); // creates new file
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e); // writes object in encrypted form into file
			out.close();
			fileOut.close();
			
		}
		catch (IOException i) {
			i.printStackTrace();
		}

	}
}
