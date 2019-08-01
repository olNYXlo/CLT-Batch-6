package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader2 {
	
	// uses file reader

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		
		
		try {
			
			//Get data from this file using a file reader
			fr = new FileReader("sample.txt");
			// c:\\Users\\yuxiong.ngiam\\Desktop\\sameple.txt
			
			//to store the contents read via File Reader
			BufferedReader br = new BufferedReader(fr);
			
			//Read br and store a line in 'data', print data
			String s;
			while((s=br.readLine()) != null) {
				System.out.println(s);
			}
		}// end of try
		
		catch (IOException e) {
			System.out.println("Sorry!! File Not Found...");
		}
		finally {
			fr.close();
		}

	}
}
