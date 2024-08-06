package streams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");

        // group by word length
        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(groupedByLength);
        // {5=[apple], 6=[banana, cherry], 4=[date], 3=[fig], 5=[grape]}
    }
}