package dario.datoteke.worldPopulation;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainWorldPopulation {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("doc/darioDatasets/dataset_91069.txt");
        Scanner scanner = new Scanner(file);

        int year;
        double popul;
        double popdifPercent = 0;
        int boomYearPercent = 0;
        double popdif = 0;
        int boomYear = 0;
        String yearParse;

        scanner.nextLine();
        int prevYear = Integer.parseInt(scanner.next());
        yearParse = scanner.next().replace(",", "");
        double prevPopul = Double.parseDouble(yearParse);
        scanner.nextLine();

        System.out.println(prevYear + "   " + prevPopul);

        while (scanner.hasNext()) {
            year = Integer.parseInt(scanner.next());
            yearParse = scanner.next().replace(",", "");
            popul = Double.parseDouble(yearParse);
            scanner.nextLine();

            System.out.println(year + "   " + popul + "    " + popul/prevPopul);

            if (popul/prevPopul > popdifPercent) {
                popdifPercent = popul/prevPopul;
                boomYearPercent = year;
            }

            if (popul - prevPopul > popdif) {
                popdif = popul - prevPopul;
                boomYear = year;
            }
            prevYear = year;
            prevPopul = popul;
        }

        System.out.println("\npop dif: " + popdifPercent + "% in year: " + boomYearPercent);
        System.out.println("\npop dif: " + (long)popdif + " souls in year: " + boomYear);
    }
}
