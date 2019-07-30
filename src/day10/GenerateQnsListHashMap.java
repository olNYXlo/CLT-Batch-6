package day10;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class GenerateQnsListHashMap {

	public static LinkedHashMap<Question, String> QnsList = new LinkedHashMap<Question, String>(); // creates attribute that is accesible globally
	// creates linkedHashMap to keep order of qns

	public static void generateQns() {

		Question q1 = new Question();
		Question q2 = new Question();
		Question q3 = new Question();
		Question q4 = new Question();
		Question q5 = new Question();

		q1.setQns("Q1. Which nail grows fastest?");
		List<String> Options = new ArrayList<String>();
		Options.add("A. Index");
		Options.add("B. Middle");
		Options.add("C. Thumb");
		Options.add("D. Pinky");
		q1.setOptions(Options);

		q2.setQns("Q2. What Temperature does Water boil? ");
		List<String> Options2 = new ArrayList<String>();
		Options2.add("A. 20");
		Options2.add("B. 50");
		Options2.add("C. 60");
		Options2.add("D. 100");
		q2.setOptions(Options2);

		q3.setQns("Q3. How many states are there in USA?");
		List<String> Options3 = new ArrayList<String>();
		Options3.add("A. 50");
		Options3.add("B. 20");
		Options3.add("C. 30");
		Options3.add("D. 40");
		q3.setOptions(Options3);

		q4.setQns("Q4. Who said E = MC2?");
		List<String> Options4 = new ArrayList<String>();
		Options4.add("A. Tesla");
		Options4.add("B. Einstein");
		Options4.add("C. Trump");
		Options4.add("D. Textbook");
		q4.setOptions(Options4);

		q5.setQns("Q5. What is the largest ocean?");
		List<String> Options5 = new ArrayList<String>();
		Options5.add("A. Pacific");
		Options5.add("B. Artic");
		Options5.add("C. Indian");
		Options5.add("D. Atlantic");
		q5.setOptions(Options5);

		QnsList.put(q1, "B");
		QnsList.put(q2, "D");
		QnsList.put(q3, "A");
		QnsList.put(q4, "B");
		QnsList.put(q5, "A");

	}

}
