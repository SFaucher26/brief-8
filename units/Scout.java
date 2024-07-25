package units;

import ressources.Resource;

public class Scout extends Unit implements Accessories {

    // Attributs hérités de Humain + outils pour la découverte
    

    // Constructeur de l'éclaireur
    public Scout(String gender, String name) {
        super(gender, name);
        
    }

    // Méthodes

    public void explore(Resource resource) {
        System.out.println("explore pour trouver " + resource);
    }

}
