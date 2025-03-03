import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


// given a list of integers, find the second highest number using java 8

public class StreamQuestion2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 1, 4, 7, 6, 5, 9);
//        Optional<Integer> secondHighest = findSecondHighest(numbers);
        Optional<Integer> secondHighest = findSecondHighestV1(numbers);
        secondHighest.ifPresent(System.out::println);
    }

    public static Optional<Integer> findSecondHighest(List<Integer> numbers) {
        return numbers.stream()
                .distinct()  // Remove duplicates
                .sorted((a, b) -> b - a)  // Sort in descending order
                .skip(1)  // Skip the highest number
                .findFirst();  // Get the second highest number
    }


    public static Optional<Integer> findSecondHighestV1(List<Integer> numbers) {

        Collections.sort(numbers);
        Collections.reverse(numbers);

        return numbers.stream()
                .distinct()  // Remove duplicates
                .skip(1)  // Skip the highest number
                .findFirst();  // Get the second highest number
    }
}


