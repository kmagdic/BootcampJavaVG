package dario.temperature;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TempReader2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("doc/temp_croatia_2022-03-02.txt"));
        scanner.nextLine();
        scanner.useDelimiter(", |\n");
        float tempMin = 100;
        String gradMin = "";
        float tempMax = -100;
        String gradMax = "";
        float tempSum = 0;
        int count = 0;

        while (scanner.hasNext()) {
            String grad = scanner.next();
            String StrTemperatura = scanner.next();
            float temperatura = Float.parseFloat(StrTemperatura);
            System.out.println("Grad: " + grad + " Temperatura: " + temperatura
            );
            if (temperatura <= tempMin) {
                tempMin = temperatura;
                gradMin = grad;
            }
            if (temperatura >= tempMax) {
                tempMax = temperatura;
                gradMax = grad;
            }
            tempSum += temperatura;
            count++;
        }
        System.out.println("Najniža temperatura je: " + tempMin + " u gradu: " + gradMin);
        System.out.println("Najviša temperatura je: " + tempMax + " u gradu: " + gradMax);
        System.out.println("Srednja temperatura je: " +(tempSum / count));
    }
}
