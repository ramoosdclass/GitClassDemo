
package Encapsulation;

public class WeatherMockDAO {

	public static void main(String[] args) {

		// User has a web form to enter weather data
		// User entered city, state, high and low
		// capture that info
		// Put that in an object and save it in the table in a row
		Weather weather1 = new Weather();
		weather1.setState("Missouri");
		weather1.setCity("Kansas City");
		weather1.setHigh(68);
		weather1.setLow(47);
		
		saveWeather(weather1);

	}

	static void saveWeather(Weather weather) {
		// Mocking code that would connect to the database
		// and store that object in the table "weather" in a row
		System.out.println(weather.getCity());
		System.out.println(weather.getState());
		System.out.println(weather.getHigh());
		System.out.println(weather.getLow());
	}

}
