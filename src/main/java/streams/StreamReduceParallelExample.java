package streams;

import java.util.Arrays;
import java.util.List;

public class StreamReduceParallelExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 2, 10, 7);

        int sumOfSquares = numbers.parallelStream()
                .reduce(0,
                        (sum, num) -> sum + num * num, // accumulator
                        Integer::sum); // combiner

        System.out.println("Sum of squares: " + sumOfSquares);
    }

}