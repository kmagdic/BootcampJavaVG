package luka;

import java.util.Scanner;

public class Zadatak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        while (n < 3 || n > 9) {
            System.out.println("Unesite broj polaznika :");
            n = scanner.nextInt();
        }
       // scanner.next();
        String[] polaznici = new String[n];

        for (int i = 0; i < polaznici.length; i++) {
            System.out.println("Unesite " + (i + 1) + ". polaznika");
            polaznici[i] = scanner.next();

        }
        for (String name:polaznici){
            System.out.println(name);
        }
    }
}
