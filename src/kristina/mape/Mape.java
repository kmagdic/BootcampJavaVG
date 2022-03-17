package kristina.mape;

import java.util.HashMap;
import java.util.Map;

public class Mape {
    public static void main(String[] args) {
        /*Map<Integer, String> voce = new HashMap<>();

        voce.put(1, "Jabuka");
        voce.put(2, "Trešnja");
        voce.put(3, "Avokado");
        voce.put(4, "Limun");

        System.out.println("Voće pod brojem 2 je: " + voce.get(2));

        voce.replace(2, "Višnja");
        System.out.println("Novo voće pod brojem 2 je: " + voce.get(2));

        voce.remove(3);
        System.out.println(voce);

        voce.put(3, "Ananas");
        System.out.println(voce);

        System.out.println();

        System.out.println("Ključevi");
        for (Integer key : voce.keySet()) {
            System.out.println(key);
        }

        System.out.println("Vrijednosti");
        for (String values : voce.values()) {
            System.out.println(values);
        }

        System.out.println();

        for (var entry : voce.entrySet()) {
            System.out.println("Ključ: " + entry.getKey() + " Vrijednost: " + entry.getValue());
        }*/

        Voce avokado = new Voce(1, "Avokado", 5.00);
        Voce ananas = new Voce(2, "Ananas", 6.50);
        Voce tresnja = new Voce(3, "Trešnja", 5.50);

        Map<Integer, Voce> cjenikVoca = new HashMap<>();
        cjenikVoca.put(avokado.getBroj(), avokado);
        cjenikVoca.put(ananas.getBroj(), ananas);
        cjenikVoca.put(tresnja.getBroj(), tresnja);

        System.out.println(cjenikVoca);

        System.out.println("Ključevi");
        for (Integer kljucevi : cjenikVoca.keySet()) {
            System.out.println(kljucevi);
        }

        System.out.println("Ime proizvoda");
        for (Voce v : cjenikVoca.values()) {
            System.out.println("Ime: " + v.getIme() + " Cijena: " + v. getCijena());
        }

        for (Integer key : cjenikVoca.keySet()) {
            System.out.println(key);
            System.out.println("Ime: " + cjenikVoca.get(key).getIme() + " Cijena: " + cjenikVoca.get(key).getCijena());
        }

    }
}
