public class Teste{
  public static void main(String[] args){
    ArrayList<Animal> = zoo = new ArrayList<>();

    Gato g1 = new Gato("bichano");
    Gato g2 = new Gato("fatequinho");

    Cachorro c1 = new Cachorro("pluto");
    Cachorro c2 = new Cachorro("snoopy");

    zoo.add(g1);
    zoo.add(g2);
    zoo.add(c1);
    zoo.add(c2);

    for(Animal a: zoo){
      System.out.println(a);
      a.fazBarulho();
    }
  }
}
