package batiments;

public class Maison extends Batiment {
    // Attributs de batiments + composant garden
    private Garden garden;
    

    public Maison(double superficie, int fenetres, int portes, int pieces, Garden garden) {
        super(superficie, fenetres, portes, pieces);
        this.garden = garden;
        
    }
       
    public void houseToSleep(){
        System.out.println("Maison");
    }

    public Garden getGarden() {
        return garden;
    }

    public void setGarden(Garden garden) {
        this.garden = garden;
    }
    
}
