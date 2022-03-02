package markob;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] polaznici; // deklaracija
        int [] brojevi = {1, 2, 3, 4, 8}; // deklaracija i inicijalizacija
        String [] studenti = new String [7]; // deklaracija i instanciranje
        studenti [0] = "kristina";
        studenti [1] = "dario";
        studenti [2] = "luka";
        studenti [3] = "vedran";
        studenti [4] = "slavko";
        studenti [5] = "davor";
        studenti [6] = "marko";

        for (int i = 0; i < studenti.length; i++) {
            String ime = scanner.next();
            studenti[i] = ime;
        }

        for (String name: studenti) {
            System.out.println(name + " ");
        }

        for (int i = 0; i <= 6; i++) {
            System.out.println(studenti[i]);
        }

        for (int i = 0; i < brojevi.length; i++) {
            System.out.println(brojevi[i]);
        }

        for (int broj: brojevi) {
            System.out.println(broj);
        }

    }
}

