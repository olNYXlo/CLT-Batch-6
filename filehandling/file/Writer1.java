package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer1 {

	public static void main(String[] args) throws IOException {
		
		try {//warning: exceptions possible
			
			
			
			
			boolean newFile = false;
			
			File f = new File("abcxyz.doc");
			System.out.println(f.exists()); // checks if file exists
			
			
			newFile = f.createNewFile(); // creates a new file
			System.out.println(newFile); // prints contents of new file
			System.out.println(f.exists()); // check if it exists as nothing is printed as file exists but is empty
			
			
			FileWriter fw = new FileWriter("abcxyz.doc"); // ensure use correct file to write into
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("this is fileWriter7");
			//bw.flush();
			bw.newLine();
			//bw.flush();
			bw.write("Thank you...");
			bw.newLine();
			bw.write("XieXie");
			bw.newLine();
			bw.write("KamSaHapNiDa");
			bw.newLine();
			bw.write("Arigato");
			bw.newLine();
			
		}
		catch (Exception e) {
			System.out.println("Error...");
		}
		
		FileReader fr = new FileReader("abcxyz.doc");
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		

	}
}
