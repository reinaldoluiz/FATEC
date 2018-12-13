import java.util.ArrayList;

public class Rede{
  private ArrayList<Amigo>amigos;

  public Rede(){
    amigos = new ArrayList<Amigo>();
  }

  public void addAmigo(Amigo amigo){
    amigos.add(amigo);
  }


  //metodo encontrar pelo nome
  public int busca(String nome){
    for(int i= 0; i < amigos.size();i++){
      if(amigos.get(i).getNome().equals(nome)) return i;
    }
    return -1;
  }

  //metodo remover
  public void bloquearAmigo(String nome){
    int indice = busca(nome);
    if (indice != -1) this.amigos.remove(indice);
  }

  //enviar mensagem

  //vetor amigos mais velhos
  public void listaOld(amigos){

  }
}
