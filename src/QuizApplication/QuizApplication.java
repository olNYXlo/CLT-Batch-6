package QuizApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizApplication {
	
	public static int score;

	public static int getScore() {
		return score;
	}

	public static void setScore(int score) {
		QuizApplication.score = score;
	}

	public static void main(String[] args) {
		QuizQnsArrayList.main();
		List <String> QuizAnsList = new ArrayList <String> (); // Can also create Answer Key & iterate respectively but the memory required will be more
		// so order the answers according to a pattern
		QuizAnsList.add("A");
		QuizAnsList.add("B");
		QuizAnsList.add("C");
		QuizAnsList.add("D");
		
		score = 0;
		
		String c;
		Scanner sc = new Scanner(System.in);
		for (int i=0; i < QuizQnsArrayList.refList.size(); i+=5) {
			System.out.println(QuizQnsArrayList.refList.get(i));
			System.out.println(QuizQnsArrayList.refList.get(i+1));
			System.out.println(QuizQnsArrayList.refList.get(i+2));
			System.out.println(QuizQnsArrayList.refList.get(i+3));
			System.out.println(QuizQnsArrayList.refList.get(i+4));
			// prints out the questions and 4 available options
			c = sc.next();
			System.out.println("=============================");
			QuizMarkingAnswer.check(c, QuizAnsList.get((i+2)%4));//pattern of answers. e.g A -> B -> C -> D -> A
		}
		System.out.println("End of quiz");
		System.out.println("=============================");
		
		
		
		
	}
}
