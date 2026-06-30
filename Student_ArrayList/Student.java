package Student_ArrayList;

public class Student {
    private double studentid;
    private String studentname;
    private int age;
    private String course;

    Student(double studentid, String studentname, int age, String course) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.age = age;
        this.course = course;
    }

    public double getId() {
        return this.studentid;
    }

    public String getStudentName() {
        return this.studentname;
    }

    public void setStudentName(String studentname) {
        this.studentname = studentname;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String toString() {
        return "Student [studentid=" + studentid + ", studentname=" + studentname + ", age=" + age + ", course="
                + course + "]";
    }

}
