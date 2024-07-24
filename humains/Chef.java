package humains;

import java.util.List;

public class Chef extends Humain {
    
    // Attribut arme pour chef   
    private Weapon gun;

    //Constructeur du chef
    public Chef(String gender, String firstname, String lastname, int age, double hight, double weight, Weapon gun) {
        super(gender, firstname, lastname, age, hight, weight);
        this.gun = gun;
        
    }

    //Méthodes 
    public void buffs(List<Humain> unites){

        System.out.println("applique des buffs aux humains autour de lui");
    }

    public void motivate(){
        System.out.println("Motive les troupes !");
    }
    
    public void haveAWeapon() {
        System.out.println("Je possède " + gun);
    }

}
