package streams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamJoiningWithDelimiterPrefixSuffixExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "World", "Java", "Stream");

        String result = words.stream()
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println("Joined String with Delimiter, Prefix and Suffix: " + result);  // [Hello, World, Java, Stream]
    }
}