package streams.terminal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinByExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 85),
                new Student("Bob", 92),
                new Student("Charlie", 78),
                new Student("David", 91)
        );

        // Minimum notlu öğrenciyi bulma
        Optional<Student> minStudent = students.stream()
                .collect(Collectors.minBy(Comparator.comparingInt(Student::getGrade)));

        System.out.println("Student with lowest grade: " + minStudent.orElse(null));  // Charlie (78)
    }
}