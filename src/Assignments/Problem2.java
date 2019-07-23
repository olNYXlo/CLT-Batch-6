package Assignments;

public class Problem2 {
	//pyramid made of numbers starting from 1
	
	public static void pyramidnum(int n) {
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		pyramidnum(5);
	}
}
