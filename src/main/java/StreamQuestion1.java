import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// given a string, find the indexes of the vowels using java 8

public class StreamQuestion1 {
    public static void main(String[] args) {
        String input = "Example string to find vowels";
        List<Integer> vowelIndexes = findVowelIndexes(input);
        System.out.println(vowelIndexes);
    }

    public static List<Integer> findVowelIndexes(String input) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        return IntStream.range(0, input.length())
                .filter(i -> vowels.contains(input.charAt(i)))
                .boxed()
                .collect(Collectors.toList());
    }
}


