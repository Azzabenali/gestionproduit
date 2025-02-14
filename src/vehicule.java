public class vehicule {

    private String marque;
    private double prixParJour;


    public void Vehicule() {
    }


    public vehicule(String marque, double prixParJour) {
        this.marque = marque;
        this.prixParJour = prixParJour;
    }


    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrixParJour() {
        return prixParJour;
    }

    public void setPrixParJour(double prixParJour) {
        this.prixParJour = prixParJour;
    }


}
