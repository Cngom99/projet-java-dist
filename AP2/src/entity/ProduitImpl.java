package entity;

import java.util.Scanner;

public class ProduitImpl implements IProduit {
    @Override
    public Produit saisie() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la référence du produit : ");
        String ref = scanner.nextLine();

        System.out.print("Entrez le libellé du produit : ");
        String libelle = scanner.nextLine();

        System.out.print("Entrez la quantité du produit : ");
        double quantite = scanner.nextDouble();

        System.out.print("Entrez le prix du produit : ");
        int prix = scanner.nextInt();

        return new Produit(ref, libelle, quantite, prix);
    }

    @Override
    public void affichage(Produit produit) {
        System.out.println("Détails du produit :");
        System.out.println(produit);
    }
}
