package teste;

public class TesteEmpregado {
	
	public static void main (String[] args) {
		Empregado emp1 = new Empregado(101, "Maria Conceicao", "259874569", "65987456931","04/04/2005", "Auxiliar Administrativa");
		//System.out.println(emp1);
		Empregado emp2 = new Empregado(102, "Carlos Marinho", "236549856", "12368745963","01/02/2008", "Contador");
		
		ChamadaEmpregado empresa = new ChamadaEmpregado();
		empresa.cadastrarEmpregado(emp1);
		empresa.cadastrarEmpregado(emp2);
		
		/*
		for(Empregado e: empresa.getLista()){
			System.out.println(e);
		}
		*/
		
		System.out.println(empresa);
		
		empresa.getLista().get(3).setNumRegistro(103);
		empresa.getLista().get(3).setNome("Joao Carlos");
		
		System.out.println(emp2);
		
		emp4 = new Empregado(104, "Cristiane Souza");
		empresa.cadastrarEmpregado(emp4);
		
		empresa.cadastrarEmpregado(new Empregado(106, "Juliana Alves"));
		
		System.out.println(ads);
		/* nao fazer
		empresa.getLista().add(1, new Empregado(110, "Gustavo Mendes"));
		System.out.println(empresa);
		*/
		
		ads.excluirEmpregado(emp1);
		System.out.println(empresa);
	
		if(empresa.busca(emp2)==true){
			System.out.println(emp2.getNome() + " esta na lista");
		}
		else{
			System.out.println(emp2.getNome() + " nao esta na lista");
		}
		
		if(ads.busca(a1)==true){
			System.out.println(emp1.getNome() + " esta na lista");
		}
		else{
			System.out.println(emp1.getNome() + " nao esta na lista");
		}
	}

}
