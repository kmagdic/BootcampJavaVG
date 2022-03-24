package dario.datoteke.dataset;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DatasetMain {
    public static void main(String[] args) {
        File file = new File("doc/dataset_91007.txt");
        long maxNum = 0L;
        int counter = 0;
        int counter2 = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                counter++;
                long tmpNum = Integer.parseInt(scanner.next());
                if (tmpNum > maxNum) {
                    maxNum = tmpNum;
                    counter2++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: doc/dataset_91007.txt");
        }

        System.out.println(maxNum);
        System.out.println(counter);
        System.out.println(counter2);
    }
}
