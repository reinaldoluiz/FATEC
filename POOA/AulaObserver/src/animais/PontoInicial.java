package animais;

public class PontoInicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeradorDeInteiros gerador = new GeradorDeInteiros();
		gerador.addObserver(new Dog());
		gerador.addObserver(new Cat());
		gerador.addObserver(new Mouse());
		gerador.addObserver(new Duck());
		gerador.iniciar();
		
	}

}
