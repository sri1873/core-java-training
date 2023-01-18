package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleOne {
	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("D:\\New folder\\core-java-training\\Java Fundamentals\\src\\exceptions\\greetings.txt");
			Scanner scanner = new Scanner(f);
			System.out.println(scanner.nextLine());
			scanner.close();
		} catch (FileNotFoundException exception) {
			System.out.println(exception.getMessage());
		} finally {
			System.out.println("process complete");
		}
	}

}