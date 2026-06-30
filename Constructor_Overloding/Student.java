package Constructor_Overloding;

public class Student {
    int sNo;
    String name;
    String course;

    public Student(int sNo, String name, String course) {
        this.sNo = sNo;
        this.name = name;
        this.course = course;
    }

    public Student(int sNo) {
        this.sNo = sNo;
    }

    void displayInfo() {
        System.out.println("Student ID: " + sNo);
        System.out.println("Student Name: " + name);
        System.out.println("Student Course: " + course);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Aravind", "CS");
        Student s2 = s1;
        s1 = new Student(2, "Imdad", "CS");
        Student s3 = new Student(3);
        s2.displayInfo();
    }
}
