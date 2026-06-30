package Employee_Salary_System;

public class Developer extends Employee {
    private double bonus;

    public Developer(String name, double basicSalary, double bonus) {
        super(name, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }

}
