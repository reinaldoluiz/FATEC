package teste;

import java.util.ArrayList;

public class ChamadaEmpregado
	private ArrayList<Empregado> lista;
	
	public ChamadaEmpregado {
		lista = new ArrayList<>();
	}
	
	public ArrayList<Empregado>getLista() {
		return lista;
	}
	
	public void setLista(ArrayList<Empregado> lista) {
		this.lista = lista;
	}
	
	public void cadastrarEmpregado (Empregado e) {
		lista.add(e);
	}
	
	@Override
	public String toString() {
		String s = "";
		for (E,pregado e:lista){
			s = s + e + "\n";
		}
		return s;
	}
	
	public void excluirEmpregado (Empregado e) {
		lista.remover(e);
	}
	
	public boolean busca(Empregado e){
		for(Empregado emp:lista) {
			if(al.equals(e)){
				return true;
			}
		}
		return false;
	}
	
}


		
	