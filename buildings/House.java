package buildings;

public class House extends Building implements Buildable{

    // Attributs de Buildings
    public House(String name, int numero) {
        super(name, numero);

    }

    // Méthode
    public void shelter(){
        System.out.println("j'abrite");
    }

}
