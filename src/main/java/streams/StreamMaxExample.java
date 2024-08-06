package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 2, 10, 7);

        Optional<Integer> max = numbers.stream()
                .max(Integer::compare);

        max.ifPresent(value -> System.out.println("Max value: " + value));
    }
}