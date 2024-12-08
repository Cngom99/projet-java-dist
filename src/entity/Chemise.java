package entity;

public class Chemise extends Article {
    private final String couture;

    // Constructeur
    public Chemise(int id, String lib, String couture) {
        super(id, lib);
        this.couture = couture;
    }

    @Override
    public String toString() {
        return super.toString() + ", couture='" + couture + "'";
    }
}