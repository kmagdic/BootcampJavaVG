package studentManager;

public class StudentManager {

    public static void main(String[] args) {
        Course javaCourse = new Course();
        javaCourse.setName("Java basic programming");


        Student s1 = new Student("Mario", "Marić");
        s1.setCourse(javaCourse);
        Student s2 = new Student("Rajko", "Rajić");
        s2.setCourse(javaCourse);
        Student s3 = new Student();

        javaCourse.setName("Java osnovno programiranje");

        System.out.println(s1);
        System.out.println(s2);


    }
}
