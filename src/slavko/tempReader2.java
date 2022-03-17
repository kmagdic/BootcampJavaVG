package slavko;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class tempReader2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("doc/temp_croatia_2022-03-02.txt"));
        scanner.nextLine();
        scanner.useDelimiter(", |\n");
        float tempMin = 100;
        String gradMin = "";

        while (scanner.hasNext()) {
            String grad = scanner.next();
            String StrTemperatura = scanner.next();
            float temperatura = Float.parseFloat(StrTemperatura);
            System.out.println("Grad " + grad + "Temperatura" + temperatura);
            if(temperatura <= tempMin) {
                tempMin = temperatura;
                gradMin = grad;
            }
        }
        System.out.println("Najniža temperatura je:" + tempMin + " u gradu " + gradMin);
    }
}
