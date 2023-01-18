package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleTwo {
	public static void main(String[] args) {
		try {
			readFile("D:\\New folder\\core-java-training\\Java Fundamentals\\src\\exceptions\\greetings.txt");
		} catch (FileNotFoundException exception) {
			System.out.println(exception.getMessage());
		} finally {
			System.out.println("process complete");
		}
	}

	public static void readFile(String fileName) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(
				"D:\\New folder\\core-java-training\\Java Fundamentals\\src\\exceptions\\greetings.txt");
		Scanner scanner = new Scanner(fis);
		System.out.println(scanner.nextLine());
		scanner.close();
	}
}