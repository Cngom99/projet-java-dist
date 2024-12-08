package entity;

import java.util.Scanner;

public class ArticleImpl implements IArticle {

    @Override
    public Article saisie() {
        Scanner scanner = new Scanner(System.in);
        int id = 0;

        // Saisie sécurisée pour l'ID
        while (true) {
            try {
                System.out.print("Entrez l'ID de l'article : ");
                id = Integer.parseInt(scanner.nextLine());
                break; // Sortir de la boucle si l'entrée est correcte
            } catch (NumberFormatException e) {
                System.out.println("Erreur : Veuillez entrer un nombre entier pour l'ID.");
            }
        }

        System.out.print("Entrez le libellé de l'article : ");
        String lib = scanner.nextLine();

        return new Article(id, lib);
    }

    @Override
    public void affichage(Article a) {
        System.out.println(a.toString());
    }
}
