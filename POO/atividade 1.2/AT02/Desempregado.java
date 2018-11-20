public class Desempregado extends  PessoaFisica{

	private double seguroDesemprego;

	public Desempregado(){

  }

	public Desempregado(String nome,String sobrenome,String cpf, double seguroDesemprego ){
		super(nome,sobrenome,cpf);
		this.seguroDesemprego = seguroDesemprego;
	}
	public void setSeguroDesemprego (double seguroDesemprego){
		this.seguroDesemprego = seguroDesemprego;
	}
	public double getSeguroDesemprego(){
		return this.seguroDesemprego;
	}
	@Override
	public String toString(){
		return super.toString() + "\n[ O valor do seguro desemprego e= " + this.seguroDesemprego + "]";
	}
}
