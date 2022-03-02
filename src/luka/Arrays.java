package luka;

import studentmanager.Student;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] polaznici; // deklaracija
        int [] brojevi = {1,2,3,4,8}; // deklaracija i inicijalizacija
        String [] studenti = new String [6]; // deklaracija i instanciranje
        studenti[0] = "Luka";
        studenti[1] = "Marko";
        studenti[2] = "Slavko";
        studenti[3] = "Dario";
        studenti[4] = "Kristina";
        studenti[5] = "Davor";
        int i;
        for (i = 0; i < brojevi.length; i++){
            System.out.println(studenti[i]);
        }
        for (int broj : brojevi) {
            System.out.println(broj);
        }
        for (int j = 0; j < studenti.length; j++) {
            String ime = scanner.next();
            studenti[j] = ime;
        }

    }
}
