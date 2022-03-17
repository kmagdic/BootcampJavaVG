package kristina.mape;

public class Voce {
    private int broj;
    private String ime;
    private double cijena;

    public Voce(int broj, String ime, double cijena) {
        this.broj = broj;
        this.ime = ime;
        this.cijena = cijena;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }
}
