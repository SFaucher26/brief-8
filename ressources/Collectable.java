package ressources;

public interface Collectable {
    public default void collectable(){
        System.out.println("Ressource collectable");
    }
}
