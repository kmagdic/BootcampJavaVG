package liste.studenti;

import studentmanager.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Studenti> students = new ArrayList<>();
        String menu = "";


        while (!menu.equals("0")) {
            System.out.println("Odaberite: 1 - upis studenta, 2 - ispis studenta po Id broju, 3 - brisanje studenta po Id broju, " +
                    "4 - promjena godine studija, 5 - ispis svih studenata, 0 - izlaz");
            menu = scanner.next();
            switch (menu) {
                case "1":
                    Studenti studenti = new Studenti();
                    System.out.println("Unesite ime: ");
                    studenti.setFirstName(scanner.next());
                    System.out.println(("Unesite ID: "));
                    studenti.setIdNumber(scanner.nextInt());
                    System.out.println(("Unesite godinu: "));
                    studenti.setYear(scanner.nextInt());
                    students.add(studenti);
                    break;

                case "2":
                    System.out.println("Unesite ID: ");
                    int id = scanner.nextInt();
                    for (Studenti s : students) {
                        if (s.getIdNumber() == id) {
                            System.out.println("Student pod ID-om " + id + " je " + s.getFirstName());
                        }
                    }
                    break;

                case "3":
                    System.out.println("Unesite ID: ");
                    id = scanner.nextInt();
                    for (Studenti s : students) {
                        if (s.getIdNumber() == id) {
                            students.remove(s);
                            System.out.println("Student removed!");
                        }
                    }
                    break;

                case "4":
                    System.out.println("Unesite ID: ");
                    id = scanner.nextInt();
                    for (Studenti s : students) {
                        if (s.getIdNumber() == id) {
                            s.increaseYear();
                            System.out.println("Student je upisao višu godinu!");
                        }
                    }
                    break;

                case "5":
                    for (Studenti s : students) {
                        System.out.println(s);
                    }
                    break;

                case "0":
                    break;

                default:
                    System.out.println("Krivi unos");
            }
        }
    }
}
