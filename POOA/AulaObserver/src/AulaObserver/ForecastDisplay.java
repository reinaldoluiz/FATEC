package AulaObserver;

import java.util.Random;

public class ForecastDisplay implements Observer, DisplayElement {
	
	private double previsao;
	
	public void update(double t, double h, double p) {
		this.previsao = (t-2) + new Random().nextDouble() * 4;
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.printf("Previsão: %.1f\u00B0C\n", this.previsao);
		
	}
}
