package batiments;

public class Ferme extends Batiment {
    
    public Ferme(double superficie, int fenetres, int portes, int pieces, String garden) {
        super(superficie, fenetres, portes, pieces);
    }

    //Méthode
    public void productFood(){
        System.out.println("produit de la nourriture");
    }
}
