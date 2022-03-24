package karlo.studentdb;

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
            PreparedStatement s = conn.prepareStatement(sql);
            s.setString(1, student.getFirstName());
            s.setString(2, student.getLastName());
            s.setInt(3, student.getYear());

            s.execute();
            student.setId(s.getGeneratedKeys().getInt(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void updateStudent(Student student) {
        //String sql = "REPLACE INTO student (first_name, last_name, year, id) VALUES(?, ?, ?, ?)";
        String sql = "UPDATE student first_name = ?, last_name = ?, year = ? WHERE ID = ?";

        try  {
            PreparedStatement s = conn.prepareStatement(sql);

            s.setString(1, student.getFirstName());
            s.setString(2, student.getLastName());
            s.setInt(3, student.getYear());
            s.setInt(4, student.getId());

            s.execute();
            student.setId(s.getGeneratedKeys().getInt(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public Map<Integer, Student> listAll() {
        Map<Integer, Student> students = new HashMap<>();
        String sql = "SELECT * FROM student";

        try {
            Statement statement = conn.createStatement();

            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                Student student = new Student();
                student.setFirstName(result.getString("first_name"));
                student.setLastName(result.getString("last_name"));
                student.setYear(result.getInt("year"));
                student.setId(result.getInt("id"));

                students.put(student.getId(), student);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return students;

    }

    public void deleteStudent(Student student) {

        try  {
            String sql= "DELETE FROM student where id = " + student.getId();
            Statement s = conn.createStatement();
            s.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
