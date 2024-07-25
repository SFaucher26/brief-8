package ressources;

public abstract class Resource {
    String name;
    String lifetime;

    // Constructeur
    public Resource(String name, String lifetime) {
        this.name = name;
        this.lifetime = lifetime;
    }
    // Méthode 
    public void viewDetails (){
        System.out.println( name +  lifetime);
    }
    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLifetime() {
        return lifetime;
    }

    public void setLifetime(String lifetime) {
        this.lifetime = lifetime;
    }
}
