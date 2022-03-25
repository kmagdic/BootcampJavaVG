package dario.datoteke.dataSetNumCounter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainNumCounter {
    public static void main(String[] args) {
        File file = new File("doc/darioDatasets/dataset_91022.txt");
        int counter = 0;
        int counter2 = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                counter++;
                long tmpNum = Integer.parseInt(scanner.next());
                if (tmpNum >= 9999) {
                    counter2++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: doc/darioDatasets/dataset_91022.txt");
        }

        System.out.println(counter);
        System.out.println(counter2);
    }
}
