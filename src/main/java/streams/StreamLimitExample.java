package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> limitedNumbers = numbers.stream()
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("Limited Numbers: " + limitedNumbers);  // [1, 2, 3, 4, 5]
    }
}