package Queue_Simulation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        while (true) {
            System.out.print(
                    "1.Generate Token\n2.Serve Next Customer\n3.View Next Customer\n4.Display Queue\n5.Exit\nEnter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();
                    queue.add(name);
                    System.out.println("Token Generated Successfully!");
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is Empty!");
                    } else {
                        System.out.println("Serving Customer: " + queue.poll());
                    }
                    break;
                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is Empty!");
                    } else {
                        System.out.println("Next Customer: " + queue.peek());
                    }
                    break;
                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is Empty!");
                    } else {
                        System.out.println("Queue: " + queue);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
