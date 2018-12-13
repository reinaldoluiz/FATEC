public class TesteChamada{
  public static void main(String[] args){
    Aluno a1 = new Aluno (10,"Gil");
    System.out.println(a1);
    Aluno a2 = new Aluno ();
    System.out.println(a2);

    chamada ads = new Chamada();
    ads.matricularAluno(a1);
    ads.matricularAluno(a2);
  }
  /*for(Aluno a: ads.getLista()){
    System.out.println(a);
  }*/
  System.out.println(ads);
  ads.getLista().get(1).setRa(20);

  System.out.println(a2);

  a1 = new Aluno(30, "Cris");
  ads.matricularAluno(a1);

  ads.matricularAluno(new Aluno(40, "Ju"));

  System.out.println(ads);

  if(busca(a2)== true){
    System.out.println(a2.getNome()+"está na lista");
  }else {
    System.out.println(a2.getNome()+"não está na lista");
  }
}
