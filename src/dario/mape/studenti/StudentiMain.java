package dario.mape.studenti;

import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class StudentiMain {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Map<Integer, Student> studenti= new HashMap<>();
        String choice = "";
        int unosID;

        while (!choice.equals("f")) {
            System.out.println("a) upis studenta, b) ispis studenta, c) brisanje studenta, ");
            System.out.println("d) promjena godine studije, e) ispis svih studenata, f) izlaz");
            choice = scanner.nextLine();
            switch (choice) {
                case "a":
                    Student studTemp = addNewStudent();
                    studenti.put(studTemp.getIdNumber(), studTemp);
                    break;
                case "b":
                    System.out.println("Unesite ID studenta: ");
                    unosID = scanner.nextInt();
                    scanner.nextLine();
                    if (studenti.containsKey(unosID)) {
                        System.out.println(studenti.get(unosID).toString());
                    } else {
                        System.out.println("Neispravan unos");
                    }
                    break;
                case "c":
                    System.out.println("Unesite ID studenta: ");
                    unosID = scanner.nextInt();
                    scanner.nextLine();
                    if (studenti.containsKey(unosID)) {
                        studenti.remove(unosID);
                        System.out.println("Student obrisan");
                    } else {
                        System.out.println("Neispravan unos");
                    }
                    break;
                case "d":
                    System.out.println("Unesite ID studenta: ");
                    unosID = scanner.nextInt();
                    scanner.nextLine();
                    if (studenti.containsKey(unosID)) {
                        int year = studenti.get(unosID).getYear();
                        studenti.get(unosID).setYear(++year);
                        System.out.println("Godina promejenjena u: " + studenti.get(unosID).getYear());
                    }
                    break;
                case "e":
                    System.out.println(studenti);
                    break;
                case "f":
                    System.out.println("exiting...");
                    break;
            }
            System.out.println("");
        }

    }

    static dario.mape.studenti.Student addNewStudent() {
        dario.mape.studenti.Student student1 = new dario.mape.studenti.Student();
        System.out.println("Unesite ime studenta: ");
        student1.setFirstName(scanner.nextLine());
        System.out.println("Unesite ID");
        student1.setIdNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Unesite godinu:");
        student1.setYear(scanner.nextInt());
        scanner.nextLine();
        return student1;
    }
}
