package Assignments;

import java.util.ArrayList;
//import java.util.List;

public class Problem11 {
	
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
