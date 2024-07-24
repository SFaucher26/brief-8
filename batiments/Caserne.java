package batiments;

public class Caserne extends Batiment {

    private Hangar hangar;
    private Dormitory dormitory;

    //Constructeur hérité
    public Caserne(double superficie, int fenetres, int portes, int pieces, Hangar hangar, Dormitory dormitory) {
        super(superficie, fenetres, portes, pieces);
        this.hangar = hangar;
        this.dormitory = dormitory;
    }

    // Méthode 
    public void practiceDefense(){
        System.out.println("entrainer les troupes");
    }

    public Hangar getHangar() {
        return hangar;
    }

    public void setHangar(Hangar hangar) {
        this.hangar = hangar;
    }

    public Dormitory getDortoir() {
        return dormitory;
    }

    public void setDortoir(Dormitory dortoir) {
        this.dormitory = dortoir;
    }
    
    
}
