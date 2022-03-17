package vedran.mape;

public class Auto {
    private String ime;
    private int godina;
    private long km;
    private double cijena;

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

    public long getKm() {
        return km;
    }

    public void setKm(long km) {
        this.km = km;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public Auto(String ime, int godina, long km, double cijena){
            this.ime = ime;
            this.godina = godina;
            this.km = km;
            this.cijena = cijena;
        }

}