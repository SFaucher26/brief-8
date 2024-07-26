package buildings;

public class Wall extends Building implements Buildable {

    public Wall(String name, int numero) {
        super(name, numero);
    }

    // Méthode
    public void defend(){
        System.out.println("Mur de défense");
    }
}
