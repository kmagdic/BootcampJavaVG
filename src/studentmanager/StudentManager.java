package studentmanager;

public class StudentManager {

    public static void main(String[] args) {
        Course javaCourse = new Course();
        javaCourse.setName("Java basic programming");
        Course ccCourse = new Course();
        ccCourse.setName("C++ programming");
        ccCourse.setDuration(90);
        Course pythonCourse = new Course();
        pythonCourse.setName("Python programming");
        Course vbCourse = new Course();
        vbCourse.setName("Visual basic programming");


        Student s1 = new Student("Mario", "Marić");
        s1.setCourse(javaCourse);
        Student s2 = new Student("Rajko", "Rajić");
        s2.setCourse(javaCourse);
        Student s3 = new Student("Zoran", "Zorić");
        s3.setCourse(pythonCourse);
        Student s4 = new Student("Ivan", "Ivić");
        s4.setCourse(vbCourse);
        Student s5 = new Student("Pero", "Perić");
        s5.setCourse(ccCourse);

        javaCourse.setName("Java osnovno programiranje");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);


    }
}
