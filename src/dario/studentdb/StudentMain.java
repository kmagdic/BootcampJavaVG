package dario.studentdb;

import java.util.List;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tempId = 0;
        Student s1 = new Student("Mario", "Manđžukić", 4);
        Student s2 = new Student("Dario", "Srna", 3);

        StudentDaoSqlite dao = new StudentDaoSqlite("doc/students_dario2.db");
        dao.saveStudent(s1);
        dao.saveStudent(s2);

        dao = new StudentDaoSqlite("doc/students_dario.db");

        List<Student> students = dao.listAll();
        for(Student s : students)
            System.out.println(s);

        do {
            System.out.println("id of student you want to delete; 0 for exit; 2 for list");
            tempId = scanner.nextInt();
            if (!(tempId == 0) && !(tempId == 2)) {
                dao.deleteStudent(tempId);
            } else if (tempId == 2) {
                students = dao.listAll();
                for(Student s : students)
                    System.out.println(s);
            } else  {
                break;
            }
        } while (true);

    }
}
