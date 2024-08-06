package streams.intStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamBoxingUnboxingExample {
    public static void main(String[] args) {
        // Boxing: Primitives to Wrapper
        List<Integer> boxedList = IntStream.range(1, 10)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Boxed List: " + boxedList);  // [1, 2, 3, 4, 5, 6, 7, 8, 9]

        // Unboxing: Wrapper to Primitives
        int[] unboxedArray = boxedList.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println("Unboxed Array: " + Arrays.toString(unboxedArray));  // [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}