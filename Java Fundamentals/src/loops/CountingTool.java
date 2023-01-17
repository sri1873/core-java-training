package loops;

import java.util.Scanner;

public class CountingTool {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi Timmy. Choose a number upto 7");
		int num = scan.nextInt();
		System.out.println("Great here's how its done");
		for (int i = 0; i <= num; i++)
			System.out.print(i + " ");
		scan.close();
	}
}
