package streams;

import java.util.Arrays;
import java.util.List;

public class CountExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        long count = numbers.stream()
                            .distinct()
                            .count();

        System.out.println("Distinct count: " + count);
    }
}