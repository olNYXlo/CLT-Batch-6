package Assignments;

public class problems {

	
	
	
	
	//problem 9
	public class problem9{
		int[] arr = {1,6,3,7,3};
		int i = 0;
		String answer = "False";
		public String check(int n) {
			while(i<arr.length) {
				if (arr[i]== n) {
					answer = "True";
					break;
				}
				i++;
			}
			return answer;
		}
	}
	
	
	
	
	//problem 10
	
	
	
	//problem 11
	public class problem11{
		int[] arr = {1,2,3,1,2,3,4};
		int i =0;
		int[] arr2 = new int[];
		while (i<arr.length) {
			if (arr[i] not in arr2) {
				arr2.add(arr[i]);
			}
			
		}
	}
	
	
	//problem 12
	public class problem12{
		int[] arr = {4,7,2,5,7,2};
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length;
		int min2;
		int max2;
		while (i<arr.length) {
			if (arr[i+1]>arr[i]) {
				min2 = arr[i+1];
				break;
			}
			i++;
		}
		while (j>0) {
			if (arr[j-1]<arr[j]) {
				max2 = arr[j-1];
				break;
			}
			j--;
		}	
	
	}
	
	
	//problem 13
	
	
	
	
}
