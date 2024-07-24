
import humains.Villageois;
import humains.Weapon;
import ressources.Resources;
import humains.Soldat;
import humains.Eclaireur;
import batiments.Atelier;
import batiments.Caserne;
import batiments.Dormitory;
import batiments.Garden;
import batiments.Hangar;
import batiments.Maison;
import batiments.Wall;
import humains.Artisan;
import humains.Chef;

public class Main {
    public static void main (String[] args){
      // Instanciation d'un villageois
      Villageois villageois1 = new Villageois("homme","INGALS","Charles",50, 1.80, 75, "une brouette", Resources.FOOD);
      Maison maison1 = new Maison(60, 5, 3, 4, new Garden());
      villageois1.viewDetails();
      villageois1.collectRessources(Resources.FOOD);
      villageois1.moveInTheCity();
      villageois1.sleepInTheHouse(maison1);
      maison1.viewDetails();

      // Instanciation d'un soldat
      Soldat soldat1 = new Soldat("femme", "KROFT", "Lara", 30, 1.75, 65, Weapon.SNIPER);
      Caserne caserne = new Caserne(600, 50, 8, 20, new Hangar(), new Dormitory());
      Wall wall = new Wall(0, 0, 0, 0, null);
      soldat1.viewDetails();
      soldat1.haveAWeapon();
      soldat1.inFrontTheWall(wall);
      soldat1.outside();
      soldat1.inTheBarracks(caserne);
      caserne.viewDetails();

      // Instanciation d'un élcaireur 
      Eclaireur eclaireur1 = new Eclaireur("homme", "JONES", "Indiana", 40, 1.80, 80, "ma lampe torche", "ma carte", Resources.WATER);
      Maison maison2 = new Maison(100, 8, 4, 5, new Garden());
      eclaireur1.viewDetails();
      eclaireur1.goOut();
      eclaireur1.inTheHouse(maison2);
      maison2.viewDetails();

      // Instanciation d'un artisan
      Artisan artisan1 = new Artisan("homme", "ALLTECH", "Vadim", 42, 1.83, 82);
      Atelier atelier1= new Atelier(200, 5, 6, 3, new Hangar());
      Maison maison3 = new Maison(150, 15, 10, 6, new Garden());
      artisan1.viewDetails();
      artisan1.goToBuilding();
      artisan1.goToWorkShop(atelier1);
      artisan1.goToSleep(maison3);
      maison3.viewDetails();
      artisan1.makeTools();
      artisan1.restoreBuilding();

      // Instanciation d'un chef
      Chef chef = new Chef("femme", "WONDER", "Woman", 25, 1.65, 60, Weapon.PISTOL);
      chef.viewDetails();
      chef.haveAWeapon();
      chef.motivate();
    }

}
