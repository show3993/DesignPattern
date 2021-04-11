package Subject;

import java.util.ArrayList;

import Display.Observer;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int idx = observers.indexOf(observer);
		if (idx >= 0) observers.remove(idx);
	}
	
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    
    public void measurementsChanged() {
        notifyObservers();
    }

	@Override
	public void notifyObservers() {
		for (int idx = 0; idx < observers.size(); idx++) {
			Observer observer = observers.get(idx);
			observer.update(temperature, humidity, pressure);
		}
	}
}
