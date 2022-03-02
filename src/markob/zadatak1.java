package markob;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        // uvjet
        while (n < 3 || n > 9) {
            System.out.println("Unesite broj polaznika: ");
            n = scanner.nextInt();
        }
        // punjenje
        String [] polaznici = new String[n];

        for (int i = 0; i < polaznici.length; i++) {
            String ime = scanner.next();
            polaznici[i] = ime;
            // polaznici[i] = scanner.next(); ---- može i tako
        }
        // ispis
        for (String name: polaznici) {
            System.out.println(name);
        }
    }
}
