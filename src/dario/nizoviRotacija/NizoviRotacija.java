package dario.nizoviRotacija;

import java.util.Scanner;

public class NizoviRotacija {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String[] str = scanner.nextLine().split(" ");
        int n = str.length;
        int[] array = new int[n];
        int[] array2 = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(str[i]);
            array2[i] = array[i];
        }

        int rotations = scanner.nextInt();
        if (rotations > array.length) {
            rotations = rotations % array.length;
        }

        int z = 0;
        int rotationIndex = rotations;
        for (int i = 0; i < n; i++) {
            if (rotationIndex <= 0) {
                array[i] = array2[z];
                z++;
            } else {
                array[i] = array2[n - rotationIndex];
                rotationIndex--;
            }
        }

        for (int number: array) {
            System.out.print(number + " ");
        }
    }
}
