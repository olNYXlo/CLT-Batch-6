package Assignments;

public class Problem6 {

	public static void pyramiddbl(int n) {
		for (int i=1;i<=n;i++) {
			if (i==1) {
				System.out.print("*\n");
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
		pyramiddbl(5);
	}
	
	
	
}
