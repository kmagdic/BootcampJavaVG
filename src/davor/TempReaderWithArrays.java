package davor;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TempReaderWithArrays {
    public static void main(String[] args) throws FileNotFoundException {

        // count number of cites
        int counter = 0;

        Scanner s = new Scanner(new File("doc/temp_croatia_2022-03-02.txt"));
        s.nextLine();
        s.useDelimiter(", |\n");

        while (s.hasNext()) {
            s.next();
            s.next();
            counter ++;
        }
        float [] temperature  = new float[counter];
        String [] gradovi  = new String[counter];

        s.close();


        // transfer data from file to array

        s = new Scanner(new File("doc/temp_croatia_2022-03-02.txt"));
        s.useDelimiter(", |\n");
        s.nextLine();

        int count = 0;
        while (s.hasNext()) {

            String city = s.next();
            float temp = Float.parseFloat(s.next());
            temperature[count] = temp;
            gradovi[count] = city;
            count++;

            System.out.println("Ime grada: " + city + " temp " + temp);
        }

        //  calculate max temperature

        float maxTemp = -20;
        String grad = "";
        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] > maxTemp){
                maxTemp = temperature[i];
                grad = gradovi[i];
            }
        }

        // print


        System.out.println("Grad:" + grad + " MaxTemp:" + maxTemp);
    }
}
