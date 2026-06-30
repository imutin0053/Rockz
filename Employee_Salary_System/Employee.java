package Employee_Salary_System;

public class Employee {
    protected String name;
    protected double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public void displayInfo() {
        System.out.printf("Name: %s", name);
        System.out.printf("Basic Salary: %.2f", basicSalary);
    }
}
