package luka;

import java.io.FileNotFoundException;
import java.io.FileReader;;
import java.util.Scanner;

public class TempReader {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("doc/temp_croatia_2022-03-02.txt"));
        scanner.nextLine();
        scanner.useDelimiter(", |\n");

        float zbroj = 0;
        float count = 0;
        while (scanner.hasNext()) {
            String city = scanner.next();
            String temp = scanner.next();
            float temperatua = Float.parseFloat(temp);
            zbroj += temperatua;
            count++;


        }
        float prosjek = zbroj / count;
        System.out.println("Prosječna temperatura iznosi : "+ prosjek +" stupnjeva celzijevih.");
    }
}
