import entity.IProduit;
import entity.Produit;
import entity.ProduitImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IProduit produitService = new ProduitImpl();

        // Saisir un produit
        Produit produit = produitService.saisie();

        // Afficher le produit
        produitService.affichage(produit);
    }
}
