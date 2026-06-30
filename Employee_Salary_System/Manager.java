package Employee_Salary_System;

public class Manager extends Employee {
    private double allowance;

    public Manager(String name, double basicSalary, double allowance) {
        super(name, basicSalary);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + allowance;
    }

}
