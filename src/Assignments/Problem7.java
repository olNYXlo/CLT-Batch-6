package Assignments;

public class Problem7 {
	// Pyramid made of numbers that follow a pattern of increasing before decreasing
	public static void pyramidnumpat(int n) {
		for (int i=1;i<=n;i++) {
			for (int j=0;j<(i*2-1);j++) {
				if (j+i <= (i*2 -1)) {
					System.out.print(j+i + " ");
				}
				else {
					System.out.print(3*i-2-j + " ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		pyramidnumpat(5);
	}
	
}
