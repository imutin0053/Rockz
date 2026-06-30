package Student_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(
                    "1.Add Student\n2.Display Student\n3.Update Student\n4.Delete Student\n5.Search Student\n6.Exit\nEnter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    double id = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Student Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student Course: ");
                    String course = sc.nextLine();
                    students.add(new Student(id, name, age, course));
                    break;
                case 2:
                    System.out.println("Student List:");
                    for (Student student : students) {
                        System.out.println(student);
                    }
                    break;
                case 3:
                    System.out.print("Enter Student ID to Update: ");
                    double id_to_update = sc.nextDouble();
                    sc.nextLine();
                    for (Student student : students) {
                        if (student.getId() == id_to_update) {
                            System.out.print("Enter New Name: ");
                            String new_name = sc.nextLine();
                            student.setStudentName(new_name);
                            System.out.print("Enter New Age: ");
                            int new_age = sc.nextInt();
                            sc.nextLine();
                            student.setAge(new_age);
                            System.out.print("Enter New Course: ");
                            String new_course = sc.nextLine();
                            student.setCourse(new_course);
                            System.out.println("Student Updated Successfully!");
                            break;
                        }
                    }
                    System.out.println("Student not found!");
                    break;
                case 4:
                    System.out.print("Enter Student ID to Delete: ");
                    double id_to_delete = sc.nextDouble();
                    sc.nextLine();
                    for (Student student : students) {
                        if (student.getId() == id_to_delete) {
                            students.remove(student);
                            System.out.println("Student Deleted Successfully!");
                            break;
                        }
                    }
                    System.out.println("Student not found!");
                    break;
                case 5:
                    System.out.println("Enter Student ID to Search: ");
                    double id_to_search = sc.nextDouble();
                    sc.nextLine();
                    for (Student student : students) {
                        if (student.getId() == id_to_search) {
                            System.out.println(student);
                            break;
                        }
                    }
                    System.out.println("Student not found!");
                    break;
                case 6:
                    System.out.println("Exitting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

}
