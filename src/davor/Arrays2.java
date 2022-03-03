package davor;

import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broj = 0;

        while (true) {
            System.out.println("Broj polaznika:");
            broj = scanner.nextInt();
            if (broj < 3 || broj > 9) {
                System.out.println("Broj polaznika je krivi");
            } else {
                break;
            }
        }

        String[] polaznici = new String[broj];
        for (int i = 0; i < polaznici.length; i++) {
            System.out.println("Unesite "+ (i+1) + ".polaznika");
            String ime = scanner.next();
            polaznici[i] = ime;
        }
        for (String polaznik : polaznici) {
            System.out.print(polaznik + " ");
        }

    }
}

