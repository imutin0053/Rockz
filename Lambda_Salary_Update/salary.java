package Lambda_Salary_Update;

import java.util.Scanner;
import java.util.function.Consumer;

public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Salary: ");
        double salary = sc.nextDouble();
        Consumer<Double> increment = s -> {
            s += s * 0.20;
            System.out.printf("Updated Salary: %.2f", s);
        };
        increment.accept(salary);
        sc.close();
    }
}
