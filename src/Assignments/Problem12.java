package Assignments;

import java.util.Arrays;

public class Problem12 {
	
	//finding the 2nd smallest and 2nd largest element in an array
	//first sort the array
	//Do a logical check on the array elements
	// To get the 2nd smallest element, the 2nd element should be larger than the first element.
	// if they are equal, compare the next elements until the logic is true
	// similar implementation for the 2nd largest element
	public static void min2max2(int[] arr){
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length;
		int min2;
		int max2;
		
		while (i<arr.length) {
			if (arr[i+1]>arr[i]) {
				min2 = arr[i+1];
				System.out.print("The second smallest element is " + min2 +"\n");
				break;
			}
			i++;
		}
		
		while (j>0) {
			if (arr[j-2]<arr[j-1]) {
				max2 = arr[j-2];
				System.out.print("The second biggest element is " + max2);
				break;
			}
			j--;
		}	
		
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {1,5,6,3,3,67,2,4,7,33,23,5,67,2};
		min2max2(arr);
		
		
	}
	
}

	

