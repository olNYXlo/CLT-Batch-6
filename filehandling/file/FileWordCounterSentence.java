package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWordCounterSentence {

	public static void main(String[] args) throws IOException {

		FileWriter fw = null;
		BufferedWriter bw = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Name : ");
		String filename = sc.nextLine();
		System.out.println("==============================");

		File f = new File(filename); // creates reference to filename

		if (f.exists()) { // checks if file exists
			System.out.println(filename + " file exists");
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			System.out.println("Enter Text To Write To File : ");
			String filecontents = sc.nextLine();
			System.out.println("==============================");
			bw.write(filecontents);
			bw.flush();
			bw.newLine();

			boolean loopcheck = true;
			while (loopcheck) {
				
				System.out.println("Do you wish to write more text to the file? Y/N");
				char c = sc.nextLine().charAt(0);
				System.out.println("==============================");
				switch (c) {
				case 'y':
					System.out.println("Enter Text To Write To File : ");
					filecontents = sc.nextLine();
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
			System.out.println(filename + " file does not exist");
			f.createNewFile(); // creates new file with the specified filename
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			System.out.println("Enter Text To Write To File : ");
			String filecontents = sc.nextLine();
			System.out.println("==============================");
			bw.write(filecontents);
			bw.flush();
			bw.newLine();
			

			boolean loopcheck = true;
			while (loopcheck) {
				
				System.out.println("Do you wish to write more text to the file? Y/N");
				char c = sc.nextLine().charAt(0);
				System.out.println("==============================");
				switch (c) {
				case 'y':
					System.out.println("Enter Text To Write To File : ");
					filecontents = sc.nextLine();
					System.out.println("==============================");
					bw.write(filecontents);
					bw.flush();
					bw.newLine();
					break;

				case 'n':
					loopcheck = false;
					break;
					//breaks out of the writing loop
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
		while (sentence != null) {// while the sentence is not null, will execute code below
			System.out.println("Sentence : "+ sentence); // used to check if writer is writing sentence correctly
			String [] words = sentence.split(" "); // splits the sentence into individual strings that are separated by " " which is a single word
			for (String word : words) {
				System.out.println(word); // prints out each word for double checking
				count++; // adds to the word count
			}
			sentence = br.readLine(); //reads the next line
		} // end of while loop

		System.out.println("Number of words = " + count);

	}// end of main method
}// end of class
