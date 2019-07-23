package Assignments;

public class Problem5 {
	// inverted pyramid made of numbers starting from 1
	public static void revpyramidnum(int n) {
		for (int i=n;i>0;i--) {
			for (int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		revpyramidnum(5);
	}
	
	
}
