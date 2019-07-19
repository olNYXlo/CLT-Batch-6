package Assignments;

import java.lang.reflect.Array;

public class Problem3 {
	
	public static void pyramidABC(int n) {
		
		String abc[] = {" ","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				String x = (String)Array.get(abc,i);
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		pyramidABC(5);
	}
	
	
}
