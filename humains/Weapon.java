package humains;

public enum Weapon {
    PISTOL("pistolet"),
    RIFLE("fusil"),
    SHOTGUN("fusil à pompe"),
    SNIPER("fusil de sniper");

    private String name;

    // Constructeur pour initialiser le nom de l'arme
    Weapon(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}