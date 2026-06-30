package Marks_Analyzer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class collection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.print("Enter how many marks to input: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            numbers.add(sc.nextInt());
        }
        List<Integer> sortednumbers = numbers.stream()
                .sorted()
                .toList();
        int max = numbers.stream()
                .max(Integer::compareTo)
                .get();
        int min = numbers.stream()
                .min(Integer::compareTo)
                .get();
        System.out.print("sorted numbers: " + sortednumbers);
        System.out.print("\nmaximum: " + max);
        System.out.print("\nminimum: " + min);
    }
}
