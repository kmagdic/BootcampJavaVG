package dario.nizovi.dvodimenzionalniRotacija;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] array = new int[n][m];
        int[][] array2 = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        /*
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
         */

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array2[i][j] = array[array.length - 1 - j][i];
                System.out.print(array2[i][j] + " ");
            }
            System.out.println("");
        }
    }
}