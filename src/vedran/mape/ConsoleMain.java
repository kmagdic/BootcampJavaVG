package vedran.mape;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConsoleMain {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, Auto> auti = new HashMap<>();
        Auto auto1 = new Auto("Kia", 2008, 500, 2500);
        Auto auto2 = new Auto("Lancia", 2022, 500, 1600);
        Auto auto3 = new Auto("Mazda", 2015, 100500, 8700);

        auti.put(auto1.getIme(), auto1);
        auti.put(auto2.getIme(), auto2);
        auti.put(auto3.getIme(), auto3);

        System.out.println("Auti - kljucevi");
        for (String key : auti.keySet()) {
            System.out.println(key);
        }
        System.out.println("odaberi auto za detalje:");
        String keya = scanner.nextLine();

        System.out.println(auti.get(keya).getIme() + " godina: " + auti.get(keya).getGodina() + " cijena: " +
                auti.get(keya).getCijena() + " kilometraza: " + auti.get(keya).getKm() + "km");

        System.out.println("\nispis svih");

        for (Auto auto : auti.values()) {
            System.out.println(auto.getIme() + " godina: " + auto.getGodina() + " cijena: " +
                    auto.getCijena() + " kilometraza: " + auto.getKm() + "km");
        }

        System.out.println("\nkoji auto zelite izbrisati?");
        for (String key : auti.keySet()) {
            System.out.println(key);
        }

        keya = scanner.nextLine();
        auti.remove(keya);
        System.out.println();

        for (Auto auto : auti.values()) {
            System.out.println(auto.getIme() + " godina: " + auto.getGodina() + " cijena: " +
                    auto.getCijena() + " kilometraza: " + auto.getKm() + "km");
        }
    }
}