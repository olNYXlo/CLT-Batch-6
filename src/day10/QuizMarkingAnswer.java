package day10;

import java.util.Scanner;

public class QuizMarkingAnswer {

	public static void checkAns(String c, String ans) {

		if (c.equalsIgnoreCase(ans)) {
			QuizApplication.setScore(QuizApplication.getScore() + 1);
			System.out.println("Correct Answer!");
			System.out.println("Your Score " + QuizApplication.getScore());
			System.out.println("=============================");
		}

		else {
			System.out.println("WRONG!!!");
			System.out.println("Your Score " + QuizApplication.getScore());
			System.out.println("=============================");
		}

	}

	public static void check(String c, String ans) {
		
		Scanner sc = new Scanner(System.in);

		boolean loopcheck = true;

		while (loopcheck) {
			c.toLowerCase();

			switch (c) {

			case "a":
				checkAns(c, ans);
				loopcheck=false;
				break;

			case "b":

				checkAns(c, ans);
				loopcheck=false;
				break;

			case "c":

				checkAns(c, ans);
				loopcheck=false;
				break;

			case "d":

				checkAns(c, ans);
				loopcheck=false;
				break;

			default:
				System.out.println("Invalid Choice");
				System.out.println("Please Enter A Valid Choice : ");
				c = sc.next();		
				System.out.println("=============================");
				
				break;

			}

		}

	}
}
