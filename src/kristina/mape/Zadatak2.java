package kristina.mape;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Auto mazda = new Auto("Mazda 6", 2021, 100_000, 150_500.00);
        Auto peugeot = new Auto("Peugeot 3008", 2018, 93_000, 128_000);
        Auto alfa = new Auto("Alfa 159", 2005, 230_128, 50_892);

        Map<String, Auto> automobili = new HashMap<>();

        automobili.put(mazda.getIme(), mazda);
        automobili.put(peugeot.getIme(), peugeot);
        automobili.put(alfa.getIme(), alfa);

        for (String key : automobili.keySet()) {
            System.out.println(key);
            System.out.println("Godina: " + automobili.get(key).getGodina() + " KM: " + automobili.get(key).getKm() + " Cijena: " + automobili.get(key).getCijena());
        }

        System.out.println("Koji auto želite izbrisati?");
        automobili.remove(scanner.nextLine());

        for (String key : automobili.keySet()) {
            System.out.println(key);
            System.out.println("Godina: " + automobili.get(key).getGodina() + " KM: " + automobili.get(key).getKm() + " Cijena: " + automobili.get(key).getCijena());
        }
    }
}
