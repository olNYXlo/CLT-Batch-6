package day10;

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
		QuizQns.main();
		List <String> QuizAnsList = new ArrayList <String> (); // Can also create Answer Key & iterate respectively but the memory required will be more
		// so order the answers according to a pattern
		QuizAnsList.add("A");
		QuizAnsList.add("B");
		QuizAnsList.add("C");
		QuizAnsList.add("D");
		
		score = 0;
		
		String c;
		Scanner sc = new Scanner(System.in);
		for (int i=0; i < QuizQns.refList.size(); i+=5) {
			System.out.println(QuizQns.refList.get(i));
			System.out.println(QuizQns.refList.get(i+1));
			System.out.println(QuizQns.refList.get(i+2));
			System.out.println(QuizQns.refList.get(i+3));
			System.out.println(QuizQns.refList.get(i+4));
			c = sc.next();
			System.out.println("=============================");
			QuizMarkingAnswer.check(c, QuizAnsList.get((i+2)%4));
		}
		System.out.println("End of quiz");
		System.out.println("=============================");
		
		
		
		/*
		System.out.println("Q1. Which nail grows fastest?");
		System.out.println("A. Index");
		System.out.println("B. Pinky");
		System.out.println("C. Middle");
		System.out.println("D. Thumb");
		c = sc.next();
		System.out.println("=============================");
		QuizMarkingAnswer.check(c, "C");
		//ans C
		
		System.out.println("Q2. What Temperature does Water boil? ");
		System.out.println("A. 100");
		System.out.println("B. 50");
		System.out.println("C. 20");
		System.out.println("D. 60");
		c = sc.next();
		System.out.println("=============================");
		QuizMarkingAnswer.check(c, "A");
		//ans A
		
		System.out.println("Q3. How many states are there in USA?");
		System.out.println("A. 30");
		System.out.println("B. 20");
		System.out.println("C. 50");
		System.out.println("D. 40");
		c = sc.next();
		System.out.println("=============================");
		QuizMarkingAnswer.check(c, "C");
		//ans C
		
		
		
		System.out.println("Q4. Who said E = MC2?");
		System.out.println("A. Einstein");
		System.out.println("B. Tesla");
		System.out.println("C. Trump");
		System.out.println("D. Textbook");
		c = sc.next();
		System.out.println("=============================");
		QuizMarkingAnswer.check(c, "A");
		//ans A
		
		System.out.println("Q5. What is the largest ocean?");
		System.out.println("A. Indian");
		System.out.println("B. Pacific");
		System.out.println("C. Artic");
		System.out.println("D. Atlantic");
		c = sc.next();
		System.out.println("=============================");
		QuizMarkingAnswer.check(c, "B");
		//ans B
		
		System.out.println("End of quiz");
		
		*/

	}
}
