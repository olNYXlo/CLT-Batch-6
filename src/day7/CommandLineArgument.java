package day7;

public class CommandLineArgument {
	
	
	
	

	public static void main(String[] city) {
		
		String cityNames[] = city;
		
		
		// for each loop
		for (String name: cityNames) {
			System.out.println(name);
		}
		
		
		// for loop
		for (int i =0; i<cityNames.length;i++) {
			System.out.println(cityNames[i]);
			
		}

	}
}
