package streams;

import java.util.Arrays;
import java.util.List;

public class StreamNoneMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);

        boolean noneEven = numbers.stream()
                .noneMatch(n -> n % 2 == 0);

        System.out.println("No numbers are even: " + noneEven);  // true
    }
}