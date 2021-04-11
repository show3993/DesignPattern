package Main;

import Display.CurrentConditionDisplay;
import Display.ForecastConditionDisplay;
import Display.StatisticsConditionDisplay;
import Subject.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		StatisticsConditionDisplay statisticsDisplay = new StatisticsConditionDisplay(weatherData);
		ForecastConditionDisplay forcastDisplay = new ForecastConditionDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f); System.out.println();
		weatherData.setMeasurements(82, 70, 29.2f); System.out.println();
		weatherData.setMeasurements(78, 90, 29.2f); System.out.println();
	}

}
