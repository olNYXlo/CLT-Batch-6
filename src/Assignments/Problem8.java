package Assignments;

public class Problem8 {
	// inverted pyramid made of * that follow a doubling pattern
	public static void revpyramiddbl(int n) {
		for (int i=n;i>0;i--) {
			if (i==1) {
				System.out.print("*");
			}
			else {
				for (int j=1;j<i;j++) {
					System.out.print("* * ");
				}
				System.out.println();
			}
			
		}
	}
	
	public static void main(String[] args) {
		revpyramiddbl(5);
	}	
	
}
