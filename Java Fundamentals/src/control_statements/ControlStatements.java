package control_statements;

import java.util.Scanner;

public class ControlStatements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = 0;
		String answer = "";
		System.out.println("1.Which is part of the Marvel Universe?");
		System.out.println("\ta) Green Lantern\n\tb) Deadpool\n\tc) Robin\n\td) Joker\n");
		answer = scan.nextLine();
		if (answer.equals("b")) {
			System.out.println("Correct!");
			score += 5;
		} else {
			System.out.println("Wrong!");
			score--;
		}

		System.out.println("2.Who is not an Avenger?");
		System.out.println("\ta) Superman\n\tb) Black Widow\n\tc) Hulk\n\td) Thor\n");
		answer = scan.nextLine();
		if (answer.equals("a")) {
			System.out.println("Correct!");
			score += 5;
		} else {
			System.out.println("Wrong!");
			score--;
		}
		System.out.println("3.Who dies in the Avengers Endgame?");
		System.out.println("\ta) Black Widow\n\tb) Ironman\n\tc) Rocket\n\td) Shuri\n");
		answer = scan.nextLine();
		if (answer.equals("a") || answer.equals("b") || answer.equals("a,b")) {
			System.out.println("Correct!");
			score += 5;
		} else {
			System.out.println("Wrong!");
			score--;
		}

		if (score >= 10) {
			System.out.println("Great job Your score is:" + score);
		} else if (score > 7) {
			System.out.println("Your score is:" + score);
		} else {
			System.out.println("Your score is:" + score);
		}
	}
}
