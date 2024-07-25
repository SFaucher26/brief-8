package units;

import buildings.Building;

public abstract class Unit {

    // Attributs
    String gender;
    String name;

    // Constructeur
    public Unit(String gender, String name) {
        this.gender = gender;
        this.name = name;

    }

    // Méthodes
    public void viewDetails() {
        System.out.println("My name is " + name + ". I\'m a " + gender);
    }

    public void move() {
        System.out.println("Je me promène");
    }

    public void toRest(Building Building) {
        System.out.println("Je me repose dans " + Building);
    }

    public void goTo(Building Building) {
        System.out.println("Je rejoins " + Building);
    }

    // Getters & Setters
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
