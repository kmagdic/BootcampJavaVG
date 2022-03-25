package dario.datoteke.evenOrZero;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainData {
    public static void main(String[] args) {
        File file = new File("doc/darioDatasets/dataset_91065.txt");
        int counter = 0;
        int counter2 = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                counter++;
                long tmpNum = Integer.parseInt(scanner.next());
                if (tmpNum % 2 == 0) {
                    if (tmpNum == 0) {
                        break;
                    } else {
                        counter2++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: doc/darioDatasets/dataset_91065.txt");
        }

        System.out.println(counter);
        System.out.println(counter2);
    }
}
