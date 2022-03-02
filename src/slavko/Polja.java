package slavko;

import java.util.Scanner;

public class Polja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len;

        while (true) {
                System.out.println("Unesite broj polaznika:");
                len = scanner.nextInt();
                if (len < 3 || len > 9) {
                    continue;
                } else {
                    break;
                }
        }

        String[] array = new String[len];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Unesite " + (i+1) + " polaznika:");
            array[i] = scanner.next();
        }

        for (String name : array) {
            System.out.println("/n" + name + " ");
        }
    }
}
