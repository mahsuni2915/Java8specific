package streams.intStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamCustomBoxingUnboxingExample {
    public static void main(String[] args) {
        // Boxing with custom operation
        List<Integer> customBoxedList = IntStream.range(1, 10)
                .mapToObj(n -> n * 2)  // Custom operation during boxing
                .collect(Collectors.toList());

        System.out.println("Custom Boxed List: " + customBoxedList);  // [2, 4, 6, 8, 10, 12, 14, 16, 18]

        // Unboxing with custom operation
        int[] customUnboxedArray = customBoxedList.stream()
                .mapToInt(n -> n / 2)  // Custom operation during unboxing
                .toArray();

        System.out.println("Custom Unboxed Array: " + Arrays.toString(customUnboxedArray));  // [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}