package AulaObserver;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class WeatherData implements Subject{
	
	private List <Observer> observers;
	
	private double temperature, humidity, pressure;
	
	public WeatherData() {
		observers = new LinkedList<Observer>();
	}
	
	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}
	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer observer : observers) {
			observer.update(getTemperature(), getHumidity(), getPressure());
			System.out.printf("===========================================================================\n");
		}
			
	}
	
	public double getTemperature() {
		return temperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public double getPressure() {
		return pressure;
	}
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void iniciar() {
		setMeasurements();
	}
	
	public void setMeasurements() {
		Random gerador = new Random ();
		while(true) {
			this.temperature = 20 + gerador.nextDouble()*15;
			this.humidity = 0.5 + gerador.nextDouble()*0.3;
			this.pressure = 690 + gerador.nextDouble() * 15;
			measurementsChanged();
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
