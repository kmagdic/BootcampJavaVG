package dario.nizovi;
import java.util.Scanner;

public class Nizovi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] polaznici; // deklaracija
        int n;

        // unos broja polaznika
        do {
            System.out.print("Unesite broj polaznika Java tečaja : ");
            n = scanner.nextInt();
            System.out.print("");
            if (n <= 2) {
                System.out.println("Broj je premali!\n");
            } else if (n > 9) {
                System.out.println("Broj je prevelik!\n");
            } else {
                break;
            }
        } while (true);

        // unos polaznika
        Scanner scanStr = new Scanner(System.in);
        polaznici = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite ime " + (i + 1) + ". polaznika: ");
            polaznici[i] = scanStr.nextLine();
        }

        // ispis polaznika
        System.out.println("");
        System.out.println("Popis Svih polaznika:");
        for (String polaznik: polaznici) {
            System.out.print(polaznik + " ");
        }

        // traženje susjeda
        System.out.println("\n");
        System.out.println("Unesite ime polaznika:");
        String unos = scanStr.nextLine();
        for (int i = 1; i < n; i++) {
            if (i + 1 < n && polaznici[i].equals(unos)) {
                System.out.println("Desni susjed: " + polaznici[i + 1]);
            }
            if (polaznici[i].equals(unos)) {
                System.out.println("Lijevi susjed: " + polaznici[i - 1]);
            }
        }
    }
}
