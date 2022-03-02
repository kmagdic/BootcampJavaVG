package kristina;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int brojP = 0;
        String[] polaznici;

        while (true) {
            System.out.println("Upišite broj polaznika: ");
            brojP = scanner.nextInt();

            if (brojP < 3) {
                System.out.println("Broj je premali!");
            }
            if (brojP > 10) {
                System.out.println("Broj je preveliki!");
            }
            if (brojP >= 3 && brojP <= 10) {
                System.out.println("Unesite ime polaznika: ");
                polaznici = new String[brojP];

                for (int i = 0; i < polaznici.length; i++) {
                    String ime = scanner.next();
                    polaznici[i] = ime;

                }
                for (int i = 0; i < polaznici.length; i++) {
                    System.out.println(polaznici[i]);
                }
            }
        }


    }
}


