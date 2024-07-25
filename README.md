
#  Brief 8 #
### 1 - Forker le projet pour l'ouvrir dans un editeur de code ###
### 2 - Se référer au Diagramme de classes du brief 9 ci-dessous ###
### 3 - Dans la class Main cliquer sur "run" pour afficher le scénario des logs dans le terminal ###

#  Brief 9 #
# Diagramme de classes #
```mermaid
---
title: UML Nebula Game Labs
---
classDiagram
    Unit --|> Artisan
    Unit --|> Soldier
    Unit --|> Chief
    Unit --|> Villager
    Unit --|> Scout

    Gun --|> Soldier
    Gun --|> Chief
    Weapon --|> Gun

    Accessory --|> Accessories
    Accessories --|> Soldier
    Accessories --|> Villager
    Accessories --|> Scout


    Building --|> House
    Building --|> Farm
    Building --|> barrack
    Building --|> WorkShop
    Building --|> Mur

    Buildable --|> House
    Buildable --|> Mur



    Ressource --|> Bois
    Ressource --|> Pierre
    Ressource --|> Nourriture
    Ressource --|> Fer

    Collectable --|> Nourriture
    Collectable --|> Bois


    class Unit
    <<abstract>> Unit
    Unit : + String name
    Unit : + String gender
    Unit : + move()
    Unit : + toRest()
    Unit : + goTo(Building)
    Unit : + viewDetails()
    class Villager{
        + collection(resources)
    }
    class Artisan{
        + makeToolsAndWeapon(WorkShop)
        + restoreBuilding(Building)
    }
    class Soldier{
        + String gun
        + defendBuilding(Building)
        + attack()
    }
    class Chief{
        + String gun
        + motivate()
        + giveBuffs()
    }
    class Scout{
        + explore()
    }

    class Gun
    <<interface>> Gun
    Gun : +haveAWeapon()

    class Weapon
    <<enumeration>> Weapon
    Weapon : + PISTOL
    Weapon : + RIFLE
    Weapon : + SHOTGUN
    Weapon : + SNIPER

    class Accessories
    <<interface>> Gun
    Accessories : +haveAnAccessory()

    class Accessory
    <<enumeration>> Accessory
    Accessory : + WHEELBARROW
    Accessory : + BAG
    Accessory : + MAP
    Accessory : + BINOCULARS
    Accessory : + COMPASS


    class Building
    <<abstract>> Building
    Building : + String name
    Building : + int numero
    Building : + viewDetails()
    class House{
        + shelter()
    }
    class barrack{
        + trainingSoldiers(Soldier)
    }
    class Farm{
        + productResources(Wood,Food)
    }
    class WorkShop{
        + productResources(Stone, Metal)
    }
    class Mur{
        + defend()
    }

    class Buildable
    <<interface>> Buildable
    Buildable : +buildable()

    class Ressource
    <<abstract>> Ressource
    Ressource : + String name
    Ressource : + String lifetime
    Ressource : + viewDetails()
    class Bois {
    }
    class Pierre{
    }
    class Nourriture{
    }
    class Fer {
    }

    class Collectable
    <<interface>> Collectable
    Collectable : +collectable()


```
# Diagramme de séquence #
### Scenario brief 9 ###

```mermaid


sequenceDiagram
    actor Villageois
    participant Maison
    participant Village
    participant Mur
    participant Exterieur
    
    participant SoldatsEnnemis

    Villageois->>Exterieur: Part récolter des ressources
    Exterieur-->>Mur: Ramène les ressources
    Note right of Mur: Pour construire un nouveau mur de défense au village
    Villageois->>Maison: Va se reposer
    Note right of Maison: Nuit
    SoldatsEnnemis-xMur: Attaquent le village
    Note right of Mur: Détruisent le nouveau mur 

```

