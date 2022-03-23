package markob.studentDAO;

import java.util.List;

public class StudentMain {
    public static void main(String[] args) {

        Student s1 = new Student("Mario", "Manđžukić", 4);
        Student s2 = new Student("Dario", "Srna", 3);
        Student s3 = new Student("Luka", "Modrić", 2);
        Student s4 = new Student("Davor", "Šuker", 1);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        StudentDaoSqlite dao = new StudentDaoSqlite("doc/students_karlo.db");
        dao.saveStudent(s1);
        dao.saveStudent(s2);
        dao.saveStudent(s3);
        dao.saveStudent(s4);
        dao.deleteStudent(s3);
        dao.deleteStudent(s4);

        List<Student> students = dao.listAll();
        for(Student s : students)
            System.out.println(s);
    }
}
