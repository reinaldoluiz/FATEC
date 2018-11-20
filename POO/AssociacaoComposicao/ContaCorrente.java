public class ContaCorrente{
  //atributos
  private int numero;
  private int digito;
  private double saldo;
  private Agencia agencia;
  //constructor
  public ContaCorrente(int numero, int digito, double saldo, Agencia agencia){
    this.numero = numero;
    this.digito = digito;
    this.saldo = saldo;
    this.agencia = agencia;
  }
  //metodos de acesso
  public int getNumero(){
    return numero;
  }
  public int getDigito(){
    return digito;
  }
  public double getSaldo(){
    return saldo;
  }
  public Agencia getAgencia(){
    return agencia;
  }
  //metodos modificadores
  public void setNumero(){
    this.numero = numero;
  }
  public void setDigito(){
    this.numero = digito;
  }
  public void setSaldo(){
    this.saldo = saldo;
  }
  public void setAgencia(){
    this.saldo = saldo;
  }

  //metodo depositar
  //metodo sacar
  //metodo consultarSaldo
  //metodo imprimirSaldo
}
