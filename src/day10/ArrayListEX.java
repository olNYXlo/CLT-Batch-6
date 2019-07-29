package day10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEX {

	public static void main(String[] args) {
		
		
		
		/*
		 List <String> refList = new ArrayList<String>(); // <DataType> can use String, Integer, ClassName, Object, etc
		 // ensures user cannot add wrong data type into the list
		 if <DataType> is left empty, will initialize with Object class
		 refList.add("Hello");
		 refList.add(60);
		 refList.add(new User("Gina")); 		  
		 
		 */
		
		
		List refList = new ArrayList();
		refList.add("Hello");
		refList.add(60);
		refList.add(new User("Gina"));
		
		System.out.println(refList);
		
		for (Object temp : refList) { // if replace Object with List, ArrayList or other interface, will have compilation error)
			System.out.println(temp);
		}
		

	}
}



class User{
	
	String name;
	public User (String string) {
		name = string;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}