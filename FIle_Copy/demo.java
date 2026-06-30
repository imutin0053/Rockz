package FIle_Copy;

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
            FileWriter fw = new FileWriter("Source.txt");
            fw.write(s.toString());
            fw.close();
            System.out.println("Student data written to file");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Copying the file to another file...");
        try {
            FileReader fr = new FileReader("Source.txt");
            FileWriter fw = new FileWriter("Destination.txt");
            int i;
            while ((i = fr.read()) != -1) {
                fw.write(i);
            }
            fr.close();
            fw.close();
            System.out.println("File copied successfully");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Task Completed");
        }

    }

}
