package Student_File_Writer_Reader;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll no: ");
        int rollno = sc.nextInt();
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();
        Student s = new Student(rollno, name, marks);
        try {
            FileWriter fw = new FileWriter("Student.txt");
            fw.write(s.toString());
            fw.close();
            System.out.println("Student data written to file");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Du you want to read the file: 1.Yes/2.No");
        int choice = sc.nextInt();
        if (choice == 1) {
            try {
                FileReader fr = new FileReader("Student.txt");
                int i;
                while ((i = fr.read()) != -1) {
                    System.out.print((char) i);
                }
                fr.close();
                System.out.println("\nStudent data read from file");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("File not read");
        }
    }
}
