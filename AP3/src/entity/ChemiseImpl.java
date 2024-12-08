package entity;

import java.util.Scanner;

public class ChemiseImpl implements IChemise {

    @Override
    public Chemise saisie() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez l'ID de la chemise : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Entrez le libellé de la chemise : ");
        String lib = scanner.nextLine();

        System.out.print("Entrez le type de couture : ");
        String couture = scanner.nextLine();

        return new Chemise(id, lib, couture);
    }

    @Override
    public void affichage(Chemise c) {
        System.out.println(c.toString());
    }
}
