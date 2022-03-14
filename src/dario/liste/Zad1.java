package dario.liste;

import java.util.ArrayList;
import java.util.List;

class Auto {
    private String ime;
    private int godina;

    public Auto() {
    }

    public Auto(String ime, int godina) {
        this.ime = ime;
        this.godina = godina;
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

    @Override
    public String toString() {
        return "Auto{" +
                "ime='" + ime + '\'' +
                ", godina=" + godina +
                '}';
    }
}

public class Zad1 {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Seat", 1956);
        Auto auto2 = new Auto("Zastava", 2021);

        List<Auto> autoList = new ArrayList<>();
        autoList.add(auto1);
        autoList.add(auto2);

        Auto auto3 = new Auto();
        auto3.setIme("Rimac");
        auto3.setGodina(2021);

        autoList.add(auto3);

        for (int i = 0; i < autoList.size(); i++) {
            System.out.println(autoList.get(i).getIme());
            System.out.println(autoList.get(i).getGodina());
        }

        for (Auto ispis: autoList) {
            System.out.println(ispis); // poziva toString
        }
    }
}
