package streams;

import java.util.Arrays;
import java.util.List;

public class StreamAnyMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 8);

        boolean anyEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println("At least one number is even: " + anyEven);  // true
    }
}