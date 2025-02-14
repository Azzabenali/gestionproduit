package Gestionproduit;

public class ProduitPromotion extends Produit {
    private double prixPromo;

    public ProduitPromotion(String nom, double prix, double prixPromo) {
        super(nom, prix);
        this.prixPromo = prixPromo;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Produit en Promotion: " + getNom() + ", Prix promotionnel: " + prixPromo + " TND");
    }}
