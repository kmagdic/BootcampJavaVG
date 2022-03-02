package markob;

import java.io.FileWriter;
import java.io.IOException;

public class TempWriter {
    public static void main(String[] args) throws IOException {

        FileWriter temp = new FileWriter("doc/temp_Croatia");

        temp.write("Grad, temperatura(Celsius)\n");

        temp.write("Zagreb, 20\n");
        temp.write("Sisak, 25\n");
        temp.write("Karlovac, 21\n");
        temp.close();

    }
}
