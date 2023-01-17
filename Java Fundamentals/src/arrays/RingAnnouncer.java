package arrays;

public class RingAnnouncer {
	public static void main(String[] args) {
		String[] record = { "WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS" };
		int wins = 0;
		int losses = 0;

		for (int i = 0; i < record.length; i++) {
			if (record[i].compareTo("WIN") == 0)
				wins++;
			else
				losses += 1;
		}
		// Instructions for this workbook are on Learn the Part (Workbook 6.7).

		System.out.println("\nWith a professional record of " + wins + " Wins and " + losses + " losses.");
		System.out.println("He is the pride of oracle: Java Fury!");

	}
}
