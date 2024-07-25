import ressources.Food;
import units.Accessory;
import units.Artisan;
import units.Chief;
import units.Scout;
import units.Soldier;
import units.Villager;
import units.Weapon;
import buildings.WorkShop;
import buildings.Barrack;
import buildings.House;
import buildings.Wall;

public class Main {
  public static void main(String[] args) {

    //--------------SCENARIO D'EXEMPLES D'INTERACTIVITE---------------//
    // Instanciation d'un Villager
    Villager villager1 = new Villager("Men", "Joey");
    villager1.viewDetails();
    villager1.haveAnAccessory(Accessory.WHEELBARROW);
    House house1 = new House("Joe House", 3);
    house1.viewDetails();
    Food pommes = new Food("pommes", "périssables");
    villager1.collection(pommes);
    villager1.move();
    villager1.toRest(house1);
   

    // Instanciation d'un Soldier
    Soldier soldier1 = new Soldier("Men", "Soldat Ryan");
    soldier1.viewDetails();
    soldier1.haveAWeapon(Weapon.PISTOL);
    Barrack barrack = new Barrack("La Caserne", 25);
    barrack.viewDetails();
    Wall wall = new Wall("Mur", 1);
    wall.viewDetails();  
    soldier1.defendBuilding(wall);
    soldier1.move();
    soldier1.toRest(barrack);
   

    // Instanciation d'un élcaireur
    Scout scout1 = new Scout("Men", "Indiana Jones");
    scout1.viewDetails();
    scout1.haveAnAccessory(Accessory.COMPASS);
    scout1.move();
    House house2 = new House("Indiana House", 6);
    house2.viewDetails();
    scout1.toRest(house2);

   

    // Instanciation d'un artisan
    Artisan artisan1 = new Artisan("Men", "Paul");
    artisan1.viewDetails();
    WorkShop workShop1 = new WorkShop("ALLTECH Entreprise", 54);
    workShop1.viewDetails();
    House house3 = new House("Paul House", 55);
    house3.viewDetails();
    artisan1.makeToolsAndWeapon(workShop1);
    artisan1.toRest(house3);
    artisan1.restoreBuilding(house3);
   

    // Instanciation d'un Chief
    Chief chief = new Chief("femme", "WONDER WOMAN");
    chief.viewDetails();
    chief.haveAWeapon(Weapon.SHOTGUN);
    chief.motivate();
    
  }

}
