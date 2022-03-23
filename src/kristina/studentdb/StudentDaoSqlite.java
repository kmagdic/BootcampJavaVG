package kristina.studentdb;

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

    public void saveStudent(Student student) {
        String sql = "INSERT INTO student (first_name, last_name, year) VALUES(?, ?, ?)";

        try  {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, student.getFirstName());
            statement.setString(2, student.getLastName());
            statement.setInt(3, student.getYear());

            statement.execute();

            student.setId(statement.getGeneratedKeys().getInt(1));

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void delete(int id) {
        String sql = "DELETE FROM student WHERE id = ?";

        try {
            PreparedStatement s = conn.prepareStatement(sql);
            s.setInt(1, id);

            s.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Student> listAll() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM student";

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
}
