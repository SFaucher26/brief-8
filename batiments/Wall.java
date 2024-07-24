package batiments;

public class Wall extends Batiment {
    
    public Wall(double superficie, int fenetres, int portes, int pieces, String garden) {
        super(superficie, fenetres, portes, pieces);
    }

    // Méthode 
    public void wallOfTheCity(){
        System.out.println("Mur de la cité à défendre");
    }
}
