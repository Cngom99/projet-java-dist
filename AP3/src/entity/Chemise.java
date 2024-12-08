package entity;

public class Chemise extends Article {
    private final String couture;

    public Chemise(int id, String lib, String couture) {
        super(id, lib);
        this.couture = couture;
    }

    @Override
    public String toString() {
        return "Chemise { " +
                "ID = " + id +
                ", Libellé = '" + lib + '\'' +
                ", Couture = '" + couture + '\'' +
                " }";
    }
}
