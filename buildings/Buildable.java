package buildings;

public interface Buildable {
    public default void buildable(){
       System.out.println("constructible");
    }
}
