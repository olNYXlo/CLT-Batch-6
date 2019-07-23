package Assignments;

// import java.util.ArrayList;

public class Problem9 {
	
	
/*	
 * 
 * tried to implement arraylist but not sure how to use it yet
 * 
	public static boolean checkarr(int[] arr,Integer x) {
		
		ArrayList<Integer> arrans = new ArrayList<Integer>(arr.length);
		System.out.print(arrans.contains(x));
		return arrans.contains(x);
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,4,6,7,3,2,6,34,2};
		checkarr(arr,6);
		
	}
		
				
		
		
	}
	
	*/
	
	//checking if a value exists within an array by iteration of array elements
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
		System.out.print(ans);
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = {1,6,3,7,3};
		check(arr,6);
		
	}

}
