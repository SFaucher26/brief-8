package units;

import buildings.WorkShop;
import buildings.Building;

public class Artisan extends Unit {

    // Constructeur
    public Artisan(String gender, String name) {
        super(gender, name);
    }

    // Méthodes
    public void makeToolsAndWeapon(WorkShop WorkShop) {
        System.out.println("fabrique des outils et des armes.");
    }

    public void restoreBuilding(Building Building) {
        System.out.println("restaure des constructions.");
    }

}
