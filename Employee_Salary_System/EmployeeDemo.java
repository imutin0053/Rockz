package Employee_Salary_System;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Manager\n2.Developer\nChoose: ");
        int choice = sc.nextInt();
        Employee employee;
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter name: ");
                String name = sc.nextLine();
                System.out.println("Enter basic salary: ");
                double basicSalary = sc.nextDouble();
                System.out.println("Enter allowance: ");
                double allowance = sc.nextDouble();
                employee = new Manager(name, basicSalary, allowance);
                break;
            case 2:
                System.out.println("Entr name: ");
                String name2 = sc.nextLine();
                System.out.println("Enter basic Salary: ");
                double basicSalary2 = sc.nextDouble();
                System.out.println("Enter bonus: ");
                double bonus = sc.nextDouble();
                employee = new Developer(name2, basicSalary2, bonus);
                break;
            default:
                System.out.println("Invalid Choice!");
                sc.close();
                return;
        }
        System.out.println("Employee Info: ");
        System.out.println("Name: " + employee.name);
        System.out.println("Basic Salary: " + employee.basicSalary);
        System.out.println("Total Salary: " + employee.calculateSalary());
        sc.close();
    }
}
