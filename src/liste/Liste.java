package liste;

import java.util.ArrayList;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        List<String> studenti = List.of("Mona", "Ivan");

        System.out.println("Veličina: " + studenti.size());
        //studenti.add("Karlo");

        for (int i = 0; i < studenti.size(); i++) {
            System.out.println(studenti.get(i));
        }

        for (String s : studenti) {
            System.out.println(s);
        }

        List<Integer> brojevi = new ArrayList<>();
        brojevi.add(3);
        brojevi.add(5);
        brojevi.add(8);

        System.out.println("Moji brojevi su: " + brojevi);

        System.out.println("Veličina liste brojevi: " + brojevi.size());
        System.out.println("Treći element liste: " + brojevi.get(2));

        brojevi.add(1, 30);
        System.out.println(brojevi);

        for (Integer br : brojevi) {
            System.out.println(br);
        }
    }
}
