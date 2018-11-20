public class Cliente{
  //atributos
  private String nome;
  private String cpf;
  private ContaCorrente conta;
  //constructor
  public Cliente(String nome, String cpf, ContaCorrente conta){
    this.nome = nome;
    this.cpf = cpf;
    this.conta = conta;
  }
  //metodos de acesso
  public String getNome(){
    return nome;
  }

  public String getCpf(){
    return cpf;
  }

  public ContaCorrente(){
    return conta;
  }

  //metodos modificadores
  public void setNome(String nome){
    this.nome = nome
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  public void setConta(ContaCorrente conta){
    this.conta = conta;
  }
}
