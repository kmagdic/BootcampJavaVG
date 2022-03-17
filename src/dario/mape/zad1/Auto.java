package dario.mape.zad1;

public class Auto {
    String ime;
    int godina;
    int km;
    long cijena;

    public Auto(String ime) {
        this.ime = ime;
    }

    public Auto(String ime, int godina, int km, long cijena) {
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

    public long getCijena() {
        return cijena;
    }

    public void setCijena(long cijena) {
        this.cijena = cijena;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "ime='" + ime + '\'' +
                ", godina=" + godina +
                ", km=" + km +
                ", cijena=" + cijena +
                '}';
    }
}
