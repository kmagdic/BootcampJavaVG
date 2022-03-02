package karlo;

import java.io.*;
import java.util.Scanner;

public class TempReader {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("doc/temp_croatia_2022-03-02.txt"));

        s.nextLine();
        s.useDelimiter(", |\n");

        while(s.hasNext()) {
            String city = s.next();
            float temp = s.nextFloat();

            System.out.println("Grad " + city + " ima temperaturu '" + temp + "'");
        }

    }
}
