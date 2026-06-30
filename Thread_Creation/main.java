package Thread_Creation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        long first = System.currentTimeMillis();
        System.out.print("Enter the end number for thread1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the end number for thread2: ");
        int num2 = sc.nextInt();
        firstTask f1 = new firstTask(num1);
        secondTask f2 = new secondTask(num2);
        f1.start();
        f1.join();
        f2.start();
        f2.join();
        long last = System.currentTimeMillis();
        System.out.printf("Total time: %dms\n", last - first);

    }

}
