package streams;

import java.util.Arrays;
import java.util.List;

public class StreamReduceProductExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 2, 10, 7);


        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Product: " + product);

        List<String> words = Arrays.asList("Hello", "world", "this", "is", "Java");

        // String concat
        String sentence = words.stream()
                .reduce("", (a, b) -> a + " " + b);

        System.out.println("Sentence: " + sentence.trim());
    }
}
