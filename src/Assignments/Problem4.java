package Assignments;

public class Problem4 {
	//Inverted pyramid made of *
	public static void revpyramid(int n) {
		for (int i=n;i>0;i--) {
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		revpyramid(4);
	}

}
