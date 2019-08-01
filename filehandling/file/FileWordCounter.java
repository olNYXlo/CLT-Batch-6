package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWordCounter {

	public static void main(String[] args) throws IOException {
		
		//can only input 1 word at a time else will run into error
		//If input multiple words, will run into error as Scanner only reads the next String/ word separated by " ".
		// so when prompted to enter text and user enters "hello world"
		// Writer will take 'hello' as input and 'world' will be taken as input for the user prompt to input more text into file
		// Should use Scanner's nextLine method instead.

		FileWriter fw = null;
		BufferedWriter bw = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Name : ");
		String filename = sc.next();
		System.out.println("==============================");

		File f = new File(filename); // creates reference to filename

		if (f.exists()) { // checks if file exists
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			System.out.println("Enter Text To Write To File : ");
			String filecontents = sc.next();
			System.out.println("==============================");
			bw.write(filecontents);
			bw.flush();
			bw.newLine();

			boolean loopcheck = true;
			while (loopcheck) {
				System.out.println("Do you wish to write more text to the file? Y/N");
				char c = sc.next().charAt(0);
				System.out.println("==============================");
				switch (c) {
				case 'y':
					System.out.println("Enter Text To Write To File : ");
					filecontents = sc.next();
					System.out.println("==============================");
					bw.write(filecontents);
					bw.flush();
					bw.newLine();
					break;

				case 'n':
					loopcheck = false;
					break;
				default:
					System.out.println("invalid choice");
					System.out.println("Do you wish to write more text to the file? Y/N");
					System.out.println("==============================");
					break;
				}// end of switch
			} // end of loopcheck

		} // end of if

		else {// runs if file does not exist
			f.createNewFile(); // creates new file with the specified filename
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			System.out.println("Enter Text To Write To File : ");
			String filecontents = sc.next();
			System.out.println("==============================");
			bw.write(filecontents);
			bw.flush();
			bw.newLine();

			boolean loopcheck = true;
			while (loopcheck) {
				System.out.println("Do you wish to write more text to the file? Y/N");
				char c = sc.next().charAt(0);
				System.out.println("==============================");
				switch (c) {
				case 'y':
					System.out.println("Enter Text To Write To File : ");
					filecontents = sc.next();
					System.out.println("==============================");
					bw.write(filecontents);
					bw.flush();
					bw.newLine();
					break;

				case 'n':
					loopcheck = false;
					break;
				default:
					System.out.println("invalid choice");
					System.out.println("Do you wish to write more text to the file? Y/N");
					System.out.println("==============================");
					break;
				}// end of switch case

			} // end of loopcheck

		} // end of else

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		int count = 0;
		String sentence = br.readLine();
		while (sentence != null) {
			String [] words = sentence.split(" ");
			for (String word : words) {
				System.out.println(word);
				count++;
			}
			sentence = br.readLine();
		} // end of while loop

		System.out.println("Number of words = " + count);

	}// end of main method
}// end of class
