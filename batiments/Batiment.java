package batiments;

public abstract class Batiment {
    // Attributs
    private double superficie;
    private int fenetres;
    private int portes;
    private int pieces;

    //Constructeur 
    public Batiment(double superficie, int fenetres, int portes, int pieces) {
        this.superficie = superficie;
        this.fenetres = fenetres;
        this.portes = portes;
        this.pieces = pieces;
    }

    //Méthodes
    public void viewDetails (){
        System.out.println("superficie :" + superficie + "m2 , fenetres : " + fenetres + ",  portes : " + portes + 
          " , pièces : " + pieces );
    }
    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getFenetres() {
        return fenetres;
    }

    public void setFenetres(int fenetres) {
        this.fenetres = fenetres;
    }

    public int getPortes() {
        return portes;
    }

    public void setPortes(int portes) {
        this.portes = portes;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

}
