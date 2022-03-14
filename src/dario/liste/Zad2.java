package dario.liste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {

    private int idNumber;
    private String firstName;
    private int year;

    public Student() {
    }

    public Student(int idNumber, String firstName, int year) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.year = year;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", firstName='" + firstName + '\'' +
                ", year=" + year +
                '}';
    }

    public void increaseYear() {
        this.year++;
    }
}

public class Zad2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        List<Student> studenti = new ArrayList<>();
        String choice = "";
        int unosID;

        while (!choice.equals("f")){
            System.out.println("a) upis studenta, b) ispis studenta, c) brisanje studenta, \n" +
                    "d) promjena godine studije, e) ispis svih studenata, f) izlaz");
            choice = scanner.nextLine();
            switch (choice) {
                case "a":
                    studenti.add(addNewStudent());
                    break;
                case "b":
                    System.out.println("Unesite ID studenta: ");
                    unosID = scanner.nextInt();
                    for (int z = 0; z < studenti.size(); z++) {
                        if (studenti.get(z).getIdNumber() == unosID) {
                            System.out.println(studenti.get(z).toString());
                        }
                    }
                    break;
                case "c":
                    System.out.println("Unesite ID studenta: ");
                    unosID = scanner.nextInt();
                    for (int z = 0; z < studenti.size(); z++) {
                        if (studenti.get(z).getIdNumber() == unosID) {
                            studenti.remove(z);
                            System.out.println("Student obrisan");
                        }
                    }
                    break;
                case "d":
                    System.out.println("Unesite ID studenta: ");
                    unosID = scanner.nextInt();
                    for (int z = 0; z < studenti.size(); z++) {
                        if (studenti.get(z).getIdNumber() == unosID) {
                            int year = studenti.get(z).getYear();
                            studenti.get(z).setYear(++year);
                            System.out.println("Godina promejenjena u: " + studenti.get(z).getYear());
                        }
                    }
                    break;
                case "e":
                    System.out.println(studenti);
                    break;
                case "f":
                    System.out.println("exiting...");
                    break;
            }
        }

    }

    static Student addNewStudent() {
        Student student1 = new Student();
        System.out.println("Unesite ime studenta: ");
        student1.setFirstName(scanner.nextLine());
        System.out.println("Unesite ID");
        student1.setIdNumber(scanner.nextInt());
        System.out.println("Unesite godinu:");
        student1.setYear(scanner.nextInt());
        return student1;
    }
}
