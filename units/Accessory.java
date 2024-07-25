package units;

public enum Accessory {
    WHEELBARROW ("Brouette"),
    BAG ("sac"),
    MAP ("carte"),
    BINOCULARS ("jumelles"),
    COMPASS("boussole");

    private String name;

    // Constructeur pour initialiser le nom de l'arme
    Accessory(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
