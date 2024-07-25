package buildings;


import ressources.Metal;
import ressources.Stone;


public class WorkShop extends Building {

    public WorkShop(String name, int numero) {
        super(name, numero);

    }
    
    // Méthode
    public void productResources(Stone stone, Metal metal) {
        System.out.println("produit du " + metal + "et des " + stone);
    }
}