package vedran.liste;

import java.util.ArrayList;
import java.util.List;

public class ListeMain {
    public static void main(String[] arg) {
/*       List<String> studenti = List.of("Mona", "Ivan");

        System.out.println("Velicina:" + studenti.size());

        for (int i = 0; i < studenti.size(); i++) {
            System.out.println(studenti.get(i));
        }

        for (String s : studenti) {
            System.out.println(s);
        }

        List<Integer> brojevi = new ArrayList<>();

        brojevi.add(1);
        brojevi.add(2);
        brojevi.add(3);

        System.out.println("velicina " + brojevi.size());
        System.out.println("2. elemant" + brojevi.get(2));

        brojevi.add(1, 100);
        System.out.println();

        for (Integer i : brojevi) {
            System.out.println(i);
        }
*/
        Auto auto1 = new Auto("Fićo", 1985);
        Auto auto2 = new Auto("Audi", 2017);

        List<Auto> auti = new ArrayList<>();
        auti.add(auto1);
        auti.add(auto2);

        System.out.println(auti);
        System.out.println();

        for (Auto a : auti) {
            System.out.println(a);
        }

        Auto auto3 = new Auto();
        auto3.setIme("Golf");
        auto3.setGodina(2000);

        auti.add(auto3);

        System.out.println();
        for (int i = 0; i < auti.size(); i++) {
            System.out.println(auti.get(i));
        }
    }
}