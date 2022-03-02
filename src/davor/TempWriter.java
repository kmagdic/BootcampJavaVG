package davor;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TempWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("doc/temperature.txt");

        fw.write("Ime grada, temperatura (Celsius)\n");
        fw.write("Zagreb, 17.2\n");
        fw.write("Sisak, 20\n");
        fw.write("Velika Gorica, 25\n");
        fw.write("Dubrovnik, 35");

        fw.close();


    }

}
