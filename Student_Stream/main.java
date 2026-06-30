package Student_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<student> students = Arrays.asList(
                new student(2, "Rockz", 20),
                new student(1, "Xebec", 22),
                new student(3, "Luffy", 24),
                new student(4, "Zoro", 26),
                new student(5, "Nami", 28));
        List<student> result = students.stream()
                .filter(s -> s.getAge() >= 21)
                .sorted(Comparator.comparingInt(student::getRoll_no))
                .toList();

        result.forEach(System.out::println);

    }

}
