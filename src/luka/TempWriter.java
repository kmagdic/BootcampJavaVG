package luka;

import java.io.FileWriter;
import java.io.IOException;

public class TempWriter {
    public static void main(String[] args) throws IOException {
        FileWriter temp = new FileWriter("doc/temp_croatia.txt");
        temp.write("Grad, temperatura(Celsius)\n");
        temp.write("Zagreb, 17.2\n");
        temp.write("Sisak, 19\n");
        temp.write("Velika Gorica, 25\n");
        temp.close();
    }

}