package animais;

public abstract class Animal implements Observer {
	public abstract void realizarAcao(int n);
	
	@Override
	public void update(int n) {
		realizarAcao(n);
	}
}
