package streams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByWithList {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 85),
                new Student("Bob", 92),
                new Student("Charlie", 85),
                new Student("David", 91),
                new Student("Eve", 92)
        );

        Map<Integer, List<String>> groupedByGrade = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.mapping(Student::getName, Collectors.toList())
                ));

        System.out.println(groupedByGrade);
        // {85=[Alice, Charlie], 91=[David], 92=[Bob, Eve]}
    }
}