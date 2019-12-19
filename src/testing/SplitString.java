package testing;

public class SplitString {

	public static void main(String[] args) {
		
		String my = "102019";
		
		String month = my.substring(0,2);
		String year = my.substring(2);
		
		System.out.println(month);
		System.out.println(year);

	}
}
