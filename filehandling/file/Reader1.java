package file;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader1 {
	
	// uses data input stream

	public static void main(String[] args) throws IOException{
		DataInputStream in = null;

		// Try ( (FileInputStream fs = new FileInputStream("sample.txt");
		// (DataInputStream in = new DataInputStream(fs)); (BufferedReader br = new BufferedReader(new InputStreamReader(in)))){//code}
		
		try {

			// open the file that is the first command line parameter
			FileInputStream fs = new FileInputStream("C:\\Users\\yuxiong.ngiam\\Desktop\\sample.txt"); // absolute path
			// have to use \\ instead of \ when specifying file location as Eclipse cannot handle single \
			
			//FileInputStream fs = new FileInputStream("sample.txt"); // relative path from within project file
			
			// c:\\MyFile.txt absolute path
			// Get the object of DataInputStream
			in = new DataInputStream(fs);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			// BufferedReader br = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream("sample.txt"))));
			// one line code to intialize stream

			String str;

			// Read File Line By Line
			while ((str = br.readLine()) != null) {
				// print the content on the console

				System.out.println(str);
			}

		} catch (Exception e) {// catch exception if any
			// System.err.println("Error: " + e.getMessage());
			System.out.println("file not found...");
		}

		finally {
			// close the input stream
			in.close();
		}

	}
}
