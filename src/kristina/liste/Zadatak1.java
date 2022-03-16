package kristina.liste;

import java.util.*;

public class Zadatak1 {
    public static void main(String[] args) {

        Auto Ford = new Auto("Ford", 1982);
        Auto VW = new Auto("Polo", 2021);

        List<Auto> auti = new ArrayList<>();
        auti.add(Ford);
        auti.add(VW);

        Auto Peugeot = new Auto("Peugeot", 2018);
        auti.add(Peugeot);

        for (Auto car : auti) {
            System.out.println(car);
        }

        for (int i = 0; i < auti.size(); i++) {
            System.out.println("Godina: " + auti.get(i).getYear() + " " + "Ime: " + auti.get(i).getName());
        }
    }
}
