package AulaObserver;

public class HeatIndexDisplay implements Observer, DisplayElement {
	private double hi;
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.printf("%.1f\u00B0C\n", hi);
	}

	@Override
	public void update(double t, double h, double p) {
		// TODO Auto-generated method stub
		t = t * 9/5 + 32;
		hi = -42.379 + 2.04901523 * t +
				10.14333127 * h - 0.22475541 * t * h
				- 6.83783 * (10 - 3 * t * t)
				-5.481717 * (10 - 2 * h * h)
				+ 1.22874 * (10-3 *t * t * h) + 
				8.5282 * (10 - 4 * t * h * h) - 
				1.99 * (10 - 6 * t * t * h * h);
		display();
		
	}

}
