package streams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExampleWithCount {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 85),
                new Student("Bob", 92),
                new Student("Charlie", 85),
                new Student("David", 91),
                new Student("Eve", 92)
        );

        // group by for grade and count each group student
        Map<Integer, Long> groupedByGrade = students.stream()
                .collect(Collectors.groupingBy(Student::getGrade, Collectors.counting()));

        System.out.println(groupedByGrade);
        // {85=2, 91=1, 92=2}
    }
}