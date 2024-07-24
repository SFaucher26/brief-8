package humains;

import batiments.Atelier;
import batiments.Maison;

public class Artisan extends Humain {
    // Attributs hérités d'humain 

    //Constructeur 
    
    public Artisan(String gender, String firstname, String lastname, int age, double hight, double weight) {
        super(gender, firstname, lastname, age, hight, weight);
    }  

    //Méthodes 
    public void makeTools(){
        System.out.println("fabrique des outils.");
    }

    public void restoreBuilding(){
        System.out.println("restaure des constructions.");
    }

    public void goToWorkShop(Atelier atelier){
        System.out.println("travaille à l'atelier.");
    }

    public void goToBuilding(){
        System.out.println("rejoint un batiment à  rénover");
    }


    public void goToSleep(Maison maison){
        System.out.println("Va dormir dans sa maison");
    }

}
