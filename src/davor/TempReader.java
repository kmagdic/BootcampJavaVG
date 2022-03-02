package davor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TempReader {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("doc/temperature.txt"));
        s.nextLine();
        s.useDelimiter(", |\n");

        while (s.hasNext()) {
            String city = s.next();
            String temp = s.next();

            System.out.println("Ime grada" + city + "temp" + temp);
        }

    }
}
