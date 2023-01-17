package arrays;

import java.util.Arrays;

public class Weather {
	public static void main(String[] args) {

		// The instructions for this workbook are on Learn the Part (Workbook 6.11)
		double[] celsius = { 12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0 };
		double[] fahrenheit = celciusToFahrenheit(celsius);
		printTemperatures(celsius, "Celsius");
		printTemperatures(fahrenheit, "Fahrenheit");

	}

	public static void printTemperatures(double[] temp, String tempType) {
		System.out.print(tempType + ": ");
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
	}

	public static double[] celciusToFahrenheit(double[] celsius) {
		double[] fahrenheit = new double[celsius.length];
		for (int i = 0; i < fahrenheit.length; i++) {
			fahrenheit[i] = (celsius[i] / 5 * 9) + 32;
		}
		return fahrenheit;
	}
}
