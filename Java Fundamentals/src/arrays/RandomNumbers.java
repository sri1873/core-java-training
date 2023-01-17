package arrays;

public class RandomNumbers {
	public static void main(String[] args) {

		int[][] array = { { 48, 56, 56, 76, 0, 81, 51, 81, 99, 70 }, { 38, 52, 73, 6, 10, 56, 1, 71, 47, 9 },
				{ 85, 35, 47, 98, 91, 25, 69, 52, 2, 93 } };
		print2DArray(array);
	}

	public static int randomNumber() {
		double randomNumber = Math.random() * 100;
		return (int) randomNumber;
	}

	public static void print2DArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
