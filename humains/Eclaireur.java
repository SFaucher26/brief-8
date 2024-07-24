package humains;

import batiments.Maison;
import ressources.Resources;

public class Eclaireur extends Humain {
    
    //Attributs hérités de Humain + outils pour la découverte
    private String outil1;
    private String outil2;
    private Resources resources;


    //Constructeur de l'éclaireur
    public Eclaireur(String gender, String firstname, String lastname, int age, double hight, double weight,
            String outil1, String outil2, Resources resources) {
        super(gender, firstname, lastname, age, hight, weight);
        this.outil1 = outil1;
        this.outil2 = outil2;
        this.resources = resources;
    }

    //Méthodes
    public void goOut(){
        System.out.println("Je sors du village pour découvrir de nouvelles ressources avec " + outil1 + " et " + outil2 +" ! ");
    }
    public void inTheHouse(Maison maison){
        System.out.println("Je rentre dans ma maison.");
    }

    public void explore(Resources resources){
        System.out.println("explore pour trouver " + resources);
    }

    //Getters et Setters pour les outils
    public String getOutil1() {
        return outil1;
    }

    public void setOutil1(String outil1) {
        this.outil1 = outil1;
    }

    public String getOutil2() {
        return outil2;
    }

    public void setOutil2(String outil2) {
        this.outil2 = outil2;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }
    
}
