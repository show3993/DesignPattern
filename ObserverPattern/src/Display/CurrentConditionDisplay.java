package Display;

import Subject.Subject;

public class CurrentConditionDisplay implements Observer, Display {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject observable;

	public CurrentConditionDisplay(Subject observable) {
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
		System.out.println("Current Condition : " + temperature + "F / " + humidity + "% /" + pressure);
	}
}
