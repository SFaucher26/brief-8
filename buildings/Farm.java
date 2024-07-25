package buildings;

import ressources.Wood;
import ressources.Food;

public class Farm extends Building {

    public Farm(String name, int numero) {
        super(name, numero);
    }

    // Méthode
    public void productResources(Wood wood, Food food) {
        System.out.println("produit du " + wood + "et " + food);
    }
}
