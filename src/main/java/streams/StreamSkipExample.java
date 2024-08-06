package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSkipExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> skippedNumbers = numbers.stream()
                .skip(5)
                .collect(Collectors.toList());

        System.out.println("Skipped Numbers: " + skippedNumbers);  // [6, 7, 8, 9, 10]
    }
}