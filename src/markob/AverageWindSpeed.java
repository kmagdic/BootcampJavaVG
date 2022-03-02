package markob;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AverageWindSpeed {
    public static void main(String[] args) throws IOException {

        Scanner windSpeed = new Scanner(new File("doc/temp_croatia_2022-03-02.txt"));

        windSpeed.nextLine();
        windSpeed.useDelimiter(", |\n");

        float zbroj = 0;
        float count = 0;

        while (windSpeed.hasNext()) {
            String city = windSpeed.next();
            String wind = windSpeed.next();
            float wind1 = Float.parseFloat(wind);
            zbroj += wind1;
            count++;
        }

        float prosjek = zbroj / count;

        System.out.println("Prosječna brzina vjetra iznosi: " + prosjek + " m/s");
    }
}
