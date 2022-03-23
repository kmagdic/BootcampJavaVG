package karlo.studentdb;

import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Mario", "Manđžukić", 4);
        Student s2 = new Student("Dario", "Srna", 3);

        System.out.println(s1);
        System.out.println(s2);


        StudentDaoSqlite dao = new StudentDaoSqlite("doc/students_karlo.db");
        dao.saveStudent(s1);
        dao.saveStudent(s2);

        List<Student> students = dao.listAll();
        for(Student s : students)
            System.out.println(s);

    }
}
