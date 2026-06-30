package Callable_Function;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        FactorialTask task = new FactorialTask(num);
        System.out.printf("%d! = %d", num, task.call());
    }
}
