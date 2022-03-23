package dario.nizovi.cinema;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        int count = 0;
        int row = 0;

        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < m; j++) {
                if (array[i][j] == 0) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == k) {
                    row = i;
                    i = n;
                    j = m;
                }
            }
        }
        if (count < k) {
            row = -1;
        }

        System.out.print(row + 1);
    }
}