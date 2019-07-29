package day10;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Customer {
	String name;

	Customer(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode()); // creates a formula to calculate the hashcode
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj; // explicit casting of selected object to Customer class
		if (name == null) { // checking this.name == null
			if (other.name != null) { // checking obj.name == null. if != null, means have different value, so diff
										// object & return false
				return false;
			} else if (!name.equals(other.name)) { // checks if name == other.name.
				return false;
			}

		}
		return true;
	}
}// end of customer class

public class ArrayEX3 {

	public static void main(String[] args) {

		boolean loopcheck = true;
		List refList = new ArrayList();

		while (loopcheck) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Customer name to add into list : ");
			String name = sc.next();
			System.out.println("===============");
			Customer cs = new Customer(name);
			if (!refList.contains(cs)) {
				refList.add(cs);
				System.out.println(refList);
				System.out.println("===============");
			} else if (refList.contains(cs)) {
				if (cs.hashCode() == refList.get(refList.indexOf(cs)).hashCode()) {
					System.out.println("Name already exists in ArrayList");
					System.out.println(cs.name + "'s" + " hashcode at " + cs.hashCode());
					System.out.println("Hashcode of " + cs.name + " already exists at "
							+ refList.get(refList.indexOf(cs)).hashCode());
					System.out.println("===============");
				}

			}

		}

	}
}
