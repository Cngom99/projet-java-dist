package entity;

public class Etudiant extends Personne {
    private String matricule;
    private double moyenne;

    public Etudiant() {}

    public Etudiant(String nom, String prenom, double moyenne) {
        super(nom, prenom);
        this.moyenne = moyenne;
        this.matricule = genererMatricule();
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    private String genererMatricule() {
        return "ET" + nom.charAt(0) + prenom.charAt(0) + System.currentTimeMillis();
    }

    @Override
    public void affiche() {
        System.out.println("Etudiant: " + nom + " " + prenom + ", Matricule: " + matricule + ", Moyenne: " + moyenne);
    }
}
