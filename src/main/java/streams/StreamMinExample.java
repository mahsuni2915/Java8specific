package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 2, 10, 7);

        Optional<Integer> min = numbers.stream()
                .min(Integer::compare);

        min.ifPresent(value -> System.out.println("Min value: " + value));
    }
}