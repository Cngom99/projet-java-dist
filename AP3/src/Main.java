import entity.Article;
import entity.ArticleImpl;
import entity.Chemise;
import entity.ChemiseImpl;
import entity.IArticle;
import entity.IChemise;
import entity.IMontre;
import entity.Montre;
import entity.MontreImpl;

public class Main {
    public static void main(String[] args) {
        IChemise chemiseImpl = new ChemiseImpl();
        Chemise chemise = chemiseImpl.saisie();
        chemiseImpl.affichage(chemise);

        IMontre montreImpl = new MontreImpl();
        Montre montre = montreImpl.saisie();
        montreImpl.affichage(montre);

        IArticle articleImpl = new ArticleImpl();
        Article article = articleImpl.saisie();
        articleImpl.affichage(article);
    }
}
