package dario;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("Unesite br polaznika");
            n = scanner.nextInt();
            if (n < 3 || n > 9) {
                System.out.println("Neispravan broj");
            } else {
                break;
            }

        } while(true);

        String [] student = new String[n];
        System.out.println("Unesite imena polaznika");
        for(int i = 0; i < n; i++) {
            student[i] = scanner.next();
        }

        for (String name: student) {
            System.out.print(name + " ");
        }
    }
}
