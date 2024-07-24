package batiments;

public class Atelier extends Batiment {
    private Hangar hangar;
    
    public Atelier(double superficie, int fenetres, int portes, int pieces, Hangar hangar) {
        super(superficie, fenetres, portes, pieces);
        this.hangar = hangar;
    }

    //Méthodes 
    public void workShop(){
        System.out.println("Atelier");
    }

    // Getter & Setter
    public Hangar getHangar() {
        return hangar;
    }

    public void setHangar(Hangar hangar) {
        this.hangar = hangar;
    }
    
}