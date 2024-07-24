package humains;

import batiments.Maison;
import ressources.Resources;

public class Villageois extends Humain{
    // Les attributs d'humain sont hérités
    // Rajout d'attributs (sac pour récolter des ressources)
    String contenant;
    private Resources resources;

    // Constructeur hérité de humain (super() + le constructreur pour son attribut supplémentaire)
    public Villageois(String gender, String firstname, String lastname, int age, double hight, double weight,
            String contenant, Resources resources) {
        super(gender, firstname, lastname, age, hight, weight);
        this.contenant = contenant;
        this.resources = resources;

    }

    //Méthode pour afficher la collecte et le contenant 
    public void collectRessources(Resources resources){
        System.out.println("Je collecte " + resources + " dans " + contenant + ".");
    }

    public void moveInTheCity(){
        System.out.println("Je me déplace dans mon village.");
    }
    
    public void sleepInTheHouse(Maison maison){
        System.out.println("Je me repose dans ma maison.");
    }

    //Getter & Setter pour le contenant 
    public String getContenant() {
        return contenant;
    }

    public void setContenant(String contenant) {
        this.contenant = contenant;
    }

    public Resources getRersources() {
        return resources;
    }

    public void setRersources(Resources resources) {
        this.resources = resources;
    }
    
}
