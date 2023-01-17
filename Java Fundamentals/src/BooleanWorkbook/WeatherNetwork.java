package BooleanWorkbook;

public class WeatherNetwork {
	public static void main(String[] args) {

		int temp = 25;

		String forecast = "";
		if (temp < 0)
			forecast = "The forecast is FREEZING! Stay home!";
		else if (temp < 11)
			forecast = "The forecast is Chilly. Wear a coat!";
		else
			forecast = "It's warm. Go outside!";
		System.out.println(forecast);
	}
}
