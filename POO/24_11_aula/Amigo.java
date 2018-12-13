public class Amigo{
  private String nome, sexo, mensagem;
  private int idade;

  public Amigo(String nome, String sexo, String mensagem, int idade){
    this.nome = nome;
    this.sexo = sexo;
    this.mensagem = mensagem;
    this.idade = idade;
  }

   public Amigo(String nome, String sexo, int idade){
    this.nome = nome;
    this.sexo = sexo;
    this.mensagem = "Seja bem vindo!";
    this.idade = idade;
  }

  public Amigo(){}

  public String getNome(){
    return nome;
  }
  public String getSexo(){
    return sexo;
  }
  public String getMensagem(){
    return mensagem;
  }
  public int getIdade(){
    return idade;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public void setSexo(String sexo){
    this.sexo = sexo;
  }

  public void setIdade(int idade){
    this.idade = idade;
  }

  public void setMensagem(String mensagem){
    if(mensagem.length()<=144){
      this.mensagem = mensagem;
    }else{
      this.mensagem = mensagem.substring(0,144);
    }
  }
  public String toString(){
    return "[Nome: " + nome + "] [Sexo: " + sexo + "][Idade: " + idade+"]\n[Mensagem: " + mensagem + "]";
  }
}
