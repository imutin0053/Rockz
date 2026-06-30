package Generic_Calculator;

import java.util.Scanner;

public class calc<T extends Number> {
    private T num1;
    private T num2;

    public calc(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    private double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    private double subtract() {
        return num1.doubleValue() - num2.doubleValue();
    }

    private double multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    private double divide() {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Not possibble");
        } else {
            return num1.doubleValue() / num2.doubleValue();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1.Integer\n2.Double\nChoose Data Type: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Enter 1st number: ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            int b = sc.nextInt();
            calc<Integer> calc = new calc<Integer>(a, b);
            System.out.println("Addition: " + calc.add());
            System.out.println("Subtraction: " + calc.subtract());
            System.out.println("Multiplication: " + calc.multiply());
            try {
                System.out.println("Dividion: " + calc.divide());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());

            }
        } else if (choice == 2) {
            System.out.print("Enter 1st number: ");
            double a = sc.nextDouble();
            System.out.print("Enter 2nd number: ");
            double b = sc.nextDouble();
            calc<Double> calc = new calc<Double>(a, b);
            System.out.println("Addition: " + calc.add());
            System.out.println("Subtraction: " + calc.subtract());
            System.out.println("Multiplication: " + calc.multiply());
            try {
                System.out.println("Dividion: " + calc.divide());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());

            }
        } else {
            System.out.println("Invalid Choice!");
        }
        sc.close();
    }
}
