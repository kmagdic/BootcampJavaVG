package davor.studentdb;

import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Mario", "Manđžukić", 4, 1111);
        Student s2 = new Student("Dario", "Srna", 3, 2222);
        Student s3 = new Student("Pero", "Perić", 3, 3333);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        StudentDaoSqlite dao = new StudentDaoSqlite("doc/students_karlo.db");
        dao.saveStudent(s1);
        dao.saveStudent(s2);
        dao.saveStudent(s3);

        dao.deleteStudent(s3);



        List<Student> students = dao.listAll();
        for(Student s : students)
            System.out.println(s);

    }
}
