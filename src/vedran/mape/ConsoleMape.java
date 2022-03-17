package vedran.mape;

import java.util.HashMap;
import java.util.Map;

public class ConsoleMape {

    public static void main(String[] args) {
       /* Map<Integer, String> studenti = new HashMap<>();
        studenti.put(100, "Vedran");
        studenti.put(102, "Marko");
        studenti.put(200, "Petar");


        for (var student : studenti.entrySet()) {
            System.out.println("id: " + student.getKey() + ", ime: " + student.getValue());
        }

        studenti.remove(102);

        for (String ime : studenti.values()) {
            System.out.println("ime: " + ime);
        }
*/
        Fruit banana = new Fruit(1, "Banana", 7.99);
        Fruit jabuka = new Fruit(2, "Jabuka", 3.99);
        Fruit limun = new Fruit(4, "Limun", 10.0);

        Map<Integer, Fruit> voce = new HashMap<>();
        voce.put(banana.getBroj(), banana);
        voce.put(jabuka.getBroj(), jabuka);
        voce.put(limun.getBroj(), limun);

        System.out.println("Klucevi:");
        for (Integer key : voce.keySet()) {
            System.out.println(key);
        }
        System.out.println();

        System.out.println("Imena i cijene:");
        for (Fruit item : voce.values()) {
            System.out.println(item.getIme() + " " + item.getCijena());
        }

        System.out.println(voce);
    }
}