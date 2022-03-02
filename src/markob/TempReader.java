package markob;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TempReader {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new FileReader("doc/temp_Croatia"));

        scanner.nextLine();
        scanner.useDelimiter(", |\n");

        while (scanner.hasNext()) {
            String city = scanner.next();
            String temp = scanner.next();
            System.out.println("Grad " + city + " ima temperaturu " + temp);
        }
    }
}
