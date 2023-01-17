package loops;

import java.util.Scanner;

public class Guess {
	public static void main(String[] args) {

		System.out.print("I chose a number between 1 and 5. Try to guess it: ");
		int secret = 4;
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		while (num != secret) {
			System.out.print("Guess again: ");
			num = scan.nextInt();
		}
		System.out.print("You got it!");

		scan.close();
	}

}
