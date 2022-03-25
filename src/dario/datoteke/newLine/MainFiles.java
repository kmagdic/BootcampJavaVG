package dario.datoteke.newLine;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainFiles {
    public static void main(String[] args) {
        File file = new File("doc/darioDatasets/dataset_91033.txt");
        long sum = 0L;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                long tmpNum = Integer.parseInt(scanner.nextLine());
                sum += tmpNum;
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: doc/darioDatasets/dataset_91033.txt");
        }

        System.out.println(sum);
    }
}
