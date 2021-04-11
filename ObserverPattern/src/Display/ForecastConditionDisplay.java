package Display;

import Subject.Subject;

public class ForecastConditionDisplay implements Observer, Display {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject observable;

	public ForecastConditionDisplay(Subject observable) {
		this.observable = observable;
		observable.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Forecast Condition : " + temperature + "F / " + humidity + "% /" + pressure);
	}
}
