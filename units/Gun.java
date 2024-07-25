package units;

public interface Gun {
    public default void haveAWeapon(Weapon gun){
            System.out.println("Je possède " + gun);
    }
}
