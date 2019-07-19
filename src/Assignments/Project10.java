package Assignments;

import java.util.ArrayList;
import java.util.List;

public class Project10 {

	public static boolean check(int[] arr, int n) {
		boolean ans = false;
		int i =0;
		while(i<arr.length) {
			if (arr[i] == n) {
				ans = true;
				break;
			}
			i++;
		}
		return ans;
	}
	
	public static void commonele(int[] arr1, int[] arr2, int[] arr3) {
		if (arr1.length>arr2.length && arr1.length>arr3.length) {
			List<Integer> ansList = new ArrayList<Integer>();
			for (int i=0; i<arr1.length;i++) {
				if (check(arr2,arr1[i]) && check(arr3,arr1[i])) {
					
					ansList.add(arr1[i]);				
				}
				
			}
			System.out.print(ansList);
			
		}
		else if (arr2.length > arr1.length && arr2.length > arr3.length) {
			List<Integer> ansList = new ArrayList<Integer>();
			for (int i=0; i<arr2.length;i++) {
				if (check(arr1,arr2[i]) && check(arr3,arr2[i])) {
					ansList.add(arr2[i]);					
				}
				
			}
			System.out.print(ansList);
			
			
		}
		else if (arr3.length > arr1.length && arr3.length > arr2.length) {
			List<Integer> ansList = new ArrayList<Integer>();
			for (int i=0; i<arr3.length;i++) {
				if (check(arr1,arr3[i]) && check(arr2,arr3[i])) {
					ansList.add(arr3[i]);				
				}
				
			}
			System.out.print(ansList);
			
			
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr1 = {1,5,10,20,40,80};
		int[] arr2 = {6,7,20,80,100};
		int[] arr3 = {3,4,15,20,30,70,80,120};
		commonele(arr1,arr2,arr3);
		
		
	}

}
