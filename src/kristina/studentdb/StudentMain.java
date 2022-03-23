package kristina.studentdb;

import java.util.List;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student s1 = new Student("Mario", "Manđžukić", 4);
        Student s2 = new Student("Dario", "Srna", 3);

        System.out.println(s1);
        System.out.println(s2);


        StudentDaoSqlite dao = new StudentDaoSqlite("doc/students-kristina.db");
        //dao.saveStudent(s1);
        //dao.saveStudent(s2);

        //System.out.println("Unesite ID studenta kojeg želite obrisati: ");
        //int studentId = scanner.nextInt();

        //dao.delete(studentId);

        List<Student> students = dao.listAll();
        for(Student s : students)
            System.out.println(s);

    }
}
