package karlo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TempWriter {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("doc/temp_croatia.txt");


        writer.write("Ime grada, temperatura (Celsius)\n");
        writer.write("Zagreb, 17.2\n");
        writer.write("Sisak, 19\n");
        writer.write("Velika Gorica, 24.2\n");

        writer.close();

        File f = new File("doc/temp_croatia.txt");
        String s = f.getAbsolutePath();
        System.out.println(s);


    }
}
