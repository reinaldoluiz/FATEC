public class Comissionado extends PessoaFisica{

	private double comissao;
  private double salario;

	public Comissionado(){

	}
	public Comissionado (String nome,String sobrenome,String cpf, double salario, double comissao){
		super(nome,sobrenome,cpf);
		this.comissao = comissao;
    this.salario = salario;
	}

	public void setComissao (double comissao){
		this.comissao = comissao;
	}
	public double getComissao(){
		return this.comissao;
	}

  public void setSalario (double salario){
    this.salario = salario;
  }
  public double getSalario(){
    return this.salario;
  }

	public double salarioTotal(){
		return this.getSalario() + this.comissao;
	}
	@Override
	public String toString(){
		return super.toString() + "\nComissao = " +this.comissao + "]\n" + "[Salario Total = " + (this.getSalario() + this.comissao) + "]";
	}

}
