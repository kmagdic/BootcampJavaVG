package luka.Liste;

import java.util.ArrayList;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        /*
        List <String> studenti = List.of("Mona", "Ivan");
        System.out.println("Veličina "+ studenti.size());
        //studenti.add("Karlo");
        for (int i = 0; i <studenti.size(); i ++) {
            System.out.println(studenti.get(i));
        }
        for (String s: studenti) {
            System.out.println(s);

        }
        List <Integer> brojevi = new ArrayList<>();
        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        System.out.println("Veličina kristina.liste brojevi : "+ brojevi.size());
        System.out.println("Trreći element kristina.liste " + brojevi.get(2));
        brojevi.add(1,15);
        System.out.println(brojevi);

        for (Integer b: brojevi) {
            System.out.println(b);
        }
        */
        Auto auto1 = new Auto("porsche", 1915);
        Auto auto2 = new Auto("ferrari", 1950);

        List<Auto>auti = new ArrayList<>();
        auti.add(0, auto1);
        auti.add(1,auto2);
        Auto auto3 = new Auto();
        auto3.setIme("astonMartin");
        auto3.setGodina(1970);
        auti.add(2,auto3);

        for (Auto a:auti) {
            System.out.println(a.getIme());

        }
        System.out.println(auti);
    }
}
