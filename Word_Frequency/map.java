package Word_Frequency;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "orange");
        map.put(4, "grape");
        map.put(5, "mango");
        map.put(6, "apple");
        map.put(7, "apple");
        map.put(8, "orange");
        map.put(9, "grape");
        System.out.print("Enter the word you want to count: ");
        String word = sc.nextLine();
        int count = 0;
        for (String value : map.values()) {
            if (value.equals(word)) {
                count++;
            }
        }
        System.out.println("The word " + word + " appears " + count + " times in the map.");
    }

}
