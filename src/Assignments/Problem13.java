package Assignments;

import java.util.ArrayList;

public class Problem13 {
	
	public static void removeduplen(int[] arr) {
		
		ArrayList<Integer> arrans = new ArrayList<Integer>(arr.length);
		for (int i=0; i<arr.length;i++) {
			if (!arrans.contains((Integer)arr[i])) {
				arrans.add((Integer)arr[i]);					
			}
		}
		System.out.print(arrans.size());
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {20,20,30,40,50,50,50};
		removeduplen(arr);		
		
	}	
	

}
