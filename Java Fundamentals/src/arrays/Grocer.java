package arrays;

public class Grocer {
	public static void main(String[] args) {
		String fruits[] = { "apples", "bananas", "candy", "chocolate", "coffee", "tea" };

		// Instructions for this workbook are on Learn the Part (Workbook 6.3).

		System.out.println("\nDo you sell coffee?");
		for (int i = 0; i < fruits.length; i++) {

			if (fruits[i].compareTo("coffee") == 0)
				System.out.println("\nWe have that in aisle: " + i);
		}

	}
}
