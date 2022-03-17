package dario.temperature;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TempReader {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("doc/dario_temp.txt"));
        scanner.nextLine();
        scanner.useDelimiter(", |\n");
        while (scanner.hasNext()) {
            System.out.println("Grad: " + scanner.next() + " Temperatura: " + scanner.next());
        }
    }
}
