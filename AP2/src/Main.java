import entity.IProduit;
import entity.Produit;
import entity.ProduitImpl;

public class Main {
    public static void main(String[] args) {
        IProduit produitService = new ProduitImpl();

        Produit produit = produitService.saisie();

        produitService.affichage(produit);
    }
}
