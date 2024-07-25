package buildings;

public abstract class Building {
    // Attributs
    private String name;
    private int numero;

    // Constructeur
    public Building(String name, int numero) {
        this.name = name;
        this.numero = numero;

    }

    // Méthodes
    public void viewDetails() {
        System.out.println( numero +" " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
