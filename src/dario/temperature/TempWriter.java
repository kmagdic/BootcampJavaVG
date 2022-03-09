package dario.temperature;

import java.io.FileWriter;
import java.io.IOException;

public class TempWriter {
    public static void main(String[] args) throws IOException {

        FileWriter write = new FileWriter("doc/dario_temp.txt");

        write.write("Ime grada, temperatura\n");
        write.write("Zagreb, 6\n");
        write.write("Velika gorica, 4\n");
        write.write("Rijeka, 14\n");
        write.write("Dubrovnik, 18\n");
        write.write("Split, 16\n");
        write.close();
    }
}
