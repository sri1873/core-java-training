package loops;

import java.util.Scanner;

public class SignIn {
	public static void main(String[] args) {
		String username = "Samantha";
		String password = "Java <3";

		Scanner scan = new Scanner(System.in);
		System.out.println("\nWelcome to Javagram! Sign in below\n");
		System.out.print("- Username: ");
		String usernameEntry = scan.nextLine();
		System.out.print("- Password: ");
		String passwordEntry = scan.nextLine();

		while (!username.equals(usernameEntry) || !password.equals(passwordEntry)) {

			System.out.println("\nIncorrect, please try again!\n");
			System.out.print("- Username: ");
			usernameEntry = scan.nextLine();
			System.out.print("- Password: ");
			passwordEntry = scan.nextLine();

		}
		System.out.println("Sign in successful. Welcome!");
		scan.close();

	}
}
