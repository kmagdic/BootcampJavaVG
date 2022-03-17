package kristina.mape;

public class Auto {
    String ime;
    int godina;
    int km;
    double cijena;

    public Auto(String ime, int godina, int km, double cijena) {
        this.ime = ime;
        this.godina = godina;
        this.km = km;
        this.cijena = cijena;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }
}
