import javax.swing.JOptionPane;

public class Teste{
  public static void main(String[] args){
    Rede redeAmigos = new Rede();
  }
  //adicione 3 amigos
  redeAmigos.addAmigo(new Amigo("Joao", "H","Ze ninguem", 19));
  redeAmigos.addAmigo(new Amigo("Maria", "M",19));
  redeAmigos.addAmigo(new Amigo("Benjamin", "H", 60));

  //exiba a lista de amigos
  redeAmigos.listar();

  //remove um amigo
  System.out.println(redeAmigos.busca("Joao"));
  System.out.println(redeAmigos.busca("Maria"));
  System.out.println(redeAmigos.busca("Benjamin"));

  redeAmigos.bloquearAmigo("Joao");
}
