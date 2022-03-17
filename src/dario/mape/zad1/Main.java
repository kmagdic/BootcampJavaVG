package dario.mape.zad1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Auto kia = new Auto("Kia", 1999, 32541, 6000);
        Auto lancia = new Auto("Lancia", 2008, 15541, 2500);
        Auto mazda = new Auto("Mazda", 2018, 85325, 9000);

        Map<String, Auto> mapaAuta = new HashMap<>();

        mapaAuta.put(kia.getIme(), kia);
        mapaAuta.put(lancia.getIme(), lancia);
        mapaAuta.put(mazda.getIme(), mazda);

        System.out.println("Automobili i njihovi ključevi: ");

        for (String ključ: mapaAuta.keySet()) {
            System.out.println(ključ);
        }

        System.out.println("");
        System.out.println("Unesite ključ auta za kojeg bi htjeli više informacija: ");
        String izbor = scanner.nextLine();
        System.out.println(mapaAuta.get(izbor).toString());
        System.out.println("");

        System.out.println("Popis svih automobila:");
        for (Auto auto: mapaAuta.values()) {
            System.out.println(auto.getIme());
            System.out.println("Godina: " + auto.getGodina() + ", KM: " + auto.getKm() + ", Cijena: " + auto.getCijena());
        }

        System.out.println("");
        System.out.println("Koji auto želite izbrisati?");
        izbor = scanner.nextLine();
        mapaAuta.remove(izbor);

        System.out.println("");
        for (Auto auto: mapaAuta.values()) {
            System.out.println(auto.getIme());
            System.out.println("Godina: " + auto.getGodina() + ", KM: " + auto.getKm() + ", Cijena: " + auto.getCijena());
        }


    }
}
