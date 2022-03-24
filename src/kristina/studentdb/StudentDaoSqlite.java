package kristina.studentdb;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDaoSqlite {

    private Connection conn;

    StudentDaoSqlite(String fileName) {
        String createTableSql = "CREATE TABLE IF NOT EXISTS student (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	first_name text NOT NULL,\n"
                + "	last_name text NOT NULL,\n"
                + "	year integer\n"
                + ");";
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:" + fileName);

            Statement s = conn.createStatement();
            s.execute(createTableSql);
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


    public Map<Integer, Student> listAll() {
        Map<Integer, Student> student = new HashMap<>();
        String sql = "SELECT * FROM student";

        try {
            Statement statement = conn.createStatement();

            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                Student s = new Student();
                s.setFirstName(result.getString("first_name"));
                s.setLastName(result.getString("last_name"));
                s.setYear(result.getInt("year"));
                s.setId(result.getInt("id"));

                student.put(s.getId(), s);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return student;

    }
}
