package Gestionproduit;

public class Produitsoldes extends Produit {
    private double pourcentageReduction;

    public Produitsoldes(String nom, double prix, double pourcentageReduction) {
        super(nom, prix);
        this.pourcentageReduction = pourcentageReduction;
    }

    public double getPrixReduit() {
        return getPrix() * (1 - pourcentageReduction / 100);
    }

    @Override
    public void afficherDetails() {
        System.out.println("Produit en Soldes: " + getNom() + ", Prix après réduction: " + getPrixReduit() + " TND");


        }}
