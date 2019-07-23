package Assignments;

import java.util.ArrayList;
//import java.util.List;

public class Problem11 {
	
	
	//Arrays are immutable so have to create new array instead
	//Iterate through elements in the original array and check if it exists in the new array
	// if it does not exist, add it in, else move on to the next element
	public static void removedup(int[] arr) {
		
		ArrayList<Integer> arrans = new ArrayList<Integer>(arr.length);
		for (int i=0; i<arr.length;i++) {
			if (!arrans.contains((Integer)arr[i])) {
				arrans.add((Integer)arr[i]);					
			}
		}
		System.out.print(arrans);
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,2,3,4};
		removedup(arr);		
		
	}

}
