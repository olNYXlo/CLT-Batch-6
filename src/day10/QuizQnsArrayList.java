package day10;

import java.util.ArrayList;
import java.util.List;

public class QuizQnsArrayList {
	
	public static List refList = new ArrayList(); // made static so ArrayList of questions are available without creating a QuizQns object
	// just have to run the main method to initialize the attribute refList

	public static void main() {
		
		refList.add("Q1. Which nail grows fastest?");
		refList.add("A. Index");
		refList.add("B. Pinky");		
		refList.add("C. Middle");
		refList.add("D. Thumb");
		
		refList.add("Q2. What Temperature does Water boil? ");
		refList.add("A. 20");
		refList.add("B. 50");
		refList.add("C. 60");
		refList.add("D. 100");
		
		refList.add("Q3. How many states are there in USA?");
		refList.add("A. 50");
		refList.add("B. 20");
		refList.add("C. 30");
		refList.add("D. 40");
		
		refList.add("Q4. Who said E = MC2?");
		refList.add("A. Tesla");
		refList.add("B. Einstein");
		refList.add("C. Trump");
		refList.add("D. Textbook");
		
		refList.add("Q5. What is the largest ocean?");
		refList.add("A. Indian");
		refList.add("B. Atlantic");
		refList.add("C. Pacific");
		refList.add("D. Artic");	
		

	}
}
