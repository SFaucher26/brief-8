package units;

import buildings.Building;

public class Soldier extends Unit implements Gun, Accessories {

    // Constructeur du Soldier
    public Soldier(String gender, String name) {
        super(gender, name);

    }

    // Méthodes du Soldier

    public void defendBuilding(Building Building) {
        System.out.println("défend le " + Building);
    }

    public void attack() {
        System.out.println("Je sors pour attaquer un autre village");
    }

}
