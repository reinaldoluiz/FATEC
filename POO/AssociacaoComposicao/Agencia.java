public class Agencia{
  //atributos
  private String nome;
  private int numero;
  private int digito;

  //constructor
  public Agencia(String nome, int numero, int digito){
    this.nome = nome;
    this.numero = numero;
    this.digito = digito;
  }
  //metodos de acesso
  public String getNome(){
    return nome;
  }
  public int getNumero(){
    return numero;
  }
  public int getDigito(){
    return digito;
  }
  //metodos modificadores
  public void setNome(String nome){
    this.nome = nome;
  }
  public void setNumero(int numero){
    this.numero = numero;
  }
  public void setDigito(int digito){
    this.digito = digito;
  }
}
