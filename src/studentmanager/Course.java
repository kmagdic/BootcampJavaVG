package studentmanager;

public class Course {
    private String name;
    private int duration;

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;

    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    Course() {
        this.name = name;
        this.duration = duration;
    }
}

