package buildings;

import units.Soldier;

public class Barrack extends Building {

    // Constructeur hérité
    public Barrack(String name, int numero) {
        super(name, numero);

    }

    // Méthode
    public void trainingSoldiers(Soldier Soldier) {
        System.out.println("Entrainer " + Soldier);
    }

}
