package QuizApplication;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class QuizHashMapApp {

	public static void main(String[] args) {

		GenerateQnsListHashMap.generateQns();// runs the method to generate qnslist in GenerateQnsList class
		LinkedHashMap <Question, String> QnsList = GenerateQnsListHashMap.QnsList; // creates reference to the generated QnsList

		
		Scanner sc = new Scanner(System.in);

		for (Entry<Question, String> entry : QnsList.entrySet()) { //For each entry, get the qns and ans. Print out the qns attributes (question & options)
			//iterates through each K,V pair in the LinkedHashMap
			Question qns = entry.getKey();
			String ans = entry.getValue();
			System.out.println(qns.getQns());
			System.out.println(qns.getOptions());
			System.out.println("Enter Your Answer :");
			String c;
			c = sc.next();
			QuizMarkingAnswer.check(c, ans); // runs marking check
			
		}
		
		
		System.out.println("End of quiz");
		System.out.println("=============================");
		
		

	}
	
}
