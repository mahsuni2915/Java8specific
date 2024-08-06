package streams.terminal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxByExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 85),
                new Student("Bob", 92),
                new Student("Charlie", 78),
                new Student("David", 91)
        );

        // Maksimum notlu öğrenciyi bulma
        Optional<Student> maxStudent = students.stream()
                .collect(Collectors.maxBy(Comparator.comparingInt(Student::getGrade)));

        System.out.println("Student with highest grade: " + maxStudent.orElse(null));  // Bob (92)
    }
}