

import entity.IPersonne;
import entity.Personne;
import entity.Etudiant;
import entity.Employe;

public class Main {
    public static void main(String[] args) {
        // Créer un étudiant
        Etudiant etudiant = new Etudiant("Niang", "Balla", 15.5);
        // Créer un employé
        Employe employe = new Employe("Diop", "Badara", "Manager", 600000);

        // Tester la méthode affiche() pour chaque instance
        System.out.println("=== Test de l'interface IPersonne ===");
        etudiant.affiche(); // Affiche les informations de l'étudiant
        employe.affiche();  // Affiche les informations de l'employé

        // Polymorphisme avec l'interface IPersonne
        System.out.println("\n=== Polymorphisme avec IPersonne ===");
        IPersonne personne1 = etudiant;
        IPersonne personne2 = employe;

        personne1.affiche(); // Appelle affiche() de l'étudiant
        personne2.affiche(); // Appelle affiche() de l'employé

        // Vérifier les attributs spécifiques
        System.out.println("\n=== Vérification des attributs spécifiques ===");
        System.out.println("Matricule de l'étudiant : " + etudiant.getMatricule());
        System.out.println("Salaire de l'employé : " + employe.getSalaire());
    }
}
