package dario;
import java.util.Scanner;

public class Nizovi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] polaznici; // deklaracija
        int [] brojevi = {1, 2, 3, 4, 8}; // deklaracija i inicijalizacija
        String [] studenti = new String[6]; // deklaracija i instanciranje

        studenti[0] = "Vedran";
        studenti[1] = "Kristina";
        studenti[2] = "Davor";
        studenti[3] = "Marko";
        studenti[4] = "Luka";
        studenti[5] = "Slavko";

        for (int i = 0; i < studenti.length; i++) {
            System.out.println(studenti[i]);
        }
    }
}
