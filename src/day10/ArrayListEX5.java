package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.Iterator;


class Employee{
	
	String name;
	int age;
	
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}




	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return name + " " + age;
	}
	
	
	
}

public class ArrayListEX5 {

	public static void main(String[] args) {
		
		
		List refList = new ArrayList();
		refList.add(new Employee("Alex",40));
		refList.add(new Employee("Bro",30));
		refList.add(new Employee("Ciao",20));
		refList.add(new Employee("Donkey",10));
		
		
		//sort by name
		Collections.sort(refList, new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName()); // String we use compareTo()
			}
		});// end of sort
			
		Iterator itr = refList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}// end of Iterator
		
		System.out.println("=======================");
		
		//sort by Age
		Collections.sort(refList, new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getAge() - o2.getAge(); // int ==> we use -
			}
		});// end of sort
		
		Iterator itr2 = refList.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}// end of Iterator2
		
		
		
			
		
		

	}
}
