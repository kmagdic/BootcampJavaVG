package dario.liste;

import java.util.ArrayList;
import java.util.List;

public class Liste1 {
    public static void main(String[] args) {

        List<Integer> brojevi = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            brojevi.add(i + 1);
        }

        System.out.println("Veličina: " + brojevi.size());
        System.out.println("Treći element liste: " + brojevi.get(2));

        brojevi.add(2, 30);
        System.out.println("Treći element liste: " + brojevi.get(2));

        System.out.println(brojevi);

        for (Integer i: brojevi) {
            System.out.println(i);
        }
    }
}
