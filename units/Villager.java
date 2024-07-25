package units;


import ressources.Food;



public class Villager extends Unit implements Accessories{
    // Les attributs d'humain sont hérités
    // Rajout d'attributs (sac pour récolter des ressources)
        

    // Constructeur hérité de humain (super() + le constructreur pour son attribut supplémentaire)
    

    public Villager(String gender, String name) {
        super(gender, name);
        
      
    }

    
    //Méthode pour afficher la collecte et le contenant 
    public void collection(Food food){
        System.out.println("Je collecte " + food);
    }


    
}
