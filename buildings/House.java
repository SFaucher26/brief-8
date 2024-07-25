package buildings;

public class House extends Building {

    // Attributs de Buildings
    public House(String name, int numero) {
        super(name, numero);

    }

    // Méthode
    public void shelter(){
        System.out.println("j'abrite");
    }

}
