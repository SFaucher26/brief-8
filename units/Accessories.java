package units;

public interface Accessories {
    public default void haveAnAccessory(Accessory accessory){
        System.out.println("Je possède " + accessory);
}
}
