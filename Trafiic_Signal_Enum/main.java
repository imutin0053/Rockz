package Trafiic_Signal_Enum;

import java.util.Scanner;

public interface main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr Traffic Signal (RED,YELLOW,GREEN): ");
        String input = sc.next().toUpperCase();
        try {
            traffic signal = traffic.valueOf(input);
            System.out.println("Signal: " + signal);
            System.out.println("Action: " + signal.getAction());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid traffic signal!");
        }
        sc.close();
    }
}
