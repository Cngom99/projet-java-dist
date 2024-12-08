package entity;

public class Montre extends Article {
    private final String nature;

    // Constructeur
    public Montre(int id, String lib, String nature) {
        super(id, lib);
        this.nature = nature;
    }

    @Override
    public String toString() {
        return "Montre { " +
                "ID = " + id +
                ", Libellé = '" + lib + '\'' +
                ", Nature = '" + nature + '\'' +
                " }";
    }
}
