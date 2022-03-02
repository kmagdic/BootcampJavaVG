package kristina;

import org.w3c.dom.ls.LSOutput;

public class polja {
    public static void main(String[] args) {

        String[] polaznici; // deklaracija polja
        int[] brojevi = {1, 2, 3, 4, 8}; // deklaracija i inicijalizacija
        String[] studenti = new String[6]; // deklaracija i instancija

        studenti[0] = "Kristina";
        studenti[1] = "Davor";
        studenti[2] = "Dario";
        studenti[3] = "Slavko";
        studenti[4] = "Luka";
        studenti[5] = "Marko-Božidar";

        for (String name : studenti) {
            System.out.println(name + " ");
        }

        for (int i = 0; i < studenti.length; i++) {
            System.out.println(studenti);
        }


    }
}