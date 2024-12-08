package entity;

public class Employe extends Personne {
    private String fonction;
    private int salaire;

    public Employe() {}

    public Employe(String nom, String prenom, String fonction, int salaire) {
        super(nom, prenom);
        this.fonction = fonction;
        this.salaire = salaire;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public void affiche() {
        System.out.println("Employe: " + nom + " " + prenom + ", Fonction: " + fonction + ", Salaire: " + salaire);
    }
}
