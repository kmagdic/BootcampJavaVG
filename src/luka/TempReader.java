package luka;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TempReader {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("doc/temp_croatia.txt"));
        scanner.nextLine();
        scanner.useDelimiter(", |\n");
        while(scanner.hasNext()) {
            String city = scanner.next();
            String temp = scanner.next();
            System.out.println("Grad: "+ city+ " ima temperaturu "+ temp);

        }

    }
}
