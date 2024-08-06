package streams.terminal;

import java.util.Arrays;
import java.util.List;

public class StreamFilteredCountExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "World", "Java", "Stream");

        long count = words.stream()
                .filter(word -> word.length() > 4)  //word length bigger than 4 and count
                .count();

        System.out.println("Count of filtered elements: " + count);
    }
}