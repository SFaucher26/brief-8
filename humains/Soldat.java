package humains;

import batiments.Caserne;
import batiments.Wall;

public class Soldat extends Humain {
    // Les attributs d'humain sont hérités
    private Weapon gun;

    //Constructeur du soldat
    public Soldat(String gender, String firstname, String lastname, int age, double hight, double weight, Weapon gun) {
        super(gender, firstname, lastname, age, hight, weight);
        this.gun = gun;
        
    }

    //Méthodes du soldat
    
    public void inFrontTheWall(Wall wall){
        System.out.println("défend le mur de la cité !");
    }

    public void inTheBarracks(Caserne caserne){
        System.out.println("se forme dans la caserne !");
    }

    public void outside(){
        System.out.println("sors du village pour attaquer");
    }

    public void haveAWeapon() {
        System.out.println("Je possède " + gun);
    }

    public Weapon getGun() {
    return gun;
    }

    public void setGun(Weapon gun) {
    this.gun = gun;
    }
     
}
