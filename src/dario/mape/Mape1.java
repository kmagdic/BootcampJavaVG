package dario.mape;

import java.util.HashMap;
import java.util.Map;

public class Mape1 {
    public static void main(String[] args) {


        Voce banana = new Voce(1, "Banana", 10L);
        Voce jabuka = new Voce(2, "Jabuka", 7L);
        Voce limun = new Voce(3, "Limun", 15L);

        Map<Integer, Voce> mapaVoca = new HashMap<>();

        mapaVoca.put(banana.getBroj(), banana);
        mapaVoca.put(jabuka.getBroj(), jabuka);
        mapaVoca.put(limun.getBroj(), limun);

        for (Integer kljuc: mapaVoca.keySet()) {
            System.out.println(kljuc);
        }

        System.out.println("");
        System.out.println(mapaVoca.keySet());
        System.out.println("");

        for (Voce tipVoca: mapaVoca.values()) {
            System.out.println("Ime: " + tipVoca.getIme() + ", cijena: " + tipVoca.getCijena());
        }

        for (Integer kljuc: mapaVoca.keySet()) {
            System.out.println(kljuc);
            System.out.println("Ime: " + mapaVoca.get(kljuc).getIme() + ", Cijena: " + mapaVoca.get(kljuc).getCijena());
        }


        /*
        Map<Integer, String> mapa= new HashMap<>();
        mapa.put(1, "Zapruđe");
        mapa.put(2, "Jarun");
        mapa.put(10, "Velika gorica");
        mapa.put(5, "Trešnjevka");
        mapa.put(20, "Dubrava");


        System.out.println(mapa);

        mapa.replace(20, "Retkovec");
        System.out.println("Pod rednim brojem 20 je: " + mapa.get(20));

        mapa.remove(5);

        System.out.println("Izmjenjena mapa" + mapa);

        for (var varijable: mapa.entr
             ) {

        }
         */
    }
}
