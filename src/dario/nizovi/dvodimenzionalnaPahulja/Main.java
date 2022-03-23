package dario.nizovi.dvodimenzionalnaPahulja;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        do {
            n = scanner.nextInt();
        } while (n % 2 == 0 && n >= 0);

        int mid = n / 2;

        String[][] array = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = ".";
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    array[i][j] = "*";
                } else if (i == mid || j == mid) {
                    array[i][j] = "*";
                } else if (i == n - 1 - j) {
                    array[i][j] = "*";
                } else {
                    array[i][j] = ".";
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}