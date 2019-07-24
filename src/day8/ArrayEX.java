package day8;

import java.util.Scanner;

class Person{

	int id;
	String name;
	public Person(int iD, String name) {
		this.id = iD;
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name;
	}
	
	
	
}

class Alien{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}



public class ArrayEX {

	public static void main(String[] args) {
		
		String str[] = {"Physics","Chemistry","Maths"};
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(i);//prints every index of the array
			System.out.println(str[i]); //prints every element of the array
		}
		//for each loop which does the same thing
		for (String i:str) {
			System.out.println(i);
		}
		
		//creating array example
		Scanner sc = new Scanner(System.in);
		System.out.println("How many records do you want to enter : ");
		int number = sc.nextInt();
		Person pRef[] = new Person[number];
		// creating array of class type of size 'number'
		
		for (int i=0;i<pRef.length;i++) {
			System.out.println("Enter your ID : ");
			int ID = sc.nextInt();
			System.out.println("Enter your Name : ");
			String name = sc.next();
			pRef[i] = new Person(ID,name);
		}// add new person into the array by iteration of index
		
		for (Person person : pRef) {
			System.out.println(person);
		}
		
		
		Alien pAlien[] = new Alien[number];
		for (int i=0; i<pAlien.length;i++) {
			System.out.println("Enter your ID : ");
			int ID = sc.nextInt();
			System.out.println("Enter your Name : ");
			String name = sc.next();
			Alien newAlien = new Alien();
			newAlien.setId(ID);
			newAlien.setName(name);
			pAlien[i] = newAlien;
		}
		
		for (Alien Al : pAlien) {
			System.out.println(Al.getId() + " " + Al.getName());
		}
		

	}
}
