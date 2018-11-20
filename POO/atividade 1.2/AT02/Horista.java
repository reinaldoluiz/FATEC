public class Horista extends Empregado{

	private int horasTrabalhadas;
	private double valorHora;


	public Horista(){

	}

	public Horista (String nome,String sobrenome,String cpf, int horasTrabalhadas, double valorHora){
		super(nome,sobrenome,cpf);
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	public void setHorasTrabalhadas (double HorasTrabalhadas){
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public void setValorHora (double valorHora){
		this.valorHora = valorHora;
	}

	public double getHorasTrabalhadas(){
		return this.horasTrabalhadas;
	}

	public double getValorHora(){
		return this.valorHora;
	}

	public double salarioTotal(){
		return this.horasTrabalhadas * this.valorHora;
	}

	@Override
	public String toString(){
		return super.toString() + " \nSalario Total = " + salarioTotal() + "]";
	}

}
