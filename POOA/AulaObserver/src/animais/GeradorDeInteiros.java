package animais;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class GeradorDeInteiros implements Subject {
	
	private List <Observer> observers;
	private int n;
	
	public GeradorDeInteiros() {
		observers = new LinkedList <> ();
	}
	
	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o : observers) {
			o.update(n);
		}
	}

	public void iniciar() {
		// TODO Auto-generated method stub
		Random gerador = new Random();
		while(true) {
			n = gerador.nextInt(10)+ 1;
			notifyObservers();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
