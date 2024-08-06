package streams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Even numbers: " + partitioned.get(true));
        System.out.println("Odd numbers: " + partitioned.get(false));


        Map<Boolean, Integer> partitionedSums = numbers.stream()
                .collect(Collectors.partitioningBy(
                        n -> n % 2 == 0,
                        Collectors.summingInt(Integer::intValue)
                ));

        System.out.println("Sum of even numbers: " + partitionedSums.get(true));
        System.out.println("Sum of odd numbers: " + partitionedSums.get(false));
    }
}