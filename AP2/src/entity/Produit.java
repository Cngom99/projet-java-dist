package entity;

public class Produit {
    private String ref;
    private String libelle;
    private double quantite;
    private int prix;

    // Constructeur par défaut
    public Produit() {}

    // Constructeur avec paramètres
    public Produit(String ref, String libelle, double quantite, int prix) {
        this.ref = ref;
        this.libelle = libelle;
        this.quantite = quantite;
        this.prix = prix;
    }

    // Getters et setters
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "ref='" + ref + '\'' +
                ", libelle='" + libelle + '\'' +
                ", quantite=" + quantite +
                ", prix=" + prix +
                '}';
    }
}
