package kristina.studlist;

public class Student {
    private int idNumber;
    private String firstName;
    private int year;

    public int getIdNumber() {
        return idNumber;
    }

    public Student() {
    }

    public Student(int idNumber, String firstName, int year) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", firstName='" + firstName + '\'' +
                ", year=" + year +
                '}';
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void increaseYear() {
        year++;
    }

}