package streams.intStream;

import java.util.stream.IntStream;

public class IntStreamSumExample {
    public static void main(String[] args) {
        int sumRange = IntStream.range(1, 10).sum();
        System.out.println("Sum of elements in range 1 to 10 (exclusive): " + sumRange);  // 45

        int sumRangeClosed = IntStream.rangeClosed(1, 10).sum();
        System.out.println("Sum of elements in range 1 to 10 (inclusive): " + sumRangeClosed);  // 55
    }
}