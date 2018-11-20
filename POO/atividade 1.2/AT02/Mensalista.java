public class Mensalista extends PessoaFisica{

	private double salario;

	public Mensalista (){

	}

	public Mensalista (String nome,String sobrenome,String cpf,double salario){
		super(nome,sobrenome,cpf);
		this.salario = salario;
	}

	public void setSalario (double salario){
		this.salario = salario;
	}
	public double getSalario(){
		return this.salario;
	}
	@Override
	public String toString(){
		return super.toString() + "\nSalario = " +this.salario + "]\n";
	}
}
