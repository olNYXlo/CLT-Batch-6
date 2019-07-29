package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEX2 {

	public static void main(String[] args) {

		
		boolean loopcheck = true;
		List refList = new ArrayList();
		
		while (loopcheck) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name to add into list : ");
			String name = sc.next();
			System.out.println("===============");
			if (!refList.contains(name)) {
				refList.add(name);
				System.out.println(refList);
				System.out.println("===============");
			}
			else if (refList.contains(name)) {
				System.out.println("Name already exists in List");
				System.out.println("===============");	
			}
		}
			

	}
}
