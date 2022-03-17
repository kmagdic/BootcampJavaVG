package kristina.studlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleStudents {
    static Scanner scanner = new Scanner(System.in);
    static List<Student> studenti = new ArrayList<>();

    public static void addNewStudent() {

        System.out.println("ID?");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("ime?");
        String ime = scanner.nextLine();
        System.out.println("godina?");
        int god = Integer.parseInt(scanner.nextLine());
        Student s = new Student(id, ime, god);
        studenti.add(s);
    }

    //public returnById

    public static void main(String[] args) {

        String izbor;
        int id;
        boolean izlaz = false;
        boolean idPostoji;

        do {
            System.out.println("1: novi, 2: ispis, 3: brisanje, 4: promjena godine, 5: ispis svih, z: izlaz");
            izbor = scanner.nextLine();

            switch (izbor) {
                case "1":
                    addNewStudent();
                    break;
                case "2":
                    System.out.println("ID?");
                    id = Integer.parseInt(scanner.nextLine());
                    idPostoji = false;
                    for (Student s : studenti) {
                        if (s.getIdNumber() == id) {
                            idPostoji = true;
                            System.out.println(s.getFirstName());
                        }
                    }
                    if (!idPostoji) System.out.println("ID ne postoji");
                    break;
                case "3":
                    System.out.println("ID?");
                    id = Integer.parseInt(scanner.nextLine());
                    idPostoji = false;
                    for (Student s : studenti) {
                        if (s.getIdNumber() == id) {
                            studenti.remove(s);
                            idPostoji = true;
                            System.out.println("izbrisan: " + s.getFirstName());
                            break;
                        }
                    }
                    if (!idPostoji) System.out.println("ID ne postoji");
                    break;
                case "4":
                    System.out.println("ID?");
                    id = Integer.parseInt(scanner.nextLine());
                    idPostoji = false;
                    for (Student s : studenti) {
                        if (s.getIdNumber() == id) {
                            s.increaseYear();
                            System.out.println(s.getFirstName() + " je sada na " + s.getYear() + ". godini");
                            idPostoji = true;
                        }
                    }
                    if (!idPostoji) System.out.println("ID ne postoji");
                    break;
                case "5":
                    for (Student s : studenti) {
                        System.out.println(s.getIdNumber() +": " + s.getFirstName() + " " + s.getYear() + ". godina");
                    }
                    break;
                case "z":
                    izlaz = true;
                    break;
                default:
                    System.out.println("neispravan unos");
            }
        }
        while (!izlaz);
    }
}