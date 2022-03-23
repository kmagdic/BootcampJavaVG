package dario.studentdb;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoSqlite {

    private Connection conn;

    StudentDaoSqlite(String fileName) {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:" + fileName);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void saveStudent(Student s1) {
        String sql = "INSERT INTO students (first_name, last_name, year) VALUES(?, ?, ?)";

        try  {
            PreparedStatement s = conn.prepareStatement(sql);
            s.setString(1, s1.getFirstName());
            s.setString(2, s1.getLastName());
            s.setString(3, String.valueOf(s1.getYear()));

            s.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public List<Student> listAll() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";

        try {
            Statement statement = conn.createStatement();

            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                Student s = new Student();
                s.setFirstName(result.getString("first_name"));
                s.setLastName(result.getString("last_name"));
                s.setYear(result.getInt("year"));
                students.add(s);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return students;

    }

    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE ID = " + id;

        try  {
            PreparedStatement s = conn.prepareStatement(sql);

            s.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
