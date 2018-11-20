public class TesteEmpregados {
	public static void main (String args[]){

    PessoaFisica p1 = new PessoaFisica();
    PessoaFisica p2 = new PessoaFisica("Joao", "Freitas", "050606");
    PessoaFisica p3 = new PessoaFisica("Gil", "Tupi", "3333606");
    PessoaFisica p4 = new PessoaFisica("Maria", "Pinheiro", "70999");
    PessoaFisica p5 = new PessoaFisica("Roberto", "Santos", "22206");
    PessoaFisica p6 = new PessoaFisica("Joana", "Silva", "1111006");

		Empregado e1 = new Empregado();
		Empregado e2 = new Empregado("Joao", "Alberto", "050606");

		Mensalista m1 = new Mensalista();
		Mensalista m2 = new Mensalista("Gil", "Tupi", "3333606",1000);

		Comissionado c1 = new Comissionado();
		Comissionado c2 = new Comissionado("Maria", "Pinheiro", "70999", 1200, 660);

		Horista h1 = new Horista();
		Horista h2 = new Horista("Roberto", "Santos", "22206", 220, 10);

    Desempregado d1 = new Desempregado();
    Desempregado d2 = new Desempregado("Joana", "Silva", "1111006", 1500);


	System.out.println (e1);
	System.out.println (e2);

	System.out.println (m1);
	System.out.println (m2);

	System.out.println (c1);
	System.out.println (c2);

	System.out.println (h1);
	System.out.println (h2);

  System.out.println (d1);
  System.out.println (d2);
	}
}
