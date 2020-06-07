package AulaObserver;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData wd = new WeatherData();
		wd.addObserver(new CurrentConditionsDisplay());
		wd.addObserver(new ForecastDisplay());
		wd.addObserver(new StatsDisplay());
		wd.addObserver(new HeatIndexDisplay());
		wd.iniciar();
	}

}
