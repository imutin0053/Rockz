package Division_Calculator;

import java.util.Scanner;

public class arithmatic extends Exception {
    public static void main(String[] args) {
        System.out.print("Enter 1st no: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter 2nd no: ");
        int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Execution finished");
        }
    }
}
