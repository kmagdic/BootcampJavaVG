package karlo.studentdb;

import java.util.List;
import java.util.Map;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Mario", "Manđžukić", 4);
        Student s2 = new Student("Dario", "Srna", 3);

        StudentDaoSqlite dao = new StudentDaoSqlite("doc/students_karlo2.db");
        dao.saveStudent(s1);
        dao.saveStudent(s2);


        Map<Integer, Student> students = dao.listAll();
        for(Student s : students.values())
            System.out.println(s);


        dao.deleteStudent(s2);

        Student st = new Student();
        st.setId(3);
        dao.deleteStudent(st);
    }
}
