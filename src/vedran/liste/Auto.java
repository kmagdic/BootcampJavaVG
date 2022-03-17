package vedran.liste;

public class Auto {
    private String ime;
    private int godina;

    @Override
    public String toString() {
        return "Auto{" +
                "ime='" + ime + '\'' +
                ", godina=" + godina +
                '}';
    }

    public Auto(String ime, int godina) {
        this.ime = ime;
        this.godina = godina;
    }

    public Auto() {
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


}